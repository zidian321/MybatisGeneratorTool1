//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.11 at 03:31:36 PM CST 
//


package demo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FILE_PART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROW_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aReportType", propOrder = {
    "filepart",
    "rowid"
})
public class AReportType {

    @XmlElement(name = "FILE_PART")
    protected String filepart;
    @XmlElement(name = "ROW_ID")
    protected String rowid;

    /**
     * Gets the value of the filepart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILEPART() {
        return filepart;
    }

    /**
     * Sets the value of the filepart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILEPART(String value) {
        this.filepart = value;
    }

    /**
     * Gets the value of the rowid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROWID() {
        return rowid;
    }

    /**
     * Sets the value of the rowid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROWID(String value) {
        this.rowid = value;
    }

}
