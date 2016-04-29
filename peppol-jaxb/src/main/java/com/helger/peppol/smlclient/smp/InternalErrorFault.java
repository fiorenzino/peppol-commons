
package com.helger.peppol.smlclient.smp;

import javax.xml.ws.WebFault;
import com.helger.commons.annotation.CodingStyleguideUnaware;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "InternalErrorFault", targetNamespace = "http://busdox.org/serviceMetadata/locator/1.0/")
@CodingStyleguideUnaware
public class InternalErrorFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FaultType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InternalErrorFault(String message, FaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InternalErrorFault(String message, FaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.helger.peppol.smlclient.smp.FaultType
     */
    public FaultType getFaultInfo() {
        return faultInfo;
    }

}
