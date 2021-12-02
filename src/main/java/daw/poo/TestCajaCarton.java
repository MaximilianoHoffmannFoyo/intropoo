
package daw.poo;

public class TestCajaCarton {

    public static void main(String[] args) {
//Dentro del método main() de la clase TestCajaCarton declara dos objetos de tipo CajaCarton. 
    //Estos objetos se pueden llamar cajaGrande y cajaChica.
    CajaCarton cajaGrande;
    CajaCarton cajaChica;
    
//Instancia los objetos anteriores con los siguientes valores, 
    //usando el constructor y el operador new:
        //cajaGrande: ancho 250mm, alto 400mm, largo 500mm. Peso 200gr.
        //cajaChica: ancho 25mm, alto 30mm, largo 15mm. Peso 17gr.
    cajaGrande = new CajaCarton(250, 400, 500, 200);
    cajaChica = new CajaCarton(25, 30, 15, 17);
    
//Muestra los datos de las cajas creadas usando métodos get.
    System.out.print("Datos de caja Grande: " + cajaGrande.getAltoMilimetros() + ", "
            + cajaGrande.getAnchoMilimetros() + ", " + cajaGrande.getLargoMilimetros()
            + ", " + cajaGrande.getPesoGramos());
    System.out.print("\nDatos de caja Chica: " + cajaChica.getAltoMilimetros() + ", "
            + cajaChica.getAnchoMilimetros() + ", " + cajaChica.getLargoMilimetros()
            + ", " + cajaChica.getPesoGramos());

    }
    
}
