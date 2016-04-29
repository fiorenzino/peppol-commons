
package com.helger.peppol.smlclient.participant;

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
 * <p>Java class for MigrationRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MigrationRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://busdox.org/serviceMetadata/locator/1.0/}ServiceMetadataPublisherID"/>
 *         &lt;element ref="{http://busdox.org/transport/identifiers/1.0/}ParticipantIdentifier"/>
 *         &lt;element name="MigrationKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationRecordType", propOrder = {
    "serviceMetadataPublisherID",
    "participantIdentifier",
    "migrationKey"
})
@CodingStyleguideUnaware
public class MigrationRecordType implements Serializable
{

    @XmlElement(name = "ServiceMetadataPublisherID", required = true)
    private String serviceMetadataPublisherID;
    @XmlElement(name = "ParticipantIdentifier", namespace = "http://busdox.org/transport/identifiers/1.0/", required = true)
    private ParticipantIdentifierType participantIdentifier;
    @XmlElement(name = "MigrationKey", required = true)
    private String migrationKey;

    /**
     * Gets the value of the serviceMetadataPublisherID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getServiceMetadataPublisherID() {
        return serviceMetadataPublisherID;
    }

    /**
     * Sets the value of the serviceMetadataPublisherID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceMetadataPublisherID(
        @Nullable
        String value) {
        this.serviceMetadataPublisherID = value;
    }

    /**
     * Gets the value of the participantIdentifier property.
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
     * Gets the value of the migrationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getMigrationKey() {
        return migrationKey;
    }

    /**
     * Sets the value of the migrationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrationKey(
        @Nullable
        String value) {
        this.migrationKey = value;
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
        final MigrationRecordType rhs = ((MigrationRecordType) o);
        if (!EqualsHelper.equals(serviceMetadataPublisherID, rhs.serviceMetadataPublisherID)) {
            return false;
        }
        if (!EqualsHelper.equals(participantIdentifier, rhs.participantIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(migrationKey, rhs.migrationKey)) {
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
        return new HashCodeGenerator(this).append(serviceMetadataPublisherID).append(participantIdentifier).append(migrationKey).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("serviceMetadataPublisherID", serviceMetadataPublisherID).append("participantIdentifier", participantIdentifier).append("migrationKey", migrationKey).toString();
    }

}
