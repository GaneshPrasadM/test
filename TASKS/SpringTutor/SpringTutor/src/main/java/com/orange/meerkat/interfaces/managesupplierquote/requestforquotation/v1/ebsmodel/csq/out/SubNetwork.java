
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.out;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubNetwork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubNetwork"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subNetworkID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubNetworkRole" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/Out}SubNetworkRole" minOccurs="0"/&gt;
 *         &lt;element name="Local_Address" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/Out}Address_SubNetwork" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubNetwork", propOrder = {
    "subNetworkID",
    "subNetworkRole",
    "localAddress"
})
public class SubNetwork {

    protected String subNetworkID;
    @XmlElement(name = "SubNetworkRole")
    protected SubNetworkRole subNetworkRole;
    @XmlElement(name = "Local_Address")
    protected AddressSubNetwork localAddress;

    /**
     * Gets the value of the subNetworkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubNetworkID() {
        return subNetworkID;
    }

    /**
     * Sets the value of the subNetworkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubNetworkID(String value) {
        this.subNetworkID = value;
    }

    /**
     * Gets the value of the subNetworkRole property.
     * 
     * @return
     *     possible object is
     *     {@link SubNetworkRole }
     *     
     */
    public SubNetworkRole getSubNetworkRole() {
        return subNetworkRole;
    }

    /**
     * Sets the value of the subNetworkRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubNetworkRole }
     *     
     */
    public void setSubNetworkRole(SubNetworkRole value) {
        this.subNetworkRole = value;
    }

    /**
     * Gets the value of the localAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressSubNetwork }
     *     
     */
    public AddressSubNetwork getLocalAddress() {
        return localAddress;
    }

    /**
     * Sets the value of the localAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSubNetwork }
     *     
     */
    public void setLocalAddress(AddressSubNetwork value) {
        this.localAddress = value;
    }

}
