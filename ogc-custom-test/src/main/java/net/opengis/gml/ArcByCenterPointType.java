//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This variant of the arc requires that the points on the arc have to be computed instead of storing the coordinates directly. The control point is the center point of the arc plus the radius and the bearing at start and end. This represenation can be used only in 2D.
 * 
 * <p>Classe Java pour ArcByCenterPointType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArcByCenterPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.opengis.net/gml}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml}coordinates"/>
 *         &lt;/choice>
 *         &lt;element name="radius" type="{http://www.opengis.net/gml}LengthType"/>
 *         &lt;element name="startAngle" type="{http://www.opengis.net/gml}AngleType" minOccurs="0"/>
 *         &lt;element name="endAngle" type="{http://www.opengis.net/gml}AngleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="circularArcCenterPointWithRadius" />
 *       &lt;attribute name="numArc" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArcByCenterPointType", propOrder = {
    "pos",
    "pointProperty",
    "pointRep",
    "posList",
    "coordinates",
    "radius",
    "startAngle",
    "endAngle"
})
@XmlSeeAlso({
    CircleByCenterPointType.class
})
public class ArcByCenterPointType
    extends AbstractCurveSegmentType
{

    protected DirectPositionType pos;
    protected PointPropertyType pointProperty;
    protected PointPropertyType pointRep;
    protected DirectPositionListType posList;
    protected CoordinatesType coordinates;
    @XmlElement(required = true)
    protected LengthType radius;
    protected AngleType startAngle;
    protected AngleType endAngle;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "interpolation")
    public final static CurveInterpolationType INTERPOLATION = CurveInterpolationType.CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "numArc", required = true)
    public final static BigInteger NUM_ARC = new BigInteger("1");

    /**
     * Obtient la valeur de la propriété pos.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getPos() {
        return pos;
    }

    /**
     * Définit la valeur de la propriété pos.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setPos(DirectPositionType value) {
        this.pos = value;
    }

    public boolean isSetPos() {
        return (this.pos!= null);
    }

    /**
     * Obtient la valeur de la propriété pointProperty.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPointProperty() {
        return pointProperty;
    }

    /**
     * Définit la valeur de la propriété pointProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPointProperty(PointPropertyType value) {
        this.pointProperty = value;
    }

    public boolean isSetPointProperty() {
        return (this.pointProperty!= null);
    }

    /**
     * Deprecated with GML version 3.1.0. Use "pointProperty" instead. Included for backwards compatibility with GML 3.0.0.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPointRep() {
        return pointRep;
    }

    /**
     * Définit la valeur de la propriété pointRep.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPointRep(PointPropertyType value) {
        this.pointRep = value;
    }

    public boolean isSetPointRep() {
        return (this.pointRep!= null);
    }

    /**
     * Obtient la valeur de la propriété posList.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionListType }
     *     
     */
    public DirectPositionListType getPosList() {
        return posList;
    }

    /**
     * Définit la valeur de la propriété posList.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionListType }
     *     
     */
    public void setPosList(DirectPositionListType value) {
        this.posList = value;
    }

    public boolean isSetPosList() {
        return (this.posList!= null);
    }

    /**
     * Deprecated with GML version 3.1.0. Use "posList" instead.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Définit la valeur de la propriété coordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

    public boolean isSetCoordinates() {
        return (this.coordinates!= null);
    }

    /**
     * Obtient la valeur de la propriété radius.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRadius() {
        return radius;
    }

    /**
     * Définit la valeur de la propriété radius.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRadius(LengthType value) {
        this.radius = value;
    }

    public boolean isSetRadius() {
        return (this.radius!= null);
    }

    /**
     * Obtient la valeur de la propriété startAngle.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getStartAngle() {
        return startAngle;
    }

    /**
     * Définit la valeur de la propriété startAngle.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setStartAngle(AngleType value) {
        this.startAngle = value;
    }

    public boolean isSetStartAngle() {
        return (this.startAngle!= null);
    }

    /**
     * Obtient la valeur de la propriété endAngle.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getEndAngle() {
        return endAngle;
    }

    /**
     * Définit la valeur de la propriété endAngle.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setEndAngle(AngleType value) {
        this.endAngle = value;
    }

    public boolean isSetEndAngle() {
        return (this.endAngle!= null);
    }

}
