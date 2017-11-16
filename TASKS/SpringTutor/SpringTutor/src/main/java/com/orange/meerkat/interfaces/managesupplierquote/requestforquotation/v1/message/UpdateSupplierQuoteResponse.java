
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.message;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.usq.out.SupplierQuoteViewForUpdateSupplierQuoteResponse;


/**
 * <p>Java class for UpdateSupplierQuoteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSupplierQuoteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierQuoteResp" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/Out}SupplierQuoteViewForUpdateSupplierQuoteResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSupplierQuoteResponse", propOrder = {
    "supplierQuoteResp"
})
public class UpdateSupplierQuoteResponse {

    @XmlElement(name = "SupplierQuoteResp")
    protected List<SupplierQuoteViewForUpdateSupplierQuoteResponse> supplierQuoteResp;

    /**
     * Gets the value of the supplierQuoteResp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierQuoteResp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierQuoteResp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierQuoteViewForUpdateSupplierQuoteResponse }
     * 
     * 
     */
    public List<SupplierQuoteViewForUpdateSupplierQuoteResponse> getSupplierQuoteResp() {
        if (supplierQuoteResp == null) {
            supplierQuoteResp = new ArrayList<SupplierQuoteViewForUpdateSupplierQuoteResponse>();
        }
        return this.supplierQuoteResp;
    }

}
