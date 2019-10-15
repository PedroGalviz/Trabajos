
public class Estudiante
{
    Integer codigo;
    String nombre;
    Integer telefono;
    String email;
    String direccion;
    Integer edad;
    Integer documento;
    String tipoDocumento;
    Integer creditosCursados;
    Integer semestresCursados;
    String estado;

    public Estudiante(){

    }

    public Estudiante(Integer codigo, String nombre, Integer telefono, String email, String direccion, Integer edad, Integer documento, String tipoDocumento, Integer creditosCursados, Integer semestresCursados, String estado){
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.edad = edad;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.creditosCursados = creditosCursados;
        this.semestresCursados = semestresCursados;
        this.estado = estado;
    }

    public Integer getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public Integer getTelefono(){
        return telefono;
    }

    public String getEmail(){
        return email;
    }

    public String getDireccion(){
        return direccion;
    }

    public Integer getEdad(){
        return edad;
    }

    public Integer getDocumento(){
        return documento;
    }

    public String getTipoDocumento(){
        return tipoDocumento;
    }

    public Integer getCreditosCursados(){
        return creditosCursados;
    }

    public Integer getSemestresCursados(){
        return semestresCursados;
    }

    public String getEstado(){
        return estado;
    }

    public void setCodigo(Integer codigo){
        this.codigo=codigo;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setTelefono(Integer telefono){
        this.telefono=telefono;
    }

    public void setEmail(String email){
        this.email=email;
    }   

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public void setEdad(Integer edad){
        this.edad=edad;
    }

    public void setDocumento(Integer documento){
        this.documento=documento;
    }

    public void setTipoDocumento(String tipoDocumento){
        this.tipoDocumento=tipoDocumento;
    }

    public void setCreditosCursados(Integer creditosCursados){
        this.creditosCursados=creditosCursados;
    }

    public void setSemestresCursados(Integer semestresCursados){
        this.semestresCursados=semestresCursados;
    }

    public void setEstado(String estado){
        this.estado=estado;
    }

    //Métodos analizadores

    public void Esmayor()
    {
        if(getEdad()>18){ 

            System.out.println("El estudiante es mayor de edad");
        }

        else{
            if(getEdad()<18)
            {
                System.out.println("El estudiante no es mayor de edad");
            }
        }
    }

    public void Creditos(){
        if(getCreditosCursados() == getCreditos()){
            System.out.println("Estas a un paso de ser ");
        }      
    }  
}

