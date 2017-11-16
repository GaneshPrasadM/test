/**
 * Parameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package meerkatBeanClass;

public class Parameter  implements java.io.Serializable {
    private int buldingNumber;

    private java.lang.String city;

    private java.lang.String country;

    private int latitude;

    private int load;

    private int longitude;

    private int postalCOde;

    private java.lang.String service;

    private int speed;

    private java.lang.String state;

    private java.lang.String streetName;

    private java.lang.String technology;

    public Parameter() {
    }

    public Parameter(
           int buldingNumber,
           java.lang.String city,
           java.lang.String country,
           int latitude,
           int load,
           int longitude,
           int postalCOde,
           java.lang.String service,
           int speed,
           java.lang.String state,
           java.lang.String streetName,
           java.lang.String technology) {
           this.buldingNumber = buldingNumber;
           this.city = city;
           this.country = country;
           this.latitude = latitude;
           this.load = load;
           this.longitude = longitude;
           this.postalCOde = postalCOde;
           this.service = service;
           this.speed = speed;
           this.state = state;
           this.streetName = streetName;
           this.technology = technology;
    }


    /**
     * Gets the buldingNumber value for this Parameter.
     * 
     * @return buldingNumber
     */
    public int getBuldingNumber() {
        return buldingNumber;
    }


    /**
     * Sets the buldingNumber value for this Parameter.
     * 
     * @param buldingNumber
     */
    public void setBuldingNumber(int buldingNumber) {
        this.buldingNumber = buldingNumber;
    }


    /**
     * Gets the city value for this Parameter.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Parameter.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the country value for this Parameter.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Parameter.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the latitude value for this Parameter.
     * 
     * @return latitude
     */
    public int getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this Parameter.
     * 
     * @param latitude
     */
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the load value for this Parameter.
     * 
     * @return load
     */
    public int getLoad() {
        return load;
    }


    /**
     * Sets the load value for this Parameter.
     * 
     * @param load
     */
    public void setLoad(int load) {
        this.load = load;
    }


    /**
     * Gets the longitude value for this Parameter.
     * 
     * @return longitude
     */
    public int getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this Parameter.
     * 
     * @param longitude
     */
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the postalCOde value for this Parameter.
     * 
     * @return postalCOde
     */
    public int getPostalCOde() {
        return postalCOde;
    }


    /**
     * Sets the postalCOde value for this Parameter.
     * 
     * @param postalCOde
     */
    public void setPostalCOde(int postalCOde) {
        this.postalCOde = postalCOde;
    }


    /**
     * Gets the service value for this Parameter.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this Parameter.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the speed value for this Parameter.
     * 
     * @return speed
     */
    public int getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this Parameter.
     * 
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    /**
     * Gets the state value for this Parameter.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Parameter.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the streetName value for this Parameter.
     * 
     * @return streetName
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this Parameter.
     * 
     * @param streetName
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the technology value for this Parameter.
     * 
     * @return technology
     */
    public java.lang.String getTechnology() {
        return technology;
    }


    /**
     * Sets the technology value for this Parameter.
     * 
     * @param technology
     */
    public void setTechnology(java.lang.String technology) {
        this.technology = technology;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Parameter)) return false;
        Parameter other = (Parameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.buldingNumber == other.getBuldingNumber() &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            this.latitude == other.getLatitude() &&
            this.load == other.getLoad() &&
            this.longitude == other.getLongitude() &&
            this.postalCOde == other.getPostalCOde() &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            this.speed == other.getSpeed() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.technology==null && other.getTechnology()==null) || 
             (this.technology!=null &&
              this.technology.equals(other.getTechnology())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getBuldingNumber();
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        _hashCode += getLatitude();
        _hashCode += getLoad();
        _hashCode += getLongitude();
        _hashCode += getPostalCOde();
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        _hashCode += getSpeed();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getTechnology() != null) {
            _hashCode += getTechnology().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Parameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://meerkatBeanClass", "Parameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buldingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "buldingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("load");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "load"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCOde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "postalCOde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "streetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://meerkatBeanClass", "technology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
