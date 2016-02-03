package JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "taxi")
@XmlType(propOrder = {"immatriculation","nbPlace", "marque", "zone", "refVehicule"})
public class Taxi {


    private String immatriculation;
    private String nbPlace;
    private String marque;
    private String zone;
    private String refVehicule;

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(String nbPlace) {
        this.nbPlace = nbPlace;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getRefVehicule() {
        return refVehicule;
    }

    public void setRefVehicule(String refVehicule) {
        this.refVehicule = refVehicule;
    }

}
