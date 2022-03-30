package objetos;

public class Coche {
	
	private long idCoche;
	private String matricula;
	
	public Coche(long idCoche, String matricula) {
		super();
		this.idCoche = idCoche;
		this.matricula = matricula;
	}
	public long getIdCoche() {
		return idCoche;
	}
	public void setIdCoche(long idCoche) {
		this.idCoche = idCoche;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
