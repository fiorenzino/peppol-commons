
package com.helger.peppol.smlclient.bdmslcipa;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import com.helger.commons.annotation.CodingStyleguideUnaware;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BDMSLCipaService", targetNamespace = "ec:services:wsdl:BDMSL:1.0", wsdlLocation = "/WEB-INF/wsdl/BDMSLCipaService-1.0.wsdl")
@CodingStyleguideUnaware
public class BDMSLCipaService
    extends Service
{

    private final static URL BDMSLCIPASERVICE_WSDL_LOCATION;
    private final static WebServiceException BDMSLCIPASERVICE_EXCEPTION;
    private final static QName BDMSLCIPASERVICE_QNAME = new QName("ec:services:wsdl:BDMSL:1.0", "BDMSLCipaService");

    static {
        BDMSLCIPASERVICE_WSDL_LOCATION = com.helger.peppol.smlclient.bdmslcipa.BDMSLCipaService.class.getResource("/WEB-INF/wsdl/BDMSLCipaService-1.0.wsdl");
        WebServiceException e = null;
        if (BDMSLCIPASERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/WEB-INF/wsdl/BDMSLCipaService-1.0.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        BDMSLCIPASERVICE_EXCEPTION = e;
    }

    public BDMSLCipaService() {
        super(__getWsdlLocation(), BDMSLCIPASERVICE_QNAME);
    }

    public BDMSLCipaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns BDMSLCipaServiceSoap
     */
    @WebEndpoint(name = "BDMSLCipaServicePort")
    public BDMSLCipaServiceSoap getBDMSLCipaServicePort() {
        return super.getPort(new QName("ec:services:wsdl:BDMSL:1.0", "BDMSLCipaServicePort"), BDMSLCipaServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BDMSLCipaServiceSoap
     */
    @WebEndpoint(name = "BDMSLCipaServicePort")
    public BDMSLCipaServiceSoap getBDMSLCipaServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("ec:services:wsdl:BDMSL:1.0", "BDMSLCipaServicePort"), BDMSLCipaServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BDMSLCIPASERVICE_EXCEPTION!= null) {
            throw BDMSLCIPASERVICE_EXCEPTION;
        }
        return BDMSLCIPASERVICE_WSDL_LOCATION;
    }

}
