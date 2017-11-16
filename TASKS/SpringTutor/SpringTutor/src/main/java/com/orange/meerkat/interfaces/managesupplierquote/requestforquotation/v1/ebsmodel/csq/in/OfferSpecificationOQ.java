
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferSpecification_OQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferSpecification_OQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offerSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numberOfIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeOfIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="symmetry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferSpecification_OQ", propOrder = {
    "offerSpecificationCode",
    "offerSpecificationLabel",
    "numberOfIP",
    "typeOfIP",
    "offerGrade",
    "symmetry"
})
public class OfferSpecificationOQ {

    protected String offerSpecificationCode;
    @XmlElement(required = true)
    protected String offerSpecificationLabel;
    protected String numberOfIP;
    protected String typeOfIP;
    protected String offerGrade;
    protected String symmetry;

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

}
