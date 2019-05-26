
package escritura;

import LecturaYEscritura.Libreria;
import LecturaYEscritura.Libro;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author jeazu
 */
public class Escritura {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext cont = JAXBContext.newInstance(Libreria.class);
        Marshaller mar = cont.createMarshaller();
        Libreria l = new Libreria("Mi libreria");
        ArrayList<Libro> arr = new ArrayList<>();
        arr.add(new Libro("145", "adf", "aaaa"));
        arr.add(new Libro("14415", "addf", "aaaaddd"));
        arr.add(new Libro("15", "adffasd", "aaaabb"));
        arr.add(new Libro("1", "advf", "aaaaavvv"));
        arr.add(new Libro("144", "advf", "aasdfsdaa"));
        l.setLibros(arr);
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        //mar.marshal(l, System.out);
        mar.marshal(l, new FileWriter("MiNuevaLibreria.xml"));
        
    }
}
