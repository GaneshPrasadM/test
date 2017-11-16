
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicCoordinates_SubNetwork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicCoordinates_SubNetwork"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geocodeX" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geocodeY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geocodingSystems" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicCoordinates_SubNetwork", propOrder = {
    "geocodeX",
    "geocodeY",
    "geocodingSystems"
})
public class GeographicCoordinatesSubNetwork {

    @XmlElement(required = true)
    protected String geocodeX;
    @XmlElement(required = true)
    protected String geocodeY;
    @XmlElement(required = true)
    protected String geocodingSystems;

    /**
     * Gets the value of the geocodeX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocodeX() {
        return geocodeX;
    }

    /**
     * Sets the value of the geocodeX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocodeX(String value) {
        this.geocodeX = value;
    }

    /**
     * Gets the value of the geocodeY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocodeY() {
        return geocodeY;
    }

    /**
     * Sets the value of the geocodeY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocodeY(String value) {
        this.geocodeY = value;
    }

    /**
     * Gets the value of the geocodingSystems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocodingSystems() {
        return geocodingSystems;
    }

    /**
     * Sets the value of the geocodingSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocodingSystems(String value) {
        this.geocodingSystems = value;
    }

}
