/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sofia
 */
public class cuentaCorriente extends cuenta {

    private double cupoSobregiro;

    public cuentaCorriente(int numero, String nombreDueno,
                           fecha fechaApertura, double saldo,
                           double cupoSobregiro) {
        super(numero, nombreDueno, fechaApertura, saldo);
        this.cupoSobregiro = cupoSobregiro;
    }

    public double getCupoSobregiro() {
        return cupoSobregiro;
    }

    public void setCupoSobregiro(double cupoSobregiro) {
        this.cupoSobregiro = cupoSobregiro;
    }

    @Override
    public boolean retirar(double valor) {
        if (valor > 0 && valor <= getSaldo() + cupoSobregiro) {
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }
}
