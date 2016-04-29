
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
 * <p>Java class for SMPAdvancedServiceForParticipantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMPAdvancedServiceForParticipantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateParticipantIdentifier" type="{http://busdox.org/serviceMetadata/locator/1.0/}ServiceMetadataPublisherServiceForParticipantType"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMPAdvancedServiceForParticipantType", propOrder = {
    "createParticipantIdentifier",
    "serviceName"
})
@CodingStyleguideUnaware
public class SMPAdvancedServiceForParticipantType implements Serializable
{

    @XmlElement(name = "CreateParticipantIdentifier", required = true)
    private ServiceMetadataPublisherServiceForParticipantType createParticipantIdentifier;
    @XmlElement(required = true)
    private String serviceName;

    /**
     * Gets the value of the createParticipantIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceMetadataPublisherServiceForParticipantType }
     *     
     */
    @Nullable
    public ServiceMetadataPublisherServiceForParticipantType getCreateParticipantIdentifier() {
        return createParticipantIdentifier;
    }

    /**
     * Sets the value of the createParticipantIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceMetadataPublisherServiceForParticipantType }
     *     
     */
    public void setCreateParticipantIdentifier(
        @Nullable
        ServiceMetadataPublisherServiceForParticipantType value) {
        this.createParticipantIdentifier = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(
        @Nullable
        String value) {
        this.serviceName = value;
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
        final SMPAdvancedServiceForParticipantType rhs = ((SMPAdvancedServiceForParticipantType) o);
        if (!EqualsHelper.equals(createParticipantIdentifier, rhs.createParticipantIdentifier)) {
            return false;
        }
        if (!EqualsHelper.equals(serviceName, rhs.serviceName)) {
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
        return new HashCodeGenerator(this).append(createParticipantIdentifier).append(serviceName).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("createParticipantIdentifier", createParticipantIdentifier).append("serviceName", serviceName).toString();
    }

}
