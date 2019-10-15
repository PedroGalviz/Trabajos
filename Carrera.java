import java.util.Date;

public class Carrera
{
    Integer codigo;
    String nombre;
    Integer semestres;
    Integer creditos;
    String titulo;
    String director;
    Date fechaInicio;
    Estudiante estudiante; 

    public Carrera(){
    }

    public Carrera(Integer codigo, String nombre, Integer semestres, Integer creditos, String titulo, String director, Date fechaInicio, Estudiante estudiante){
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestres = semestres;
        this.creditos = creditos;
        this.titulo = titulo;
        this.director = director;
        this.fechaInicio = fechaInicio;
        this.estudiante = estudiante;
    }

    public Integer getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public Integer getSemestres(){
        return semestres;
    }

    public Integer getCreditos(){
        return creditos;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDirector(){
        return director;
    }

    public Date getFechaInicio(){
        return fechaInicio;
    }
    
    public Estudiante getEstudiante(){
        return estudiante;
    }

    public void setCodigo(Integer codigo){
        this.codigo=codigo;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setSemestres(Integer semestres){
        this.semestres=semestres;
    }

    public void setCreditos(Integer creditos){
        this.creditos=creditos;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setDirector(String director){
        this.director=director;
    }

    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio=fechaInicio;
    }
    public void setEstudiante(Estudiante estudiante){
        this.estudiante=estudiante;
    }
}