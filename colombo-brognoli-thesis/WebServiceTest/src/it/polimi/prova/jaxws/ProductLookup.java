
package it.polimi.prova.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.2
 * Fri Sep 21 16:29:35 CEST 2012
 * Generated source version: 2.6.2
 */

@XmlRootElement(name = "productLookup", namespace = "http://prova.polimi.it/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productLookup", namespace = "http://prova.polimi.it/")

public class ProductLookup {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}
