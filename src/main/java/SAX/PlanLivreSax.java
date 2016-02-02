package SAX;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class PlanLivreSax {
public static void main(String[] args) throws Throwable {
XMLReader xr = XMLReaderFactory.createXMLReader();
xr.setContentHandler( new PlanReader() );
xr.parse( "livre.xml" );
}
}