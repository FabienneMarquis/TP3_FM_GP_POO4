package JAXB;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
/**
 * Created by 1494778 on 2016-02-02.
 */
//This statement means that class is the root-element of our example
@XmlRootElement(namespace = "")
public class ListTaxi {

    // XmLElementWrapper generates a wrapper element around XML representation
    @XmlElementWrapper(name = "ListTaxi")
    // XmlElement sets the name of the entities
    @XmlElement(name = "taxi")
    private ArrayList<Taxi> ListTaxi;
    private String nom;
    private String location;

    public void setListTaxi(ArrayList<Taxi> ListTaxi) {
        this.ListTaxi = ListTaxi;
    }

    public ArrayList<Taxi> getListTaxi() {
        return ListTaxi;
    }

    }
