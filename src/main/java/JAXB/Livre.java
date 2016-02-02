package JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "livre")
// If you want you can define the order in which the fields are written
// Optional
@XmlType(propOrder = { "auteur", "nom", "publication", "isbn" })
public class Livre {

  private String nom;
  private String auteur;
  private String publication;
  private String isbn;

  // If you like the variable nom, e.g. "nom", you can easily change this
  // nom for your XML-Output:
  @XmlElement(name = "titre")
  public String getnom() {
    return nom;
  }

  public void setnom(String nom) {
    this.nom = nom;
  }

  public String getauteur() {
    return auteur;
  }

  public void setauteur(String auteur) {
    this.auteur = auteur;
  }

  public String getpublication() {
    return publication;
  }

  public void setpublication(String publication) {
    this.publication = publication;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

}
