package itinvest;

import javax.xml.ws.Endpoint;

public class Publisher {

    public static void main(String [] args) {
        String iin = "881205350510";
        System.out.println("fiths value " + iin.substring(4, 5));
        System.out.println("6 value " + iin.substring(5, 6));
        System.out.println("service endpoint published");
        Endpoint.publish("http://localhost:7779/ws/hello", new HelloWorldImpl());
    }
}
