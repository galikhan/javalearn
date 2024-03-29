package kz.ws.bee.court.sk.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.14.redhat-1
 * 2019-09-27T11:22:52.062+06:00
 * Generated source version: 2.7.14.redhat-1
 * 
 */
@WebService(targetNamespace = "http://sk.court.bee.ws.kz/wsdl", name = "skCases")
@XmlSeeAlso({ObjectFactory.class})
public interface SkCases {

    @WebMethod(action = "urn:findCasesByIinBin")
    @Action(input = "urn:findCasesByIinBin", output = "http://sk.court.bee.ws.kz/wsdl/skCases/findCasesByIinBinResponse")
    @RequestWrapper(localName = "findCasesByIinBin", targetNamespace = "http://sk.court.bee.ws.kz/wsdl", className = "kz.ws.bee.court.sk.wsdl.FindCasesByIinBin")
    @ResponseWrapper(localName = "findCasesByIinBinResponse", targetNamespace = "http://sk.court.bee.ws.kz/wsdl", className = "kz.ws.bee.court.sk.wsdl.FindCasesByIinBinResponse")
    @WebResult(name = "return", targetNamespace = "")
    public SkCasesResponse findCasesByIinBin(
            @WebParam(name = "iinBin", targetNamespace = "")
                    String iinBin,
            @WebParam(name = "page", targetNamespace = "")
                    int page
    );
}
