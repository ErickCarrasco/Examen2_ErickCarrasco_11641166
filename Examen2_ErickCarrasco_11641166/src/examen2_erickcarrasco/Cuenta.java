/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_erickcarrasco;

/**
 *
 * @author erick
 */
public class Cuenta {
    private String numcuenta;
    private int saldo;
    private String id;

    public Cuenta(String numcuenta, int saldo, String id) {
        this.numcuenta = numcuenta;
        this.saldo = saldo;
        this.id = id;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cuenta: " + " " + numcuenta ;
    }
    
    
    
}
