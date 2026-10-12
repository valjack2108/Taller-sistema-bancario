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
       
       public void crearCuentaAhorros(int numero, String nombreDueno,
                               fecha fechaApertura, double saldo) {
           
   cuentaActual = new cuentaAhorros(numero, nombreDueno, fechaApertura, saldo);
   }
       
   public void crearCuentaCorriente(int numero, String nombreDueno, fecha fechaApertura, double saldo, double cupoSobregiro) {
       
    cuenta nuevaCuenta = new cuentaCorriente(numero, nombreDueno, fechaApertura, saldo, cupoSobregiro);

    cuentas.add(nuevaCuenta);
    
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
