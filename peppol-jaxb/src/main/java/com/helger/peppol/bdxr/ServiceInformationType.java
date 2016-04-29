
package com.helger.peppol.bdxr;

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
 *         &lt;element ref="{http://docs.oasis-open.org/bdxr/ns/SMP/2016/04}ParticipantIdentifier"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/bdxr/ns/SMP/2016/04}DocumentIdentifier"/&gt;
 *         &lt;element name="ProcessList" type="{http://docs.oasis-open.org/bdxr/ns/SMP/2016/04}ProcessListType"/&gt;
 *         &lt;element name="Extension" type="{http://docs.oasis-open.org/bdxr/ns/SMP/2016/04}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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

    @XmlElement(name = "ParticipantIdentifier", required = true)
    private ParticipantIdentifierType participantIdentifier;
    @XmlElement(name = "DocumentIdentifier", required = true)
    private DocumentIdentifierType documentIdentifier;
    @XmlElement(name = "ProcessList", required = true)
    private ProcessListType processList;
    @XmlElement(name = "Extension")
    private List<ExtensionType> extension;

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
     * Gets the value of the documentIdentifier property.
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
