package objetos;

public class Persona {
	
	private long idPersona;
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String nacionalidad;
	private String fechaNac;
	private String direccion;
	
	
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String dni, String nombre, String apellido1, String apellido2, String nacionalidad,
			String fechaNac, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nacionalidad = nacionalidad;
		this.fechaNac = fechaNac;
		this.direccion = direccion;
	}
	public long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(long idPersona) {
		this.idPersona = idPersona;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", nacionalidad=" + nacionalidad + ", fechaNac=" + fechaNac 
				+ ", direccion=" + direccion + "]";
	}
	
	

}
