//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.se._2_0.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.opengis.fes._2.LiteralType;
import net.opengis.ows._2.DescriptionType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.se._2_0.core package. 
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

    private final static QName _FontFamily_QNAME = new QName("http://www.opengis.net/se/2.0/core", "FontFamily");
    private final static QName _Geometry_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Geometry");
    private final static QName _PointPosition_QNAME = new QName("http://www.opengis.net/se/2.0/core", "PointPosition");
    private final static QName _Transform_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Transform");
    private final static QName _FormalParameterList_QNAME = new QName("http://www.opengis.net/se/2.0/core", "FormalParameterList");
    private final static QName _AbstractStyle_QNAME = new QName("http://www.opengis.net/se/2.0/core", "AbstractStyle");
    private final static QName _VerticalAlignment_QNAME = new QName("http://www.opengis.net/se/2.0/core", "VerticalAlignment");
    private final static QName _HorizontalAlignment_QNAME = new QName("http://www.opengis.net/se/2.0/core", "HorizontalAlignment");
    private final static QName _RelativePosition_QNAME = new QName("http://www.opengis.net/se/2.0/core", "RelativePosition");
    private final static QName _Position_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Position");
    private final static QName _MarkGraphic_QNAME = new QName("http://www.opengis.net/se/2.0/core", "MarkGraphic");
    private final static QName _Distance_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Distance");
    private final static QName _Scale_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Scale");
    private final static QName _ExclusionZone_QNAME = new QName("http://www.opengis.net/se/2.0/core", "ExclusionZone");
    private final static QName _Height_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Height");
    private final static QName _WellKnownName_QNAME = new QName("http://www.opengis.net/se/2.0/core", "WellKnownName");
    private final static QName _AreaSymbolizer_QNAME = new QName("http://www.opengis.net/se/2.0/core", "AreaSymbolizer");
    private final static QName _ParametrizedSymbolizer_QNAME = new QName("http://www.opengis.net/se/2.0/core", "ParametrizedSymbolizer");
    private final static QName _FormatNumber_QNAME = new QName("http://www.opengis.net/se/2.0/core", "FormatNumber");
    private final static QName _Value_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Value");
    private final static QName _SemanticTypeIdentifier_QNAME = new QName("http://www.opengis.net/se/2.0/core", "SemanticTypeIdentifier");
    private final static QName _ExclusionRectangle_QNAME = new QName("http://www.opengis.net/se/2.0/core", "ExclusionRectangle");
    private final static QName _SolidFill_QNAME = new QName("http://www.opengis.net/se/2.0/core", "SolidFill");
    private final static QName _TextSymbolizer_QNAME = new QName("http://www.opengis.net/se/2.0/core", "TextSymbolizer");
    private final static QName _FirstValue_QNAME = new QName("http://www.opengis.net/se/2.0/core", "FirstValue");
    private final static QName _Halo_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Halo");
    private final static QName _Offset_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Offset");
    private final static QName _StrokeReference_QNAME = new QName("http://www.opengis.net/se/2.0/core", "StrokeReference");
    private final static QName _LineLabel_QNAME = new QName("http://www.opengis.net/se/2.0/core", "LineLabel");
    private final static QName _CompositeSymbolizer_QNAME = new QName("http://www.opengis.net/se/2.0/core", "CompositeSymbolizer");
    private final static QName _PointSymbolizer_QNAME = new QName("http://www.opengis.net/se/2.0/core", "PointSymbolizer");
    private final static QName _PenStroke_QNAME = new QName("http://www.opengis.net/se/2.0/core", "PenStroke");
    private final static QName _StringPosition_QNAME = new QName("http://www.opengis.net/se/2.0/core", "StringPosition");
    private final static QName _FontWeight_QNAME = new QName("http://www.opengis.net/se/2.0/core", "FontWeight");
    private final static QName _MinScaleDenominator_QNAME = new QName("http://www.opengis.net/se/2.0/core", "MinScaleDenominator");
    private final static QName _Color_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Color");
    private final static QName _FontSize_QNAME = new QName("http://www.opengis.net/se/2.0/core", "FontSize");
    private final static QName _Pattern_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Pattern");
    private final static QName _Recode_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Recode");
    private final static QName _Description_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Description");
    private final static QName _Threshold_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Threshold");
    private final static QName _Translate_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Translate");
    private final static QName _PointTextGraphic_QNAME = new QName("http://www.opengis.net/se/2.0/core", "PointTextGraphic");
    private final static QName _Argument_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Argument");
    private final static QName _MarkIndex_QNAME = new QName("http://www.opengis.net/se/2.0/core", "MarkIndex");
    private final static QName _PreGap_QNAME = new QName("http://www.opengis.net/se/2.0/core", "PreGap");
    private final static QName _ExclusionRadius_QNAME = new QName("http://www.opengis.net/se/2.0/core", "ExclusionRadius");
    private final static QName _StyleReference_QNAME = new QName("http://www.opengis.net/se/2.0/core", "StyleReference");
    private final static QName _Stroke_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Stroke");
    private final static QName _FormatDate_QNAME = new QName("http://www.opengis.net/se/2.0/core", "FormatDate");
    private final static QName _PointLabel_QNAME = new QName("http://www.opengis.net/se/2.0/core", "PointLabel");
    private final static QName _DateValue_QNAME = new QName("http://www.opengis.net/se/2.0/core", "DateValue");
    private final static QName _DataTypeName_QNAME = new QName("http://www.opengis.net/se/2.0/core", "DataTypeName");
    private final static QName _SymbolizerReference_QNAME = new QName("http://www.opengis.net/se/2.0/core", "SymbolizerReference");
    private final static QName _Key_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Key");
    private final static QName _LookupValue_QNAME = new QName("http://www.opengis.net/se/2.0/core", "LookupValue");
    private final static QName _Displacement_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Displacement");
    private final static QName _NegativePattern_QNAME = new QName("http://www.opengis.net/se/2.0/core", "NegativePattern");
    private final static QName _Extension_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Extension");
    private final static QName _LineCap_QNAME = new QName("http://www.opengis.net/se/2.0/core", "LineCap");
    private final static QName _StrokeElement_QNAME = new QName("http://www.opengis.net/se/2.0/core", "StrokeElement");
    private final static QName _LineSymbolizer_QNAME = new QName("http://www.opengis.net/se/2.0/core", "LineSymbolizer");
    private final static QName _Name_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Name");
    private final static QName _Text_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Text");
    private final static QName _CompoundStroke_QNAME = new QName("http://www.opengis.net/se/2.0/core", "CompoundStroke");
    private final static QName _LookupString_QNAME = new QName("http://www.opengis.net/se/2.0/core", "LookupString");
    private final static QName _InterpolationPoint_QNAME = new QName("http://www.opengis.net/se/2.0/core", "InterpolationPoint");
    private final static QName _GraphicReference_QNAME = new QName("http://www.opengis.net/se/2.0/core", "GraphicReference");
    private final static QName _Style_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Style");
    private final static QName _Width_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Width");
    private final static QName _Substring_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Substring");
    private final static QName _Graphic_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Graphic");
    private final static QName _ElseFilter_QNAME = new QName("http://www.opengis.net/se/2.0/core", "ElseFilter");
    private final static QName _OnlineResource_QNAME = new QName("http://www.opengis.net/se/2.0/core", "OnlineResource");
    private final static QName _Symbolizer_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Symbolizer");
    private final static QName _LineJoin_QNAME = new QName("http://www.opengis.net/se/2.0/core", "LineJoin");
    private final static QName _TileGap_QNAME = new QName("http://www.opengis.net/se/2.0/core", "TileGap");
    private final static QName _Radius_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Radius");
    private final static QName _Format_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Format");
    private final static QName _Function_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Function");
    private final static QName _PerpendicularOffset_QNAME = new QName("http://www.opengis.net/se/2.0/core", "PerpendicularOffset");
    private final static QName _Fill_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Fill");
    private final static QName _FontStyle_QNAME = new QName("http://www.opengis.net/se/2.0/core", "FontStyle");
    private final static QName _GraphicStroke_QNAME = new QName("http://www.opengis.net/se/2.0/core", "GraphicStroke");
    private final static QName _Trim_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Trim");
    private final static QName _Length_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Length");
    private final static QName _B_QNAME = new QName("http://www.opengis.net/se/2.0/core", "B");
    private final static QName _C_QNAME = new QName("http://www.opengis.net/se/2.0/core", "C");
    private final static QName _A_QNAME = new QName("http://www.opengis.net/se/2.0/core", "A");
    private final static QName _F_QNAME = new QName("http://www.opengis.net/se/2.0/core", "F");
    private final static QName _D_QNAME = new QName("http://www.opengis.net/se/2.0/core", "D");
    private final static QName _E_QNAME = new QName("http://www.opengis.net/se/2.0/core", "E");
    private final static QName _Font_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Font");
    private final static QName _Opacity_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Opacity");
    private final static QName _X_QNAME = new QName("http://www.opengis.net/se/2.0/core", "X");
    private final static QName _Y_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Y");
    private final static QName _HatchedFill_QNAME = new QName("http://www.opengis.net/se/2.0/core", "HatchedFill");
    private final static QName _TextStroke_QNAME = new QName("http://www.opengis.net/se/2.0/core", "TextStroke");
    private final static QName _Categorize_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Categorize");
    private final static QName _ChangeCase_QNAME = new QName("http://www.opengis.net/se/2.0/core", "ChangeCase");
    private final static QName _Dimension_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Dimension");
    private final static QName _Href_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Href");
    private final static QName _Interpolate_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Interpolate");
    private final static QName _Angle_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Angle");
    private final static QName _MapItem_QNAME = new QName("http://www.opengis.net/se/2.0/core", "MapItem");
    private final static QName _Rotate_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Rotate");
    private final static QName _DashOffset_QNAME = new QName("http://www.opengis.net/se/2.0/core", "DashOffset");
    private final static QName _CompositeGraphic_QNAME = new QName("http://www.opengis.net/se/2.0/core", "CompositeGraphic");
    private final static QName _Rule_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Rule");
    private final static QName _ExtensionParameter_QNAME = new QName("http://www.opengis.net/se/2.0/core", "ExtensionParameter");
    private final static QName _Matrix_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Matrix");
    private final static QName _StringValue_QNAME = new QName("http://www.opengis.net/se/2.0/core", "StringValue");
    private final static QName _FormalParameter_QNAME = new QName("http://www.opengis.net/se/2.0/core", "FormalParameter");
    private final static QName _Data_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Data");
    private final static QName _NumericValue_QNAME = new QName("http://www.opengis.net/se/2.0/core", "NumericValue");
    private final static QName _MaxScaleDenominator_QNAME = new QName("http://www.opengis.net/se/2.0/core", "MaxScaleDenominator");
    private final static QName _AlternativeGraphics_QNAME = new QName("http://www.opengis.net/se/2.0/core", "AlternativeGraphics");
    private final static QName _RelativeOrientation_QNAME = new QName("http://www.opengis.net/se/2.0/core", "RelativeOrientation");
    private final static QName _StringLength_QNAME = new QName("http://www.opengis.net/se/2.0/core", "StringLength");
    private final static QName _StyledText_QNAME = new QName("http://www.opengis.net/se/2.0/core", "StyledText");
    private final static QName _ArgumentList_QNAME = new QName("http://www.opengis.net/se/2.0/core", "ArgumentList");
    private final static QName _AlternativeStrokeElements_QNAME = new QName("http://www.opengis.net/se/2.0/core", "AlternativeStrokeElements");
    private final static QName _LegendGraphic_QNAME = new QName("http://www.opengis.net/se/2.0/core", "LegendGraphic");
    private final static QName _FillReference_QNAME = new QName("http://www.opengis.net/se/2.0/core", "FillReference");
    private final static QName _PostGap_QNAME = new QName("http://www.opengis.net/se/2.0/core", "PostGap");
    private final static QName _DashArray_QNAME = new QName("http://www.opengis.net/se/2.0/core", "DashArray");
    private final static QName _Rotation_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Rotation");
    private final static QName _InlineContent_QNAME = new QName("http://www.opengis.net/se/2.0/core", "InlineContent");
    private final static QName _LinearRapport_QNAME = new QName("http://www.opengis.net/se/2.0/core", "LinearRapport");
    private final static QName _ExternalGraphic_QNAME = new QName("http://www.opengis.net/se/2.0/core", "ExternalGraphic");
    private final static QName _GraphicFill_QNAME = new QName("http://www.opengis.net/se/2.0/core", "GraphicFill");
    private final static QName _Concatenate_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Concatenate");
    private final static QName _Label_QNAME = new QName("http://www.opengis.net/se/2.0/core", "Label");
    private final static QName _ViewBox_QNAME = new QName("http://www.opengis.net/se/2.0/core", "ViewBox");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.se._2_0.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OnlineResourceType }
     * 
     */
    public OnlineResourceType createOnlineResourceType() {
        return new OnlineResourceType();
    }

    /**
     * Create an instance of {@link ExtensionParameterType }
     * 
     */
    public ExtensionParameterType createExtensionParameterType() {
        return new ExtensionParameterType();
    }

    /**
     * Create an instance of {@link CompositeSymbolizerType }
     * 
     */
    public CompositeSymbolizerType createCompositeSymbolizerType() {
        return new CompositeSymbolizerType();
    }

    /**
     * Create an instance of {@link LineLabelType }
     * 
     */
    public LineLabelType createLineLabelType() {
        return new LineLabelType();
    }

    /**
     * Create an instance of {@link ParameterValueType }
     * 
     */
    public ParameterValueType createParameterValueType() {
        return new ParameterValueType();
    }

    /**
     * Create an instance of {@link MatrixType }
     * 
     */
    public MatrixType createMatrixType() {
        return new MatrixType();
    }

    /**
     * Create an instance of {@link MarkGraphicType }
     * 
     */
    public MarkGraphicType createMarkGraphicType() {
        return new MarkGraphicType();
    }

    /**
     * Create an instance of {@link TranslateType }
     * 
     */
    public TranslateType createTranslateType() {
        return new TranslateType();
    }

    /**
     * Create an instance of {@link SubstringType }
     * 
     */
    public SubstringType createSubstringType() {
        return new SubstringType();
    }

    /**
     * Create an instance of {@link HatchedFillType }
     * 
     */
    public HatchedFillType createHatchedFillType() {
        return new HatchedFillType();
    }

    /**
     * Create an instance of {@link ElseFilterType }
     * 
     */
    public ElseFilterType createElseFilterType() {
        return new ElseFilterType();
    }

    /**
     * Create an instance of {@link SymbolizerReferenceType }
     * 
     */
    public SymbolizerReferenceType createSymbolizerReferenceType() {
        return new SymbolizerReferenceType();
    }

    /**
     * Create an instance of {@link StrokeReferenceType }
     * 
     */
    public StrokeReferenceType createStrokeReferenceType() {
        return new StrokeReferenceType();
    }

    /**
     * Create an instance of {@link CompositeGraphicType }
     * 
     */
    public CompositeGraphicType createCompositeGraphicType() {
        return new CompositeGraphicType();
    }

    /**
     * Create an instance of {@link RuleType }
     * 
     */
    public RuleType createRuleType() {
        return new RuleType();
    }

    /**
     * Create an instance of {@link InterpolationPointType }
     * 
     */
    public InterpolationPointType createInterpolationPointType() {
        return new InterpolationPointType();
    }

    /**
     * Create an instance of {@link RotateType }
     * 
     */
    public RotateType createRotateType() {
        return new RotateType();
    }

    /**
     * Create an instance of {@link FontType }
     * 
     */
    public FontType createFontType() {
        return new FontType();
    }

    /**
     * Create an instance of {@link GraphicReferenceType }
     * 
     */
    public GraphicReferenceType createGraphicReferenceType() {
        return new GraphicReferenceType();
    }

    /**
     * Create an instance of {@link FormalParameterListType }
     * 
     */
    public FormalParameterListType createFormalParameterListType() {
        return new FormalParameterListType();
    }

    /**
     * Create an instance of {@link PointLabelType }
     * 
     */
    public PointLabelType createPointLabelType() {
        return new PointLabelType();
    }

    /**
     * Create an instance of {@link StyleType }
     * 
     */
    public StyleType createStyleType() {
        return new StyleType();
    }

    /**
     * Create an instance of {@link ExclusionRectangleType }
     * 
     */
    public ExclusionRectangleType createExclusionRectangleType() {
        return new ExclusionRectangleType();
    }

    /**
     * Create an instance of {@link TrimType }
     * 
     */
    public TrimType createTrimType() {
        return new TrimType();
    }

    /**
     * Create an instance of {@link RecodeType }
     * 
     */
    public RecodeType createRecodeType() {
        return new RecodeType();
    }

    /**
     * Create an instance of {@link DimensionType }
     * 
     */
    public DimensionType createDimensionType() {
        return new DimensionType();
    }

    /**
     * Create an instance of {@link SolidFillType }
     * 
     */
    public SolidFillType createSolidFillType() {
        return new SolidFillType();
    }

    /**
     * Create an instance of {@link GeometryType }
     * 
     */
    public GeometryType createGeometryType() {
        return new GeometryType();
    }

    /**
     * Create an instance of {@link FormatDateType }
     * 
     */
    public FormatDateType createFormatDateType() {
        return new FormatDateType();
    }

    /**
     * Create an instance of {@link InterpolateType }
     * 
     */
    public InterpolateType createInterpolateType() {
        return new InterpolateType();
    }

    /**
     * Create an instance of {@link CompoundStrokeType }
     * 
     */
    public CompoundStrokeType createCompoundStrokeType() {
        return new CompoundStrokeType();
    }

    /**
     * Create an instance of {@link TextSymbolizerType }
     * 
     */
    public TextSymbolizerType createTextSymbolizerType() {
        return new TextSymbolizerType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link MapItemType }
     * 
     */
    public MapItemType createMapItemType() {
        return new MapItemType();
    }

    /**
     * Create an instance of {@link HaloType }
     * 
     */
    public HaloType createHaloType() {
        return new HaloType();
    }

    /**
     * Create an instance of {@link GraphicStrokeType }
     * 
     */
    public GraphicStrokeType createGraphicStrokeType() {
        return new GraphicStrokeType();
    }

    /**
     * Create an instance of {@link ViewBoxType }
     * 
     */
    public ViewBoxType createViewBoxType() {
        return new ViewBoxType();
    }

    /**
     * Create an instance of {@link ChangeCaseType }
     * 
     */
    public ChangeCaseType createChangeCaseType() {
        return new ChangeCaseType();
    }

    /**
     * Create an instance of {@link FillReferenceType }
     * 
     */
    public FillReferenceType createFillReferenceType() {
        return new FillReferenceType();
    }

    /**
     * Create an instance of {@link ParametrizedSymbolizerType }
     * 
     */
    public ParametrizedSymbolizerType createParametrizedSymbolizerType() {
        return new ParametrizedSymbolizerType();
    }

    /**
     * Create an instance of {@link CategorizeType }
     * 
     */
    public CategorizeType createCategorizeType() {
        return new CategorizeType();
    }

    /**
     * Create an instance of {@link StringLengthType }
     * 
     */
    public StringLengthType createStringLengthType() {
        return new StringLengthType();
    }

    /**
     * Create an instance of {@link StyledTextType }
     * 
     */
    public StyledTextType createStyledTextType() {
        return new StyledTextType();
    }

    /**
     * Create an instance of {@link ArgumentListType }
     * 
     */
    public ArgumentListType createArgumentListType() {
        return new ArgumentListType();
    }

    /**
     * Create an instance of {@link ExternalGraphicType }
     * 
     */
    public ExternalGraphicType createExternalGraphicType() {
        return new ExternalGraphicType();
    }

    /**
     * Create an instance of {@link ExclusionRadiusType }
     * 
     */
    public ExclusionRadiusType createExclusionRadiusType() {
        return new ExclusionRadiusType();
    }

    /**
     * Create an instance of {@link StrokeElementType }
     * 
     */
    public StrokeElementType createStrokeElementType() {
        return new StrokeElementType();
    }

    /**
     * Create an instance of {@link ConcatenateType }
     * 
     */
    public ConcatenateType createConcatenateType() {
        return new ConcatenateType();
    }

    /**
     * Create an instance of {@link GraphicFillType }
     * 
     */
    public GraphicFillType createGraphicFillType() {
        return new GraphicFillType();
    }

    /**
     * Create an instance of {@link FormatNumberType }
     * 
     */
    public FormatNumberType createFormatNumberType() {
        return new FormatNumberType();
    }

    /**
     * Create an instance of {@link LineSymbolizerType }
     * 
     */
    public LineSymbolizerType createLineSymbolizerType() {
        return new LineSymbolizerType();
    }

    /**
     * Create an instance of {@link AlternativeStrokeElementsType }
     * 
     */
    public AlternativeStrokeElementsType createAlternativeStrokeElementsType() {
        return new AlternativeStrokeElementsType();
    }

    /**
     * Create an instance of {@link StyleReferenceType }
     * 
     */
    public StyleReferenceType createStyleReferenceType() {
        return new StyleReferenceType();
    }

    /**
     * Create an instance of {@link LegendGraphicType }
     * 
     */
    public LegendGraphicType createLegendGraphicType() {
        return new LegendGraphicType();
    }

    /**
     * Create an instance of {@link ArgumentType }
     * 
     */
    public ArgumentType createArgumentType() {
        return new ArgumentType();
    }

    /**
     * Create an instance of {@link AlternativeGraphicsType }
     * 
     */
    public AlternativeGraphicsType createAlternativeGraphicsType() {
        return new AlternativeGraphicsType();
    }

    /**
     * Create an instance of {@link StringPositionType }
     * 
     */
    public StringPositionType createStringPositionType() {
        return new StringPositionType();
    }

    /**
     * Create an instance of {@link TextStrokeType }
     * 
     */
    public TextStrokeType createTextStrokeType() {
        return new TextStrokeType();
    }

    /**
     * Create an instance of {@link AreaSymbolizerType }
     * 
     */
    public AreaSymbolizerType createAreaSymbolizerType() {
        return new AreaSymbolizerType();
    }

    /**
     * Create an instance of {@link FormalParameterType }
     * 
     */
    public FormalParameterType createFormalParameterType() {
        return new FormalParameterType();
    }

    /**
     * Create an instance of {@link PointSymbolizerType }
     * 
     */
    public PointSymbolizerType createPointSymbolizerType() {
        return new PointSymbolizerType();
    }

    /**
     * Create an instance of {@link PointTextGraphicType }
     * 
     */
    public PointTextGraphicType createPointTextGraphicType() {
        return new PointTextGraphicType();
    }

    /**
     * Create an instance of {@link ScaleType }
     * 
     */
    public ScaleType createScaleType() {
        return new ScaleType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link PenStrokeType }
     * 
     */
    public PenStrokeType createPenStrokeType() {
        return new PenStrokeType();
    }

    /**
     * Create an instance of {@link TileGapType }
     * 
     */
    public TileGapType createTileGapType() {
        return new TileGapType();
    }

    /**
     * Create an instance of {@link InlineContentType }
     * 
     */
    public InlineContentType createInlineContentType() {
        return new InlineContentType();
    }

    /**
     * Create an instance of {@link VariableOnlineResourceType }
     * 
     */
    public VariableOnlineResourceType createVariableOnlineResourceType() {
        return new VariableOnlineResourceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "FontFamily")
    public JAXBElement<ParameterValueType> createFontFamily(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_FontFamily_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeometryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Geometry")
    public JAXBElement<GeometryType> createGeometry(GeometryType value) {
        return new JAXBElement<GeometryType>(_Geometry_QNAME, GeometryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranslateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "PointPosition")
    public JAXBElement<TranslateType> createPointPosition(TranslateType value) {
        return new JAXBElement<TranslateType>(_PointPosition_QNAME, TranslateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Transform")
    public JAXBElement<TransformType> createTransform(TransformType value) {
        return new JAXBElement<TransformType>(_Transform_QNAME, TransformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormalParameterListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "FormalParameterList")
    public JAXBElement<FormalParameterListType> createFormalParameterList(FormalParameterListType value) {
        return new JAXBElement<FormalParameterListType>(_FormalParameterList_QNAME, FormalParameterListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractStyleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "AbstractStyle")
    public JAXBElement<AbstractStyleType> createAbstractStyle(AbstractStyleType value) {
        return new JAXBElement<AbstractStyleType>(_AbstractStyle_QNAME, AbstractStyleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "VerticalAlignment")
    public JAXBElement<ParameterValueType> createVerticalAlignment(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_VerticalAlignment_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "HorizontalAlignment")
    public JAXBElement<ParameterValueType> createHorizontalAlignment(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_HorizontalAlignment_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "RelativePosition")
    public JAXBElement<ParameterValueType> createRelativePosition(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_RelativePosition_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Position")
    public JAXBElement<ParameterValueType> createPosition(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Position_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkGraphicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "MarkGraphic", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Graphic")
    public JAXBElement<MarkGraphicType> createMarkGraphic(MarkGraphicType value) {
        return new JAXBElement<MarkGraphicType>(_MarkGraphic_QNAME, MarkGraphicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Distance")
    public JAXBElement<ParameterValueType> createDistance(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Distance_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Scale")
    public JAXBElement<ScaleType> createScale(ScaleType value) {
        return new JAXBElement<ScaleType>(_Scale_QNAME, ScaleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionZoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "ExclusionZone")
    public JAXBElement<ExclusionZoneType> createExclusionZone(ExclusionZoneType value) {
        return new JAXBElement<ExclusionZoneType>(_ExclusionZone_QNAME, ExclusionZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Height")
    public JAXBElement<ParameterValueType> createHeight(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Height_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "WellKnownName")
    public JAXBElement<ParameterValueType> createWellKnownName(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_WellKnownName_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaSymbolizerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "AreaSymbolizer", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Symbolizer")
    public JAXBElement<AreaSymbolizerType> createAreaSymbolizer(AreaSymbolizerType value) {
        return new JAXBElement<AreaSymbolizerType>(_AreaSymbolizer_QNAME, AreaSymbolizerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametrizedSymbolizerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "ParametrizedSymbolizer")
    public JAXBElement<ParametrizedSymbolizerType> createParametrizedSymbolizer(ParametrizedSymbolizerType value) {
        return new JAXBElement<ParametrizedSymbolizerType>(_ParametrizedSymbolizer_QNAME, ParametrizedSymbolizerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormatNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "FormatNumber", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<FormatNumberType> createFormatNumber(FormatNumberType value) {
        return new JAXBElement<FormatNumberType>(_FormatNumber_QNAME, FormatNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Value")
    public JAXBElement<ParameterValueType> createValue(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Value_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "SemanticTypeIdentifier")
    public JAXBElement<String> createSemanticTypeIdentifier(String value) {
        return new JAXBElement<String>(_SemanticTypeIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionRectangleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "ExclusionRectangle", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "ExclusionZone")
    public JAXBElement<ExclusionRectangleType> createExclusionRectangle(ExclusionRectangleType value) {
        return new JAXBElement<ExclusionRectangleType>(_ExclusionRectangle_QNAME, ExclusionRectangleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidFillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "SolidFill", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Fill")
    public JAXBElement<SolidFillType> createSolidFill(SolidFillType value) {
        return new JAXBElement<SolidFillType>(_SolidFill_QNAME, SolidFillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSymbolizerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "TextSymbolizer", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Symbolizer")
    public JAXBElement<TextSymbolizerType> createTextSymbolizer(TextSymbolizerType value) {
        return new JAXBElement<TextSymbolizerType>(_TextSymbolizer_QNAME, TextSymbolizerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "FirstValue")
    public JAXBElement<ParameterValueType> createFirstValue(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_FirstValue_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HaloType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Halo")
    public JAXBElement<HaloType> createHalo(HaloType value) {
        return new JAXBElement<HaloType>(_Halo_QNAME, HaloType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Offset")
    public JAXBElement<ParameterValueType> createOffset(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Offset_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrokeReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "StrokeReference", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Stroke")
    public JAXBElement<StrokeReferenceType> createStrokeReference(StrokeReferenceType value) {
        return new JAXBElement<StrokeReferenceType>(_StrokeReference_QNAME, StrokeReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineLabelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "LineLabel", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Label")
    public JAXBElement<LineLabelType> createLineLabel(LineLabelType value) {
        return new JAXBElement<LineLabelType>(_LineLabel_QNAME, LineLabelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeSymbolizerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "CompositeSymbolizer", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Symbolizer")
    public JAXBElement<CompositeSymbolizerType> createCompositeSymbolizer(CompositeSymbolizerType value) {
        return new JAXBElement<CompositeSymbolizerType>(_CompositeSymbolizer_QNAME, CompositeSymbolizerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointSymbolizerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "PointSymbolizer", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Symbolizer")
    public JAXBElement<PointSymbolizerType> createPointSymbolizer(PointSymbolizerType value) {
        return new JAXBElement<PointSymbolizerType>(_PointSymbolizer_QNAME, PointSymbolizerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PenStrokeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "PenStroke", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Stroke")
    public JAXBElement<PenStrokeType> createPenStroke(PenStrokeType value) {
        return new JAXBElement<PenStrokeType>(_PenStroke_QNAME, PenStrokeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "StringPosition", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<StringPositionType> createStringPosition(StringPositionType value) {
        return new JAXBElement<StringPositionType>(_StringPosition_QNAME, StringPositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "FontWeight")
    public JAXBElement<ParameterValueType> createFontWeight(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_FontWeight_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "MinScaleDenominator")
    public JAXBElement<Double> createMinScaleDenominator(Double value) {
        return new JAXBElement<Double>(_MinScaleDenominator_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Color")
    public JAXBElement<ParameterValueType> createColor(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Color_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "FontSize")
    public JAXBElement<ParameterValueType> createFontSize(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_FontSize_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Pattern")
    public JAXBElement<String> createPattern(String value) {
        return new JAXBElement<String>(_Pattern_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Recode", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<RecodeType> createRecode(RecodeType value) {
        return new JAXBElement<RecodeType>(_Recode_QNAME, RecodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Description")
    public JAXBElement<DescriptionType> createDescription(DescriptionType value) {
        return new JAXBElement<DescriptionType>(_Description_QNAME, DescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiteralType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Threshold")
    public JAXBElement<LiteralType> createThreshold(LiteralType value) {
        return new JAXBElement<LiteralType>(_Threshold_QNAME, LiteralType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranslateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Translate")
    public JAXBElement<TranslateType> createTranslate(TranslateType value) {
        return new JAXBElement<TranslateType>(_Translate_QNAME, TranslateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointTextGraphicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "PointTextGraphic", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Graphic")
    public JAXBElement<PointTextGraphicType> createPointTextGraphic(PointTextGraphicType value) {
        return new JAXBElement<PointTextGraphicType>(_PointTextGraphic_QNAME, PointTextGraphicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArgumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Argument")
    public JAXBElement<ArgumentType> createArgument(ArgumentType value) {
        return new JAXBElement<ArgumentType>(_Argument_QNAME, ArgumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "MarkIndex")
    public JAXBElement<ParameterValueType> createMarkIndex(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_MarkIndex_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "PreGap")
    public JAXBElement<ParameterValueType> createPreGap(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_PreGap_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclusionRadiusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "ExclusionRadius", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "ExclusionZone")
    public JAXBElement<ExclusionRadiusType> createExclusionRadius(ExclusionRadiusType value) {
        return new JAXBElement<ExclusionRadiusType>(_ExclusionRadius_QNAME, ExclusionRadiusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "StyleReference", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "AbstractStyle")
    public JAXBElement<StyleReferenceType> createStyleReference(StyleReferenceType value) {
        return new JAXBElement<StyleReferenceType>(_StyleReference_QNAME, StyleReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrokeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Stroke")
    public JAXBElement<StrokeType> createStroke(StrokeType value) {
        return new JAXBElement<StrokeType>(_Stroke_QNAME, StrokeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormatDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "FormatDate", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<FormatDateType> createFormatDate(FormatDateType value) {
        return new JAXBElement<FormatDateType>(_FormatDate_QNAME, FormatDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointLabelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "PointLabel", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Label")
    public JAXBElement<PointLabelType> createPointLabel(PointLabelType value) {
        return new JAXBElement<PointLabelType>(_PointLabel_QNAME, PointLabelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "DateValue")
    public JAXBElement<ParameterValueType> createDateValue(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_DateValue_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "DataTypeName")
    public JAXBElement<QName> createDataTypeName(QName value) {
        return new JAXBElement<QName>(_DataTypeName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolizerReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "SymbolizerReference", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Symbolizer")
    public JAXBElement<SymbolizerReferenceType> createSymbolizerReference(SymbolizerReferenceType value) {
        return new JAXBElement<SymbolizerReferenceType>(_SymbolizerReference_QNAME, SymbolizerReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Key")
    public JAXBElement<String> createKey(String value) {
        return new JAXBElement<String>(_Key_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "LookupValue")
    public JAXBElement<ParameterValueType> createLookupValue(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_LookupValue_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranslateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Displacement")
    public JAXBElement<TranslateType> createDisplacement(TranslateType value) {
        return new JAXBElement<TranslateType>(_Displacement_QNAME, TranslateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "NegativePattern")
    public JAXBElement<String> createNegativePattern(String value) {
        return new JAXBElement<String>(_NegativePattern_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Extension")
    public JAXBElement<ExtensionType> createExtension(ExtensionType value) {
        return new JAXBElement<ExtensionType>(_Extension_QNAME, ExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "LineCap")
    public JAXBElement<ParameterValueType> createLineCap(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_LineCap_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrokeElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "StrokeElement")
    public JAXBElement<StrokeElementType> createStrokeElement(StrokeElementType value) {
        return new JAXBElement<StrokeElementType>(_StrokeElement_QNAME, StrokeElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineSymbolizerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "LineSymbolizer", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Symbolizer")
    public JAXBElement<LineSymbolizerType> createLineSymbolizer(LineSymbolizerType value) {
        return new JAXBElement<LineSymbolizerType>(_LineSymbolizer_QNAME, LineSymbolizerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Text")
    public JAXBElement<ParameterValueType> createText(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Text_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompoundStrokeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "CompoundStroke", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Stroke")
    public JAXBElement<CompoundStrokeType> createCompoundStroke(CompoundStrokeType value) {
        return new JAXBElement<CompoundStrokeType>(_CompoundStroke_QNAME, CompoundStrokeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "LookupString")
    public JAXBElement<ParameterValueType> createLookupString(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_LookupString_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterpolationPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "InterpolationPoint")
    public JAXBElement<InterpolationPointType> createInterpolationPoint(InterpolationPointType value) {
        return new JAXBElement<InterpolationPointType>(_InterpolationPoint_QNAME, InterpolationPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphicReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "GraphicReference", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Graphic")
    public JAXBElement<GraphicReferenceType> createGraphicReference(GraphicReferenceType value) {
        return new JAXBElement<GraphicReferenceType>(_GraphicReference_QNAME, GraphicReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Style", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "AbstractStyle")
    public JAXBElement<StyleType> createStyle(StyleType value) {
        return new JAXBElement<StyleType>(_Style_QNAME, StyleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Width")
    public JAXBElement<ParameterValueType> createWidth(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Width_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Substring", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<SubstringType> createSubstring(SubstringType value) {
        return new JAXBElement<SubstringType>(_Substring_QNAME, SubstringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Graphic")
    public JAXBElement<GraphicType> createGraphic(GraphicType value) {
        return new JAXBElement<GraphicType>(_Graphic_QNAME, GraphicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElseFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "ElseFilter")
    public JAXBElement<ElseFilterType> createElseFilter(ElseFilterType value) {
        return new JAXBElement<ElseFilterType>(_ElseFilter_QNAME, ElseFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnlineResourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "OnlineResource")
    public JAXBElement<OnlineResourceType> createOnlineResource(OnlineResourceType value) {
        return new JAXBElement<OnlineResourceType>(_OnlineResource_QNAME, OnlineResourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolizerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Symbolizer")
    public JAXBElement<SymbolizerType> createSymbolizer(SymbolizerType value) {
        return new JAXBElement<SymbolizerType>(_Symbolizer_QNAME, SymbolizerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "LineJoin")
    public JAXBElement<ParameterValueType> createLineJoin(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_LineJoin_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TileGapType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "TileGap")
    public JAXBElement<TileGapType> createTileGap(TileGapType value) {
        return new JAXBElement<TileGapType>(_TileGap_QNAME, TileGapType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Radius")
    public JAXBElement<ParameterValueType> createRadius(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Radius_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Format")
    public JAXBElement<String> createFormat(String value) {
        return new JAXBElement<String>(_Format_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunctionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Function", substitutionHeadNamespace = "http://www.opengis.net/fes/2.1", substitutionHeadName = "expression")
    public JAXBElement<FunctionType> createFunction(FunctionType value) {
        return new JAXBElement<FunctionType>(_Function_QNAME, FunctionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "PerpendicularOffset")
    public JAXBElement<ParameterValueType> createPerpendicularOffset(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_PerpendicularOffset_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Fill")
    public JAXBElement<FillType> createFill(FillType value) {
        return new JAXBElement<FillType>(_Fill_QNAME, FillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "FontStyle")
    public JAXBElement<ParameterValueType> createFontStyle(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_FontStyle_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphicStrokeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "GraphicStroke", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Stroke")
    public JAXBElement<GraphicStrokeType> createGraphicStroke(GraphicStrokeType value) {
        return new JAXBElement<GraphicStrokeType>(_GraphicStroke_QNAME, GraphicStrokeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrimType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Trim", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<TrimType> createTrim(TrimType value) {
        return new JAXBElement<TrimType>(_Trim_QNAME, TrimType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Length")
    public JAXBElement<ParameterValueType> createLength(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Length_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "B")
    public JAXBElement<ParameterValueType> createB(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_B_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "C")
    public JAXBElement<ParameterValueType> createC(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_C_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "A")
    public JAXBElement<ParameterValueType> createA(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_A_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "F")
    public JAXBElement<ParameterValueType> createF(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_F_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "D")
    public JAXBElement<ParameterValueType> createD(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_D_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "E")
    public JAXBElement<ParameterValueType> createE(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_E_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FontType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Font")
    public JAXBElement<FontType> createFont(FontType value) {
        return new JAXBElement<FontType>(_Font_QNAME, FontType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Opacity")
    public JAXBElement<ParameterValueType> createOpacity(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Opacity_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "X")
    public JAXBElement<ParameterValueType> createX(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_X_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Y")
    public JAXBElement<ParameterValueType> createY(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Y_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HatchedFillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "HatchedFill", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Fill")
    public JAXBElement<HatchedFillType> createHatchedFill(HatchedFillType value) {
        return new JAXBElement<HatchedFillType>(_HatchedFill_QNAME, HatchedFillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextStrokeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "TextStroke", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Stroke")
    public JAXBElement<TextStrokeType> createTextStroke(TextStrokeType value) {
        return new JAXBElement<TextStrokeType>(_TextStroke_QNAME, TextStrokeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategorizeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Categorize", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<CategorizeType> createCategorize(CategorizeType value) {
        return new JAXBElement<CategorizeType>(_Categorize_QNAME, CategorizeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeCaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "ChangeCase", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<ChangeCaseType> createChangeCase(ChangeCaseType value) {
        return new JAXBElement<ChangeCaseType>(_ChangeCase_QNAME, ChangeCaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Dimension", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<DimensionType> createDimension(DimensionType value) {
        return new JAXBElement<DimensionType>(_Dimension_QNAME, DimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Href")
    public JAXBElement<ParameterValueType> createHref(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Href_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterpolateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Interpolate", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<InterpolateType> createInterpolate(InterpolateType value) {
        return new JAXBElement<InterpolateType>(_Interpolate_QNAME, InterpolateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Angle")
    public JAXBElement<ParameterValueType> createAngle(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Angle_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "MapItem")
    public JAXBElement<MapItemType> createMapItem(MapItemType value) {
        return new JAXBElement<MapItemType>(_MapItem_QNAME, MapItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RotateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Rotate")
    public JAXBElement<RotateType> createRotate(RotateType value) {
        return new JAXBElement<RotateType>(_Rotate_QNAME, RotateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "DashOffset")
    public JAXBElement<ParameterValueType> createDashOffset(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_DashOffset_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeGraphicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "CompositeGraphic", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Graphic")
    public JAXBElement<CompositeGraphicType> createCompositeGraphic(CompositeGraphicType value) {
        return new JAXBElement<CompositeGraphicType>(_CompositeGraphic_QNAME, CompositeGraphicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Rule")
    public JAXBElement<RuleType> createRule(RuleType value) {
        return new JAXBElement<RuleType>(_Rule_QNAME, RuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "ExtensionParameter")
    public JAXBElement<ExtensionParameterType> createExtensionParameter(ExtensionParameterType value) {
        return new JAXBElement<ExtensionParameterType>(_ExtensionParameter_QNAME, ExtensionParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Matrix")
    public JAXBElement<MatrixType> createMatrix(MatrixType value) {
        return new JAXBElement<MatrixType>(_Matrix_QNAME, MatrixType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "StringValue")
    public JAXBElement<ParameterValueType> createStringValue(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_StringValue_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormalParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "FormalParameter")
    public JAXBElement<FormalParameterType> createFormalParameter(FormalParameterType value) {
        return new JAXBElement<FormalParameterType>(_FormalParameter_QNAME, FormalParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Data")
    public JAXBElement<Double> createData(Double value) {
        return new JAXBElement<Double>(_Data_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "NumericValue")
    public JAXBElement<ParameterValueType> createNumericValue(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_NumericValue_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "MaxScaleDenominator")
    public JAXBElement<Double> createMaxScaleDenominator(Double value) {
        return new JAXBElement<Double>(_MaxScaleDenominator_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternativeGraphicsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "AlternativeGraphics", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Graphic")
    public JAXBElement<AlternativeGraphicsType> createAlternativeGraphics(AlternativeGraphicsType value) {
        return new JAXBElement<AlternativeGraphicsType>(_AlternativeGraphics_QNAME, AlternativeGraphicsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelativeOrientationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "RelativeOrientation")
    public JAXBElement<RelativeOrientationType> createRelativeOrientation(RelativeOrientationType value) {
        return new JAXBElement<RelativeOrientationType>(_RelativeOrientation_QNAME, RelativeOrientationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringLengthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "StringLength", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<StringLengthType> createStringLength(StringLengthType value) {
        return new JAXBElement<StringLengthType>(_StringLength_QNAME, StringLengthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyledTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "StyledText")
    public JAXBElement<StyledTextType> createStyledText(StyledTextType value) {
        return new JAXBElement<StyledTextType>(_StyledText_QNAME, StyledTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArgumentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "ArgumentList")
    public JAXBElement<ArgumentListType> createArgumentList(ArgumentListType value) {
        return new JAXBElement<ArgumentListType>(_ArgumentList_QNAME, ArgumentListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternativeStrokeElementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "AlternativeStrokeElements")
    public JAXBElement<AlternativeStrokeElementsType> createAlternativeStrokeElements(AlternativeStrokeElementsType value) {
        return new JAXBElement<AlternativeStrokeElementsType>(_AlternativeStrokeElements_QNAME, AlternativeStrokeElementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegendGraphicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "LegendGraphic")
    public JAXBElement<LegendGraphicType> createLegendGraphic(LegendGraphicType value) {
        return new JAXBElement<LegendGraphicType>(_LegendGraphic_QNAME, LegendGraphicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "FillReference", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Fill")
    public JAXBElement<FillReferenceType> createFillReference(FillReferenceType value) {
        return new JAXBElement<FillReferenceType>(_FillReference_QNAME, FillReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "PostGap")
    public JAXBElement<ParameterValueType> createPostGap(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_PostGap_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "DashArray")
    public JAXBElement<ParameterValueType> createDashArray(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_DashArray_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Rotation")
    public JAXBElement<ParameterValueType> createRotation(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_Rotation_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InlineContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "InlineContent")
    public JAXBElement<InlineContentType> createInlineContent(InlineContentType value) {
        return new JAXBElement<InlineContentType>(_InlineContent_QNAME, InlineContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "LinearRapport")
    public JAXBElement<Boolean> createLinearRapport(Boolean value) {
        return new JAXBElement<Boolean>(_LinearRapport_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalGraphicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "ExternalGraphic", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Graphic")
    public JAXBElement<ExternalGraphicType> createExternalGraphic(ExternalGraphicType value) {
        return new JAXBElement<ExternalGraphicType>(_ExternalGraphic_QNAME, ExternalGraphicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphicFillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "GraphicFill", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Fill")
    public JAXBElement<GraphicFillType> createGraphicFill(GraphicFillType value) {
        return new JAXBElement<GraphicFillType>(_GraphicFill_QNAME, GraphicFillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcatenateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Concatenate", substitutionHeadNamespace = "http://www.opengis.net/se/2.0/core", substitutionHeadName = "Function")
    public JAXBElement<ConcatenateType> createConcatenate(ConcatenateType value) {
        return new JAXBElement<ConcatenateType>(_Concatenate_QNAME, ConcatenateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "Label")
    public JAXBElement<LabelType> createLabel(LabelType value) {
        return new JAXBElement<LabelType>(_Label_QNAME, LabelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewBoxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/se/2.0/core", name = "ViewBox")
    public JAXBElement<ViewBoxType> createViewBox(ViewBoxType value) {
        return new JAXBElement<ViewBoxType>(_ViewBox_QNAME, ViewBoxType.class, null, value);
    }

}
