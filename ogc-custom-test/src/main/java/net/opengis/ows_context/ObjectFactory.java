//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.ows_context;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.ows_context package. 
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

    private final static QName _Media_QNAME = new QName("http://www.opengis.net/ows-context", "Media");
    private final static QName _Layer_QNAME = new QName("http://www.opengis.net/ows-context", "Layer");
    private final static QName _ResourceList_QNAME = new QName("http://www.opengis.net/ows-context", "ResourceList");
    private final static QName _OWSContext_QNAME = new QName("http://www.opengis.net/ows-context", "OWSContext");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.ows_context
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResourceListType }
     * 
     */
    public ResourceListType createResourceListType() {
        return new ResourceListType();
    }

    /**
     * Create an instance of {@link OWSContextType }
     * 
     */
    public OWSContextType createOWSContextType() {
        return new OWSContextType();
    }

    /**
     * Create an instance of {@link MediaType }
     * 
     */
    public MediaType createMediaType() {
        return new MediaType();
    }

    /**
     * Create an instance of {@link LayerType }
     * 
     */
    public LayerType createLayerType() {
        return new LayerType();
    }

    /**
     * Create an instance of {@link ServerType }
     * 
     */
    public ServerType createServerType() {
        return new ServerType();
    }

    /**
     * Create an instance of {@link DimensionType }
     * 
     */
    public DimensionType createDimensionType() {
        return new DimensionType();
    }

    /**
     * Create an instance of {@link StyleType }
     * 
     */
    public StyleType createStyleType() {
        return new StyleType();
    }

    /**
     * Create an instance of {@link DimensionListType }
     * 
     */
    public DimensionListType createDimensionListType() {
        return new DimensionListType();
    }

    /**
     * Create an instance of {@link GeneralType }
     * 
     */
    public GeneralType createGeneralType() {
        return new GeneralType();
    }

    /**
     * Create an instance of {@link FormatType }
     * 
     */
    public FormatType createFormatType() {
        return new FormatType();
    }

    /**
     * Create an instance of {@link InlineFeatureCollectionType }
     * 
     */
    public InlineFeatureCollectionType createInlineFeatureCollectionType() {
        return new InlineFeatureCollectionType();
    }

    /**
     * Create an instance of {@link OnlineResourceType }
     * 
     */
    public OnlineResourceType createOnlineResourceType() {
        return new OnlineResourceType();
    }

    /**
     * Create an instance of {@link StyleListType }
     * 
     */
    public StyleListType createStyleListType() {
        return new StyleListType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link FormatListType }
     * 
     */
    public FormatListType createFormatListType() {
        return new FormatListType();
    }

    /**
     * Create an instance of {@link WindowType }
     * 
     */
    public WindowType createWindowType() {
        return new WindowType();
    }

    /**
     * Create an instance of {@link ParameterListType }
     * 
     */
    public ParameterListType createParameterListType() {
        return new ParameterListType();
    }

    /**
     * Create an instance of {@link SLDType }
     * 
     */
    public SLDType createSLDType() {
        return new SLDType();
    }

    /**
     * Create an instance of {@link URLType }
     * 
     */
    public URLType createURLType() {
        return new URLType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ows-context", name = "Media")
    public JAXBElement<MediaType> createMedia(MediaType value) {
        return new JAXBElement<MediaType>(_Media_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ows-context", name = "Layer")
    public JAXBElement<LayerType> createLayer(LayerType value) {
        return new JAXBElement<LayerType>(_Layer_QNAME, LayerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ows-context", name = "ResourceList")
    public JAXBElement<ResourceListType> createResourceList(ResourceListType value) {
        return new JAXBElement<ResourceListType>(_ResourceList_QNAME, ResourceListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OWSContextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/ows-context", name = "OWSContext")
    public JAXBElement<OWSContextType> createOWSContext(OWSContextType value) {
        return new JAXBElement<OWSContextType>(_OWSContext_QNAME, OWSContextType.class, null, value);
    }

}