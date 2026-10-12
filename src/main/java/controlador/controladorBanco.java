/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.cuenta;
import modelo.cuentaAhorros;
import modelo.cuentaCorriente;
import modelo.fecha;

/**
 *
 * @author Sofia
 */
public class controladorBanco {
    
    private final ArrayList<cuenta> cuentas = new ArrayList<>();
    
       private cuenta cuentaActual;
       
       
public boolean crearCuentaAhorros(
        int numero, String nombreDueno,
        fecha fechaApertura, double saldo) {

    if (buscarCuenta(numero) != null) {
        return false;
    }

    if (nombreDueno == null || nombreDueno.trim().isEmpty()
            || fechaApertura == null || saldo < 0) {
        return false;
    }

    cuenta nuevaCuenta =
            new cuentaAhorros(numero, nombreDueno,
                    fechaApertura, saldo);

    cuentas.add(nuevaCuenta);
    return true;
}
       
  
public boolean crearCuentaCorriente(
        int numero, String nombreDueno,
        fecha fechaApertura, double saldo,
        double cupoSobregiro) {

    if (buscarCuenta(numero) != null) {
        return false;
    }

    if (nombreDueno == null || nombreDueno.trim().isEmpty()
            || fechaApertura == null || saldo < 0
            || cupoSobregiro < 0) {
        return false;
    }

    cuenta nuevaCuenta =
            new cuentaCorriente(numero, nombreDueno,
                    fechaApertura, saldo, cupoSobregiro);

    cuentas.add(nuevaCuenta);
    return true;
}
   
   public cuenta buscarCuenta(int numero) {
    for (cuenta c : cuentas) {
        if (c.getNumero() == numero) {
            return c;
        }
    }

    return null;
}
     

public boolean consignar(int numero, double valor) {
    cuenta c = buscarCuenta(numero);

    if (c != null && valor > 0) {
        c.consignar(valor);
        return true;
    }

    return false;
}

public boolean retirar(int numero, double valor) {
    cuenta c = buscarCuenta(numero);

    if (c != null) {
        return c.retirar(valor);
    }

    return false;
}

public ArrayList<cuenta> getCuentas() {
    return cuentas;
}    

}
