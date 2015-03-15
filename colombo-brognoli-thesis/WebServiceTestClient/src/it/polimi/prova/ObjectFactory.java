
package it.polimi.prova;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.polimi.prova package. 
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
public class ObjectFactory {

    private final static QName _AnswerResponse_QNAME = new QName("http://prova.polimi.it/", "answerResponse");
    private final static QName _DoSleepResponse_QNAME = new QName("http://prova.polimi.it/", "doSleepResponse");
    private final static QName _DoSleep_QNAME = new QName("http://prova.polimi.it/", "doSleep");
    private final static QName _Answer_QNAME = new QName("http://prova.polimi.it/", "answer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polimi.prova
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoSleepResponse }
     * 
     */
    public DoSleepResponse createDoSleepResponse() {
        return new DoSleepResponse();
    }

    /**
     * Create an instance of {@link AnswerResponse }
     * 
     */
    public AnswerResponse createAnswerResponse() {
        return new AnswerResponse();
    }

    /**
     * Create an instance of {@link DoSleep }
     * 
     */
    public DoSleep createDoSleep() {
        return new DoSleep();
    }

    /**
     * Create an instance of {@link Answer }
     * 
     */
    public Answer createAnswer() {
        return new Answer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prova.polimi.it/", name = "answerResponse")
    public JAXBElement<AnswerResponse> createAnswerResponse(AnswerResponse value) {
        return new JAXBElement<AnswerResponse>(_AnswerResponse_QNAME, AnswerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSleepResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prova.polimi.it/", name = "doSleepResponse")
    public JAXBElement<DoSleepResponse> createDoSleepResponse(DoSleepResponse value) {
        return new JAXBElement<DoSleepResponse>(_DoSleepResponse_QNAME, DoSleepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoSleep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prova.polimi.it/", name = "doSleep")
    public JAXBElement<DoSleep> createDoSleep(DoSleep value) {
        return new JAXBElement<DoSleep>(_DoSleep_QNAME, DoSleep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Answer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://prova.polimi.it/", name = "answer")
    public JAXBElement<Answer> createAnswer(Answer value) {
        return new JAXBElement<Answer>(_Answer_QNAME, Answer.class, null, value);
    }

}
