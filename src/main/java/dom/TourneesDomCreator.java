package dom;


import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TourneesDomCreator {

    public void create(List<Tournee> tournees, String filePath) {
        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder documentBuilder = documentFactory
                    .newDocumentBuilder();

            // El�ment racine
            Document document = documentBuilder.newDocument();
            Element rootElement = document.createElement("tournees");
            document.appendChild(rootElement);

            for (Tournee tournee : tournees) {
                Element elementTournee = document.createElement("tournee");
                rootElement.appendChild(elementTournee);

                // origine
                Element elementOrigine = document.createElement("origine");
                elementOrigine.appendChild(document.createTextNode(tournee.getOrigine()));
                elementTournee.appendChild(elementOrigine);

                // destination
                Element elementDestination = document.createElement("destination");
                elementDestination.appendChild(document.createTextNode(tournee.getDestination()));
                elementTournee.appendChild(elementDestination);

                // heureDepart
                Element elementHeureDepart = document.createElement("heureDepart");
                elementHeureDepart.appendChild(document.createTextNode(tournee.getHeureDepart()));
                elementTournee.appendChild(elementHeureDepart);

                // client
                Element elementClient = document.createElement("client");
                elementClient.appendChild(document.createTextNode(tournee.getClient()));
                elementTournee.appendChild(elementClient);

                // Reference Vehicule
                Element elementRefVehicule = document.createElement("refVehicule");
                elementRefVehicule.appendChild(document.createTextNode(tournee.getRefVehicule()));
                elementTournee.appendChild(elementRefVehicule);

            }

            // Cr�ation et �criture dans un fichier XML
            TransformerFactory transformerFactory = TransformerFactory
                    .newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(filePath));

            transformer.transform(domSource, streamResult);
            System.out.println("Génération d'XML terminée!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TourneesDomCreator dc = new TourneesDomCreator();
        List<Tournee> tournees = new ArrayList<>();
        for (int i = 0;i<5;i++){
            Tournee tournee = new Tournee();
            tournee.setOrigine("PlaceA"+i);
            tournee.setDestination("PlaceB" + i);
            tournee.setHeureDepart("Heure" + i);
            tournee.setClient("client" + i);
            tournee.setRefVehicule("vehicule"+i);
            tournees.add(tournee);
        }
        dc.create(tournees,"tournees.xml");
    }
}