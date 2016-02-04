package dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TourneesDomReader {
    public static void main(String[] args) {
        TourneesDomReader reader = new TourneesDomReader();
        List<Tournee> tournees = reader.readTourneesFromFile("tournees.xml");

        tournees.forEach(System.out::println);
    }

    public List<Tournee> readTourneesFromFile(String file) {
        try {
            // cr�ation d'une fabrique de constructeur de documents DOM
            DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();

            // cr�ation d'un constructeur de documents DOM
            DocumentBuilder constructeur = fabrique.newDocumentBuilder();
            File xmlFile = new File(file);
            Document document = constructeur.parse(xmlFile);

            // traitement du document
            return read(document);
        } catch (ParserConfigurationException pce) {
            System.out.println("Erreur de configuration du parseur DOM");
        } catch (SAXException se) {
            System.out.println("Erreur lors du parsing du document");
        } catch (IOException ioe) {
            System.out.println("Erreur d'entr�e/sortie");
        }
        return null;
    }

    private List<Tournee> read(Document document) {
        Element racine = document.getDocumentElement();
        List<Tournee> tournees = new ArrayList<>();
        NodeList tourneesNode = racine.getChildNodes();
        for (int i = 0; i < tourneesNode.getLength(); i++) {
            Node tourneeNode = tourneesNode.item(i);
            if(tourneeNode.getNodeName().equals("tournee")){
                Tournee tournee = new Tournee();
                NodeList tourneeValueNodes = tourneeNode.getChildNodes();
                for (int j = 0; j < tourneeValueNodes.getLength(); j++) {
                    Node node = tourneeValueNodes.item(j);
                    switch (node.getNodeName()) {
                        case "origine":
                            tournee.setOrigine(node.getChildNodes().item(0).getNodeValue());
                            break;
                        case "destination":
                            tournee.setDestination(node.getChildNodes().item(0).getNodeValue());
                            break;
                        case "heureDepart":
                            tournee.setHeureDepart(node.getChildNodes().item(0).getNodeValue());
                            break;
                        case "client":
                            tournee.setClient(node.getChildNodes().item(0).getNodeValue());
                            break;
                        case "refVehicule":
                            tournee.setRefVehicule(node.getChildNodes().item(0).getNodeValue());
                            break;
                    }
                }
                tournees.add(tournee);
            }

        }
        return tournees;
    }
}