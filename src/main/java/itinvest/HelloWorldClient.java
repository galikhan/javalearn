package itinvest;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorldClient {

    public static void main(String [] args) throws MalformedURLException {

//        URL url = new URL("http://localhost:7779/ws/hello?wsdl");
        URL url = new URL("http://localhost:5555/name?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
//        QName qname = new QName("http://itinvest.kz/", "HelloWorldImplService");
        QName qname = new QName("http://itinvest.kz/", "SkCasesServices");
        Service service = Service.create(url, qname);

//        service.getPort()

//        HelloWorld hello = service.getPort(HelloWorld.class);
//        System.out.println(hello.getHelloWorldAsString());
    }
}
