//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.thematic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.opengis.se._2_0.core.ParameterValueType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.se._2_0.thematic package. 
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

    private final static QName _Gap_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "Gap");
    private final static QName _DensityFill_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "DensityFill");
    private final static QName _CategoryGap_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "CategoryGap");
    private final static QName _Category_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "Category");
    private final static QName _ValuePerMark_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "ValuePerMark");
    private final static QName _DotMapFill_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "DotMapFill");
    private final static QName _PieSubtype_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "PieSubtype");
    private final static QName _AxisChartSubtype_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "AxisChartSubtype");
    private final static QName _AxisScale_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "AxisScale");
    private final static QName _CategoryWidth_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "CategoryWidth");
    private final static QName _AxisChart_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "AxisChart");
    private final static QName _ValueToRepresent_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "ValueToRepresent");
    private final static QName _AxisLength_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "AxisLength");
    private final static QName _PieChart_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "PieChart");
    private final static QName _Orientation_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "Orientation");
    private final static QName _HoleRadius_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "HoleRadius");
    private final static QName _Slice_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "Slice");
    private final static QName _Percentage_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "Percentage");
    private final static QName _Normalization_QNAME = new QName("http://www.opengis.net/se/2.0/thematic", "Normalization");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.se._2_0.thematic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link AxisChartType }
     * 
     */
    public AxisChartType createAxisChartType() {
        return new AxisChartType();
    }

    /**
     * Create an instance of {@link AxisScaleType }
     * 
     */
    public AxisScaleType createAxisScaleType() {
        return new AxisScaleType();
    }

    /**
     * Create an instance of {@link PieChartType }
     * 
     */
    public PieChartType createPieChartType() {
        return new PieChartType();
    }

    /**
     * Create an instance of {@link SliceType }
     * 
     */
    public SliceType createSliceType() {
        return new SliceType();
    }

    /**
     * Create an instance of {@link DensityFillType }
     * 
     */
    public DensityFillType createDensityFillType() {
        return new DensityFillType();
    }

    /**
     * Create an instance of {@link DotMapFillType }
     * 
     */
    public DotMapFillType createDotMapFillType() {
        return new DotMapFillType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "Gap")
    public JAXBElement<ParameterValueType> createGap(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Gap_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DensityFillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "DensityFill", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Fill")
    public JAXBElement<DensityFillType> createDensityFill(DensityFillType value) {
        return new JAXBElement<DensityFillType>(_DensityFill_QNAME, DensityFillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "CategoryGap")
    public JAXBElement<ParameterValueType> createCategoryGap(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_CategoryGap_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "Category")
    public JAXBElement<CategoryType> createCategory(CategoryType value) {
        return new JAXBElement<CategoryType>(_Category_QNAME, CategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "ValuePerMark")
    public JAXBElement<ParameterValueType> createValuePerMark(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_ValuePerMark_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DotMapFillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "DotMapFill", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Fill")
    public JAXBElement<DotMapFillType> createDotMapFill(DotMapFillType value) {
        return new JAXBElement<DotMapFillType>(_DotMapFill_QNAME, DotMapFillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PieSubtypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "PieSubtype")
    public JAXBElement<PieSubtypeType> createPieSubtype(PieSubtypeType value) {
        return new JAXBElement<PieSubtypeType>(_PieSubtype_QNAME, PieSubtypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxisChartSubtypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "AxisChartSubtype")
    public JAXBElement<AxisChartSubtypeType> createAxisChartSubtype(AxisChartSubtypeType value) {
        return new JAXBElement<AxisChartSubtypeType>(_AxisChartSubtype_QNAME, AxisChartSubtypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxisScaleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "AxisScale")
    public JAXBElement<AxisScaleType> createAxisScale(AxisScaleType value) {
        return new JAXBElement<AxisScaleType>(_AxisScale_QNAME, AxisScaleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "CategoryWidth")
    public JAXBElement<ParameterValueType> createCategoryWidth(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_CategoryWidth_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxisChartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "AxisChart", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Graphic")
    public JAXBElement<AxisChartType> createAxisChart(AxisChartType value) {
        return new JAXBElement<AxisChartType>(_AxisChart_QNAME, AxisChartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "ValueToRepresent")
    public JAXBElement<ParameterValueType> createValueToRepresent(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_ValueToRepresent_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "AxisLength")
    public JAXBElement<ParameterValueType> createAxisLength(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_AxisLength_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PieChartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "PieChart", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Graphic")
    public JAXBElement<PieChartType> createPieChart(PieChartType value) {
        return new JAXBElement<PieChartType>(_PieChart_QNAME, PieChartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "Orientation")
    public JAXBElement<ParameterValueType> createOrientation(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Orientation_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "HoleRadius")
    public JAXBElement<ParameterValueType> createHoleRadius(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_HoleRadius_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SliceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "Slice")
    public JAXBElement<SliceType> createSlice(SliceType value) {
        return new JAXBElement<SliceType>(_Slice_QNAME, SliceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "Percentage")
    public JAXBElement<ParameterValueType> createPercentage(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Percentage_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/thematic", name = "Normalization")
    public JAXBElement<ParameterValueType> createNormalization(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Normalization_QNAME, ParameterValueType.class, null, value);
    }

}
