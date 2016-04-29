
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
import com.helger.peppol.xmldsig.SignatureType;


/**
 * The SignedServiceMetadata structure is a ServiceMetadata structure 
 *       that has been signed by the ServiceMetadataPublisher, according to governance policies.
 * 
 * <p>Java class for SignedServiceMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignedServiceMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://busdox.org/serviceMetadata/publishing/1.0/}ServiceMetadata"/&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedServiceMetadataType", propOrder = {
    "serviceMetadata",
    "signature"
})
@CodingStyleguideUnaware
public class SignedServiceMetadataType implements Serializable
{

    @XmlElement(name = "ServiceMetadata", required = true)
    private ServiceMetadataType serviceMetadata;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    private SignatureType signature;

    /**
     * The ServiceMetadata element covered by the signature.
     * 
     * @return
     *     possible object is
     *     {@link ServiceMetadataType }
     *     
     */
    @Nullable
    public ServiceMetadataType getServiceMetadata() {
        return serviceMetadata;
    }

    /**
     * Sets the value of the serviceMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceMetadataType }
     *     
     */
    public void setServiceMetadata(
        @Nullable
        ServiceMetadataType value) {
        this.serviceMetadata = value;
    }

    /**
     * Represents an enveloped XML signature over the SignedServiceMetadata element.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    @Nullable
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(
        @Nullable
        SignatureType value) {
        this.signature = value;
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
        final SignedServiceMetadataType rhs = ((SignedServiceMetadataType) o);
        if (!EqualsHelper.equals(serviceMetadata, rhs.serviceMetadata)) {
            return false;
        }
        if (!EqualsHelper.equals(signature, rhs.signature)) {
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
        return new HashCodeGenerator(this).append(serviceMetadata).append(signature).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("serviceMetadata", serviceMetadata).append("signature", signature).toString();
    }

}
