package conversor_package;

public class Principal {

	//Declaramos las atributos
	private String cliente;
	private String direccion;
	private int edad;
	
	//Getters & setters
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Constructor 
	public Principal(String cliente, String direccion) {
		super();
		this.cliente = cliente;
		this.direccion = direccion;
	}

	//Metodo main
	public static void main(String[] args) {
		
	}
}
