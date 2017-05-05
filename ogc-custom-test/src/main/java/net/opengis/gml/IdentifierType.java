//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.04.27 à 02:51:41 PM CEST 
//


package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * An identification of a CRS object. The first use of the IdentifierType for an object, if any, is normally the primary identification code, and any others are aliases.
 * 
 * <p>Classe Java pour IdentifierType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}name"/>
 *         &lt;element ref="{http://www.opengis.net/gml}version" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", propOrder = {
    "name",
    "version",
    "remarks"
})
public class IdentifierType {

    @XmlElementRef(name = "name", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected JAXBElement<CodeType> name;
    protected String version;
    protected StringOrRefType remarks;

    /**
     * The code or name for this Identifier, often from a controlled list or pattern defined by a code space. The optional codeSpace attribute is normally included to identify or reference a code space within which one or more codes are defined. This code space is often defined by some authority organization, where one organization may define multiple code spaces. The range and format of each Code Space identifier is defined by that code space authority. Information about that code space authority can be included as metaDataProperty elements which are optionally allowed in all CRS objects.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public JAXBElement<CodeType> getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public void setName(JAXBElement<CodeType> value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

    /**
     * Remarks about this code or alias.
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

}
