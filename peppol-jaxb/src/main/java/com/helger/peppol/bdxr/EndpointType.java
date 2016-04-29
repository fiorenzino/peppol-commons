
package com.helger.peppol.bdxr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.ReturnsMutableObject;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;
import com.helger.peppol.xsd.Adapter1;
import org.joda.time.LocalDateTime;


/**
 * <p>Java class for EndpointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndpointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndpointURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="RequireBusinessLevelSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumAuthenticationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ServiceExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="ServiceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TechnicalContactUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="TechnicalInformationUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://docs.oasis-open.org/bdxr/ns/SMP/2016/04}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="transportProfile" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointType", propOrder = {
    "endpointURI",
    "requireBusinessLevelSignature",
    "minimumAuthenticationLevel",
    "serviceActivationDate",
    "serviceExpirationDate",
    "certificate",
    "serviceDescription",
    "technicalContactUrl",
    "technicalInformationUrl",
    "extension"
})
@CodingStyleguideUnaware
public class EndpointType implements Serializable
{

    @XmlElement(name = "EndpointURI", required = true)
    @XmlSchemaType(name = "anyURI")
    private String endpointURI;
    @XmlElement(name = "RequireBusinessLevelSignature")
    private Boolean requireBusinessLevelSignature;
    @XmlElement(name = "MinimumAuthenticationLevel")
    private String minimumAuthenticationLevel;
    @XmlElement(name = "ServiceActivationDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    private LocalDateTime serviceActivationDate;
    @XmlElement(name = "ServiceExpirationDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    private LocalDateTime serviceExpirationDate;
    @XmlElement(name = "Certificate", required = true)
    private byte[] certificate;
    @XmlElement(name = "ServiceDescription", required = true)
    private String serviceDescription;
    @XmlElement(name = "TechnicalContactUrl", required = true)
    @XmlSchemaType(name = "anyURI")
    private String technicalContactUrl;
    @XmlElement(name = "TechnicalInformationUrl")
    @XmlSchemaType(name = "anyURI")
    private String technicalInformationUrl;
    @XmlElement(name = "Extension")
    private List<ExtensionType> extension;
    @XmlAttribute(name = "transportProfile", required = true)
    private String transportProfile;

    /**
     * Gets the value of the endpointURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getEndpointURI() {
        return endpointURI;
    }

    /**
     * Sets the value of the endpointURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpointURI(
        @Nullable
        String value) {
        this.endpointURI = value;
    }

    /**
     * Gets the value of the requireBusinessLevelSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireBusinessLevelSignature() {
        return requireBusinessLevelSignature;
    }

    /**
     * Sets the value of the requireBusinessLevelSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireBusinessLevelSignature(
        @Nullable
        Boolean value) {
        this.requireBusinessLevelSignature = value;
    }

    /**
     * Gets the value of the minimumAuthenticationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getMinimumAuthenticationLevel() {
        return minimumAuthenticationLevel;
    }

    /**
     * Sets the value of the minimumAuthenticationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumAuthenticationLevel(
        @Nullable
        String value) {
        this.minimumAuthenticationLevel = value;
    }

    /**
     * Gets the value of the serviceActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public LocalDateTime getServiceActivationDate() {
        return serviceActivationDate;
    }

    /**
     * Sets the value of the serviceActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceActivationDate(
        @Nullable
        LocalDateTime value) {
        this.serviceActivationDate = value;
    }

    /**
     * Gets the value of the serviceExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public LocalDateTime getServiceExpirationDate() {
        return serviceExpirationDate;
    }

    /**
     * Sets the value of the serviceExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceExpirationDate(
        @Nullable
        LocalDateTime value) {
        this.serviceExpirationDate = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Nullable
    public byte[] getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCertificate(
        @Nullable
        byte[] value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(
        @Nullable
        String value) {
        this.serviceDescription = value;
    }

    /**
     * Gets the value of the technicalContactUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getTechnicalContactUrl() {
        return technicalContactUrl;
    }

    /**
     * Sets the value of the technicalContactUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalContactUrl(
        @Nullable
        String value) {
        this.technicalContactUrl = value;
    }

    /**
     * Gets the value of the technicalInformationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getTechnicalInformationUrl() {
        return technicalInformationUrl;
    }

    /**
     * Sets the value of the technicalInformationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalInformationUrl(
        @Nullable
        String value) {
        this.technicalInformationUrl = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the transportProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getTransportProfile() {
        return transportProfile;
    }

    /**
     * Sets the value of the transportProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportProfile(
        @Nullable
        String value) {
        this.transportProfile = value;
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
        final EndpointType rhs = ((EndpointType) o);
        if (!EqualsHelper.equals(endpointURI, rhs.endpointURI)) {
            return false;
        }
        if (!EqualsHelper.equals(requireBusinessLevelSignature, rhs.requireBusinessLevelSignature)) {
            return false;
        }
        if (!EqualsHelper.equals(minimumAuthenticationLevel, rhs.minimumAuthenticationLevel)) {
            return false;
        }
        if (!EqualsHelper.equals(serviceActivationDate, rhs.serviceActivationDate)) {
            return false;
        }
        if (!EqualsHelper.equals(serviceExpirationDate, rhs.serviceExpirationDate)) {
            return false;
        }
        if (!EqualsHelper.equals(certificate, rhs.certificate)) {
            return false;
        }
        if (!EqualsHelper.equals(serviceDescription, rhs.serviceDescription)) {
            return false;
        }
        if (!EqualsHelper.equals(technicalContactUrl, rhs.technicalContactUrl)) {
            return false;
        }
        if (!EqualsHelper.equals(technicalInformationUrl, rhs.technicalInformationUrl)) {
            return false;
        }
        if (!EqualsHelper.equals(extension, rhs.extension)) {
            return false;
        }
        if (!EqualsHelper.equals(transportProfile, rhs.transportProfile)) {
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
        return new HashCodeGenerator(this).append(endpointURI).append(requireBusinessLevelSignature).append(minimumAuthenticationLevel).append(serviceActivationDate).append(serviceExpirationDate).append(certificate).append(serviceDescription).append(technicalContactUrl).append(technicalInformationUrl).append(extension).append(transportProfile).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("endpointURI", endpointURI).append("requireBusinessLevelSignature", requireBusinessLevelSignature).append("minimumAuthenticationLevel", minimumAuthenticationLevel).append("serviceActivationDate", serviceActivationDate).append("serviceExpirationDate", serviceExpirationDate).append("certificate", certificate).append("serviceDescription", serviceDescription).append("technicalContactUrl", technicalContactUrl).append("technicalInformationUrl", technicalInformationUrl).append("extension", extension).append("transportProfile", transportProfile).toString();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @param aList
     *     The new list member to set. May be <code>null</code>.
     */
    public void setExtension(
        @Nullable
        final List<ExtensionType> aList) {
        extension = aList;
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if at least one item is contained, <code>false</code> otherwise.
     */
    public boolean hasExtensionEntries() {
        return (!getExtension().isEmpty());
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if no item is contained, <code>false</code> otherwise.
     */
    public boolean hasNoExtensionEntries() {
        return getExtension().isEmpty();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     The number of contained elements. Always &ge; 0.
     */
    @Nonnegative
    public int getExtensionCount() {
        return getExtension().size();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @param index
     *     The index to retrieve
     * @return
     *     The element at the specified index. May be <code>null</code>
     * @throws ArrayIndexOutOfBoundsException
     *     if the index is invalid!
     */
    @Nullable
    public ExtensionType getExtensionAtIndex(
        @Nonnegative
        final int index) {
        return getExtension().get(index);
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @param elem
     *     The element to be added. May not be <code>null</code>.
     */
    public void addExtension(
        @Nonnull
        final ExtensionType elem) {
        getExtension().add(elem);
    }

}
