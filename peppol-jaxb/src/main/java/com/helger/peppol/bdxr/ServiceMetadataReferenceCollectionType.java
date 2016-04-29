
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
 * <p>Java class for ServiceMetadataReferenceCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceMetadataReferenceCollectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceMetadataReference" type="{http://docs.oasis-open.org/bdxr/ns/SMP/2016/04}ServiceMetadataReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceMetadataReferenceCollectionType", propOrder = {
    "serviceMetadataReference"
})
@CodingStyleguideUnaware
public class ServiceMetadataReferenceCollectionType implements Serializable
{

    @XmlElement(name = "ServiceMetadataReference")
    private List<ServiceMetadataReferenceType> serviceMetadataReference;

    /**
     * Gets the value of the serviceMetadataReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceMetadataReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceMetadataReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceMetadataReferenceType }
     * 
     * 
     */
    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<ServiceMetadataReferenceType> getServiceMetadataReference() {
        if (serviceMetadataReference == null) {
            serviceMetadataReference = new ArrayList<ServiceMetadataReferenceType>();
        }
        return this.serviceMetadataReference;
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
        final ServiceMetadataReferenceCollectionType rhs = ((ServiceMetadataReferenceCollectionType) o);
        if (!EqualsHelper.equals(serviceMetadataReference, rhs.serviceMetadataReference)) {
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
        return new HashCodeGenerator(this).append(serviceMetadataReference).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("serviceMetadataReference", serviceMetadataReference).toString();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @param aList
     *     The new list member to set. May be <code>null</code>.
     */
    public void setServiceMetadataReference(
        @Nullable
        final List<ServiceMetadataReferenceType> aList) {
        serviceMetadataReference = aList;
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if at least one item is contained, <code>false</code> otherwise.
     */
    public boolean hasServiceMetadataReferenceEntries() {
        return (!getServiceMetadataReference().isEmpty());
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if no item is contained, <code>false</code> otherwise.
     */
    public boolean hasNoServiceMetadataReferenceEntries() {
        return getServiceMetadataReference().isEmpty();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     The number of contained elements. Always &ge; 0.
     */
    @Nonnegative
    public int getServiceMetadataReferenceCount() {
        return getServiceMetadataReference().size();
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
    public ServiceMetadataReferenceType getServiceMetadataReferenceAtIndex(
        @Nonnegative
        final int index) {
        return getServiceMetadataReference().get(index);
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @param elem
     *     The element to be added. May not be <code>null</code>.
     */
    public void addServiceMetadataReference(
        @Nonnull
        final ServiceMetadataReferenceType elem) {
        getServiceMetadataReference().add(elem);
    }

}
