
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
 * <p>Java class for ProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/bdxr/ns/SMP/2016/04}ProcessIdentifier"/&gt;
 *         &lt;element name="ServiceEndpointList" type="{http://docs.oasis-open.org/bdxr/ns/SMP/2016/04}ServiceEndpointList"/&gt;
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
@XmlType(name = "ProcessType", propOrder = {
    "processIdentifier",
    "serviceEndpointList",
    "extension"
})
@CodingStyleguideUnaware
public class ProcessType implements Serializable
{

    @XmlElement(name = "ProcessIdentifier", required = true)
    private ProcessIdentifierType processIdentifier;
    @XmlElement(name = "ServiceEndpointList", required = true)
    private ServiceEndpointList serviceEndpointList;
    @XmlElement(name = "Extension")
    private List<ExtensionType> extension;

    /**
     * Gets the value of the processIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessIdentifierType }
     *     
     */
    @Nullable
    public ProcessIdentifierType getProcessIdentifier() {
        return processIdentifier;
    }

    /**
     * Sets the value of the processIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessIdentifierType }
     *     
     */
    public void setProcessIdentifier(
        @Nullable
        ProcessIdentifierType value) {
        this.processIdentifier = value;
    }

    /**
     * Gets the value of the serviceEndpointList property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEndpointList }
     *     
     */
    @Nullable
    public ServiceEndpointList getServiceEndpointList() {
        return serviceEndpointList;
    }

    /**
     * Sets the value of the serviceEndpointList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEndpointList }
     *     
     */
    public void setServiceEndpointList(
        @Nullable
        ServiceEndpointList value) {
        this.serviceEndpointList = value;
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
        final ProcessType rhs = ((ProcessType) o);
        if (!EqualsHelper.equals(processIdentifier, rhs.processIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(serviceEndpointList, rhs.serviceEndpointList)) {
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
        return new HashCodeGenerator(this).append(processIdentifier).append(serviceEndpointList).append(extension).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("processIdentifier", processIdentifier).append("serviceEndpointList", serviceEndpointList).append("extension", extension).toString();
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
