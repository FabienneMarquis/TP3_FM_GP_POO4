package SAX;

import JAXB.Taxi;
import org.xml.sax.*;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 0940135 on 2016-02-04.
 */
public class TaxiReader implements ContentHandler {
    String tag;
    List<Taxi> taxis;
    int pos;

    public List<Taxi> getTaxis() {
        return taxis;
    }

    @Override
    public void setDocumentLocator(Locator locator) {

    }

    @Override
    public void startDocument() throws SAXException {
        taxis = new ArrayList<>();
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
        tag = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String donnees = new String(ch, start, length);
        if (!tag.equals("")) {
            if(tag.equals("taxi")){

                taxis.add(pos,new Taxi());
                pos++;
            }
            if (!Character.isISOControl(ch[start])) {
                switch (tag){
                    case "immatriculation":
                        taxis.get(pos-1).setImmatriculation(donnees);
                        break;
                    case "nbPlace":
                        taxis.get(pos-1).setNbPlace(donnees);
                        break;
                    case "marque":
                        taxis.get(pos-1).setMarque(donnees);
                        break;
                    case "zone":
                        taxis.get(pos-1).setZone(donnees);
                        break;
                    case "refVehicule":
                        taxis.get(pos-1).setRefVehicule(donnees);
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

    public List<Taxi> read(String file){
        XMLReader xr = null;
        try {
            xr = XMLReaderFactory.createXMLReader();

            xr.setContentHandler(this);
            try {
                xr.parse(file);
                return taxis;

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args){
        TaxiReader taxiReader = new TaxiReader();
        List<Taxi> taxis = taxiReader.read("taxis.xml");
        taxis.forEach(System.out::println);
    }
}
