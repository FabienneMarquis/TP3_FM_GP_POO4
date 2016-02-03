package JAXB;

/**
 * Created by 1494778 on 2016-02-02.
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;


//This statement means that class "Bookstore.java" is the root-element of our example
@XmlRootElement(namespace = "")
public class CompagnieTaxi {

  // XmLElementWrapper generates a wrapper element around XML representation
  @XmlElementWrapper(name = "ListTaxi")
  // XmlElement sets the name of the entities
  @XmlElement(name = "Taxi")
  private ArrayList<Taxi> listTaxi;
  private String nom;
  private String location;

    // XmLElementWrapper generates a wrapper element around XML representation
    @XmlElementWrapper(name = "ListChauffeur")
    // XmlElement sets the name of the entities
    @XmlElement(name = "chauffeur")
    private ArrayList<Chauffeur> ListChauffeur;

    public ArrayList<Chauffeur> getListChauffeur() {
        return ListChauffeur;
    }

    public void setListChauffeur(ArrayList<Chauffeur> listChauffeur) {
        ListChauffeur = listChauffeur;
    }

    public ArrayList<Taxi> getListTaxi() {
        return listTaxi;
    }

    public void setListTaxi(ArrayList<Taxi> listTaxi) {
        this.listTaxi = listTaxi;
    }

    public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}

