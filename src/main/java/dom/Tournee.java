package dom;

import java.sql.Time;

/**
 * Created by 1494778 on 2016-02-02.
 */
public class Tournee {

    private String origine;
    private String destination;
    private String heureDepart;
    private String client;
    private String refVehicule;

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getRefVehicule() {
        return refVehicule;
    }

    public void setRefVehicule(String refVehicule) {
        this.refVehicule = refVehicule;
    }


    @Override
    public String toString() {
        return "Tournee{" +
                "origine='" + origine + '\'' +
                ", destination='" + destination + '\'' +
                ", heureDepart='" + heureDepart + '\'' +
                ", client='" + client + '\'' +
                ", refVehicule='" + refVehicule + '\'' +
                '}';
    }
}
