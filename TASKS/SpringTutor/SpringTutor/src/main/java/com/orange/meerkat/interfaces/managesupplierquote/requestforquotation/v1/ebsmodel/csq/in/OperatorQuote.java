
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorQuote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuoteItem" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}QuoteItem_OQ"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorQuote", propOrder = {
    "quoteItem"
})
public class OperatorQuote {

    @XmlElement(name = "QuoteItem", required = true)
    protected QuoteItemOQ quoteItem;

    /**
     * Gets the value of the quoteItem property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteItemOQ }
     *     
     */
    public QuoteItemOQ getQuoteItem() {
        return quoteItem;
    }

    /**
     * Sets the value of the quoteItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteItemOQ }
     *     
     */
    public void setQuoteItem(QuoteItemOQ value) {
        this.quoteItem = value;
    }

}
