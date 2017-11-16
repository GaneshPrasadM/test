
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productSpecificationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FunctionSpecification" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}FunctionSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubNetwork" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}SubNetwork" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecification", propOrder = {
    "productSpecificationType",
    "functionSpecification",
    "subNetwork"
})
public class ProductSpecification {

    @XmlElement(required = true)
    protected String productSpecificationType;
    @XmlElement(name = "FunctionSpecification")
    protected List<FunctionSpecification> functionSpecification;
    @XmlElement(name = "SubNetwork")
    protected SubNetwork subNetwork;

    /**
     * Gets the value of the productSpecificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSpecificationType() {
        return productSpecificationType;
    }

    /**
     * Sets the value of the productSpecificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSpecificationType(String value) {
        this.productSpecificationType = value;
    }

    /**
     * Gets the value of the functionSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionSpecification }
     * 
     * 
     */
    public List<FunctionSpecification> getFunctionSpecification() {
        if (functionSpecification == null) {
            functionSpecification = new ArrayList<FunctionSpecification>();
        }
        return this.functionSpecification;
    }

    /**
     * Gets the value of the subNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link SubNetwork }
     *     
     */
    public SubNetwork getSubNetwork() {
        return subNetwork;
    }

    /**
     * Sets the value of the subNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubNetwork }
     *     
     */
    public void setSubNetwork(SubNetwork value) {
        this.subNetwork = value;
    }

}
