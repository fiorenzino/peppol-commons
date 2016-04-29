
package com.helger.peppol.xmldsig;

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
 * <p>Java class for DSAKeyValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSAKeyValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="P" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *           &lt;element name="Q" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="G" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary" minOccurs="0"/&gt;
 *         &lt;element name="Y" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;element name="J" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Seed" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *           &lt;element name="PgenCounter" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSAKeyValueType", propOrder = {
    "p",
    "q",
    "g",
    "y",
    "j",
    "seed",
    "pgenCounter"
})
@CodingStyleguideUnaware
public class DSAKeyValueType implements Serializable
{

    @XmlElement(name = "P")
    private byte[] p;
    @XmlElement(name = "Q")
    private byte[] q;
    @XmlElement(name = "G")
    private byte[] g;
    @XmlElement(name = "Y", required = true)
    private byte[] y;
    @XmlElement(name = "J")
    private byte[] j;
    @XmlElement(name = "Seed")
    private byte[] seed;
    @XmlElement(name = "PgenCounter")
    private byte[] pgenCounter;

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Nullable
    public byte[] getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setP(
        @Nullable
        byte[] value) {
        this.p = value;
    }

    /**
     * Gets the value of the q property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Nullable
    public byte[] getQ() {
        return q;
    }

    /**
     * Sets the value of the q property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setQ(
        @Nullable
        byte[] value) {
        this.q = value;
    }

    /**
     * Gets the value of the g property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Nullable
    public byte[] getG() {
        return g;
    }

    /**
     * Sets the value of the g property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setG(
        @Nullable
        byte[] value) {
        this.g = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Nullable
    public byte[] getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setY(
        @Nullable
        byte[] value) {
        this.y = value;
    }

    /**
     * Gets the value of the j property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Nullable
    public byte[] getJ() {
        return j;
    }

    /**
     * Sets the value of the j property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setJ(
        @Nullable
        byte[] value) {
        this.j = value;
    }

    /**
     * Gets the value of the seed property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Nullable
    public byte[] getSeed() {
        return seed;
    }

    /**
     * Sets the value of the seed property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSeed(
        @Nullable
        byte[] value) {
        this.seed = value;
    }

    /**
     * Gets the value of the pgenCounter property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Nullable
    public byte[] getPgenCounter() {
        return pgenCounter;
    }

    /**
     * Sets the value of the pgenCounter property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPgenCounter(
        @Nullable
        byte[] value) {
        this.pgenCounter = value;
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
        final DSAKeyValueType rhs = ((DSAKeyValueType) o);
        if (!EqualsHelper.equals(p, rhs.p)) {
            return false;
        }
        if (!EqualsHelper.equals(q, rhs.q)) {
            return false;
        }
        if (!EqualsHelper.equals(g, rhs.g)) {
            return false;
        }
        if (!EqualsHelper.equals(y, rhs.y)) {
            return false;
        }
        if (!EqualsHelper.equals(j, rhs.j)) {
            return false;
        }
        if (!EqualsHelper.equals(seed, rhs.seed)) {
            return false;
        }
        if (!EqualsHelper.equals(pgenCounter, rhs.pgenCounter)) {
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
        return new HashCodeGenerator(this).append(p).append(q).append(g).append(y).append(j).append(seed).append(pgenCounter).getHashCode();
    }

    /**
     * Created by ph-jaxb22-plugin -Xph-tostring
     * 
     */
    @Override
    public String toString() {
        return new ToStringGenerator(this).append("p", p).append("q", q).append("g", g).append("y", y).append("j", j).append("seed", seed).append("pgenCounter", pgenCounter).toString();
    }

}
