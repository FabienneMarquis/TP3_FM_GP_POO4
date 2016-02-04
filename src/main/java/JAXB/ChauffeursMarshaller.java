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
public class ChauffeursMarshaller {
    /**
     * this method save a list of taxis to an xml file.
     * @param list the list of taxis to save in xml
     * @param file the filename to save the parsed xml at.
     */
    public void marshalTaxistoFile(List<Chauffeur> list, String file) {
        try {
            JAXBContext context = JAXBContext.newInstance(Chauffeurs.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT
                    , Boolean.TRUE);

            Chauffeurs chauffeurs = new Chauffeurs();
            chauffeurs.setChauffeurs(list);

            m.marshal(chauffeurs, new File(file));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ChauffeursMarshaller marshaller = new ChauffeursMarshaller();
        List<Chauffeur> chauffeurs = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Chauffeur chauffeur = new Chauffeur();
            chauffeur.setRefVehicule("Ref" + i);
            chauffeur.setTelephone("Tel" + i);
            chauffeur.setPermis("Permi" + i);
            chauffeur.setPrenom("Prenom" + i);
            chauffeur.setNom("Nom" + i);
            chauffeurs.add(chauffeur);
        }
        marshaller.marshalTaxistoFile(chauffeurs, "chauffeurs.xml");
    }
}
