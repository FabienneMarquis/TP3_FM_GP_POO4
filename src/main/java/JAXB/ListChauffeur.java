package JAXB;

/**
 * Created by 1494778 on 2016-02-02.
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

//This statement means that class is the root-element of our example
@XmlRootElement(namespace = "")
public class ListChauffeur {

  // XmLElementWrapper generates a wrapper element around XML representation
  @XmlElementWrapper(name = "ListChauffeur")
  // XmlElement sets the name of the entities
  @XmlElement(name = "chauffeur")
  private ArrayList<Chauffeur> ListChauffeur;
  private String nom;
  private String location;

  public void setListChauffeur(ArrayList<Chauffeur> ListChauffeur) {
    this.ListChauffeur = ListChauffeur;
  }

  public ArrayList<Chauffeur> getListChauffeur() {
    return ListChauffeur;
  }

}
