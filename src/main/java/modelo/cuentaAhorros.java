/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sofia
 */
public class cuentaAhorros {
    
    public class CuentaAhorros extends cuenta {

    public CuentaAhorros(int numero, String nombreDueno,
                         fecha fechaApertura, double saldo) {
        super(numero, nombreDueno, fechaApertura, saldo);
    }

    @Override
    public boolean retirar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }
}
    
}
