
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.usq.in.SupplierQuoteViewForUpdateSupplierQuoteRequest;


/**
 * <p>Java class for UpdateSupplierQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSupplierQuote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierQuote" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/In}SupplierQuoteViewForUpdateSupplierQuoteRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSupplierQuote", propOrder = {
    "supplierQuote"
})
public class UpdateSupplierQuote {

    @XmlElement(name = "SupplierQuote", required = true)
    protected SupplierQuoteViewForUpdateSupplierQuoteRequest supplierQuote;

    /**
     * Gets the value of the supplierQuote property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierQuoteViewForUpdateSupplierQuoteRequest }
     *     
     */
    public SupplierQuoteViewForUpdateSupplierQuoteRequest getSupplierQuote() {
        return supplierQuote;
    }

    /**
     * Sets the value of the supplierQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierQuoteViewForUpdateSupplierQuoteRequest }
     *     
     */
    public void setSupplierQuote(SupplierQuoteViewForUpdateSupplierQuoteRequest value) {
        this.supplierQuote = value;
    }

}
