
package com.helger.peppol.smp;

import java.io.Serializable;
import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.ws.wsaddressing.W3CEndpointReference;
import com.helger.commons.annotation.CodingStyleguideUnaware;
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
 *         &lt;element ref="{http://www.w3.org/2005/08/addressing}EndpointReference"/&gt;
 *         &lt;element name="RequireBusinessLevelSignature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MinimumAuthenticationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ServiceExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Certificate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TechnicalContactUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="TechnicalInformationUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://busdox.org/serviceMetadata/publishing/1.0/}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="transportProfile" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointType", propOrder = {
    "endpointReference",
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

    @XmlElement(name = "EndpointReference", namespace = "http://www.w3.org/2005/08/addressing", required = true)
    private W3CEndpointReference endpointReference;
    @XmlElement(name = "RequireBusinessLevelSignature")
    private boolean requireBusinessLevelSignature;
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
    private String certificate;
    @XmlElement(name = "ServiceDescription", required = true)
    private String serviceDescription;
    @XmlElement(name = "TechnicalContactUrl", required = true)
    @XmlSchemaType(name = "anyURI")
    private String technicalContactUrl;
    @XmlElement(name = "TechnicalInformationUrl")
    @XmlSchemaType(name = "anyURI")
    private String technicalInformationUrl;
    @XmlElement(name = "Extension")
    private ExtensionType extension;
    @XmlAttribute(name = "transportProfile")
    private String transportProfile;

    /**
     * The address of an endpoint, as an WS-Addressing Endpoint Reference
     * 
     * @return
     *     possible object is
     *     {@link W3CEndpointReference }
     *     
     */
    @Nullable
    public W3CEndpointReference getEndpointReference() {
        return endpointReference;
    }

    /**
     * Sets the value of the endpointReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link W3CEndpointReference }
     *     
     */
    public void setEndpointReference(
        @Nullable
        W3CEndpointReference value) {
        this.endpointReference = value;
    }

    /**
     * Gets the value of the requireBusinessLevelSignature property.
     * 
     */
    public boolean isRequireBusinessLevelSignature() {
        return requireBusinessLevelSignature;
    }

    /**
     * Sets the value of the requireBusinessLevelSignature property.
     * 
     */
    public void setRequireBusinessLevelSignature(boolean value) {
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
     *     {@link String }
     *     
     */
    @Nullable
    public String getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificate(
        @Nullable
        String value) {
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
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    @Nullable
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(
        @Nullable
        ExtensionType value) {
        this.extension = value;
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
        if (!EqualsHelper.equals(endpointReference, rhs.endpointReference)) {
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
        return new HashCodeGenerator(this).append(endpointReference).append(requireBusinessLevelSignature).append(minimumAuthenticationLevel).append(serviceActivationDate).append(serviceExpirationDate).append(certificate).append(serviceDescription).append(technicalContactUrl).append(technicalInformationUrl).append(extension).append(transportProfile).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("endpointReference", endpointReference).append("requireBusinessLevelSignature", requireBusinessLevelSignature).append("minimumAuthenticationLevel", minimumAuthenticationLevel).append("serviceActivationDate", serviceActivationDate).append("serviceExpirationDate", serviceExpirationDate).append("certificate", certificate).append("serviceDescription", serviceDescription).append("technicalContactUrl", technicalContactUrl).append("technicalInformationUrl", technicalInformationUrl).append("extension", extension).append("transportProfile", transportProfile).toString();
    }

}
