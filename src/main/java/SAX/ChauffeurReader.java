package SAX;

import JAXB.Chauffeur;
import org.xml.sax.*;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Fabienne et Gabriel on 2016-02-04.
 */
public class ChauffeurReader implements ContentHandler {
    String tag;
    List<Chauffeur> chauffeurs;
    int pos;
    @Override
    public void setDocumentLocator(Locator locator) {

    }

    @Override
    public void startDocument() throws SAXException {
        chauffeurs = new ArrayList<>();
    }

    @Override
    public void endDocument() throws SAXException {

    }

    @Override
    public void startPrefixMapping(String prefix, String uri) throws SAXException {

    }

    @Override
    public void endPrefixMapping(String prefix) throws SAXException {

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        tag = localName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String donnees = new String(ch, start, length);
        if (!tag.equals("")) {
            if(tag.equals("chauffeur")){
                chauffeurs.add(pos,new Chauffeur());
                pos++;
            }
            if (!Character.isISOControl(ch[start])) {

                switch (tag) {
                    case "nom":
                        chauffeurs.get(pos- 1).setNom(donnees);
                        break;
                    case "prenom":
                        chauffeurs.get(pos-1).setPrenom(donnees);
                        break;
                    case "telephone":
                        chauffeurs.get(pos-1).setTelephone(donnees);
                        break;
                    case "permis":
                        chauffeurs.get(pos-1).setPermis(donnees);
                        break;
                    case "refVehicule":
                        chauffeurs.get(pos-1).setRefVehicule(donnees);
                        break;
                }
            }
        }
    }

    @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {

    }

    @Override
    public void processingInstruction(String target, String data) throws SAXException {

    }

    @Override
    public void skippedEntity(String name) throws SAXException {

    }

    /**
     *  this method return the list of chauffeur from xml file.
     * @param file
     * @return a list of chauffeur from the xml file
     */
    public List<Chauffeur> read(String file) {
        XMLReader xr = null;
        try {
            xr = XMLReaderFactory.createXMLReader();
            xr.setContentHandler(this);
            try {
                xr.parse(file);
                return chauffeurs;

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args){
        ChauffeurReader reader = new ChauffeurReader();
        List<Chauffeur> chauffeurs = reader.read("chauffeurs.xml");
        chauffeurs.forEach(System.out::println);
    }
}
