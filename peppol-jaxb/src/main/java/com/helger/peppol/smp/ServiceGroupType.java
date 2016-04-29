
package com.helger.peppol.smp;

import java.io.Serializable;
import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;
import com.helger.peppol.identifier.ParticipantIdentifierType;


/**
 * The ServiceGroup structure represents a set of services 
 *       associated with a specific participant identifier that is handled by a 
 *       specific Service Metadata Publisher. The ServiceGroup structure holds a 
 *       list of references to SignedServiceMetadata resources in the ServiceList
 *       structure.
 * 
 * <p>Java class for ServiceGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://busdox.org/transport/identifiers/1.0/}ParticipantIdentifier"/&gt;
 *         &lt;element name="ServiceMetadataReferenceCollection" type="{http://busdox.org/serviceMetadata/publishing/1.0/}ServiceMetadataReferenceCollectionType"/&gt;
 *         &lt;element name="Extension" type="{http://busdox.org/serviceMetadata/publishing/1.0/}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceGroupType", propOrder = {
    "participantIdentifier",
    "serviceMetadataReferenceCollection",
    "extension"
})
@CodingStyleguideUnaware
public class ServiceGroupType implements Serializable
{

    @XmlElement(name = "ParticipantIdentifier", namespace = "http://busdox.org/transport/identifiers/1.0/", required = true)
    private ParticipantIdentifierType participantIdentifier;
    @XmlElement(name = "ServiceMetadataReferenceCollection", required = true)
    private ServiceMetadataReferenceCollectionType serviceMetadataReferenceCollection;
    @XmlElement(name = "Extension")
    private ExtensionType extension;

    /**
     * Represents the business level endpoint key and key type, e.g. a DUNS or GLN number that is associated with a group of services. 
     * 
     * @return
     *     possible object is
     *     {@link ParticipantIdentifierType }
     *     
     */
    @Nullable
    public ParticipantIdentifierType getParticipantIdentifier() {
        return participantIdentifier;
    }

    /**
     * Sets the value of the participantIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantIdentifierType }
     *     
     */
    public void setParticipantIdentifier(
        @Nullable
        ParticipantIdentifierType value) {
        this.participantIdentifier = value;
    }

    /**
     * Gets the value of the serviceMetadataReferenceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceMetadataReferenceCollectionType }
     *     
     */
    @Nullable
    public ServiceMetadataReferenceCollectionType getServiceMetadataReferenceCollection() {
        return serviceMetadataReferenceCollection;
    }

    /**
     * Sets the value of the serviceMetadataReferenceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceMetadataReferenceCollectionType }
     *     
     */
    public void setServiceMetadataReferenceCollection(
        @Nullable
        ServiceMetadataReferenceCollectionType value) {
        this.serviceMetadataReferenceCollection = value;
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
        final ServiceGroupType rhs = ((ServiceGroupType) o);
        if (!EqualsHelper.equals(participantIdentifier, rhs.participantIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(serviceMetadataReferenceCollection, rhs.serviceMetadataReferenceCollection)) {
            return false;
        }
        if (!EqualsHelper.equals(extension, rhs.extension)) {
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
        return new HashCodeGenerator(this).append(participantIdentifier).append(serviceMetadataReferenceCollection).append(extension).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("participantIdentifier", participantIdentifier).append("serviceMetadataReferenceCollection", serviceMetadataReferenceCollection).append("extension", extension).toString();
    }

}
