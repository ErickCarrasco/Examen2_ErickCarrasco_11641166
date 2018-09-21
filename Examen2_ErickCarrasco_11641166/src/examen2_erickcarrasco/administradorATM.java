/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_erickcarrasco;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erick
 */
public class administradorATM {
    private ArrayList<atm> atms = new ArrayList();
    private File archivo = null;

    public administradorATM(String path) {
        archivo = new File (path);
        
    }

    public ArrayList<atm> getAtms() {
        return atms;
    }

    public void setAtms(ArrayList<atm> atms) {
        this.atms = atms;
    }
    
    public void setATM(atm a){
        this.atms.add(a);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void escribirArchivo()throws IOException{
        FileWriter fw= null;
        BufferedWriter bw=null;
        try{
            fw=new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (atm a : atms) {
                bw.write(a.getUbicacion()+";");
                bw.write(a.getId()+";");
                bw.write(a.getDate()+";");
                bw.write(a.getMaintenance()+";");
                bw.write(a.getMoney()+";");
                
                
            }
            bw.flush();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        Scanner sc = null;
        atms = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");

                while (sc.hasNext()) {
                    int  e;
                    String ubi, n, date, main;
                    ubi = sc.next();
                    n = sc.next();
                    date = sc.next();
                    main = sc.next();
                    
                    
                    
                    e = sc.nextInt();
                    atms.add(new atm(ubi,n,date, main));
                    atms.get(atms.size()-1).setMoney(e);
                }

            } catch (Exception ex) {
                System.out.println("No data");
            } finally {
                sc.close();
            }
        }
    }
    
    
    
    
    
    
}
