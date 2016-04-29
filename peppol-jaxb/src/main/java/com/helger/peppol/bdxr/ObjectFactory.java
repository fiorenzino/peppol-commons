
package com.helger.peppol.bdxr;

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
 * generated in the com.helger.peppol.bdxr package. 
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

    public final static QName _ServiceGroup_QNAME = new QName("http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", "ServiceGroup");
    public final static QName _ServiceMetadata_QNAME = new QName("http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", "ServiceMetadata");
    public final static QName _SignedServiceMetadata_QNAME = new QName("http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", "SignedServiceMetadata");
    public final static QName _ParticipantIdentifier_QNAME = new QName("http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", "ParticipantIdentifier");
    public final static QName _DocumentIdentifier_QNAME = new QName("http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", "DocumentIdentifier");
    public final static QName _ProcessIdentifier_QNAME = new QName("http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", "ProcessIdentifier");
    public final static QName _RecipientIdentifier_QNAME = new QName("http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", "RecipientIdentifier");
    public final static QName _SenderIdentifier_QNAME = new QName("http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", "SenderIdentifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.helger.peppol.bdxr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceGroupType }
     * 
     * @return
     *     The created ServiceGroupType object and never <code>null</code>.
     */
    @Nonnull
    public ServiceGroupType createServiceGroupType() {
        return new ServiceGroupType();
    }

    /**
     * Create an instance of {@link ServiceMetadataType }
     * 
     * @return
     *     The created ServiceMetadataType object and never <code>null</code>.
     */
    @Nonnull
    public ServiceMetadataType createServiceMetadataType() {
        return new ServiceMetadataType();
    }

    /**
     * Create an instance of {@link SignedServiceMetadataType }
     * 
     * @return
     *     The created SignedServiceMetadataType object and never <code>null</code>.
     */
    @Nonnull
    public SignedServiceMetadataType createSignedServiceMetadataType() {
        return new SignedServiceMetadataType();
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
     * Create an instance of {@link ServiceInformationType }
     * 
     * @return
     *     The created ServiceInformationType object and never <code>null</code>.
     */
    @Nonnull
    public ServiceInformationType createServiceInformationType() {
        return new ServiceInformationType();
    }

    /**
     * Create an instance of {@link ProcessListType }
     * 
     * @return
     *     The created ProcessListType object and never <code>null</code>.
     */
    @Nonnull
    public ProcessListType createProcessListType() {
        return new ProcessListType();
    }

    /**
     * Create an instance of {@link ProcessType }
     * 
     * @return
     *     The created ProcessType object and never <code>null</code>.
     */
    @Nonnull
    public ProcessType createProcessType() {
        return new ProcessType();
    }

    /**
     * Create an instance of {@link ServiceEndpointList }
     * 
     * @return
     *     The created ServiceEndpointList object and never <code>null</code>.
     */
    @Nonnull
    public ServiceEndpointList createServiceEndpointList() {
        return new ServiceEndpointList();
    }

    /**
     * Create an instance of {@link EndpointType }
     * 
     * @return
     *     The created EndpointType object and never <code>null</code>.
     */
    @Nonnull
    public EndpointType createEndpointType() {
        return new EndpointType();
    }

    /**
     * Create an instance of {@link ServiceMetadataReferenceCollectionType }
     * 
     * @return
     *     The created ServiceMetadataReferenceCollectionType object and never <code>null</code>.
     */
    @Nonnull
    public ServiceMetadataReferenceCollectionType createServiceMetadataReferenceCollectionType() {
        return new ServiceMetadataReferenceCollectionType();
    }

    /**
     * Create an instance of {@link ServiceMetadataReferenceType }
     * 
     * @return
     *     The created ServiceMetadataReferenceType object and never <code>null</code>.
     */
    @Nonnull
    public ServiceMetadataReferenceType createServiceMetadataReferenceType() {
        return new ServiceMetadataReferenceType();
    }

    /**
     * Create an instance of {@link RedirectType }
     * 
     * @return
     *     The created RedirectType object and never <code>null</code>.
     */
    @Nonnull
    public RedirectType createRedirectType() {
        return new RedirectType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     * @return
     *     The created ExtensionType object and never <code>null</code>.
     */
    @Nonnull
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceGroupType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", name = "ServiceGroup")
    @Nonnull
    public JAXBElement<ServiceGroupType> createServiceGroup(
        @Nullable
        final ServiceGroupType value) {
        return new JAXBElement<ServiceGroupType>(_ServiceGroup_QNAME, ServiceGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMetadataType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", name = "ServiceMetadata")
    @Nonnull
    public JAXBElement<ServiceMetadataType> createServiceMetadata(
        @Nullable
        final ServiceMetadataType value) {
        return new JAXBElement<ServiceMetadataType>(_ServiceMetadata_QNAME, ServiceMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedServiceMetadataType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", name = "SignedServiceMetadata")
    @Nonnull
    public JAXBElement<SignedServiceMetadataType> createSignedServiceMetadata(
        @Nullable
        final SignedServiceMetadataType value) {
        return new JAXBElement<SignedServiceMetadataType>(_SignedServiceMetadata_QNAME, SignedServiceMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantIdentifierType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", name = "ParticipantIdentifier")
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
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", name = "DocumentIdentifier")
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
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", name = "ProcessIdentifier")
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
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", name = "RecipientIdentifier")
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
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/bdxr/ns/SMP/2016/04", name = "SenderIdentifier")
    @Nonnull
    public JAXBElement<ParticipantIdentifierType> createSenderIdentifier(
        @Nullable
        final ParticipantIdentifierType value) {
        return new JAXBElement<ParticipantIdentifierType>(_SenderIdentifier_QNAME, ParticipantIdentifierType.class, null, value);
    }

}
