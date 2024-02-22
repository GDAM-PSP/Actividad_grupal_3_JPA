package requisito3;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.util.ArrayList;
import java.util.List;

public class ArticuloXML {

	public static void main(String[] args) {
		JAXBContext contexto;
		
		try {
			contexto = JAXBContext.newInstance(Articulo.class);
		} catch (JAXBException e) {
			System.out.println("Error creando el contexto");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}
		
		Marshaller m;
		
		try {
			m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			 List<Articulo> listaArticulos = new ArrayList<>();
		     listaArticulos.add(new Articulo(1, "Ordenador", "portatil HP 15s-fq5060ns", 10, 659.0));
		     listaArticulos.add(new Articulo(2, "Móvil", "Samsung Galaxy S24 ultra 12 + 512GB", 20, 1579.0 ));
		     listaArticulos.add(new Articulo(3, "Monitor", "Phillips B-Line 278B1" , 30,199.99));
		     
		     m.marshal(listaArticulos, System.out);
			 m.marshal(listaArticulos, new File("articulos.xml"));
		     
		}catch(JAXBException e) {
			System.out.println("Error en la conversión a XML");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
