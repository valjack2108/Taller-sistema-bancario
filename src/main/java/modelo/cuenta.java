/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sofia
 */
public class cuenta {
    
    private int numero;
    private String nombreDueno;
    private fecha fechaApertura;
    private double saldo;
    
    public cuenta(int numero, String nombreDueno, fecha fechaApertura, double saldo) {
    this.numero = numero;
    this.nombreDueno = nombreDueno;
    this.fechaApertura = fechaApertura;
    this.saldo = saldo;
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public fecha getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(fecha fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
