
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.usq.out;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SupplierQuoteViewForUpdateSupplierQuoteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierQuoteViewForUpdateSupplierQuoteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="local_businessOpportunityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="local_accessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteItem" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/Out}QuoteItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierQuoteViewForUpdateSupplierQuoteResponse", propOrder = {
    "creationDate",
    "localBusinessOpportunityType",
    "localAccessType",
    "quoteItem"
})
public class SupplierQuoteViewForUpdateSupplierQuoteResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "local_businessOpportunityType")
    protected String localBusinessOpportunityType;
    @XmlElement(name = "local_accessType")
    protected String localAccessType;
    @XmlElement(name = "QuoteItem", required = true)
    protected List<QuoteItem> quoteItem;

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the localBusinessOpportunityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalBusinessOpportunityType() {
        return localBusinessOpportunityType;
    }

    /**
     * Sets the value of the localBusinessOpportunityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalBusinessOpportunityType(String value) {
        this.localBusinessOpportunityType = value;
    }

    /**
     * Gets the value of the localAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAccessType() {
        return localAccessType;
    }

    /**
     * Sets the value of the localAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAccessType(String value) {
        this.localAccessType = value;
    }

    /**
     * Gets the value of the quoteItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteItem }
     * 
     * 
     */
    public List<QuoteItem> getQuoteItem() {
        if (quoteItem == null) {
            quoteItem = new ArrayList<QuoteItem>();
        }
        return this.quoteItem;
    }

}
