
package com.helger.peppol.smlclient.bdmslcipa;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.peppol.identifier.ParticipantIdentifierType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.helger.peppol.smlclient.bdmslcipa package. 
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

    public final static QName _DeleteList_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "DeleteList");
    public final static QName _BadRequestFault_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "BadRequestFault");
    public final static QName _PrepareMigrationRecord_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "PrepareMigrationRecord");
    public final static QName _InternalErrorFault_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "InternalErrorFault");
    public final static QName _PrepareChangeCertificate_QNAME = new QName("ec:services:wsdl:BDMSL:data:1.0", "PrepareChangeCertificate");
    public final static QName _ClearCache_QNAME = new QName("ec:services:wsdl:BDMSL:data:1.0", "ClearCache");
    public final static QName _IsAlive_QNAME = new QName("ec:services:wsdl:BDMSL:data:1.0", "IsAlive");
    public final static QName _ListParticipantsIn_QNAME = new QName("ec:services:wsdl:BDMSL:data:1.0", "ListParticipantsIn");
    public final static QName _UnauthorizedFault_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "UnauthorizedFault");
    public final static QName _CompleteMigrationRecord_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "CompleteMigrationRecord");
    public final static QName _CreateList_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "CreateList");
    public final static QName _ServiceMetadataPublisherID_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "ServiceMetadataPublisherID");
    public final static QName _SMPAdvancedServiceForParticipantService_QNAME = new QName("ec:services:wsdl:BDMSL:data:1.0", "SMPAdvancedServiceForParticipantService");
    public final static QName _ListParticipantsOut_QNAME = new QName("ec:services:wsdl:BDMSL:data:1.0", "ListParticipantsOut");
    public final static QName _NotFoundFault_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "NotFoundFault");
    public final static QName _PageRequest_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "PageRequest");
    public final static QName _ParticipantIdentifier_QNAME = new QName("http://busdox.org/transport/identifiers/1.0/", "ParticipantIdentifier");
    public final static QName _DeleteParticipantIdentifier_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "DeleteParticipantIdentifier");
    public final static QName _ParticipantIdentifierPage_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "ParticipantIdentifierPage");
    public final static QName _CreateParticipantIdentifier_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "CreateParticipantIdentifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.helger.peppol.smlclient.bdmslcipa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     * @return
     *     The created FaultType object and never <code>null</code>.
     */
    @Nonnull
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link MigrationRecordType }
     * 
     * @return
     *     The created MigrationRecordType object and never <code>null</code>.
     */
    @Nonnull
    public MigrationRecordType createMigrationRecordType() {
        return new MigrationRecordType();
    }

    /**
     * Create an instance of {@link ParticipantIdentifierPageType }
     * 
     * @return
     *     The created ParticipantIdentifierPageType object and never <code>null</code>.
     */
    @Nonnull
    public ParticipantIdentifierPageType createParticipantIdentifierPageType() {
        return new ParticipantIdentifierPageType();
    }

    /**
     * Create an instance of {@link ServiceMetadataPublisherServiceForParticipantType }
     * 
     * @return
     *     The created ServiceMetadataPublisherServiceForParticipantType object and never <code>null</code>.
     */
    @Nonnull
    public ServiceMetadataPublisherServiceForParticipantType createServiceMetadataPublisherServiceForParticipantType() {
        return new ServiceMetadataPublisherServiceForParticipantType();
    }

    /**
     * Create an instance of {@link PageRequestType }
     * 
     * @return
     *     The created PageRequestType object and never <code>null</code>.
     */
    @Nonnull
    public PageRequestType createPageRequestType() {
        return new PageRequestType();
    }

    /**
     * Create an instance of {@link ListParticipantsType }
     * 
     * @return
     *     The created ListParticipantsType object and never <code>null</code>.
     */
    @Nonnull
    public ListParticipantsType createListParticipantsType() {
        return new ListParticipantsType();
    }

    /**
     * Create an instance of {@link SMPAdvancedServiceForParticipantType }
     * 
     * @return
     *     The created SMPAdvancedServiceForParticipantType object and never <code>null</code>.
     */
    @Nonnull
    public SMPAdvancedServiceForParticipantType createSMPAdvancedServiceForParticipantType() {
        return new SMPAdvancedServiceForParticipantType();
    }

    /**
     * Create an instance of {@link PrepareChangeCertificateType }
     * 
     * @return
     *     The created PrepareChangeCertificateType object and never <code>null</code>.
     */
    @Nonnull
    public PrepareChangeCertificateType createPrepareChangeCertificateType() {
        return new PrepareChangeCertificateType();
    }

    /**
     * Create an instance of {@link IsAliveType }
     * 
     * @return
     *     The created IsAliveType object and never <code>null</code>.
     */
    @Nonnull
    public IsAliveType createIsAliveType() {
        return new IsAliveType();
    }

    /**
     * Create an instance of {@link ClearCacheType }
     * 
     * @return
     *     The created ClearCacheType object and never <code>null</code>.
     */
    @Nonnull
    public ClearCacheType createClearCacheType() {
        return new ClearCacheType();
    }

    /**
     * Create an instance of {@link ListParticipantsInType }
     * 
     * @return
     *     The created ListParticipantsInType object and never <code>null</code>.
     */
    @Nonnull
    public ListParticipantsInType createListParticipantsInType() {
        return new ListParticipantsInType();
    }

    /**
     * Create an instance of {@link ParticipantsType }
     * 
     * @return
     *     The created ParticipantsType object and never <code>null</code>.
     */
    @Nonnull
    public ParticipantsType createParticipantsType() {
        return new ParticipantsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantIdentifierPageType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "DeleteList")
    @Nonnull
    public JAXBElement<ParticipantIdentifierPageType> createDeleteList(
        @Nullable
        final ParticipantIdentifierPageType value) {
        return new JAXBElement<ParticipantIdentifierPageType>(_DeleteList_QNAME, ParticipantIdentifierPageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "BadRequestFault")
    @Nonnull
    public JAXBElement<FaultType> createBadRequestFault(
        @Nullable
        final FaultType value) {
        return new JAXBElement<FaultType>(_BadRequestFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrationRecordType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "PrepareMigrationRecord")
    @Nonnull
    public JAXBElement<MigrationRecordType> createPrepareMigrationRecord(
        @Nullable
        final MigrationRecordType value) {
        return new JAXBElement<MigrationRecordType>(_PrepareMigrationRecord_QNAME, MigrationRecordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "InternalErrorFault")
    @Nonnull
    public JAXBElement<FaultType> createInternalErrorFault(
        @Nullable
        final FaultType value) {
        return new JAXBElement<FaultType>(_InternalErrorFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareChangeCertificateType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "ec:services:wsdl:BDMSL:data:1.0", name = "PrepareChangeCertificate")
    @Nonnull
    public JAXBElement<PrepareChangeCertificateType> createPrepareChangeCertificate(
        @Nullable
        final PrepareChangeCertificateType value) {
        return new JAXBElement<PrepareChangeCertificateType>(_PrepareChangeCertificate_QNAME, PrepareChangeCertificateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearCacheType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "ec:services:wsdl:BDMSL:data:1.0", name = "ClearCache")
    @Nonnull
    public JAXBElement<ClearCacheType> createClearCache(
        @Nullable
        final ClearCacheType value) {
        return new JAXBElement<ClearCacheType>(_ClearCache_QNAME, ClearCacheType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAliveType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "ec:services:wsdl:BDMSL:data:1.0", name = "IsAlive")
    @Nonnull
    public JAXBElement<IsAliveType> createIsAlive(
        @Nullable
        final IsAliveType value) {
        return new JAXBElement<IsAliveType>(_IsAlive_QNAME, IsAliveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListParticipantsInType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "ec:services:wsdl:BDMSL:data:1.0", name = "ListParticipantsIn")
    @Nonnull
    public JAXBElement<ListParticipantsInType> createListParticipantsIn(
        @Nullable
        final ListParticipantsInType value) {
        return new JAXBElement<ListParticipantsInType>(_ListParticipantsIn_QNAME, ListParticipantsInType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "UnauthorizedFault")
    @Nonnull
    public JAXBElement<FaultType> createUnauthorizedFault(
        @Nullable
        final FaultType value) {
        return new JAXBElement<FaultType>(_UnauthorizedFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrationRecordType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "CompleteMigrationRecord")
    @Nonnull
    public JAXBElement<MigrationRecordType> createCompleteMigrationRecord(
        @Nullable
        final MigrationRecordType value) {
        return new JAXBElement<MigrationRecordType>(_CompleteMigrationRecord_QNAME, MigrationRecordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantIdentifierPageType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "CreateList")
    @Nonnull
    public JAXBElement<ParticipantIdentifierPageType> createCreateList(
        @Nullable
        final ParticipantIdentifierPageType value) {
        return new JAXBElement<ParticipantIdentifierPageType>(_CreateList_QNAME, ParticipantIdentifierPageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "ServiceMetadataPublisherID")
    @Nonnull
    public JAXBElement<String> createServiceMetadataPublisherID(
        @Nullable
        final String value) {
        return new JAXBElement<String>(_ServiceMetadataPublisherID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMPAdvancedServiceForParticipantType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "ec:services:wsdl:BDMSL:data:1.0", name = "SMPAdvancedServiceForParticipantService")
    @Nonnull
    public JAXBElement<SMPAdvancedServiceForParticipantType> createSMPAdvancedServiceForParticipantService(
        @Nullable
        final SMPAdvancedServiceForParticipantType value) {
        return new JAXBElement<SMPAdvancedServiceForParticipantType>(_SMPAdvancedServiceForParticipantService_QNAME, SMPAdvancedServiceForParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListParticipantsType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "ec:services:wsdl:BDMSL:data:1.0", name = "ListParticipantsOut")
    @Nonnull
    public JAXBElement<ListParticipantsType> createListParticipantsOut(
        @Nullable
        final ListParticipantsType value) {
        return new JAXBElement<ListParticipantsType>(_ListParticipantsOut_QNAME, ListParticipantsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "NotFoundFault")
    @Nonnull
    public JAXBElement<FaultType> createNotFoundFault(
        @Nullable
        final FaultType value) {
        return new JAXBElement<FaultType>(_NotFoundFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageRequestType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "PageRequest")
    @Nonnull
    public JAXBElement<PageRequestType> createPageRequest(
        @Nullable
        final PageRequestType value) {
        return new JAXBElement<PageRequestType>(_PageRequest_QNAME, PageRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantIdentifierType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/transport/identifiers/1.0/", name = "ParticipantIdentifier")
    @Nonnull
    public JAXBElement<ParticipantIdentifierType> createParticipantIdentifier(
        @Nullable
        final ParticipantIdentifierType value) {
        return new JAXBElement<ParticipantIdentifierType>(_ParticipantIdentifier_QNAME, ParticipantIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMetadataPublisherServiceForParticipantType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "DeleteParticipantIdentifier")
    @Nonnull
    public JAXBElement<ServiceMetadataPublisherServiceForParticipantType> createDeleteParticipantIdentifier(
        @Nullable
        final ServiceMetadataPublisherServiceForParticipantType value) {
        return new JAXBElement<ServiceMetadataPublisherServiceForParticipantType>(_DeleteParticipantIdentifier_QNAME, ServiceMetadataPublisherServiceForParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantIdentifierPageType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "ParticipantIdentifierPage")
    @Nonnull
    public JAXBElement<ParticipantIdentifierPageType> createParticipantIdentifierPage(
        @Nullable
        final ParticipantIdentifierPageType value) {
        return new JAXBElement<ParticipantIdentifierPageType>(_ParticipantIdentifierPage_QNAME, ParticipantIdentifierPageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMetadataPublisherServiceForParticipantType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "CreateParticipantIdentifier")
    @Nonnull
    public JAXBElement<ServiceMetadataPublisherServiceForParticipantType> createCreateParticipantIdentifier(
        @Nullable
        final ServiceMetadataPublisherServiceForParticipantType value) {
        return new JAXBElement<ServiceMetadataPublisherServiceForParticipantType>(_CreateParticipantIdentifier_QNAME, ServiceMetadataPublisherServiceForParticipantType.class, null, value);
    }

}
