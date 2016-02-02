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

public class Dom_Lecture {
  public static void main(String[] args) {
    try{
      // cr�ation d'une fabrique de constructeur de documents DOM
      DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();

      // cr�ation d'un constructeur de documents DOM
      DocumentBuilder constructeur = fabrique.newDocumentBuilder();
// lecture du contenu d'un fichier XML avec le constructeur pour
 	  // cr�er le document DOM correspondant
	  //File xmlFile = new File("ExempleDOM.xml");
	  File xmlFile = new File("livre2.xml");
	  Document document = constructeur.parse(xmlFile);

	  // traitement du document
	  printDocument(document);
	}
	catch(ParserConfigurationException pce) {
		System.out.println("Erreur de configuration du parseur DOM");
	}
	catch(SAXException se) {
		System.out.println("Erreur lors du parsing du document");
	}
catch(IOException ioe) {
		System.out.println("Erreur d'entr�e/sortie");
	}
  }

  public static void printNode(Node node) {
	System.out.println(node);
	NodeList nodes = node.getChildNodes();
	for(int i=0; i<nodes.getLength(); i++) {
		Node n = nodes.item(i);
		printNode(n);
	}
  }
  public static void printDocument(Document document) {
	Element racine = document.getDocumentElement();
	printNode(racine);
  }
}