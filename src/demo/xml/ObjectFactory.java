//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.11 at 03:31:36 PM CST 
//


package demo.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the demo.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _List_QNAME = new QName("", "list");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: demo.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListType }
     * 
     */
    public ListType createListType() {
        return new ListType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link SCRTReportType }
     * 
     */
    public SCRTReportType createSCRTReportType() {
        return new SCRTReportType();
    }

    /**
     * Create an instance of {@link AReportType }
     * 
     */
    public AReportType createAReportType() {
        return new AReportType();
    }

    /**
     * Create an instance of {@link OneCustomerType }
     * 
     */
    public OneCustomerType createOneCustomerType() {
        return new OneCustomerType();
    }

    /**
     * Create an instance of {@link OneMachineType }
     * 
     */
    public OneMachineType createOneMachineType() {
        return new OneMachineType();
    }

    /**
     * Create an instance of {@link ReportType }
     * 
     */
    public ReportType createReportType() {
        return new ReportType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "list")
    public JAXBElement<ListType> createList(ListType value) {
        return new JAXBElement<ListType>(_List_QNAME, ListType.class, null, value);
    }

}
