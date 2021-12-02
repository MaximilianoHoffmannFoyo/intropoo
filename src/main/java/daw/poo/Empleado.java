
package daw.poo;

public class Empleado {
    
    private String nombre, apellidos, NIF;
    private double sueldoBase, pagoHoraExtra, horasExtraMes;
    private int irpf, numeroHijos;
    private boolean casado;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public void setHorasExtraMes(double horasExtraMes) {
        this.horasExtraMes = horasExtraMes;
    }

    public void setIrpf(int irpf) {
        this.irpf = irpf;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public double getHorasExtraMes() {
        return horasExtraMes;
    }

    public int getIrpf() {
        return irpf;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public boolean isCasado() {
        return casado;
    }

    public Empleado() {
        this.sueldoBase = 1050;
        this.pagoHoraExtra = 32;
        this.irpf = 15;
    }
    
    public Empleado(String nombre, String apellidos, String NIF, 
            double sueldoBase, double pagoHoraExtra, double horasExtraMes, 
            int irpf, int numeroHijos, boolean casado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtraMes = horasExtraMes;
        this.irpf = irpf;
        this.numeroHijos = numeroHijos;
        this.casado = casado;
    }
    
    public double calculoHorasExtra(){
        double pagoTotalHorasExtra = this.horasExtraMes * this.pagoHoraExtra;
        return pagoTotalHorasExtra;
    }
    
    public double sueldoBruto(){
        double pagoTotalHorasExtra = this.horasExtraMes * this.pagoHoraExtra;
        double sueldoBruto = pagoTotalHorasExtra + this.sueldoBase;
        return sueldoBruto;
    }
    
    public double irpf(){
        int casadoNumero;
        if(this.isCasado()){
            casadoNumero = 2;
        }else{
            casadoNumero = 0;
        }
        double irpfMenos = this.irpf - (this.numeroHijos + casadoNumero);
        double irpfFinal = this.sueldoBase * (irpfMenos / 100);
        return irpfFinal;
    }
    
    public double sueldoNeto(){
        double sueldoNeto = sueldoBruto() - irpf();
        return sueldoNeto;
    }
    
    public String escribirBasicInfo(){
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + 
                ", NIF=" + NIF + ", numeroHijos=" + numeroHijos + ", casado=" + casado + '}';
    }
    
    public String escribirAllInfo(){
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + 
                ", NIF=" + NIF + ", numeroHijos=" + numeroHijos + ", casado=" + 
                casado + ", sueldoBase=" + sueldoBase + ", complemento por horas extra=" + 
                calculoHorasExtra() + ", sueldo bruto=" + sueldoBruto() + 
                ", sueldo bruto=" + sueldoBruto() + ", retención de IRPF=" + irpf()+
                ", sueldo neto=" + sueldoNeto() +'}';
    } 

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + 
                ", NIF=" + NIF + ", sueldoBase=" + sueldoBase + ", pagoHoraExtra=" + 
                pagoHoraExtra + ", horasExtraMes=" + horasExtraMes + ", irpf=" + 
                irpf + ", numeroHijos=" + numeroHijos + ", casado=" + casado + '}';
    }

    
}
