
package com.helger.peppol.smlclient.smp;

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
 * generated in the com.helger.peppol.smlclient.smp package. 
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

    public final static QName _ServiceMetadataPublisherService_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "ServiceMetadataPublisherService");
    public final static QName _BadRequestFault_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "BadRequestFault");
    public final static QName _ServiceMetadataPublisherID_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "ServiceMetadataPublisherID");
    public final static QName _CreateServiceMetadataPublisherService_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "CreateServiceMetadataPublisherService");
    public final static QName _NotFoundFault_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "NotFoundFault");
    public final static QName _InternalErrorFault_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "InternalErrorFault");
    public final static QName _UpdateServiceMetadataPublisherService_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "UpdateServiceMetadataPublisherService");
    public final static QName _ReadServiceMetadataPublisherService_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "ReadServiceMetadataPublisherService");
    public final static QName _UnauthorizedFault_QNAME = new QName("http://busdox.org/serviceMetadata/locator/1.0/", "UnauthorizedFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.helger.peppol.smlclient.smp
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
     * Create an instance of {@link ServiceMetadataPublisherServiceType }
     * 
     * @return
     *     The created ServiceMetadataPublisherServiceType object and never <code>null</code>.
     */
    @Nonnull
    public ServiceMetadataPublisherServiceType createServiceMetadataPublisherServiceType() {
        return new ServiceMetadataPublisherServiceType();
    }

    /**
     * Create an instance of {@link PublisherEndpointType }
     * 
     * @return
     *     The created PublisherEndpointType object and never <code>null</code>.
     */
    @Nonnull
    public PublisherEndpointType createPublisherEndpointType() {
        return new PublisherEndpointType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMetadataPublisherServiceType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "ServiceMetadataPublisherService")
    @Nonnull
    public JAXBElement<ServiceMetadataPublisherServiceType> createServiceMetadataPublisherService(
        @Nullable
        final ServiceMetadataPublisherServiceType value) {
        return new JAXBElement<ServiceMetadataPublisherServiceType>(_ServiceMetadataPublisherService_QNAME, ServiceMetadataPublisherServiceType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMetadataPublisherServiceType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "CreateServiceMetadataPublisherService")
    @Nonnull
    public JAXBElement<ServiceMetadataPublisherServiceType> createCreateServiceMetadataPublisherService(
        @Nullable
        final ServiceMetadataPublisherServiceType value) {
        return new JAXBElement<ServiceMetadataPublisherServiceType>(_CreateServiceMetadataPublisherService_QNAME, ServiceMetadataPublisherServiceType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMetadataPublisherServiceType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "UpdateServiceMetadataPublisherService")
    @Nonnull
    public JAXBElement<ServiceMetadataPublisherServiceType> createUpdateServiceMetadataPublisherService(
        @Nullable
        final ServiceMetadataPublisherServiceType value) {
        return new JAXBElement<ServiceMetadataPublisherServiceType>(_UpdateServiceMetadataPublisherService_QNAME, ServiceMetadataPublisherServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMetadataPublisherServiceType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/locator/1.0/", name = "ReadServiceMetadataPublisherService")
    @Nonnull
    public JAXBElement<ServiceMetadataPublisherServiceType> createReadServiceMetadataPublisherService(
        @Nullable
        final ServiceMetadataPublisherServiceType value) {
        return new JAXBElement<ServiceMetadataPublisherServiceType>(_ReadServiceMetadataPublisherService_QNAME, ServiceMetadataPublisherServiceType.class, null, value);
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

}
