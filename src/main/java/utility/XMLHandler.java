package utility;

import data.SpaceMarine;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringWriter;

public class XMLHandler {
    public String spaceMarineToXML(SpaceMarine o) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(SpaceMarine.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(o, sw);
            return sw.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
            return "error";
        }
    }

    public SpaceMarine xmlToSpaceMarine(File xmlFile) {
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(SpaceMarine.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (SpaceMarine) jaxbUnmarshaller.unmarshal(xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

}
