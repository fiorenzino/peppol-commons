
package com.helger.peppol.xsd;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import com.helger.commons.annotation.CodingStyleguideUnaware;
import org.joda.time.LocalDateTime;

@CodingStyleguideUnaware
public class Adapter1
    extends XmlAdapter<String, LocalDateTime>
{


    public LocalDateTime unmarshal(String value) {
        return (com.helger.peppol.DateAdapter.getLocalDateTimeFromXSD(value));
    }

    public String marshal(LocalDateTime value) {
        return (com.helger.peppol.DateAdapter.getAsStringXSD(value));
    }

}
