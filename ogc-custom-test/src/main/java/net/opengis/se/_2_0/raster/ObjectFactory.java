//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.raster;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.se._2_0.raster package. 
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

    private final static QName _SourceChannelName_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "SourceChannelName");
    private final static QName _Histogram_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "Histogram");
    private final static QName _GrayChannel_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "GrayChannel");
    private final static QName _RasterSymbolizer_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "RasterSymbolizer");
    private final static QName _ReliefFactor_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "ReliefFactor");
    private final static QName _ImageOutline_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "ImageOutline");
    private final static QName _ColorMap_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "ColorMap");
    private final static QName _OverlapBehavior_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "OverlapBehavior");
    private final static QName _ContrastEnhancement_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "ContrastEnhancement");
    private final static QName _GreenChannel_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "GreenChannel");
    private final static QName _RedChannel_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "RedChannel");
    private final static QName _Normalize_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "Normalize");
    private final static QName _BlueChannel_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "BlueChannel");
    private final static QName _ChannelSelection_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "ChannelSelection");
    private final static QName _GammaValue_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "GammaValue");
    private final static QName _ShadedRelief_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "ShadedRelief");
    private final static QName _BrightnessOnly_QNAME = new QName("http://www.opengis.net/se/2.0/raster", "BrightnessOnly");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.se._2_0.raster
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NormalizeType }
     * 
     */
    public NormalizeType createNormalizeType() {
        return new NormalizeType();
    }

    /**
     * Create an instance of {@link SelectedChannelType }
     * 
     */
    public SelectedChannelType createSelectedChannelType() {
        return new SelectedChannelType();
    }

    /**
     * Create an instance of {@link HistogramType }
     * 
     */
    public HistogramType createHistogramType() {
        return new HistogramType();
    }

    /**
     * Create an instance of {@link ImageOutlineType }
     * 
     */
    public ImageOutlineType createImageOutlineType() {
        return new ImageOutlineType();
    }

    /**
     * Create an instance of {@link ColorMapType }
     * 
     */
    public ColorMapType createColorMapType() {
        return new ColorMapType();
    }

    /**
     * Create an instance of {@link ShadedReliefType }
     * 
     */
    public ShadedReliefType createShadedReliefType() {
        return new ShadedReliefType();
    }

    /**
     * Create an instance of {@link RasterSymbolizerType }
     * 
     */
    public RasterSymbolizerType createRasterSymbolizerType() {
        return new RasterSymbolizerType();
    }

    /**
     * Create an instance of {@link ContrastEnhancementType }
     * 
     */
    public ContrastEnhancementType createContrastEnhancementType() {
        return new ContrastEnhancementType();
    }

    /**
     * Create an instance of {@link ChannelSelectionType }
     * 
     */
    public ChannelSelectionType createChannelSelectionType() {
        return new ChannelSelectionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "SourceChannelName")
    public JAXBElement<String> createSourceChannelName(String value) {
        return new JAXBElement<String>(_SourceChannelName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistogramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "Histogram")
    public JAXBElement<HistogramType> createHistogram(HistogramType value) {
        return new JAXBElement<HistogramType>(_Histogram_QNAME, HistogramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectedChannelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "GrayChannel")
    public JAXBElement<SelectedChannelType> createGrayChannel(SelectedChannelType value) {
        return new JAXBElement<SelectedChannelType>(_GrayChannel_QNAME, SelectedChannelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RasterSymbolizerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "RasterSymbolizer", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Symbolizer")
    public JAXBElement<RasterSymbolizerType> createRasterSymbolizer(RasterSymbolizerType value) {
        return new JAXBElement<RasterSymbolizerType>(_RasterSymbolizer_QNAME, RasterSymbolizerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "ReliefFactor")
    public JAXBElement<Double> createReliefFactor(Double value) {
        return new JAXBElement<Double>(_ReliefFactor_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageOutlineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "ImageOutline")
    public JAXBElement<ImageOutlineType> createImageOutline(ImageOutlineType value) {
        return new JAXBElement<ImageOutlineType>(_ImageOutline_QNAME, ImageOutlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorMapType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "ColorMap")
    public JAXBElement<ColorMapType> createColorMap(ColorMapType value) {
        return new JAXBElement<ColorMapType>(_ColorMap_QNAME, ColorMapType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "OverlapBehavior")
    public JAXBElement<String> createOverlapBehavior(String value) {
        return new JAXBElement<String>(_OverlapBehavior_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContrastEnhancementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "ContrastEnhancement")
    public JAXBElement<ContrastEnhancementType> createContrastEnhancement(ContrastEnhancementType value) {
        return new JAXBElement<ContrastEnhancementType>(_ContrastEnhancement_QNAME, ContrastEnhancementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectedChannelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "GreenChannel")
    public JAXBElement<SelectedChannelType> createGreenChannel(SelectedChannelType value) {
        return new JAXBElement<SelectedChannelType>(_GreenChannel_QNAME, SelectedChannelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectedChannelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "RedChannel")
    public JAXBElement<SelectedChannelType> createRedChannel(SelectedChannelType value) {
        return new JAXBElement<SelectedChannelType>(_RedChannel_QNAME, SelectedChannelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormalizeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "Normalize")
    public JAXBElement<NormalizeType> createNormalize(NormalizeType value) {
        return new JAXBElement<NormalizeType>(_Normalize_QNAME, NormalizeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectedChannelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "BlueChannel")
    public JAXBElement<SelectedChannelType> createBlueChannel(SelectedChannelType value) {
        return new JAXBElement<SelectedChannelType>(_BlueChannel_QNAME, SelectedChannelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelSelectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "ChannelSelection")
    public JAXBElement<ChannelSelectionType> createChannelSelection(ChannelSelectionType value) {
        return new JAXBElement<ChannelSelectionType>(_ChannelSelection_QNAME, ChannelSelectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "GammaValue")
    public JAXBElement<Double> createGammaValue(Double value) {
        return new JAXBElement<Double>(_GammaValue_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShadedReliefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "ShadedRelief")
    public JAXBElement<ShadedReliefType> createShadedRelief(ShadedReliefType value) {
        return new JAXBElement<ShadedReliefType>(_ShadedRelief_QNAME, ShadedReliefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/raster", name = "BrightnessOnly")
    public JAXBElement<Boolean> createBrightnessOnly(Boolean value) {
        return new JAXBElement<Boolean>(_BrightnessOnly_QNAME, Boolean.class, null, value);
    }

}
