
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offerSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}Currency" minOccurs="0"/&gt;
 *         &lt;element name="CommitmentSpecification" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}CommitmentSpecification" minOccurs="0"/&gt;
 *         &lt;element name="ProductSpecification" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}ProductSpecification"/&gt;
 *         &lt;element name="Catalogue" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}Catalogue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferSpecification", propOrder = {
    "offerSpecificationCode",
    "offerSpecificationLabel",
    "currency",
    "commitmentSpecification",
    "productSpecification",
    "catalogue"
})
public class OfferSpecification {

    protected String offerSpecificationCode;
    protected String offerSpecificationLabel;
    @XmlElement(name = "Currency")
    protected Currency currency;
    @XmlElement(name = "CommitmentSpecification")
    protected CommitmentSpecification commitmentSpecification;
    @XmlElement(name = "ProductSpecification", required = true)
    protected ProductSpecification productSpecification;
    @XmlElement(name = "Catalogue")
    protected Catalogue catalogue;

    /**
     * Gets the value of the offerSpecificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferSpecificationCode() {
        return offerSpecificationCode;
    }

    /**
     * Sets the value of the offerSpecificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferSpecificationCode(String value) {
        this.offerSpecificationCode = value;
    }

    /**
     * Gets the value of the offerSpecificationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferSpecificationLabel() {
        return offerSpecificationLabel;
    }

    /**
     * Sets the value of the offerSpecificationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferSpecificationLabel(String value) {
        this.offerSpecificationLabel = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the commitmentSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentSpecification }
     *     
     */
    public CommitmentSpecification getCommitmentSpecification() {
        return commitmentSpecification;
    }

    /**
     * Sets the value of the commitmentSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentSpecification }
     *     
     */
    public void setCommitmentSpecification(CommitmentSpecification value) {
        this.commitmentSpecification = value;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSpecification }
     *     
     */
    public ProductSpecification getProductSpecification() {
        return productSpecification;
    }

    /**
     * Sets the value of the productSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSpecification }
     *     
     */
    public void setProductSpecification(ProductSpecification value) {
        this.productSpecification = value;
    }

    /**
     * Gets the value of the catalogue property.
     * 
     * @return
     *     possible object is
     *     {@link Catalogue }
     *     
     */
    public Catalogue getCatalogue() {
        return catalogue;
    }

    /**
     * Sets the value of the catalogue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Catalogue }
     *     
     */
    public void setCatalogue(Catalogue value) {
        this.catalogue = value;
    }

}
