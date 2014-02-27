
package gr.opap.draws.ws.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fetchPropoGoalDrawByNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fetchPropoGoalDrawByNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drawNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fetchPropoGoalDrawByNumber", propOrder = {
    "drawNo"
})
public class FetchPropoGoalDrawByNumber {

    protected long drawNo;

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

}
