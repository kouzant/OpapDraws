
package gr.opap.draws.ws.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for propoDraw complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propoDraw">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drawId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="drawTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gameId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resultArr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propoDraw", propOrder = {
    "drawId",
    "drawTime",
    "gameId",
    "resultArr"
})
public class PropoDraw {

    protected Long drawId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar drawTime;
    protected Long gameId;
    @XmlElement(nillable = true)
    protected List<String> resultArr;

    /**
     * Gets the value of the drawId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDrawId() {
        return drawId;
    }

    /**
     * Sets the value of the drawId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDrawId(Long value) {
        this.drawId = value;
    }

    /**
     * Gets the value of the drawTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDrawTime() {
        return drawTime;
    }

    /**
     * Sets the value of the drawTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDrawTime(XMLGregorianCalendar value) {
        this.drawTime = value;
    }

    /**
     * Gets the value of the gameId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGameId() {
        return gameId;
    }

    /**
     * Sets the value of the gameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGameId(Long value) {
        this.gameId = value;
    }

    /**
     * Gets the value of the resultArr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultArr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultArr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResultArr() {
        if (resultArr == null) {
            resultArr = new ArrayList<String>();
        }
        return this.resultArr;
    }

}
