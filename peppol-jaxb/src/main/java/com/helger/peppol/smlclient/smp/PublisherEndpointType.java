
package com.helger.peppol.smlclient.smp;

import java.io.Serializable;
import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;


/**
 * <p>Java class for PublisherEndpointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublisherEndpointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="PhysicalAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublisherEndpointType", propOrder = {
    "logicalAddress",
    "physicalAddress"
})
@CodingStyleguideUnaware
public class PublisherEndpointType implements Serializable
{

    @XmlElement(name = "LogicalAddress", required = true)
    @XmlSchemaType(name = "anyURI")
    private String logicalAddress;
    @XmlElement(name = "PhysicalAddress", required = true)
    private String physicalAddress;

    /**
     * Gets the value of the logicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getLogicalAddress() {
        return logicalAddress;
    }

    /**
     * Sets the value of the logicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalAddress(
        @Nullable
        String value) {
        this.logicalAddress = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddress(
        @Nullable
        String value) {
        this.physicalAddress = value;
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
        final PublisherEndpointType rhs = ((PublisherEndpointType) o);
        if (!EqualsHelper.equals(logicalAddress, rhs.logicalAddress)) {
            return false;
        }
        if (!EqualsHelper.equals(physicalAddress, rhs.physicalAddress)) {
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
        return new HashCodeGenerator(this).append(logicalAddress).append(physicalAddress).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("logicalAddress", logicalAddress).append("physicalAddress", physicalAddress).toString();
    }

}
