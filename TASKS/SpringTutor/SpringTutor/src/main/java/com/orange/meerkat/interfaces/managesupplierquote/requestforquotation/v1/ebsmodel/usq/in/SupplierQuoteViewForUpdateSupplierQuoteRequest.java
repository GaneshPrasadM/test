
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.usq.in;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierQuoteViewForUpdateSupplierQuoteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierQuoteViewForUpdateSupplierQuoteRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="local_callingSystem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="local_refId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QuoteItem" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/In}QuoteItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierQuoteViewForUpdateSupplierQuoteRequest", propOrder = {
    "localCallingSystem",
    "localRefId",
    "quoteItem"
})
public class SupplierQuoteViewForUpdateSupplierQuoteRequest {

    @XmlElement(name = "local_callingSystem", required = true)
    protected String localCallingSystem;
    @XmlElement(name = "local_refId", required = true)
    protected String localRefId;
    @XmlElement(name = "QuoteItem")
    protected List<QuoteItem> quoteItem;

    /**
     * Gets the value of the localCallingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCallingSystem() {
        return localCallingSystem;
    }

    /**
     * Sets the value of the localCallingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCallingSystem(String value) {
        this.localCallingSystem = value;
    }

    /**
     * Gets the value of the localRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRefId() {
        return localRefId;
    }

    /**
     * Sets the value of the localRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalRefId(String value) {
        this.localRefId = value;
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
