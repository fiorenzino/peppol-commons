
package com.helger.peppol.bdxr;

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
 * <p>Java class for ServiceMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ServiceInformation" type="{http://docs.oasis-open.org/bdxr/ns/SMP/2016/04}ServiceInformationType"/&gt;
 *         &lt;element name="Redirect" type="{http://docs.oasis-open.org/bdxr/ns/SMP/2016/04}RedirectType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceMetadataType", propOrder = {
    "serviceInformation",
    "redirect"
})
@CodingStyleguideUnaware
public class ServiceMetadataType implements Serializable
{

    @XmlElement(name = "ServiceInformation")
    private ServiceInformationType serviceInformation;
    @XmlElement(name = "Redirect")
    private RedirectType redirect;

    /**
     * Gets the value of the serviceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInformationType }
     *     
     */
    @Nullable
    public ServiceInformationType getServiceInformation() {
        return serviceInformation;
    }

    /**
     * Sets the value of the serviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInformationType }
     *     
     */
    public void setServiceInformation(
        @Nullable
        ServiceInformationType value) {
        this.serviceInformation = value;
    }

    /**
     * Gets the value of the redirect property.
     * 
     * @return
     *     possible object is
     *     {@link RedirectType }
     *     
     */
    @Nullable
    public RedirectType getRedirect() {
        return redirect;
    }

    /**
     * Sets the value of the redirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectType }
     *     
     */
    public void setRedirect(
        @Nullable
        RedirectType value) {
        this.redirect = value;
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
        final ServiceMetadataType rhs = ((ServiceMetadataType) o);
        if (!EqualsHelper.equals(serviceInformation, rhs.serviceInformation)) {
            return false;
        }
        if (!EqualsHelper.equals(redirect, rhs.redirect)) {
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
        return new HashCodeGenerator(this).append(serviceInformation).append(redirect).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("serviceInformation", serviceInformation).append("redirect", redirect).toString();
    }

}
