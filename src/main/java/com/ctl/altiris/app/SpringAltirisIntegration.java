package com.ctl.altiris.app;

import java.io.StringReader;
import java.util.Arrays;
import java.util.regex.Pattern;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.ctl.altiris.SubmitIncidentHPOV;
import com.ctl.altiris.SubmitIncidentHPOVResponse;

@SpringBootApplication
public class SpringAltirisIntegration {
	public static String PARAMS;
	public static String COUNTRY;
	public static String SIEBELID;
	public static String CREATED;
	public static String SEVERITY;
	public static String TEXT;
	public static String MSG_ID;
	public static String NODE;
	public static String USER;
	public static String OBJECT;
	public static String MSG_GROUP;
	public static String APPLICATION;
	public static String[] PARAMS_ARRAY;

	public static void main(String[] args) {
		SpringApplication.run(SpringAltirisIntegration.class, args);
	}

	@Bean
	CommandLineRunner lookup(SOAPConnector soapConnector) {
		return args -> {
			try {
				if (args.length > 0) {
					PARAMS = args[0];
//		        PARAMS=
//"Major|HPOV|TEST|757e5520-5c9b-71e8-06c2-ac1029140000|bue-ha-prd.bunge.ar|jb021879|DCSQLTED:Tedesco|MS SQL|Database";
					PARAMS_ARRAY = PARAMS.split(Pattern.quote("|"));
					SEVERITY = PARAMS_ARRAY[0];
					CREATED = PARAMS_ARRAY[1];
					TEXT = PARAMS_ARRAY[2];
					MSG_ID = PARAMS_ARRAY[3];
					NODE = PARAMS_ARRAY[4];
					USER = PARAMS_ARRAY[5];
					OBJECT = PARAMS_ARRAY[6];
					APPLICATION = PARAMS_ARRAY[7];
					MSG_GROUP = PARAMS_ARRAY[8];
				}

				Client client = ClientBuilder.newClient();

				WebTarget webTarget = client.target("http://192.168.10.93:8000/GetNodeCustCountry").path(NODE);

				String response = webTarget.request("application/json").get(String.class);
				JsonReader jsonReader = Json.createReader(new StringReader(response));
				JsonArray object = jsonReader.readArray();
				jsonReader.close();
				SIEBELID = object.getJsonObject(0).getString("SIEBELID");
				COUNTRY = object.getJsonObject(0).getString("COUNTRY");

				SubmitIncidentHPOV request = new SubmitIncidentHPOV();
				request.setSeverity(SEVERITY);
				request.setAlert("Created time: " + CREATED + " - Node: " + NODE + " - Application: " + APPLICATION
						+ " - Object: " + OBJECT + " - Alarm: " + TEXT);
				request.setApplicationInformation(APPLICATION);
				request.setCountry(COUNTRY);
				
				request.setSubmittedBy(USER);
				request.setMasterSiebelID(SIEBELID);
				request.setHpomID(MSG_ID);
				request.setIPAddress(NODE);
				request.setNodeName(NODE);
				request.setMessageGroup(MSG_GROUP);
				request.setObjectInformation(OBJECT);
				SubmitIncidentHPOVResponse resp = (SubmitIncidentHPOVResponse) soapConnector.callWebService(
						"http://sdc-dimp.intranet.corp/CT.Create.Incident.Hpov/IncidentHPOV.asmx", request,
						new SoapActionCallback("www.symantec.com/SubmitIncidentHPOV"));
				System.out.println("SUCCESS" + "," + resp.getSubmitIncidentHPOVResult().getProcessID() + ","
						+ resp.getSubmitIncidentHPOVResult().getMessage());
			} catch (IndexOutOfBoundsException e) {
				System.out.println(
						"ERROR,The ticket was not created. Unable to determine Siebel ID of customer or Node is not in nodegroup Country,"
								+ e);
			} catch (Exception e) {
				System.out.println("ERROR,The ticket was not created," + e);
			}

		};
	}
}
