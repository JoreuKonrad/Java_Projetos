package entities;

public class Helicoptero {

	public String marca;
	public String modelo;
	public String prefixo;
	
	
	public void helicoptero() {
		
	}


	public Helicoptero(String marca, String modelo, String prefixo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.prefixo = prefixo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPrefixo() {
		return prefixo;
	}


	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	@Override
	public String toString() {
		return getMarca();			
	}
}
