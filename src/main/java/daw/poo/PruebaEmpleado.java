
package daw.poo;

public class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Norman","Osborn","113252V",
                100049.50,32.0,5.0,15,2,true);
        Empleado empleado2 = new Empleado("Harry","Osborn","147812L",
                5000.0,0,0,10,0,false);
        
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getApellidos());
        empleado1.setNombre("Piter");
        empleado1.setApellidos("Parker");
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getApellidos());
        
        System.out.println(empleado2.getNombre());
        System.out.println(empleado2.getApellidos());
        empleado2.setNombre("Mery Jane");
        empleado2.setApellidos("Whatson");
        System.out.println(empleado2.getNombre());
        System.out.println(empleado2.getApellidos());
        
        System.out.println("complemento correspondiente a las horas extra realizadas: "
                +empleado1.calculoHorasExtra());
        System.out.println("Cálculo del sueldo bruto: "
                +empleado1.sueldoBruto());
        System.out.println("Cálculo de las retenciones (IRPF): "
                +empleado1.irpf());
        System.out.println("Cálculo del sueldo neto: "
                +empleado1.sueldoNeto());
        System.out.println("información básica del empleado: "
                +empleado1.escribirBasicInfo());
        System.out.println("toda la información del empleado: "
                +empleado1.escribirAllInfo());
        System.out.println("toString: "+empleado1.toString());
        
    }
    
}
