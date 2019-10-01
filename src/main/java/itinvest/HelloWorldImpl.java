package itinvest;


import javax.jws.WebService;

@WebService(endpointInterface = "itinvest.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString() {
        return "Hello world of web service";
    }
}
