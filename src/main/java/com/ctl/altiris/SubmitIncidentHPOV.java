//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.14 at 08:21:09 PM ART 
//


package com.ctl.altiris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HpomID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MasterSiebelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObjectInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubmittedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alert",
    "applicationInformation",
    "country",
    "hpomID",
    "ipAddress",
    "masterSiebelID",
    "messageGroup",
    "nodeName",
    "objectInformation",
    "severity",
    "submittedBy"
})
@XmlRootElement(name = "SubmitIncidentHPOV")
public class SubmitIncidentHPOV {

    @XmlElement(name = "Alert")
    protected String alert;
    @XmlElement(name = "ApplicationInformation")
    protected String applicationInformation;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "HpomID")
    protected String hpomID;
    @XmlElement(name = "IPAddress")
    protected String ipAddress;
    @XmlElement(name = "MasterSiebelID")
    protected String masterSiebelID;
    @XmlElement(name = "MessageGroup")
    protected String messageGroup;
    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "ObjectInformation")
    protected String objectInformation;
    @XmlElement(name = "Severity")
    protected String severity;
    @XmlElement(name = "SubmittedBy")
    protected String submittedBy;

    /**
     * Gets the value of the alert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlert() {
        return alert;
    }

    /**
     * Sets the value of the alert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlert(String value) {
        this.alert = value;
    }

    /**
     * Gets the value of the applicationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationInformation() {
        return applicationInformation;
    }

    /**
     * Sets the value of the applicationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationInformation(String value) {
        this.applicationInformation = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the hpomID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpomID() {
        return hpomID;
    }

    /**
     * Sets the value of the hpomID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpomID(String value) {
        this.hpomID = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the masterSiebelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterSiebelID() {
        return masterSiebelID;
    }

    /**
     * Sets the value of the masterSiebelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterSiebelID(String value) {
        this.masterSiebelID = value;
    }

    /**
     * Gets the value of the messageGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageGroup() {
        return messageGroup;
    }

    /**
     * Sets the value of the messageGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageGroup(String value) {
        this.messageGroup = value;
    }

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the objectInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectInformation() {
        return objectInformation;
    }

    /**
     * Sets the value of the objectInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectInformation(String value) {
        this.objectInformation = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the submittedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Sets the value of the submittedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedBy(String value) {
        this.submittedBy = value;
    }

}
