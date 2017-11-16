
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.usq.out;

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
 *         &lt;element name="local_pricingResultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productSpecificationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FunctionSpecification" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/Out}FunctionSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TariffSpecification" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/Out}TariffSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubNetwork" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/Out}SubNetwork" minOccurs="0"/&gt;
 *         &lt;element name="Local_EligibilityDecision" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/Out}EligibilityDecision" minOccurs="0"/&gt;
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
    "localPricingResultType",
    "productSpecificationType",
    "functionSpecification",
    "tariffSpecification",
    "subNetwork",
    "localEligibilityDecision"
})
public class ProductSpecification {

    @XmlElement(name = "local_pricingResultType")
    protected String localPricingResultType;
    @XmlElement(required = true)
    protected String productSpecificationType;
    @XmlElement(name = "FunctionSpecification")
    protected List<FunctionSpecification> functionSpecification;
    @XmlElement(name = "TariffSpecification")
    protected List<TariffSpecification> tariffSpecification;
    @XmlElement(name = "SubNetwork")
    protected SubNetwork subNetwork;
    @XmlElement(name = "Local_EligibilityDecision")
    protected EligibilityDecision localEligibilityDecision;

    /**
     * Gets the value of the localPricingResultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPricingResultType() {
        return localPricingResultType;
    }

    /**
     * Sets the value of the localPricingResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPricingResultType(String value) {
        this.localPricingResultType = value;
    }

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
     * Gets the value of the tariffSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffSpecification }
     * 
     * 
     */
    public List<TariffSpecification> getTariffSpecification() {
        if (tariffSpecification == null) {
            tariffSpecification = new ArrayList<TariffSpecification>();
        }
        return this.tariffSpecification;
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

    /**
     * Gets the value of the localEligibilityDecision property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityDecision }
     *     
     */
    public EligibilityDecision getLocalEligibilityDecision() {
        return localEligibilityDecision;
    }

    /**
     * Sets the value of the localEligibilityDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityDecision }
     *     
     */
    public void setLocalEligibilityDecision(EligibilityDecision value) {
        this.localEligibilityDecision = value;
    }

}
