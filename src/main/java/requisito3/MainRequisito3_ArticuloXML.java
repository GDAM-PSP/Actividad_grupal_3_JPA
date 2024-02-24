package requisito3;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MainRequisito3_ArticuloXML {

	public static void main(String[] args) {
		System.out.println("Empieza la generación del XML de artículos");
		JAXBContext contexto;
		
		try {
			contexto = JAXBContext.newInstance(ArrayArticulos.class);
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

			 ArrayArticulos articulos = new ArrayArticulos();
			 Articulo articulo1 = new Articulo(1, "Ordenador", "portatil HP 15s-fq5060ns", 10, 659.0);
		     articulos.getArticulos().add(articulo1);
		     System.out.println("Artículo 1 añadido a la BDD: " + articulo1);
		     
			 Articulo articulo2 = new Articulo(2, "Móvil", "Samsung Galaxy S24 ultra 12 + 512GB", 20, 1579.0 );
		     articulos.getArticulos().add(articulo2);
		     System.out.println("Artículo 2 añadido a la BDD: " + articulo2);
		     
			 Articulo articulo3 = new Articulo(3, "Monitor", "Phillips B-Line 278B1" , 30,199.99);
		     articulos.getArticulos().add(articulo3);
		     System.out.println("Artículo 3 añadido a la BDD: " + articulo3);		     
		     
		     System.out.println("XML generado:");
		     m.marshal(articulos, System.out);
			 m.marshal(articulos, new File("articulos.xml"));
			 System.out.println("\nFichero articulos.xml creado en la raiz del proyecto");

		}catch(JAXBException e) {
			System.out.println("Error en la conversión a XML");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
