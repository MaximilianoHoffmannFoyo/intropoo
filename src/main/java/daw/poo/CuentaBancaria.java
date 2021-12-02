
package daw.poo;

import org.apache.commons.lang3.RandomStringUtils;

public class CuentaBancaria {
//atributos para el número de cuenta (String), el NIF del cliente (String), 
//nombre del cliente, el saldo actual y el interés anual que se aplica
//a la cuenta (entre 0.1% y 3%).
    private String numeroCuenta;
    private String nif;
    private String nombreCliente;
    private double saldoActual;
    private double interesAnual;
    
    
//Constructor por defecto, con los valores que tú consideres oportunos. 
//El número de cuenta debe tener 20 dígitos y se debe generar usando la 
//clase RandomStringUtils de la librería Apache Commons. 
    public CuentaBancaria() {
        this.numeroCuenta = RandomStringUtils.randomNumeric(20);
    }
    
//Constructor parametrizado con NIF, nombre, saldo e interés. 
//Genera el número de cuenta de igual forma que en el constructor por defecto. 
//En este ejercicio, a la hora de generar números de cuenta en ambos 
//constructores, no se tendrá en cuenta que se puedan generar números de cuenta  
//repetidos, algo que evidentemente en la vida real no debería suceder.
    public CuentaBancaria(String nif, String nombre, 
            double saldoActual, double interesAnual) {
        this.numeroCuenta = RandomStringUtils.randomNumeric(20);
        this.nif = nif;
        this.nombreCliente = nombre;
        this.saldoActual = saldoActual;
        if(interesAnual<0.1){
            this.interesAnual = 0.1;
        }else if(interesAnual>3){
            this.interesAnual = 3;
        }else{
            this.interesAnual = interesAnual;
        }
    }
    
//Métodos get y set. Para el número de cuenta no hay método set, suponemos que 
//un número de cuenta no se puede cambiar una vez la cuenta está creada.
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    
//ingresarIntereses(): aumenta el saldo de la cuenta, 
//aplicando el interés anual [saldo = saldo + (interés * saldo)].
    public void ingresarIntereses(){
        this.saldoActual = this.saldoActual + 
                (this.interesAnual * this.saldoActual);
    }
    
//ingresarDinero(double cantidad): permite ingresar una cantidad en la cuenta.
    public void ingresarDinero(double cantidad){
        this.saldoActual += cantidad;
    }
    
//retirarEfectivo(double cantidad): permite sacar una cantidad de la cuenta 
//(si hay saldo). Si no hay saldo suficiente no se realiza la operación.
    public void retirarEfectivo(double cantidad){
        if(this.saldoActual > cantidad){
            this.saldoActual -= cantidad;
        }        
    }
//toString()
    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", nif=" + nif + ", nombreCliente=" + nombreCliente + ", saldoActual=" + saldoActual + ", interesAnual=" + interesAnual + '}';
    }

}
