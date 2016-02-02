package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LivreMain {

  private static final String LIBRAIRIE_XML = "./Librairie-jaxb.xml";

  public static void main(String[] args) throws JAXBException, IOException {

    ArrayList<Livre> livreList = new ArrayList<Livre>();

    // create books
    Livre livre1 = new Livre();
    livre1.setIsbn("978-0060554736");
    livre1.setnom("The Game");
    livre1.setauteur("Neil Strauss");
    livre1.setpublication("Harpercollins");
    livreList.add(livre1);

    Livre livre2 = new Livre();
    livre2.setIsbn("978-3832180577");
    livre2.setnom("Feuchtgebiete");
    livre2.setauteur("Charlotte Roche");
    livre2.setpublication("Dumont Buchverlag");
    livreList.add(livre2);

    // create bookstore, assigning book
    Librairie librairie = new Librairie();
    librairie.setNom("Librairie X");
    librairie.setLocation("Vieux Québec");
    librairie.setlivreList(livreList);

    // create JAXB context and instantiate marshaller
    JAXBContext context = JAXBContext.newInstance(Librairie.class);
    Marshaller m = context.createMarshaller();
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    // Write to System.out
    m.marshal(librairie, System.out);

    // Write to File
    m.marshal(librairie, new File(LIBRAIRIE_XML));

    // get variables from our xml file, created before
    System.out.println();
    System.out.println("Output à partir fichier XML: ");
    Unmarshaller um = context.createUnmarshaller();
    Librairie librairie2 = (Librairie) um.unmarshal(new FileReader(LIBRAIRIE_XML));
    ArrayList<Livre> list = librairie2.getlivresList();
    for (Livre livre : list) {
      System.out.println("Livre: " + livre.getnom() + " à partir "
          + livre.getauteur());
    }
  }
}
