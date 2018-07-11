    package draft.xml;  
      
    import java.io.FileInputStream;  
    import java.io.FileOutputStream;  
    import java.io.OutputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;  
    import javax.xml.bind.JAXBElement;  
    import javax.xml.bind.Marshaller;  
    import javax.xml.bind.Unmarshaller;  
      
    public class jaxbDemo {
    	public static DraftType report;
          
        public static void main(String[] args) throws Exception {  
            unmarshalling();  
             marshalling();  
        }  
          
        static void unmarshalling() throws Exception{             
    		JAXBContext ctx = JAXBContext.newInstance(ObjectFactory.class);
    		Unmarshaller unmarshaller = ctx.createUnmarshaller();
    		@SuppressWarnings("unchecked")
    		String f = jaxbDemo.class.getResource("a.xml").getPath();
			JAXBElement<DraftType> jaxbElem= (JAXBElement<DraftType>) unmarshaller.unmarshal( new FileInputStream(   
                    f));
			DraftType Report = jaxbElem.getValue();
    		report = Report;
    		//System.out.println(Report.getReports().get(0).getItem().get(0).getAReport().get(0).getFILEPART());
        }  
          
        static void marshalling()throws Exception{  
    		JAXBContext ctx = JAXBContext.newInstance(ObjectFactory.class); 
            Marshaller ms = ctx.createMarshaller();  
            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
              
              
            OutputStream os = new FileOutputStream("F:\\xmldemo\\b.xml");  
            ms.marshal(report, os);  
            os.close();  
        }  
      
    }  