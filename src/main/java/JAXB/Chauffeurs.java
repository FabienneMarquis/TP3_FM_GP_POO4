package JAXB;

/**
 * Created by 1494778 on 2016-02-02.
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

//This statement means that class is the root-element of our example
@XmlRootElement(namespace = "")
public class Chauffeurs {

  // XmLElementWrapper generates a wrapper element around XML representation
  // XmlElement sets the name of the entities
  @XmlElement(name = "chauffeur")
  private List<Chauffeur> chauffeurs;

  public void setChauffeurs(List<Chauffeur> chauffeurs) {
    this.chauffeurs = chauffeurs;
  }

  public List<Chauffeur> getchauffeurs() {
    return chauffeurs;
  }

}
