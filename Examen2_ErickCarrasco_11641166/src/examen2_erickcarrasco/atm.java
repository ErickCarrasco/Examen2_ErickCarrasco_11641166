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
public class atm {
    private String ubicacion;
    private String id;
    private String date;
    private String maintenance;
    private int money;

    public atm(String ubicacion, String id, String date, String maintenance) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.date = date;
        this.maintenance = maintenance;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "atm: " + "ubicacion: " + ubicacion + ", id: " + id ;
    }
    
    
}

