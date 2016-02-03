package dom;


import org.w3c.dom.Attr;
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

public class Dom_creation_Tournee {
    public void Dom_Creation() {
        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder documentBuilder = documentFactory
                    .newDocumentBuilder();

            // El�ment racine
            Document document = documentBuilder.newDocument();
            Element rootElement = document.createElement("ListeTournee");
            document.appendChild(rootElement);

            // El�ment tournee 1
            Element tournee1 = document.createElement("tournee");
            rootElement.appendChild(tournee1);

            // Ajouter l'attribut � tournee
            Attr attribuer1 = document.createAttribute("id");
            attribuer1.setValue("1");
            tournee1.setAttributeNode(attribuer1);

            // Element référence 1
            Element refVeh1 = document.createElement("Référence véhicule");
            refVeh1.appendChild(document.createTextNode("ref01"));
            tournee1.appendChild(refVeh1);
            // Element origine 1
            Element origine1 = document.createElement("Origine");
            origine1.appendChild(document.createTextNode("origine 1"));
            tournee1.appendChild(origine1);
            // Element destination 1
            Element destination1 = document.createElement("Destination");
            destination1.appendChild(document.createTextNode("Hotel de Glace"));
            tournee1.appendChild(destination1);
            // Element client1
            Element client1 = document.createElement("Client");
            client1.appendChild(document.createTextNode("Bonhomme carvale"));
            tournee1.appendChild(client1);
            // Element heure départ 1
            Element heureD1 = document.createElement("Heure de départ");
            heureD1.appendChild(document.createTextNode("16H20"));
            tournee1.appendChild(heureD1);

//            // El�ment tourne2
//            Element tournee2 = document.createElement("tournee");
//            rootElement.appendChild(tournee2);
//
//            // Ajouter l'attribut � tournee
//            Attr attribuer2 = document.createAttribute("id");
//            attribuer1.setValue("2");
//            tournee2.setAttributeNode(attribuer2);
//            // Element référence 1
//            Element refVeh2 = document.createElement("Référence véhicule");
//            refVeh2.appendChild(document.createTextNode("ref01"));
//            tournee1.appendChild(refVeh2);
//            // Element origine 1
//            Element origine2 = document.createElement("Origine");
//            origine2.appendChild(document.createTextNode("origine 1"));
//            tournee2.appendChild(origine2);
//            // Element destination 1
//            Element destination2 = document.createElement("Destination");
//            destination2.appendChild(document.createTextNode(""));
//            tournee2.appendChild(destination1);
//            // Element client1
//            Element client2 = document.createElement("Client");
//            client2.appendChild(document.createTextNode(""));
//            tournee2.appendChild(client2);
//            // Element heure départ 1
//            Element heureD2 = document.createElement("Heure de départ");
//            heureD2.appendChild(document.createTextNode(""));
//            tournee2.appendChild(heureD2);


            // Cr�ation et �criture dans un fichier XML
            TransformerFactory transformerFactory = TransformerFactory
                    .newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File("tournee.xml"));

            transformer.transform(domSource, streamResult);
            System.out.println("G�n�ration d'XML termin�e!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Dom_creation_Tournee dc = new Dom_creation_Tournee();
        dc.Dom_Creation();
    }
}