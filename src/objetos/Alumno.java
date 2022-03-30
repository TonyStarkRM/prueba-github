package objetos;

public class Alumno {
	
	private long idAlumno;
    private Persona persona;
	
	
	
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(long idAlumno, Persona persona) {
		super();
        this.idAlumno = idAlumno;
        this.persona = persona;


	}
	
    
    public long getIdAlumno(){
        return this.idAlumno;
    }

    public void setIdAlumno(long idAlumno){
        this.idAlumno = idAlumno;
    }

    public Persona getPersona(){
        return this.idAlumno;
    }

    public void setPersona(Persona persona){
        this.persona = persona;
    }
	
	

}
