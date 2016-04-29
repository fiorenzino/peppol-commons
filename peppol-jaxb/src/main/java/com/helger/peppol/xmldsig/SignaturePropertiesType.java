
package com.helger.peppol.xmldsig;

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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.ReturnsMutableObject;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;


/**
 * <p>Java class for SignaturePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignaturePropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}SignatureProperty" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePropertiesType", propOrder = {
    "signatureProperty"
})
@CodingStyleguideUnaware
public class SignaturePropertiesType implements Serializable
{

    @XmlElement(name = "SignatureProperty", required = true)
    private List<SignaturePropertyType> signatureProperty;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    private String id;

    /**
     * Gets the value of the signatureProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignaturePropertyType }
     * 
     * 
     */
    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<SignaturePropertyType> getSignatureProperty() {
        if (signatureProperty == null) {
            signatureProperty = new ArrayList<SignaturePropertyType>();
        }
        return this.signatureProperty;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(
        @Nullable
        String value) {
        this.id = value;
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
        final SignaturePropertiesType rhs = ((SignaturePropertiesType) o);
        if (!EqualsHelper.equals(signatureProperty, rhs.signatureProperty)) {
            return false;
        }
        if (!EqualsHelper.equals(id, rhs.id)) {
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
        return new HashCodeGenerator(this).append(signatureProperty).append(id).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("signatureProperty", signatureProperty).append("id", id).toString();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @param aList
     *     The new list member to set. May be <code>null</code>.
     */
    public void setSignatureProperty(
        @Nullable
        final List<SignaturePropertyType> aList) {
        signatureProperty = aList;
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if at least one item is contained, <code>false</code> otherwise.
     */
    public boolean hasSignaturePropertyEntries() {
        return (!getSignatureProperty().isEmpty());
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     <code>true</code> if no item is contained, <code>false</code> otherwise.
     */
    public boolean hasNoSignaturePropertyEntries() {
        return getSignatureProperty().isEmpty();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @return
     *     The number of contained elements. Always &ge; 0.
     */
    @Nonnegative
    public int getSignaturePropertyCount() {
        return getSignatureProperty().size();
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
    public SignaturePropertyType getSignaturePropertyAtIndex(
        @Nonnegative
        final int index) {
        return getSignatureProperty().get(index);
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-list-extension
     * 
     * @param elem
     *     The element to be added. May not be <code>null</code>.
     */
    public void addSignatureProperty(
        @Nonnull
        final SignaturePropertyType elem) {
        getSignatureProperty().add(elem);
    }

}
