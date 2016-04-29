
package com.helger.peppol.smlclient.smp;

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


/**
 * <p>Java class for ServiceMetadataPublisherServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceMetadataPublisherServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublisherEndpoint" type="{http://busdox.org/serviceMetadata/locator/1.0/}PublisherEndpointType"/>
 *         &lt;element ref="{http://busdox.org/serviceMetadata/locator/1.0/}ServiceMetadataPublisherID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceMetadataPublisherServiceType", propOrder = {
    "publisherEndpoint",
    "serviceMetadataPublisherID"
})
@CodingStyleguideUnaware
public class ServiceMetadataPublisherServiceType implements Serializable
{

    @XmlElement(name = "PublisherEndpoint", required = true)
    private PublisherEndpointType publisherEndpoint;
    @XmlElement(name = "ServiceMetadataPublisherID", required = true)
    private String serviceMetadataPublisherID;

    /**
     * Gets the value of the publisherEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link PublisherEndpointType }
     *     
     */
    @Nullable
    public PublisherEndpointType getPublisherEndpoint() {
        return publisherEndpoint;
    }

    /**
     * Sets the value of the publisherEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublisherEndpointType }
     *     
     */
    public void setPublisherEndpoint(
        @Nullable
        PublisherEndpointType value) {
        this.publisherEndpoint = value;
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
        final ServiceMetadataPublisherServiceType rhs = ((ServiceMetadataPublisherServiceType) o);
        if (!EqualsHelper.equals(publisherEndpoint, rhs.publisherEndpoint)) {
            return false;
        }
        if (!EqualsHelper.equals(serviceMetadataPublisherID, rhs.serviceMetadataPublisherID)) {
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
        return new HashCodeGenerator(this).append(publisherEndpoint).append(serviceMetadataPublisherID).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("publisherEndpoint", publisherEndpoint).append("serviceMetadataPublisherID", serviceMetadataPublisherID).toString();
    }

}
