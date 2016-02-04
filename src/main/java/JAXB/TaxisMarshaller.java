package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Fabienne et Gabriel on 2016-02-04.
 */
public class TaxisMarshaller {

    /**
     *  this methode save a list of taxi to and xml file
     * @param taxiList the list of taxi to save in xml
     * @param file the filename to save the parsed xml at
     */
    public void marshalTaxistoFile(List<Taxi> taxiList, String file){
        try {
            JAXBContext context = JAXBContext.newInstance(Taxis.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT
                    , Boolean.TRUE);

            Taxis taxis = new Taxis();
            taxis.setTaxis(taxiList);

            m.marshal(taxis, new File(file));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        TaxisMarshaller taxisMarshaller = new TaxisMarshaller();
        List<Taxi> taxis = new ArrayList<>();
        for (int i = 0; i<5;i++){
            Taxi taxi = new Taxi();
            taxi.setRefVehicule("Ref"+i);
            taxi.setNbPlace("NbPlace" + i);
            taxi.setZone("Zone" + i);
            taxi.setImmatriculation("Immatriculation" + i);
            taxi.setMarque("Marque" + i);
            taxis.add(taxi);
        }
        taxisMarshaller.marshalTaxistoFile(taxis,"taxis.xml");
    }
}
