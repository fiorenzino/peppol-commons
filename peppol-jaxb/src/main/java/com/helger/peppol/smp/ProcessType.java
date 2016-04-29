
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
import com.helger.peppol.identifier.ProcessIdentifierType;


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
 *         &lt;element ref="{http://busdox.org/transport/identifiers/1.0/}ProcessIdentifier"/&gt;
 *         &lt;element name="ServiceEndpointList" type="{http://busdox.org/serviceMetadata/publishing/1.0/}ServiceEndpointList"/&gt;
 *         &lt;element name="Extension" type="{http://busdox.org/serviceMetadata/publishing/1.0/}ExtensionType" minOccurs="0"/&gt;
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

    @XmlElement(name = "ProcessIdentifier", namespace = "http://busdox.org/transport/identifiers/1.0/", required = true)
    private ProcessIdentifierType processIdentifier;
    @XmlElement(name = "ServiceEndpointList", required = true)
    private ServiceEndpointList serviceEndpointList;
    @XmlElement(name = "Extension")
    private ExtensionType extension;

    /**
     * The identifier of the process.
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
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    @Nullable
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(
        @Nullable
        ExtensionType value) {
        this.extension = value;
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

}
