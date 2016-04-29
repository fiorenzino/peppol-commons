
package com.helger.peppol.smlclient.participant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.ReturnsMutableObject;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;
import com.helger.peppol.identifier.ParticipantIdentifierType;


/**
 * <p>Java class for ParticipantIdentifierPageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantIdentifierPageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://busdox.org/transport/identifiers/1.0/}ParticipantIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://busdox.org/serviceMetadata/locator/1.0/}ServiceMetadataPublisherID" minOccurs="0"/>
 *         &lt;element name="NextPageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantIdentifierPageType", propOrder = {
    "participantIdentifier",
    "serviceMetadataPublisherID",
    "nextPageIdentifier"
})
@CodingStyleguideUnaware
public class ParticipantIdentifierPageType implements Serializable
{

    @XmlElement(name = "ParticipantIdentifier", namespace = "http://busdox.org/transport/identifiers/1.0/")
    private List<ParticipantIdentifierType> participantIdentifier;
    @XmlElement(name = "ServiceMetadataPublisherID")
    private String serviceMetadataPublisherID;
    @XmlElement(name = "NextPageIdentifier")
    private String nextPageIdentifier;

    /**
     * Gets the value of the participantIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantIdentifierType }
     * 
     * 
     */
    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<ParticipantIdentifierType> getParticipantIdentifier() {
        if (participantIdentifier == null) {
            participantIdentifier = new ArrayList<ParticipantIdentifierType>();
        }
        return this.participantIdentifier;
    }

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
     * Gets the value of the nextPageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getNextPageIdentifier() {
        return nextPageIdentifier;
    }

    /**
     * Sets the value of the nextPageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPageIdentifier(
        @Nullable
        String value) {
        this.nextPageIdentifier = value;
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
        final ParticipantIdentifierPageType rhs = ((ParticipantIdentifierPageType) o);
        if (!EqualsHelper.equals(participantIdentifier, rhs.participantIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(serviceMetadataPublisherID, rhs.serviceMetadataPublisherID)) {
            return false;
        }
        if (!EqualsHelper.equals(nextPageIdentifier, rhs.nextPageIdentifier)) {
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
        return new HashCodeGenerator(this).append(participantIdentifier).append(serviceMetadataPublisherID).append(nextPageIdentifier).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("participantIdentifier", participantIdentifier).append("serviceMetadataPublisherID", serviceMetadataPublisherID).append("nextPageIdentifier", nextPageIdentifier).toString();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @param aList
     *     The new list member to set. May be <code>null</code>.
     */
    public void setParticipantIdentifier(
        @Nullable
        final List<ParticipantIdentifierType> aList) {
        participantIdentifier = aList;
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if at least one item is contained, <code>false</code> otherwise.
     */
    public boolean hasParticipantIdentifierEntries() {
        return (!getParticipantIdentifier().isEmpty());
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if no item is contained, <code>false</code> otherwise.
     */
    public boolean hasNoParticipantIdentifierEntries() {
        return getParticipantIdentifier().isEmpty();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     The number of contained elements. Always &ge; 0.
     */
    @Nonnegative
    public int getParticipantIdentifierCount() {
        return getParticipantIdentifier().size();
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
    public ParticipantIdentifierType getParticipantIdentifierAtIndex(
        @Nonnegative
        final int index) {
        return getParticipantIdentifier().get(index);
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @param elem
     *     The element to be added. May not be <code>null</code>.
     */
    public void addParticipantIdentifier(
        @Nonnull
        final ParticipantIdentifierType elem) {
        getParticipantIdentifier().add(elem);
    }

}
