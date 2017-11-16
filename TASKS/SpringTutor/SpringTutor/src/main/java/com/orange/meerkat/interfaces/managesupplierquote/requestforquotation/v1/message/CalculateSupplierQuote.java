
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in.SupplierQuoteViewForCalculateSupplierQuoteRequest;


/**
 * <p>Java class for CalculateSupplierQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculateSupplierQuote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierQuote" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}SupplierQuoteViewForCalculateSupplierQuoteRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateSupplierQuote", propOrder = {
    "supplierQuote"
})
public class CalculateSupplierQuote {

    @XmlElement(name = "SupplierQuote", required = true)
    protected SupplierQuoteViewForCalculateSupplierQuoteRequest supplierQuote;

    /**
     * Gets the value of the supplierQuote property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierQuoteViewForCalculateSupplierQuoteRequest }
     *     
     */
    public SupplierQuoteViewForCalculateSupplierQuoteRequest getSupplierQuote() {
        return supplierQuote;
    }

    /**
     * Sets the value of the supplierQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierQuoteViewForCalculateSupplierQuoteRequest }
     *     
     */
    public void setSupplierQuote(SupplierQuoteViewForCalculateSupplierQuoteRequest value) {
        this.supplierQuote = value;
    }

}
