    package demo.xml;  
      
    import java.io.FileInputStream;  
    import java.io.FileOutputStream;  
    import java.io.OutputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;  
    import javax.xml.bind.JAXBElement;  
    import javax.xml.bind.Marshaller;  
    import javax.xml.bind.Unmarshaller;  
      
    public class jaxbDemo {
    	public static ListType report;
          
        public static void main(String[] args) throws Exception {  
            unmarshalling();  
             marshalling();  
        }  
          
        static void unmarshalling() throws Exception{             
    		JAXBContext ctx = JAXBContext.newInstance(ObjectFactory.class);
    		Unmarshaller unmarshaller = ctx.createUnmarshaller();
    		@SuppressWarnings("unchecked")
			JAXBElement<ListType> jaxbElem= (JAXBElement<ListType>) unmarshaller.unmarshal( new FileInputStream(   
                    "F:\\xmldemo\\a.xml"));
    		ListType Report = jaxbElem.getValue();
    		report = Report;
    		System.out.println(Report.getReports().get(0).getItem().get(0).getAReport().get(0).getFILEPART());
        }  
          
        static void marshalling()throws Exception{  
    		JAXBContext ctx = JAXBContext.newInstance(ObjectFactory.class); 
            Marshaller ms = ctx.createMarshaller();  
            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
              
            ListType list = new ListType();
            List<SCRTReportType> scrtlist= list.getScrtReportData();
            SCRTReportType scrt = new SCRTReportType();
            scrt.setSubmitDate("fdsfdsfjdshf");
            scrtlist.add(scrt);
              
            OutputStream os = new FileOutputStream("F:\\xmldemo\\b.xml");  
            ms.marshal(report, os);  
            os.close();  
        }  
      
    }  