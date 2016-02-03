package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by 1494778 on 2016-02-02.
 */
public class TaxiMain {

    private static final String MY_TAXI_XML = "./ListeTaxi-jaxb.xml";



    public static void main(String[] args) throws JAXBException, IOException {

        ArrayList<Taxi> list = new ArrayList<Taxi>();
        try {
            JAXBContext context = JAXBContext.newInstance(CompagnieTaxi.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT
                    , Boolean.TRUE);
            ArrayList<Taxi> tList = new ArrayList<Taxi>();
            Taxi taxi = new Taxi();
            taxi.setImmatriculation("Alien");
            taxi.setMarque("toyota");
            taxi.setNbPlace("5");
            taxi.setRefVehicule("refpouette");
            taxi.setZone("twilligth");
            tList.add(taxi);
            CompagnieTaxi ctaxi = new CompagnieTaxi();
            ctaxi.setListTaxi(tList);
            ctaxi.setLocation("Quebec");
            ctaxi.setNom("BAnane");

            m.marshal(ctaxi, new File(MY_TAXI_XML));

//            Unmarshaller um = context.createUnmarshaller();
//            Departement departement = (Departement) um.unmarshal(new File(DEPARTEMENT_XML));
//
//            System.out.println(departement);


        } catch (JAXBException e) {
            e.printStackTrace();
        }

/*
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
    ArrayList<Livre> list = librairie2.getListTaxi();
    for (Livre livre : list) {
      System.out.println("Livre: " + livre.getnom() + " à partir "
          + livre.getauteur());
    }
  }*/
    }
}
