
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="functionSpecificationLabel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FunctionValueSpecification" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}FunctionValueSpecification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionSpecification", propOrder = {
    "functionSpecificationLabel",
    "functionValueSpecification"
})
public class FunctionSpecification {

    @XmlElement(required = true)
    protected String functionSpecificationLabel;
    @XmlElement(name = "FunctionValueSpecification", required = true)
    protected FunctionValueSpecification functionValueSpecification;

    /**
     * Gets the value of the functionSpecificationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionSpecificationLabel() {
        return functionSpecificationLabel;
    }

    /**
     * Sets the value of the functionSpecificationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionSpecificationLabel(String value) {
        this.functionSpecificationLabel = value;
    }

    /**
     * Gets the value of the functionValueSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionValueSpecification }
     *     
     */
    public FunctionValueSpecification getFunctionValueSpecification() {
        return functionValueSpecification;
    }

    /**
     * Sets the value of the functionValueSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionValueSpecification }
     *     
     */
    public void setFunctionValueSpecification(FunctionValueSpecification value) {
        this.functionValueSpecification = value;
    }

}
