
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.usq.out;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffSpecificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TariffValueSpec" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/USQ/Out}TariffValueSpec"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffSpecification", propOrder = {
    "tariffSpecificationCode",
    "tariffValueSpec"
})
public class TariffSpecification {

    @XmlElement(required = true)
    protected String tariffSpecificationCode;
    @XmlElement(name = "TariffValueSpec", required = true)
    protected TariffValueSpec tariffValueSpec;

    /**
     * Gets the value of the tariffSpecificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffSpecificationCode() {
        return tariffSpecificationCode;
    }

    /**
     * Sets the value of the tariffSpecificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffSpecificationCode(String value) {
        this.tariffSpecificationCode = value;
    }

    /**
     * Gets the value of the tariffValueSpec property.
     * 
     * @return
     *     possible object is
     *     {@link TariffValueSpec }
     *     
     */
    public TariffValueSpec getTariffValueSpec() {
        return tariffValueSpec;
    }

    /**
     * Sets the value of the tariffValueSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffValueSpec }
     *     
     */
    public void setTariffValueSpec(TariffValueSpec value) {
        this.tariffValueSpec = value;
    }

}
