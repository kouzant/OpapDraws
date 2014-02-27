
package gr.opap.draws.ws.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fetchPropoDrawByNumberAndDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fetchPropoDrawByNumberAndDay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drawNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dayNum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fetchPropoDrawByNumberAndDay", propOrder = {
    "drawNo",
    "dayNum"
})
public class FetchPropoDrawByNumberAndDay {

    protected long drawNo;
    protected long dayNum;

    /**
     * Gets the value of the drawNo property.
     * 
     */
    public long getDrawNo() {
        return drawNo;
    }

    /**
     * Sets the value of the drawNo property.
     * 
     */
    public void setDrawNo(long value) {
        this.drawNo = value;
    }

    /**
     * Gets the value of the dayNum property.
     * 
     */
    public long getDayNum() {
        return dayNum;
    }

    /**
     * Sets the value of the dayNum property.
     * 
     */
    public void setDayNum(long value) {
        this.dayNum = value;
    }

}
