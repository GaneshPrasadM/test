
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.usq.out;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EligibilityDecision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibilityDecision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="local_decisionCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="local_decisionComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibilityDecision", propOrder = {
    "localDecisionCode",
    "localDecisionComments"
})
public class EligibilityDecision {

    @XmlElement(name = "local_decisionCode", required = true)
    protected String localDecisionCode;
    @XmlElement(name = "local_decisionComments")
    protected String localDecisionComments;

    /**
     * Gets the value of the localDecisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDecisionCode() {
        return localDecisionCode;
    }

    /**
     * Sets the value of the localDecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDecisionCode(String value) {
        this.localDecisionCode = value;
    }

    /**
     * Gets the value of the localDecisionComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDecisionComments() {
        return localDecisionComments;
    }

    /**
     * Sets the value of the localDecisionComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDecisionComments(String value) {
        this.localDecisionComments = value;
    }

}
