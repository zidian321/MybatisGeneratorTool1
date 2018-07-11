//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.11 at 01:38:06 PM CST 
//


package demo.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reports" type="{}ReportType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scrt-report-data" type="{}SCRTReportType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "list")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListType", propOrder = {
    "reports",
    "scrtReportData"
})
public class ListType {

    protected List<ReportType> reports;
    @XmlElement(name = "scrt-report-data")
    protected List<SCRTReportType> scrtReportData;

    /**
     * Gets the value of the reports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportType }
     * 
     * 
     */
    public List<ReportType> getReports() {
        if (reports == null) {
            reports = new ArrayList<ReportType>();
        }
        return this.reports;
    }

    /**
     * Gets the value of the scrtReportData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scrtReportData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScrtReportData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCRTReportType }
     * 
     * 
     */
    public List<SCRTReportType> getScrtReportData() {
        if (scrtReportData == null) {
            scrtReportData = new ArrayList<SCRTReportType>();
        }
        return this.scrtReportData;
    }

}
