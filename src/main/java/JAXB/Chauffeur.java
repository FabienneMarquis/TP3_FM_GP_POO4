package JAXB;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "chauffeur")
@XmlType(propOrder = {"nom","prenom", "telephone", "permis", "refVehicule"})
/**
 * @author Fabienne et Gabriel on 2016-02-04.
 */
public class Chauffeur {
   private String nom, prenom, telephone, permis, refVehicule;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPermis() {
        return permis;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }

    public String getRefVehicule() {
        return refVehicule;
    }

    public void setRefVehicule(String refVehicule) {
        this.refVehicule = refVehicule;
    }

    @Override
    public String toString() {
        return "Chauffeur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", permis='" + permis + '\'' +
                ", refVehicule='" + refVehicule + '\'' +
                '}';
    }
}
