package kz.ws.bee.court.sk.wsdl;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:10406/ws/sk-cases?wsdl");

        QName qName = new QName("http://sk.court.bee.ws.kz/wsdl", "SkCasesServiceService");

//        SkCasesServicesService service = new SkCasesServicesService(url, qName);
        SkCasesServiceService serviceService = new SkCasesServiceService(url, qName);
        SkCases cases = serviceService.getSkCasesPort();
        SkCasesResponse response = cases.findCasesByIinBin("881205350510", 2);
        System.out.println(" code " + response.code + " - msg : " + response.message + " value : "  + response.getCases());
        if(response.code == 200) {
            List<SkCasesDto> list = response.getCases().getCase();
            list.stream().forEach(value -> {
                        System.out.println(value.number + " - " + value.participantType + " : " + value.decreeDate + " - " + value.decreeStartDate);
                    }
            );
        } else {
            System.out.println("error");
        }
    }
}
