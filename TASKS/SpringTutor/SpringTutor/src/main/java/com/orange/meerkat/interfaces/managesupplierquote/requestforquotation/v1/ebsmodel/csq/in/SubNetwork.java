
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="subNetworkID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SubNetworkRole" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}SubNetworkRole" minOccurs="0"/&gt;
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
    "subNetworkRole"
})
public class SubNetwork {

    @XmlElement(required = true)
    protected List<String> subNetworkID;
    @XmlElement(name = "SubNetworkRole")
    protected SubNetworkRole subNetworkRole;

    /**
     * Gets the value of the subNetworkID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subNetworkID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubNetworkID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubNetworkID() {
        if (subNetworkID == null) {
            subNetworkID = new ArrayList<String>();
        }
        return this.subNetworkID;
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

}
