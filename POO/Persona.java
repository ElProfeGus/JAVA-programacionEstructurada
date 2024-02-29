package Repositorio;
public class Persona {
    // Atributos 
    String nombre;
    int edad;

    //Get and Setter
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    // metodo para saludar
    public void saludar(){
        System.out.println("Hola mi nombre es: " + nombre + " y tengo " + edad);
                
    }
    
    
}
