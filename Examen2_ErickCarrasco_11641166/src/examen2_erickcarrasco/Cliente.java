/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_erickcarrasco;

import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class Cliente {
    private String id;
    private String nombre;
    private String segundonombre;
    private String apellido;
    private String segapellido;
    private String password;
    private ArrayList transacciones = new ArrayList();
    private String birthdate;
    private String affilation;
    private ArrayList <Cuenta> cuentas = new ArrayList();

    public Cliente(String id, String nombre, String segundonombre, String apellido, String segapellido, String password, String birthdate, String affilation) {
        this.id = id;
        this.nombre = nombre;
        this.segundonombre = segundonombre;
        this.apellido = apellido;
        this.segapellido = segapellido;
        this.password = password;
        this.birthdate = birthdate;
        this.affilation = affilation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegapellido() {
        return segapellido;
    }

    public void setSegapellido(String segapellido) {
        this.segapellido = segapellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList transacciones) {
        this.transacciones = transacciones;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAffilation() {
        return affilation;
    }

    public void setAffilation(String affilation) {
        this.affilation = affilation;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public void setCuenta(Cuenta c){
        this.cuentas.add(c);
    }

    @Override
    public String toString() {
        return "Cliente: " + "id " + id + ", nombre: " + nombre;
    }
    
    
}
