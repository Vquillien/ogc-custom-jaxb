//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.kml._2_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TimeSpanType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimeSpanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractTimePrimitiveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}begin" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}end" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}TimeSpanSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}TimeSpanObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSpanType", propOrder = {
    "begin",
    "end",
    "timeSpanSimpleExtensionGroup",
    "timeSpanObjectExtensionGroup"
})
public class TimeSpanType
    extends AbstractTimePrimitiveType
{

    protected String begin;
    protected String end;
    @XmlElement(name = "TimeSpanSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> timeSpanSimpleExtensionGroup;
    @XmlElement(name = "TimeSpanObjectExtensionGroup")
    protected List<AbstractObjectType> timeSpanObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété begin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegin() {
        return begin;
    }

    /**
     * Définit la valeur de la propriété begin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegin(String value) {
        this.begin = value;
    }

    public boolean isSetBegin() {
        return (this.begin!= null);
    }

    /**
     * Obtient la valeur de la propriété end.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Définit la valeur de la propriété end.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    public boolean isSetEnd() {
        return (this.end!= null);
    }

    /**
     * Gets the value of the timeSpanSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSpanSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSpanSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTimeSpanSimpleExtensionGroup() {
        if (timeSpanSimpleExtensionGroup == null) {
            timeSpanSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.timeSpanSimpleExtensionGroup;
    }

    public boolean isSetTimeSpanSimpleExtensionGroup() {
        return ((this.timeSpanSimpleExtensionGroup!= null)&&(!this.timeSpanSimpleExtensionGroup.isEmpty()));
    }

    public void unsetTimeSpanSimpleExtensionGroup() {
        this.timeSpanSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the timeSpanObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSpanObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSpanObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getTimeSpanObjectExtensionGroup() {
        if (timeSpanObjectExtensionGroup == null) {
            timeSpanObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.timeSpanObjectExtensionGroup;
    }

    public boolean isSetTimeSpanObjectExtensionGroup() {
        return ((this.timeSpanObjectExtensionGroup!= null)&&(!this.timeSpanObjectExtensionGroup.isEmpty()));
    }

    public void unsetTimeSpanObjectExtensionGroup() {
        this.timeSpanObjectExtensionGroup = null;
    }

}