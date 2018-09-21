/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_erickcarrasco;

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
public class administrarClientes {
    private ArrayList<Cliente> listaClientes= new ArrayList();
    private File archivo = null;

    public administrarClientes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setCliente(Cliente c){
        this.listaClientes.add(c);
    }
    
    //Escribir archivo
    public void escribirArchivo()throws IOException{
        FileWriter fw= null;
        BufferedWriter bw=null;
        try{
            fw=new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Cliente c : listaClientes) {
                bw.write(c.getId()+";");
                bw.write(c.getNombre()+";");
                bw.write(c.getSegundonombre()+";");
                bw.write(c.getApellido()+";");
                bw.write(c.getSegapellido()+";");
                bw.write(c.getPassword()+";");
                bw.write(c.getBirthdate()+";");
                bw.write(c.getAffilation()+";");
                for (Object t: c.getTransacciones()) {
                    bw.write(t.toString()+",");
                }
                bw.write(";");
                for (Cuenta h : c.getCuentas()) {
                    bw.write(h.getId()+",");
                    bw.write(h.getNumcuenta()+",");
                    bw.write(h.getSaldo()+",");
                }
                bw.write(";");
                
            }
            bw.flush();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        bw.close();
        fw.close();
    }
    
    //Cargar
    public void cargarArchivo(){
        Scanner sc = null;
        listaClientes = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");

                while (sc.hasNext()) {
                    
                    String id, n, n2, a, a2, pw, bd, aff;
                    ArrayList<Cuenta> temporary = new ArrayList();
                    ArrayList tr= new ArrayList();
                    id = sc.next();
                    
                    n = sc.next();
                    
                    n2 = sc.next();
                    a = sc.next();
                    a2 = sc.next();
                    pw = sc.next();
                    bd = sc.next();
                    aff = sc.next();
                    
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()){
                        tr.add((s2.next()));
                    }
                    Scanner s3 = new Scanner(sc.next());
                    
                    s3.useDelimiter(",");
                    while(s3.hasNext()){
                        temporary.add(new Cuenta(s3.next(), s3.nextInt(), s3.next()));
                    }
                            
                    
                    listaClientes.add(new Cliente(id,n,n2, a, a2, pw, bd, aff));
                    listaClientes.get(listaClientes.size()-1).setTransacciones(tr);
                    listaClientes.get(listaClientes.size()-1).setCuentas(temporary);
                }

            } catch (Exception ex) {
                System.out.println("No data");
            } finally {
                sc.close();
            }
        }
    }
    
    
    
}
