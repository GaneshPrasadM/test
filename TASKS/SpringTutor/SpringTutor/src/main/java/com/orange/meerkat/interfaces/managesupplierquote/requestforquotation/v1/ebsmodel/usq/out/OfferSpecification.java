
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.usq.out;

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
 *         &lt;element name="offerSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offerSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numberOfIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeOfIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="areaCovered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ispProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pstnResponsibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceAvailability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrierQuoteRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mttr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contentionRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ltc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trafficRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="demarcationInterface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orangeCpeResp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="symmetry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/Out}Currency" minOccurs="0"/&gt;
 *         &lt;element name="CommitmentSpecification" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/Out}CommitmentSpecification" minOccurs="0"/&gt;
 *         &lt;element name="ProductSpecification" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/Out}ProductSpecification"/&gt;
 *         &lt;element name="Catalogue" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/Out}Catalogue"/&gt;
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
    "numberOfIP",
    "typeOfIP",
    "areaCovered",
    "ispProductName",
    "pstnResponsibility",
    "serviceAvailability",
    "carrierQuoteRef",
    "mttr",
    "contentionRatio",
    "ltc",
    "trafficRestrictions",
    "demarcationInterface",
    "orangeCpeResp",
    "offerId",
    "offerStatus",
    "offerGrade",
    "symmetry",
    "currency",
    "commitmentSpecification",
    "productSpecification",
    "catalogue"
})
public class OfferSpecification {

    @XmlElement(required = true)
    protected String offerSpecificationCode;
    @XmlElement(required = true)
    protected String offerSpecificationLabel;
    protected String numberOfIP;
    protected String typeOfIP;
    protected String areaCovered;
    protected String ispProductName;
    protected String pstnResponsibility;
    protected String serviceAvailability;
    protected String carrierQuoteRef;
    protected String mttr;
    protected String contentionRatio;
    protected String ltc;
    protected String trafficRestrictions;
    protected String demarcationInterface;
    protected String orangeCpeResp;
    protected String offerId;
    protected String offerStatus;
    protected String offerGrade;
    protected String symmetry;
    @XmlElement(name = "Currency")
    protected Currency currency;
    @XmlElement(name = "CommitmentSpecification")
    protected CommitmentSpecification commitmentSpecification;
    @XmlElement(name = "ProductSpecification", required = true)
    protected ProductSpecification productSpecification;
    @XmlElement(name = "Catalogue", required = true)
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
     * Gets the value of the numberOfIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfIP() {
        return numberOfIP;
    }

    /**
     * Sets the value of the numberOfIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfIP(String value) {
        this.numberOfIP = value;
    }

    /**
     * Gets the value of the typeOfIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfIP() {
        return typeOfIP;
    }

    /**
     * Sets the value of the typeOfIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfIP(String value) {
        this.typeOfIP = value;
    }

    /**
     * Gets the value of the areaCovered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCovered() {
        return areaCovered;
    }

    /**
     * Sets the value of the areaCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCovered(String value) {
        this.areaCovered = value;
    }

    /**
     * Gets the value of the ispProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIspProductName() {
        return ispProductName;
    }

    /**
     * Sets the value of the ispProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIspProductName(String value) {
        this.ispProductName = value;
    }

    /**
     * Gets the value of the pstnResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstnResponsibility() {
        return pstnResponsibility;
    }

    /**
     * Sets the value of the pstnResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstnResponsibility(String value) {
        this.pstnResponsibility = value;
    }

    /**
     * Gets the value of the serviceAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAvailability() {
        return serviceAvailability;
    }

    /**
     * Sets the value of the serviceAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAvailability(String value) {
        this.serviceAvailability = value;
    }

    /**
     * Gets the value of the carrierQuoteRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierQuoteRef() {
        return carrierQuoteRef;
    }

    /**
     * Sets the value of the carrierQuoteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierQuoteRef(String value) {
        this.carrierQuoteRef = value;
    }

    /**
     * Gets the value of the mttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMttr() {
        return mttr;
    }

    /**
     * Sets the value of the mttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMttr(String value) {
        this.mttr = value;
    }

    /**
     * Gets the value of the contentionRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentionRatio() {
        return contentionRatio;
    }

    /**
     * Sets the value of the contentionRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentionRatio(String value) {
        this.contentionRatio = value;
    }

    /**
     * Gets the value of the ltc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtc() {
        return ltc;
    }

    /**
     * Sets the value of the ltc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtc(String value) {
        this.ltc = value;
    }

    /**
     * Gets the value of the trafficRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficRestrictions() {
        return trafficRestrictions;
    }

    /**
     * Sets the value of the trafficRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficRestrictions(String value) {
        this.trafficRestrictions = value;
    }

    /**
     * Gets the value of the demarcationInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemarcationInterface() {
        return demarcationInterface;
    }

    /**
     * Sets the value of the demarcationInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemarcationInterface(String value) {
        this.demarcationInterface = value;
    }

    /**
     * Gets the value of the orangeCpeResp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrangeCpeResp() {
        return orangeCpeResp;
    }

    /**
     * Sets the value of the orangeCpeResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrangeCpeResp(String value) {
        this.orangeCpeResp = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferId(String value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the offerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferStatus() {
        return offerStatus;
    }

    /**
     * Sets the value of the offerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferStatus(String value) {
        this.offerStatus = value;
    }

    /**
     * Gets the value of the offerGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferGrade() {
        return offerGrade;
    }

    /**
     * Sets the value of the offerGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferGrade(String value) {
        this.offerGrade = value;
    }

    /**
     * Gets the value of the symmetry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymmetry() {
        return symmetry;
    }

    /**
     * Sets the value of the symmetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymmetry(String value) {
        this.symmetry = value;
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
