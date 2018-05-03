/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

/**
 *
 * @author Jesus David
 */
public class FileHandle {

    public FileHandle() {
        File archivo = new File("mispeliculas.txt");
        Scanner s = null;
        try {
            s = new Scanner(archivo);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] campos = linea.split(",");
                ptr = AgregarCola(ptr, campos[0], campos[1], campos[2], campos[3]);
            }
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }

    public void modify(String name,String duracion, String clasificacion,String  portada) {
        File archivo = new File("mispeliculas.txt");
        System.out.println("Hi");
        Nodo p=ptr;
        if(ptr==null){
            
            
        }else{
           while (p != null) {
                    if(p.nombre.equals(ListaPeliculas.nombre)){
                        p.nombre=name;
                        p.duracion=duracion;
                        p.clasifi=clasificacion;
                        p.portada=portada;
                    }
                    p = p.link;
                } 
        }
        writefromlist(ptr,archivo);
        
    }

    public void delete(File movies, String name) {

        try {
            Nodo antp = null;
            Nodo p = ptr;

            while (!p.nombre.equals(name) && !p.link.equals(null)) {
                antp = p;
                p = p.link;
            }
            if (p.nombre.equals(name)) {
                if (p.equals(ptr)) {
                    ptr = ptr.link;
                } else {
                    antp.link = p.link;
                }
                File portada=new File(p.portada);
                portada.delete();
                p.link = null;

            } else {
                System.out.println("No se encontro el elemento");
            }
            File archivo = new File("mispeliculas.txt");
            writefromlist(ptr, archivo);

        } catch (Exception ex) {
            System.out.println("Mensaje $: " + ex.getMessage());
        }

    }

    class Nodo {

        String nombre;
        String duracion;
        String clasifi;
        String portada;
        Nodo link;

    }
    Nodo ptr;

    public Nodo AgregarCola(Nodo ptr, String nombre, String duraci, String clasific, String portada) {
        Nodo p = new Nodo();

        p.nombre = nombre;
        p.duracion = duraci;
        p.clasifi = clasific;
        p.portada = portada;

        if (ptr == null) {
            ptr = p;
        } else {
            Nodo q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        return ptr;
    }

    void writefromlist(Nodo ptr, File archivo) {
        Nodo p = ptr;
        try {
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(archivo));
            bw2.write("");
            bw2.close();

            p = ptr;
            if (ptr == null) {

            } else {
                while (p != null) {
                    try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new FileWriter(archivo, true));) {
                        bw.write(p.nombre + "," + p.duracion + "," + p.clasifi + "," + p.portada);
                        bw.newLine();

                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                    p = p.link;
                }
            }
        } catch (Exception e) {
            System.out.println("Mensaje: " + e.toString());
        }
    }
/*Este método verifica si una cadena existe en un archivo dado un campo
    Devuelve true si encuentra que el dato existe en el archivo en el campo indicado,
    false en caso contrario
    */
    public static boolean existsonfile(File archivo, int campo, String something) {
        boolean sw = false;
        Scanner s = null;
        try {

            s = new Scanner(archivo);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] campos = linea.split(",");
                if (campos[campo].equals(something)) {
                    sw = true;
                }
            }
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.toString());
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.toString());
            }
        }
        return sw;
    }

    public static String getField(String nombre,int campo) {
        File archivo = new File("mispeliculas.txt");
        String dir = "";
        Scanner s = null;
        try {

            s = new Scanner(archivo);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] campos = linea.split(",");
                if (campos[0].equals(nombre)) {
                    dir = campos[campo];
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.toString());
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        return dir;
    }
}
