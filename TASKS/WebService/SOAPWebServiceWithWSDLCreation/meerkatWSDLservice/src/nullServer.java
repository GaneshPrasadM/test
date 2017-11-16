
package $intf.PackageName;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2017-09-01T05:11:01.533+05:30
 * Generated source version: 2.7.7
 * 
 */
 
public class ${intf.Name}Server{

    protected ${intf.Name}Server() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new com.websystique.spring.configuration.ProducerApplication();
        String address = "http://localhost:9090/RequestHandlerPort";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new ${intf.Name}Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
 
 