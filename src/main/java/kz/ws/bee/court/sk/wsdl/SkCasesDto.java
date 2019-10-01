
package kz.ws.bee.court.sk.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for skCasesDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="skCasesDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="casetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decreeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="decreeStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="participantType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "skCasesDto", propOrder = {
    "number",
    "casetype",
    "organization",
    "decreeDate",
    "decreeStartDate",
    "participantType",
    "caseCategory"
})
public class SkCasesDto {

    protected String number;
    protected String casetype;
    protected String organization;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar decreeDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar decreeStartDate;
    protected String participantType;
    protected String caseCategory;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the casetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasetype() {
        return casetype;
    }

    /**
     * Sets the value of the casetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasetype(String value) {
        this.casetype = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the decreeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecreeDate() {
        return decreeDate;
    }

    /**
     * Sets the value of the decreeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecreeDate(XMLGregorianCalendar value) {
        this.decreeDate = value;
    }

    /**
     * Gets the value of the decreeStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecreeStartDate() {
        return decreeStartDate;
    }

    /**
     * Sets the value of the decreeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecreeStartDate(XMLGregorianCalendar value) {
        this.decreeStartDate = value;
    }

    /**
     * Gets the value of the participantType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantType() {
        return participantType;
    }

    /**
     * Sets the value of the participantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantType(String value) {
        this.participantType = value;
    }

    /**
     * Gets the value of the caseCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseCategory() {
        return caseCategory;
    }

    /**
     * Sets the value of the caseCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseCategory(String value) {
        this.caseCategory = value;
    }

}
