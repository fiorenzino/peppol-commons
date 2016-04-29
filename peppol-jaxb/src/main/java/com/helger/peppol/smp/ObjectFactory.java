
package com.helger.peppol.smp;

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
 * generated in the com.helger.peppol.smp package. 
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

    public final static QName _ServiceGroupReferenceList_QNAME = new QName("http://busdox.org/serviceMetadata/publishing/1.0/", "ServiceGroupReferenceList");
    public final static QName _CompleteServiceGroup_QNAME = new QName("http://busdox.org/serviceMetadata/publishing/1.0/", "CompleteServiceGroup");
    public final static QName _ServiceGroup_QNAME = new QName("http://busdox.org/serviceMetadata/publishing/1.0/", "ServiceGroup");
    public final static QName _ServiceMetadata_QNAME = new QName("http://busdox.org/serviceMetadata/publishing/1.0/", "ServiceMetadata");
    public final static QName _SignedServiceMetadata_QNAME = new QName("http://busdox.org/serviceMetadata/publishing/1.0/", "SignedServiceMetadata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.helger.peppol.smp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceGroupReferenceListType }
     * 
     * @return
     *     The created ServiceGroupReferenceListType object and never <code>null</code>.
     */
    @Nonnull
    public ServiceGroupReferenceListType createServiceGroupReferenceListType() {
        return new ServiceGroupReferenceListType();
    }

    /**
     * Create an instance of {@link CompleteServiceGroupType }
     * 
     * @return
     *     The created CompleteServiceGroupType object and never <code>null</code>.
     */
    @Nonnull
    public CompleteServiceGroupType createCompleteServiceGroupType() {
        return new CompleteServiceGroupType();
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
     * Create an instance of {@link ServiceGroupReferenceType }
     * 
     * @return
     *     The created ServiceGroupReferenceType object and never <code>null</code>.
     */
    @Nonnull
    public ServiceGroupReferenceType createServiceGroupReferenceType() {
        return new ServiceGroupReferenceType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceGroupReferenceListType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/publishing/1.0/", name = "ServiceGroupReferenceList")
    @Nonnull
    public JAXBElement<ServiceGroupReferenceListType> createServiceGroupReferenceList(
        @Nullable
        final ServiceGroupReferenceListType value) {
        return new JAXBElement<ServiceGroupReferenceListType>(_ServiceGroupReferenceList_QNAME, ServiceGroupReferenceListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteServiceGroupType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/publishing/1.0/", name = "CompleteServiceGroup")
    @Nonnull
    public JAXBElement<CompleteServiceGroupType> createCompleteServiceGroup(
        @Nullable
        final CompleteServiceGroupType value) {
        return new JAXBElement<CompleteServiceGroupType>(_CompleteServiceGroup_QNAME, CompleteServiceGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceGroupType }{@code >}}
     * 
     * @return
     *     The created JAXBElement and never <code>null</code>.
     */
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/publishing/1.0/", name = "ServiceGroup")
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
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/publishing/1.0/", name = "ServiceMetadata")
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
    @XmlElementDecl(namespace = "http://busdox.org/serviceMetadata/publishing/1.0/", name = "SignedServiceMetadata")
    @Nonnull
    public JAXBElement<SignedServiceMetadataType> createSignedServiceMetadata(
        @Nullable
        final SignedServiceMetadataType value) {
        return new JAXBElement<SignedServiceMetadataType>(_SignedServiceMetadata_QNAME, SignedServiceMetadataType.class, null, value);
    }

}
