
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.out.SupplierQuoteViewForCalculateSupplierQuoteResponse;


/**
 * <p>Java class for CalculateSupplierQuoteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculateSupplierQuoteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierQuoteResp" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/Out}SupplierQuoteViewForCalculateSupplierQuoteResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateSupplierQuoteResponse", propOrder = {
    "supplierQuoteResp"
})
public class CalculateSupplierQuoteResponse {

    @XmlElement(name = "SupplierQuoteResp")
    protected SupplierQuoteViewForCalculateSupplierQuoteResponse supplierQuoteResp;

    /**
     * Gets the value of the supplierQuoteResp property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierQuoteViewForCalculateSupplierQuoteResponse }
     *     
     */
    public SupplierQuoteViewForCalculateSupplierQuoteResponse getSupplierQuoteResp() {
        return supplierQuoteResp;
    }

    /**
     * Sets the value of the supplierQuoteResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierQuoteViewForCalculateSupplierQuoteResponse }
     *     
     */
    public void setSupplierQuoteResp(SupplierQuoteViewForCalculateSupplierQuoteResponse value) {
        this.supplierQuoteResp = value;
    }

}
