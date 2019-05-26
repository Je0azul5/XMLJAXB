package xmljaxb;

import LecturaYEscritura.Libreria;
import LecturaYEscritura.Libro;
import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author jeazu
 */
public class XMLJAXB {

    public static void main(String[] args) throws JAXBException {
        JAXBContext cont = JAXBContext.newInstance(Libreria.class);
        //pasamos de un xml a java nos permite leer 
        Unmarshaller un = cont.createUnmarshaller();
        //recibimos un xml por medio de un arcihvo ya importado a java
        // si no ponemos la ruta del xml
        Libreria lb = (Libreria) un.unmarshal(new File("libreria.xml"));
       // System.out.println(lb.getNombre());
        ArrayList<Libro> libors = lb.getLibros();
      
        System.out.println(lb.toString());  

    }

}
