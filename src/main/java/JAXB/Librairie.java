package JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

//This statement means that class "Bookstore.java" is the root-element of our example
@XmlRootElement(namespace = "")
public class Librairie {

  // XmLElementWrapper generates a wrapper element around XML representation
  @XmlElementWrapper(name = "Listlivre")
  // XmlElement sets the name of the entities
  @XmlElement(name = "livre")
  private ArrayList<Livre> Listlivre;
  private String nom;
  private String location;

  public void setlivreList(ArrayList<Livre> ListLivre) {
    this.Listlivre = ListLivre;
  }

  public ArrayList<Livre> getlivresList() {
    return Listlivre;
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