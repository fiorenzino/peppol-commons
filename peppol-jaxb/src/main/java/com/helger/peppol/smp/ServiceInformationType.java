
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
import com.helger.peppol.identifier.DocumentIdentifierType;
import com.helger.peppol.identifier.ParticipantIdentifierType;


/**
 * <p>Java class for ServiceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://busdox.org/transport/identifiers/1.0/}ParticipantIdentifier"/&gt;
 *         &lt;element ref="{http://busdox.org/transport/identifiers/1.0/}DocumentIdentifier"/&gt;
 *         &lt;element name="ProcessList" type="{http://busdox.org/serviceMetadata/publishing/1.0/}ProcessListType"/&gt;
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
@XmlType(name = "ServiceInformationType", propOrder = {
    "participantIdentifier",
    "documentIdentifier",
    "processList",
    "extension"
})
@CodingStyleguideUnaware
public class ServiceInformationType implements Serializable
{

    @XmlElement(name = "ParticipantIdentifier", namespace = "http://busdox.org/transport/identifiers/1.0/", required = true)
    private ParticipantIdentifierType participantIdentifier;
    @XmlElement(name = "DocumentIdentifier", namespace = "http://busdox.org/transport/identifiers/1.0/", required = true)
    private DocumentIdentifierType documentIdentifier;
    @XmlElement(name = "ProcessList", required = true)
    private ProcessListType processList;
    @XmlElement(name = "Extension")
    private ExtensionType extension;

    /**
     * The participant identifier. Comprises the identifier, and an identifier scheme. This identifier MUST have the same value of the {id} part of the URI of the enclosing ServiceMetadata resource.
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
     * Represents the type of document that the recipient is able to handle.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentifierType }
     *     
     */
    @Nullable
    public DocumentIdentifierType getDocumentIdentifier() {
        return documentIdentifier;
    }

    /**
     * Sets the value of the documentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentifierType }
     *     
     */
    public void setDocumentIdentifier(
        @Nullable
        DocumentIdentifierType value) {
        this.documentIdentifier = value;
    }

    /**
     * Gets the value of the processList property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessListType }
     *     
     */
    @Nullable
    public ProcessListType getProcessList() {
        return processList;
    }

    /**
     * Sets the value of the processList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessListType }
     *     
     */
    public void setProcessList(
        @Nullable
        ProcessListType value) {
        this.processList = value;
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
        final ServiceInformationType rhs = ((ServiceInformationType) o);
        if (!EqualsHelper.equals(participantIdentifier, rhs.participantIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(documentIdentifier, rhs.documentIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(processList, rhs.processList)) {
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
        return new HashCodeGenerator(this).append(participantIdentifier).append(documentIdentifier).append(processList).append(extension).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("participantIdentifier", participantIdentifier).append("documentIdentifier", documentIdentifier).append("processList", processList).append("extension", extension).toString();
    }

}
