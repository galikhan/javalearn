
package kz.ws.bee.court.sk.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kz.ws.bee.court.sk.wsdl package. 
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

    private final static QName _FindCasesByIinBin_QNAME = new QName("http://sk.court.bee.ws.kz/wsdl", "findCasesByIinBin");
    private final static QName _FindCasesByIinBinResponse_QNAME = new QName("http://sk.court.bee.ws.kz/wsdl", "findCasesByIinBinResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kz.ws.bee.court.sk.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SkCasesResponse }
     * 
     */
    public SkCasesResponse createSkCasesResponse() {
        return new SkCasesResponse();
    }

    /**
     * Create an instance of {@link FindCasesByIinBinResponse }
     * 
     */
    public FindCasesByIinBinResponse createFindCasesByIinBinResponse() {
        return new FindCasesByIinBinResponse();
    }

    /**
     * Create an instance of {@link FindCasesByIinBin }
     * 
     */
    public FindCasesByIinBin createFindCasesByIinBin() {
        return new FindCasesByIinBin();
    }

    /**
     * Create an instance of {@link SkCasesDto }
     * 
     */
    public SkCasesDto createSkCasesDto() {
        return new SkCasesDto();
    }

    /**
     * Create an instance of {@link SkCasesResponse.Cases }
     * 
     */
    public SkCasesResponse.Cases createSkCasesResponseCases() {
        return new SkCasesResponse.Cases();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCasesByIinBin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sk.court.bee.ws.kz/wsdl", name = "findCasesByIinBin")
    public JAXBElement<FindCasesByIinBin> createFindCasesByIinBin(FindCasesByIinBin value) {
        return new JAXBElement<FindCasesByIinBin>(_FindCasesByIinBin_QNAME, FindCasesByIinBin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCasesByIinBinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sk.court.bee.ws.kz/wsdl", name = "findCasesByIinBinResponse")
    public JAXBElement<FindCasesByIinBinResponse> createFindCasesByIinBinResponse(FindCasesByIinBinResponse value) {
        return new JAXBElement<FindCasesByIinBinResponse>(_FindCasesByIinBinResponse_QNAME, FindCasesByIinBinResponse.class, null, value);
    }

}
