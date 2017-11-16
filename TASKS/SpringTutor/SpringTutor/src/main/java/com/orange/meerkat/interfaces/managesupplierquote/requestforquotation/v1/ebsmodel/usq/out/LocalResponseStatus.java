
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.usq.out;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for local_responseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="local_responseStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID"/&gt;
 *     &lt;enumeration value="NOPENDINGRESPONSE"/&gt;
 *     &lt;enumeration value="In Progress"/&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="RESPONSETIMEDOUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "local_responseStatus")
@XmlEnum
public enum LocalResponseStatus {

    INVALID("INVALID"),
    NOPENDINGRESPONSE("NOPENDINGRESPONSE"),
    @XmlEnumValue("In Progress")
    IN_PROGRESS("In Progress"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    RESPONSETIMEDOUT("RESPONSETIMEDOUT");
    private final String value;

    LocalResponseStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocalResponseStatus fromValue(String v) {
        for (LocalResponseStatus c: LocalResponseStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
