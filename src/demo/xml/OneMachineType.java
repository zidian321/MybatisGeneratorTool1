//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.11 at 01:38:06 PM CST 
//


package demo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oneMachineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oneMachineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="machine-serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="machine-type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="machine-capacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="designated-machine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oneMachineType", propOrder = {
    "machineSerial",
    "machineType",
    "machineCapacity",
    "designatedMachine"
})
public class OneMachineType {

    @XmlElement(name = "machine-serial")
    protected String machineSerial;
    @XmlElement(name = "machine-type")
    protected String machineType;
    @XmlElement(name = "machine-capacity")
    protected String machineCapacity;
    @XmlElement(name = "designated-machine")
    protected String designatedMachine;

    /**
     * Gets the value of the machineSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineSerial() {
        return machineSerial;
    }

    /**
     * Sets the value of the machineSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineSerial(String value) {
        this.machineSerial = value;
    }

    /**
     * Gets the value of the machineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineType() {
        return machineType;
    }

    /**
     * Sets the value of the machineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineType(String value) {
        this.machineType = value;
    }

    /**
     * Gets the value of the machineCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineCapacity() {
        return machineCapacity;
    }

    /**
     * Sets the value of the machineCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineCapacity(String value) {
        this.machineCapacity = value;
    }

    /**
     * Gets the value of the designatedMachine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignatedMachine() {
        return designatedMachine;
    }

    /**
     * Sets the value of the designatedMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatedMachine(String value) {
        this.designatedMachine = value;
    }

}