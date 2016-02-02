package SAX;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class PlanReader implements ContentHandler {

public void startDocument() throws SAXException {
	System.out.println("====D�but==========");
}
public void endDocument() throws SAXException {
	System.out.println("====Fin============");
}

public void characters(char[] ch, int start, int length)
throws SAXException {
}
public void ignorableWhitespace(char[] ch, int start, int length)
throws SAXException {
}
public void endPrefixMapping(String prefix) throws SAXException {
}
public void skippedEntity(String name) throws SAXException {
}

public void setDocumentLocator(Locator locator) {
}
public void processingInstruction(String target, String data)
throws SAXException {
}
public void startPrefixMapping(String prefix, String uri)
throws SAXException {
}
public void endElement(String namespaceURI, String localName, String qName)
throws SAXException {
}
private int numSection = 0;
private int numChapitre = 0;
public void startElement(String namespaceURI, String localName,
String qName, Attributes atts) throws SAXException {
if ( "livre".equals( localName ) )
System.out.println(
"Livre:" + atts.getValue( "titre" ) );
else
if ( "auteur".equals( localName ) )
System.out.println(
"Auteur:" + atts.getValue( "nom") + " " + atts.getValue( "prenom" ) );
else
if ( "section".equals( localName ) ) {
System.out.println(
( ++numSection ) + ". " + atts.getValue( "titre" ) );
numChapitre = 0;
}
else
if ( "chapitre".equals( localName ) ) {
System.out.println( numSection + "." + ( ++numChapitre ) + "." + atts.getValue( "titre" ));
}
}
}
