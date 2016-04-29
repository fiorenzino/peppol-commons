
package com.helger.peppol.bdxr;

import java.io.Serializable;
import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;
import org.w3c.dom.Element;


/**
 * 
 *         A single extension for private use.
 *       
 * 
 * <p>Java class for ExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtensionID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionAgencyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionAgencyURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionVersionID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionReasonCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionType", propOrder = {
    "extensionID",
    "extensionName",
    "extensionAgencyID",
    "extensionAgencyName",
    "extensionAgencyURI",
    "extensionVersionID",
    "extensionURI",
    "extensionReasonCode",
    "extensionReason",
    "any"
})
@CodingStyleguideUnaware
public class ExtensionType implements Serializable
{

    @XmlElement(name = "ExtensionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String extensionID;
    @XmlElement(name = "ExtensionName")
    private String extensionName;
    @XmlElement(name = "ExtensionAgencyID")
    private String extensionAgencyID;
    @XmlElement(name = "ExtensionAgencyName")
    private String extensionAgencyName;
    @XmlElement(name = "ExtensionAgencyURI")
    @XmlSchemaType(name = "anyURI")
    private String extensionAgencyURI;
    @XmlElement(name = "ExtensionVersionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String extensionVersionID;
    @XmlElement(name = "ExtensionURI")
    @XmlSchemaType(name = "anyURI")
    private String extensionURI;
    @XmlElement(name = "ExtensionReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    private String extensionReasonCode;
    @XmlElement(name = "ExtensionReason")
    private String extensionReason;
    @XmlAnyElement(lax = true)
    private Object any;

    /**
     * Gets the value of the extensionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getExtensionID() {
        return extensionID;
    }

    /**
     * Sets the value of the extensionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionID(
        @Nullable
        String value) {
        this.extensionID = value;
    }

    /**
     * Gets the value of the extensionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getExtensionName() {
        return extensionName;
    }

    /**
     * Sets the value of the extensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionName(
        @Nullable
        String value) {
        this.extensionName = value;
    }

    /**
     * Gets the value of the extensionAgencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getExtensionAgencyID() {
        return extensionAgencyID;
    }

    /**
     * Sets the value of the extensionAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionAgencyID(
        @Nullable
        String value) {
        this.extensionAgencyID = value;
    }

    /**
     * Gets the value of the extensionAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getExtensionAgencyName() {
        return extensionAgencyName;
    }

    /**
     * Sets the value of the extensionAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionAgencyName(
        @Nullable
        String value) {
        this.extensionAgencyName = value;
    }

    /**
     * Gets the value of the extensionAgencyURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getExtensionAgencyURI() {
        return extensionAgencyURI;
    }

    /**
     * Sets the value of the extensionAgencyURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionAgencyURI(
        @Nullable
        String value) {
        this.extensionAgencyURI = value;
    }

    /**
     * Gets the value of the extensionVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getExtensionVersionID() {
        return extensionVersionID;
    }

    /**
     * Sets the value of the extensionVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionVersionID(
        @Nullable
        String value) {
        this.extensionVersionID = value;
    }

    /**
     * Gets the value of the extensionURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getExtensionURI() {
        return extensionURI;
    }

    /**
     * Sets the value of the extensionURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionURI(
        @Nullable
        String value) {
        this.extensionURI = value;
    }

    /**
     * Gets the value of the extensionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getExtensionReasonCode() {
        return extensionReasonCode;
    }

    /**
     * Sets the value of the extensionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionReasonCode(
        @Nullable
        String value) {
        this.extensionReasonCode = value;
    }

    /**
     * Gets the value of the extensionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getExtensionReason() {
        return extensionReason;
    }

    /**
     * Sets the value of the extensionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionReason(
        @Nullable
        String value) {
        this.extensionReason = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    @Nullable
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(
        @Nullable
        Object value) {
        this.any = value;
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-equalshashcode
     * 
     */
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if ((o == null)||(!getClass().equals(o.getClass()))) {
            return false;
        }
        final ExtensionType rhs = ((ExtensionType) o);
        if (!EqualsHelper.equals(extensionID, rhs.extensionID)) {
            return false;
        }
        if (!EqualsHelper.equals(extensionName, rhs.extensionName)) {
            return false;
        }
        if (!EqualsHelper.equals(extensionAgencyID, rhs.extensionAgencyID)) {
            return false;
        }
        if (!EqualsHelper.equals(extensionAgencyName, rhs.extensionAgencyName)) {
            return false;
        }
        if (!EqualsHelper.equals(extensionAgencyURI, rhs.extensionAgencyURI)) {
            return false;
        }
        if (!EqualsHelper.equals(extensionVersionID, rhs.extensionVersionID)) {
            return false;
        }
        if (!EqualsHelper.equals(extensionURI, rhs.extensionURI)) {
            return false;
        }
        if (!EqualsHelper.equals(extensionReasonCode, rhs.extensionReasonCode)) {
            return false;
        }
        if (!EqualsHelper.equals(extensionReason, rhs.extensionReason)) {
            return false;
        }
        if (!EqualsHelper.equals(any, rhs.any)) {
            return false;
        }
        return true;
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-equalshashcode
     * 
     */
    @Override
    public int hashCode() {
        return new HashCodeGenerator(this).append(extensionID).append(extensionName).append(extensionAgencyID).append(extensionAgencyName).append(extensionAgencyURI).append(extensionVersionID).append(extensionURI).append(extensionReasonCode).append(extensionReason).append(any).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("extensionID", extensionID).append("extensionName", extensionName).append("extensionAgencyID", extensionAgencyID).append("extensionAgencyName", extensionAgencyName).append("extensionAgencyURI", extensionAgencyURI).append("extensionVersionID", extensionVersionID).append("extensionURI", extensionURI).append("extensionReasonCode", extensionReasonCode).append("extensionReason", extensionReason).append("any", any).toString();
    }

}
