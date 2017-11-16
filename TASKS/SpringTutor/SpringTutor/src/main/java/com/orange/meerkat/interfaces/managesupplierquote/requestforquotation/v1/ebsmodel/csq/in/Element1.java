
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Element1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Element1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="staircaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="floorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="residenceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeographicCoordinates" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}GeographicCoordinates_SubNetwork"/&gt;
 *         &lt;element name="Street" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}Street_SubNetwork" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}City_SubNetwork" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}State_SubNetwork" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}Country_SubNetwork"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Element1", propOrder = {
    "apartmentNumber",
    "staircaseNumber",
    "floorNumber",
    "buildingName",
    "residenceName",
    "locality",
    "postalCode",
    "geographicCoordinates",
    "street",
    "city",
    "state",
    "country"
})
public class Element1 {

    protected String apartmentNumber;
    protected String staircaseNumber;
    protected String floorNumber;
    protected String buildingName;
    protected String residenceName;
    protected String locality;
    protected String postalCode;
    @XmlElement(name = "GeographicCoordinates", required = true)
    protected GeographicCoordinatesSubNetwork geographicCoordinates;
    @XmlElement(name = "Street")
    protected StreetSubNetwork street;
    @XmlElement(name = "City")
    protected CitySubNetwork city;
    @XmlElement(name = "State")
    protected StateSubNetwork state;
    @XmlElement(name = "Country", required = true)
    protected CountrySubNetwork country;

    /**
     * Gets the value of the apartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Sets the value of the apartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentNumber(String value) {
        this.apartmentNumber = value;
    }

    /**
     * Gets the value of the staircaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaircaseNumber() {
        return staircaseNumber;
    }

    /**
     * Sets the value of the staircaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaircaseNumber(String value) {
        this.staircaseNumber = value;
    }

    /**
     * Gets the value of the floorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorNumber() {
        return floorNumber;
    }

    /**
     * Sets the value of the floorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorNumber(String value) {
        this.floorNumber = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingName(String value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the residenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceName() {
        return residenceName;
    }

    /**
     * Sets the value of the residenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceName(String value) {
        this.residenceName = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the geographicCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicCoordinatesSubNetwork }
     *     
     */
    public GeographicCoordinatesSubNetwork getGeographicCoordinates() {
        return geographicCoordinates;
    }

    /**
     * Sets the value of the geographicCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicCoordinatesSubNetwork }
     *     
     */
    public void setGeographicCoordinates(GeographicCoordinatesSubNetwork value) {
        this.geographicCoordinates = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link StreetSubNetwork }
     *     
     */
    public StreetSubNetwork getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetSubNetwork }
     *     
     */
    public void setStreet(StreetSubNetwork value) {
        this.street = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CitySubNetwork }
     *     
     */
    public CitySubNetwork getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitySubNetwork }
     *     
     */
    public void setCity(CitySubNetwork value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateSubNetwork }
     *     
     */
    public StateSubNetwork getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateSubNetwork }
     *     
     */
    public void setState(StateSubNetwork value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubNetwork }
     *     
     */
    public CountrySubNetwork getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubNetwork }
     *     
     */
    public void setCountry(CountrySubNetwork value) {
        this.country = value;
    }

}
