//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A prime meridian defines the origin from which longitude values are determined.
 * 
 * <p>Classe Java pour PrimeMeridianType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PrimeMeridianType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}PrimeMeridianBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}meridianID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}greenwichLongitude"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimeMeridianType", propOrder = {
    "meridianID",
    "remarks",
    "greenwichLongitude"
})
public class PrimeMeridianType
    extends PrimeMeridianBaseType
{

    protected List<IdentifierType> meridianID;
    protected StringOrRefType remarks;
    @XmlElement(required = true)
    protected AngleChoiceType greenwichLongitude;

    /**
     * Set of alternative identifications of this prime meridian. The first meridianID, if any, is normally the primary identification code, and any others are aliases. Gets the value of the meridianID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meridianID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeridianID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getMeridianID() {
        if (meridianID == null) {
            meridianID = new ArrayList<IdentifierType>();
        }
        return this.meridianID;
    }

    public boolean isSetMeridianID() {
        return ((this.meridianID!= null)&&(!this.meridianID.isEmpty()));
    }

    public void unsetMeridianID() {
        this.meridianID = null;
    }

    /**
     * Comments on or information about this prime meridian, including source information. 
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getRemarks() {
        return remarks;
    }

    /**
     * Définit la valeur de la propriété remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setRemarks(StringOrRefType value) {
        this.remarks = value;
    }

    public boolean isSetRemarks() {
        return (this.remarks!= null);
    }

    /**
     * Obtient la valeur de la propriété greenwichLongitude.
     * 
     * @return
     *     possible object is
     *     {@link AngleChoiceType }
     *     
     */
    public AngleChoiceType getGreenwichLongitude() {
        return greenwichLongitude;
    }

    /**
     * Définit la valeur de la propriété greenwichLongitude.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleChoiceType }
     *     
     */
    public void setGreenwichLongitude(AngleChoiceType value) {
        this.greenwichLongitude = value;
    }

    public boolean isSetGreenwichLongitude() {
        return (this.greenwichLongitude!= null);
    }

}
