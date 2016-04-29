
package com.helger.peppol.smlclient.bdmslcipa;

import java.io.Serializable;
import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;


/**
 * <p>Java class for PrepareChangeCertificateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepareChangeCertificateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newCertificatePublicKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="migrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepareChangeCertificateType", propOrder = {
    "newCertificatePublicKey",
    "migrationDate"
})
@CodingStyleguideUnaware
public class PrepareChangeCertificateType implements Serializable
{

    @XmlElement(required = true)
    private String newCertificatePublicKey;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    private XMLGregorianCalendar migrationDate;

    /**
     * Gets the value of the newCertificatePublicKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Nullable
    public String getNewCertificatePublicKey() {
        return newCertificatePublicKey;
    }

    /**
     * Sets the value of the newCertificatePublicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCertificatePublicKey(
        @Nullable
        String value) {
        this.newCertificatePublicKey = value;
    }

    /**
     * Gets the value of the migrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Nullable
    public XMLGregorianCalendar getMigrationDate() {
        return migrationDate;
    }

    /**
     * Sets the value of the migrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMigrationDate(
        @Nullable
        XMLGregorianCalendar value) {
        this.migrationDate = value;
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
        final PrepareChangeCertificateType rhs = ((PrepareChangeCertificateType) o);
        if (!EqualsHelper.equals(newCertificatePublicKey, rhs.newCertificatePublicKey)) {
            return false;
        }
        if (!EqualsHelper.equals(migrationDate, rhs.migrationDate)) {
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
        return new HashCodeGenerator(this).append(newCertificatePublicKey).append(migrationDate).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("newCertificatePublicKey", newCertificatePublicKey).append("migrationDate", migrationDate).toString();
    }

}
