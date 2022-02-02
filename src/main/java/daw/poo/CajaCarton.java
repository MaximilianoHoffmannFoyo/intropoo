
package daw.poo;

public class CajaCarton {

//Añade los siguientes atributos private: ancho, alto, largo y peso. 
    //Las dimensiones se expresan en milímetros y el peso en gramos.
    private int anchoMilimetros;
    private int altoMilimetros;
    private int largoMilimetros;
    private int pesoGramos;

    public CajaCarton() {
    }

//Completa la definición de la clase anterior, incluyendo los métodos getters y setters.
    public int getAnchoMilimetros() {
        return anchoMilimetros;
    }

    public int getAltoMilimetros() {
        return altoMilimetros;
    }

    public int getLargoMilimetros() {
        return largoMilimetros;
    }

    public int getPesoGramos() {
        return pesoGramos;
    }

    public void setAnchoMilimetros(int anchoMilimetros) {
        this.anchoMilimetros = anchoMilimetros;
    }

    public void setAltoMilimetros(int altoMilimetros) {
        this.altoMilimetros = altoMilimetros;
    }

    public void setLargoMilimetros(int largoMilimetros) {
        this.largoMilimetros = largoMilimetros;
    }

    public void setPesoGramos(int pesoGramos) {
        this.pesoGramos = pesoGramos;
        if(pesoGramos < 0 || pesoGramos > 1000){
            System.out.println("El peso pasado como argumento no es válido "
                    + "y se establecerá a cero.");
            this.pesoGramos = 0;
        }
        
    }
    
//Añade, dentro de la definición de la clase anterior, un método constructor con 
    //parámetros similar al de la clase Vehiculo de los apuntes.
    public CajaCarton(int anchoMilimetros, int altoMilimetros, 
            int largoMilimetros, int pesoGramos){
        this.altoMilimetros = altoMilimetros;
        this.anchoMilimetros = anchoMilimetros;
        this.largoMilimetros = largoMilimetros;
        this.pesoGramos = pesoGramos;
    } 
    
//Incluye dos métodos públicos que no devuelven valor y no tienen parámetros, 
    //llamados abrir() y cerrar(). Estos métodos no hacen nada, su cuerpo estará vacío.
    public void abrir(){
        
    }
    public void cerrar(){
        
    }
}
