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
 * <p>Classe Java pour AliasType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AliasType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}targetHref" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}sourceHref" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AliasSimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AliasObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasType", propOrder = {
    "targetHref",
    "sourceHref",
    "aliasSimpleExtensionGroup",
    "aliasObjectExtensionGroup"
})
public class AliasType
    extends AbstractObjectType
{

    @XmlSchemaType(name = "anyURI")
    protected String targetHref;
    @XmlSchemaType(name = "anyURI")
    protected String sourceHref;
    @XmlElement(name = "AliasSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> aliasSimpleExtensionGroup;
    @XmlElement(name = "AliasObjectExtensionGroup")
    protected List<AbstractObjectType> aliasObjectExtensionGroup;

    /**
     * Obtient la valeur de la propriété targetHref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetHref() {
        return targetHref;
    }

    /**
     * Définit la valeur de la propriété targetHref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetHref(String value) {
        this.targetHref = value;
    }

    public boolean isSetTargetHref() {
        return (this.targetHref!= null);
    }

    /**
     * Obtient la valeur de la propriété sourceHref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceHref() {
        return sourceHref;
    }

    /**
     * Définit la valeur de la propriété sourceHref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceHref(String value) {
        this.sourceHref = value;
    }

    public boolean isSetSourceHref() {
        return (this.sourceHref!= null);
    }

    /**
     * Gets the value of the aliasSimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliasSimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliasSimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAliasSimpleExtensionGroup() {
        if (aliasSimpleExtensionGroup == null) {
            aliasSimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.aliasSimpleExtensionGroup;
    }

    public boolean isSetAliasSimpleExtensionGroup() {
        return ((this.aliasSimpleExtensionGroup!= null)&&(!this.aliasSimpleExtensionGroup.isEmpty()));
    }

    public void unsetAliasSimpleExtensionGroup() {
        this.aliasSimpleExtensionGroup = null;
    }

    /**
     * Gets the value of the aliasObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliasObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliasObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getAliasObjectExtensionGroup() {
        if (aliasObjectExtensionGroup == null) {
            aliasObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.aliasObjectExtensionGroup;
    }

    public boolean isSetAliasObjectExtensionGroup() {
        return ((this.aliasObjectExtensionGroup!= null)&&(!this.aliasObjectExtensionGroup.isEmpty()));
    }

    public void unsetAliasObjectExtensionGroup() {
        this.aliasObjectExtensionGroup = null;
    }

}