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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class BitRate extends Thread{
    private String funcion;
    private String variables;
    private String alarm;
    private String codigo;

    public BitRate(String funcion, String variables, String alarm, String codigo) {
        this.funcion = funcion;
        this.variables = variables;
        this.alarm = alarm;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getVariables() {
        return variables;
    }

    public void setVariables(String variables) {
        this.variables = variables;
    }

    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm;
    }
    
    @Override
    public void run(){
        while(true){
            File a = new File("./"+codigo+"_"+"bitacora.txt");
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter(a, true);
                bw = new BufferedWriter(fw);
                bw.write(funcion + " de: " +variables+" ATM codigo: " + codigo +"Alerta: "+alarm+ "\n");
                bw.flush();
            } catch (IOException ex) {

            }

            try {
                bw.close();
                fw.close();
                Thread.sleep(5000000);
            } catch (InterruptedException e) {
            }catch(Exception e){
                
            }
        }
    }
}
