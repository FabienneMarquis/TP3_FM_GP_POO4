package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.File;
import java.io.IOException;

/**
 * Created by 1494778 on 2016-02-02.
 */
@XmlRootElement(name = "chauffeur")
@XmlType(propOrder = {"nom","prénom", "téléphone", "permis", "refVehicule"})
public class Chauffeur {
   private String nom, prénom, téléphone, permis, refVehicule;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getTéléphone() {
        return téléphone;
    }

    public void setTéléphone(String téléphone) {
        this.téléphone = téléphone;
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
                ", prénom='" + prénom + '\'' +
                ", téléphone='" + téléphone + '\'' +
                ", permis='" + permis + '\'' +
                ", refVehicule='" + refVehicule + '\'' +
                '}';
    }
}
