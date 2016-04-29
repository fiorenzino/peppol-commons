
package com.helger.peppol.smlclient.bdmslcipa;

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
 * <p>Java class for PageRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://busdox.org/serviceMetadata/locator/1.0/}ServiceMetadataPublisherID"/>
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
@XmlType(name = "PageRequestType", namespace = "http://busdox.org/serviceMetadata/locator/1.0/", propOrder = {
    "serviceMetadataPublisherID",
    "nextPageIdentifier"
})
@CodingStyleguideUnaware
public class PageRequestType implements Serializable
{

    @XmlElement(name = "ServiceMetadataPublisherID", required = true)
    private String serviceMetadataPublisherID;
    @XmlElement(name = "NextPageIdentifier")
    private String nextPageIdentifier;

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
        final PageRequestType rhs = ((PageRequestType) o);
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
        return new HashCodeGenerator(this).append(serviceMetadataPublisherID).append(nextPageIdentifier).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("serviceMetadataPublisherID", serviceMetadataPublisherID).append("nextPageIdentifier", nextPageIdentifier).toString();
    }

}
