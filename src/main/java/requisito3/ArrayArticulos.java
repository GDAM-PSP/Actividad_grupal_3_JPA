package requisito3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "informatica")
public class ArrayArticulos {
	private List<Articulo> articulos;

	public ArrayArticulos(List<Articulo> articulos) {
		//super();
		this.articulos = articulos;
	}

	public ArrayArticulos() {
		articulos = new ArrayList<Articulo>();
	}
	@XmlElement(name = "articulo")
	@XmlElementWrapper(name="articulos")
	public List<Articulo> getArticulos() {
		return articulos;
	}
	
	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	
	
	
}
