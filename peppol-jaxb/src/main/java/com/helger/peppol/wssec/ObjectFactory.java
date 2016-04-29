
package com.helger.peppol.wssec;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.helger.commons.annotation.CodingStyleguideUnaware;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.helger.peppol.wssec package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@CodingStyleguideUnaware
public class ObjectFactory {

    public final static QName _Timestamp_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Timestamp");
    public final static QName _Expires_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Expires");
    public final static QName _Created_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Created");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.helger.peppol.wssec
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TimestampType }
     * 
     * @return
     *     The created TimestampType object and never <code>null</code>.
     */
    @Nonnull
    public TimestampType createTimestampType() {
        return new TimestampType();
    }

    /**
     * Create an instance of {@link AttributedDateTime }
     * 
     * @return
     *     The created AttributedDateTime object and never <code>null</code>.
     */
    @Nonnull
    public AttributedDateTime createAttributedDateTime() {
        return new AttributedDateTime();
    }

    /**
     * Create an instance of {@link AttributedURI }
     * 
     * @return
     *     The created AttributedURI object and never <code>null</code>.
     */
    @Nonnull
    public AttributedURI createAttributedURI() {
        return new AttributedURI();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimestampType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "Timestamp")
    @Nonnull
    public JAXBElement<TimestampType> createTimestamp(
        @Nullable
        final TimestampType value) {
        return new JAXBElement<TimestampType>(_Timestamp_QNAME, TimestampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedDateTime }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "Expires")
    @Nonnull
    public JAXBElement<AttributedDateTime> createExpires(
        @Nullable
        final AttributedDateTime value) {
        return new JAXBElement<AttributedDateTime>(_Expires_QNAME, AttributedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedDateTime }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "Created")
    @Nonnull
    public JAXBElement<AttributedDateTime> createCreated(
        @Nullable
        final AttributedDateTime value) {
        return new JAXBElement<AttributedDateTime>(_Created_QNAME, AttributedDateTime.class, null, value);
    }

}
