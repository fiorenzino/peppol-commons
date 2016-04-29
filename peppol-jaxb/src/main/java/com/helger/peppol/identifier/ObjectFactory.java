
package com.helger.peppol.identifier;

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
 * generated in the com.helger.peppol.identifier package.
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

    public final static QName _ParticipantIdentifier_QNAME = new QName("http://busdox.org/transport/identifiers/1.0/", "ParticipantIdentifier2");
    public final static QName _DocumentIdentifier_QNAME = new QName("http://busdox.org/transport/identifiers/1.0/", "DocumentIdentifier");
    public final static QName _ProcessIdentifier_QNAME = new QName("http://busdox.org/transport/identifiers/1.0/", "ProcessIdentifier");
    public final static QName _RecipientIdentifier_QNAME = new QName("http://busdox.org/transport/identifiers/1.0/", "RecipientIdentifier");
    public final static QName _SenderIdentifier_QNAME = new QName("http://busdox.org/transport/identifiers/1.0/", "SenderIdentifier");
    public final static QName _MessageIdentifier_QNAME = new QName("http://busdox.org/transport/identifiers/1.0/", "MessageIdentifier");
    public final static QName _ChannelIdentifier_QNAME = new QName("http://busdox.org/transport/identifiers/1.0/", "ChannelIdentifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.helger.peppol.identifier
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParticipantIdentifierType }
     *
     * @return
     *     The created ParticipantIdentifierType object and never <code>null</code>.
     */
    @Nonnull
    public ParticipantIdentifierType createParticipantIdentifierType() {
        return new ParticipantIdentifierType();
    }

    /**
     * Create an instance of {@link DocumentIdentifierType }
     *
     * @return
     *     The created DocumentIdentifierType object and never <code>null</code>.
     */
    @Nonnull
    public DocumentIdentifierType createDocumentIdentifierType() {
        return new DocumentIdentifierType();
    }

    /**
     * Create an instance of {@link ProcessIdentifierType }
     *
     * @return
     *     The created ProcessIdentifierType object and never <code>null</code>.
     */
    @Nonnull
    public ProcessIdentifierType createProcessIdentifierType() {
        return new ProcessIdentifierType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantIdentifierType }{@code >}}
     *
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/transport/identifiers/1.0/", name = "ParticipantIdentifier2")
    @Nonnull
    public JAXBElement<ParticipantIdentifierType> createParticipantIdentifier(
        @Nullable
        final ParticipantIdentifierType value) {
        return new JAXBElement<ParticipantIdentifierType>(_ParticipantIdentifier_QNAME, ParticipantIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentIdentifierType }{@code >}}
     *
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/transport/identifiers/1.0/", name = "DocumentIdentifier")
    @Nonnull
    public JAXBElement<DocumentIdentifierType> createDocumentIdentifier(
        @Nullable
        final DocumentIdentifierType value) {
        return new JAXBElement<DocumentIdentifierType>(_DocumentIdentifier_QNAME, DocumentIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessIdentifierType }{@code >}}
     *
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/transport/identifiers/1.0/", name = "ProcessIdentifier")
    @Nonnull
    public JAXBElement<ProcessIdentifierType> createProcessIdentifier(
        @Nullable
        final ProcessIdentifierType value) {
        return new JAXBElement<ProcessIdentifierType>(_ProcessIdentifier_QNAME, ProcessIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantIdentifierType }{@code >}}
     *
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/transport/identifiers/1.0/", name = "RecipientIdentifier")
    @Nonnull
    public JAXBElement<ParticipantIdentifierType> createRecipientIdentifier(
        @Nullable
        final ParticipantIdentifierType value) {
        return new JAXBElement<ParticipantIdentifierType>(_RecipientIdentifier_QNAME, ParticipantIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantIdentifierType }{@code >}}
     *
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/transport/identifiers/1.0/", name = "SenderIdentifier")
    @Nonnull
    public JAXBElement<ParticipantIdentifierType> createSenderIdentifier(
        @Nullable
        final ParticipantIdentifierType value) {
        return new JAXBElement<ParticipantIdentifierType>(_SenderIdentifier_QNAME, ParticipantIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/transport/identifiers/1.0/", name = "MessageIdentifier")
    @Nonnull
    public JAXBElement<String> createMessageIdentifier(
        @Nullable
        final String value) {
        return new JAXBElement<String>(_MessageIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/transport/identifiers/1.0/", name = "ChannelIdentifier")
    @Nonnull
    public JAXBElement<String> createChannelIdentifier(
        @Nullable
        final String value) {
        return new JAXBElement<String>(_ChannelIdentifier_QNAME, String.class, null, value);
    }

}
