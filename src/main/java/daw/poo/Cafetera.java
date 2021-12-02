package daw.poo;

/*
Desarrolla una clase Cafetera con atributos capacidadMaxima (la cantidad máxima 
de café que puede contener la cafetera) y cantidadActual (la cantidad actual de 
café que hay dentro de la cafetera). Implementa, al menos, los siguientes métodos:
Restriccionnes Naturales:
- capacidadMaxima y cantidadActual no pueden ser negativos
- cantidadActual no puede ser mayor que capacidadMaxima
 */
public class Cafetera {

    private double capacidadMaxima, cantidadActual;

//Constructor predeterminado, sin parámetros: establece la capacidad máxima en 
//1000 (c.c.) y la cantidad actual en cero (cafetera vacía).
    public Cafetera() {
        this.cantidadActual = 0;
        this.capacidadMaxima = 1000;
    }

//Constructor, que recibe sólo la capacidad máxima de la cafetera; inicializa 
//la cantidad actual de café igual a la capacidad máxima (cafetera llena).
    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = Math.abs(capacidadMaxima);
        this.cantidadActual = this.capacidadMaxima;
        
                            //ó
                            
        if(capacidadMaxima <= 0){
            this.capacidadMaxima = 1;
        }
        this.cantidadActual = this.capacidadMaxima;
    }

//Constructor, que recibe la capacidad máxima y la cantidad actual. Si la 
//cantidad actual que se pasa es mayor que la capacidad máxima de la cafetera,
//se ajustará la cantidad actual a la capacidad máxima.
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if(capacidadMaxima <= 0){
            this.capacidadMaxima = 1;
        }
        this.cantidadActual = cantidadActual;
        if(cantidadActual < 0){
            this.cantidadActual = 0;
        }
        if (cantidadActual > this.capacidadMaxima){
            this.cantidadActual = this.capacidadMaxima;
        }
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }
 
//llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }
    
//servirTaza(double cantidadAServir): simula la acción de servir una taza con
//la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar
//la taza, se sirve lo que quede.
    public void servirTaza(double cantidadAServir){
        double servir = Math.abs(cantidadAServir);
        if(this.cantidadActual < cantidadAServir){
            this.cantidadActual = 0;
        }else{
            this.cantidadActual -= servir;
        }
        
    }

//vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    } 

//agregarCafe(double cantidadAgregar): añade a la cafetera la cantidad de café
//indicada, teniendo en cuenta que la cafetera no puede rebosar.
    public double agregarCafe(double cantidadAgregar){
        this.cantidadActual += cantidadAgregar;
        if(this.cantidadActual>this.capacidadMaxima){
           this.cantidadActual = this.capacidadMaxima; 
        }
        return this.cantidadActual;
    }
}
