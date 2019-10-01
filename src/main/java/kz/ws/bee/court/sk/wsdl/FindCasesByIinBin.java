
package kz.ws.bee.court.sk.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findCasesByIinBin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findCasesByIinBin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iinBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCasesByIinBin", propOrder = {
    "iinBin",
    "page"
})
public class FindCasesByIinBin {

    protected String iinBin;
    protected int page;

    /**
     * Gets the value of the iinBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIinBin() {
        return iinBin;
    }

    /**
     * Sets the value of the iinBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIinBin(String value) {
        this.iinBin = value;
    }

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

}
