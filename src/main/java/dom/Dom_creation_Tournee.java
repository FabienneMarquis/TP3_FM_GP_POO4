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
   Element rootElement = document.createElement("bibliotheque");
   document.appendChild(rootElement);

   // El�ment livre 1
   Element livre1 = document.createElement("Livre");
   rootElement.appendChild(livre1);

   // Ajouter l'attribut � livre
   Attr attribuer1 = document.createAttribute("id");
   attribuer1.setValue("1");
   livre1.setAttributeNode(attribuer1);

   // Element titre 1
   Element titre1 = document.createElement("titre");
   titre1.appendChild(document.createTextNode("Feuchtgebiete"));
   livre1.appendChild(titre1);
// Element auteur 1
   Element auteur1 = document.createElement("auteur");
   auteur1.appendChild(document.createTextNode("Charlotte Roche"));
   livre1.appendChild(auteur1);
// Element �diteur 1
   Element editeur1 = document.createElement("editeur");
   editeur1.appendChild(document.createTextNode("Dumont Buchverlag"));
   livre1.appendChild(editeur1);
   // El�ment livre 2
   Element livre2 = document.createElement("Livre");
   rootElement.appendChild(livre2);
// Ajouter l'attribut � livre 2
   Attr attribuer2 = document.createAttribute("id");
   attribuer2.setValue("2");
   livre2.setAttributeNode(attribuer2);
// Element titre 2
   Element titre2 = document.createElement("titre");
   titre2.appendChild(document.createTextNode("The Game"));
   livre2.appendChild(titre2);
// Element auteur 2
   Element auteur2 = document.createElement("auteur");
   auteur2.appendChild(document.createTextNode("Neil Strauss"));
   livre2.appendChild(auteur2);
// Element �diteur 2
   Element editeur2 = document.createElement("editeur");
   editeur2.appendChild(document.createTextNode(" Harpercollins"));
   livre2.appendChild(editeur2);

   // Cr�ation et �criture dans un fichier XML
   TransformerFactory transformerFactory = TransformerFactory
     .newInstance();
   Transformer transformer = transformerFactory.newTransformer();
   DOMSource domSource = new DOMSource(document);
   StreamResult streamResult = new StreamResult(new File("livre2.xml"));

   transformer.transform(domSource, streamResult);
   System.out.println("G�n�ration d'XML termin�e!");

  } catch (ParserConfigurationException pce) {
   pce.printStackTrace();
  } catch (TransformerException tfe) {
   tfe.printStackTrace();
  }
 }

 public static void main(String[] args) {
	 Dom_creation_Tournee dc=new Dom_creation_Tournee();
	 dc.Dom_Creation();
 }
}