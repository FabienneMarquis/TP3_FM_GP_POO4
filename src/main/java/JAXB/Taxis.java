package JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by 0940135 on 2016-02-04.
 */
@XmlRootElement(namespace = "")
public class Taxis {
    // XmlElement sets the name of the entities
    @XmlElement(name = "taxi")
    List<Taxi> taxis;

    public List<Taxi> gettaxis() {
        return taxis;
    }

    public void setTaxis(List<Taxi> taxis) {
        this.taxis = taxis;
    }
}
