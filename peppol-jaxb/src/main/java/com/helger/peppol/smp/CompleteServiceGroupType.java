
package com.helger.peppol.smp;

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
 * <p>Java class for CompleteServiceGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteServiceGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://busdox.org/serviceMetadata/publishing/1.0/}ServiceGroup"/&gt;
 *         &lt;element ref="{http://busdox.org/serviceMetadata/publishing/1.0/}ServiceMetadata" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteServiceGroupType", propOrder = {
    "serviceGroup",
    "serviceMetadata"
})
@CodingStyleguideUnaware
public class CompleteServiceGroupType implements Serializable
{

    @XmlElement(name = "ServiceGroup", required = true)
    private ServiceGroupType serviceGroup;
    @XmlElement(name = "ServiceMetadata")
    private List<ServiceMetadataType> serviceMetadata;

    /**
     * Gets the value of the serviceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceGroupType }
     *     
     */
    @Nullable
    public ServiceGroupType getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Sets the value of the serviceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceGroupType }
     *     
     */
    public void setServiceGroup(
        @Nullable
        ServiceGroupType value) {
        this.serviceGroup = value;
    }

    /**
     * Gets the value of the serviceMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceMetadataType }
     * 
     * 
     */
    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<ServiceMetadataType> getServiceMetadata() {
        if (serviceMetadata == null) {
            serviceMetadata = new ArrayList<ServiceMetadataType>();
        }
        return this.serviceMetadata;
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
        final CompleteServiceGroupType rhs = ((CompleteServiceGroupType) o);
        if (!EqualsHelper.equals(serviceGroup, rhs.serviceGroup)) {
            return false;
        }
        if (!EqualsHelper.equals(serviceMetadata, rhs.serviceMetadata)) {
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
        return new HashCodeGenerator(this).append(serviceGroup).append(serviceMetadata).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("serviceGroup", serviceGroup).append("serviceMetadata", serviceMetadata).toString();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @param aList
     *     The new list member to set. May be <code>null</code>.
     */
    public void setServiceMetadata(
        @Nullable
        final List<ServiceMetadataType> aList) {
        serviceMetadata = aList;
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if at least one item is contained, <code>false</code> otherwise.
     */
    public boolean hasServiceMetadataEntries() {
        return (!getServiceMetadata().isEmpty());
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if no item is contained, <code>false</code> otherwise.
     */
    public boolean hasNoServiceMetadataEntries() {
        return getServiceMetadata().isEmpty();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     The number of contained elements. Always &ge; 0.
     */
    @Nonnegative
    public int getServiceMetadataCount() {
        return getServiceMetadata().size();
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
    public ServiceMetadataType getServiceMetadataAtIndex(
        @Nonnegative
        final int index) {
        return getServiceMetadata().get(index);
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @param elem
     *     The element to be added. May not be <code>null</code>.
     */
    public void addServiceMetadata(
        @Nonnull
        final ServiceMetadataType elem) {
        getServiceMetadata().add(elem);
    }

}
