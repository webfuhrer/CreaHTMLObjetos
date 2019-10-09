/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomovil;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
 public static int pedirOpcion()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("INTRODUZCA UNA OPCIÓN: ");
     System.out.println("1-Introducir móvil");
     System.out.println("2-Listar móviles");
     System.out.println("3-Pintar tabla móviles");
     System.out.println("4-Salir");
     int opcion=sc.nextInt();
     return opcion;
 }

    static Movil pedirDatosMovil() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el modelo");
        String modelo=sc.nextLine();
        System.out.println("Introduzca la marca");
        String marca=sc.nextLine();
        System.out.println("Introduzca la gama");
        String  gama=sc.nextLine();
        //(String marca, String modelo, String gama)
        Movil m=new Movil(marca, modelo, gama);
        return m;
    }

    static void mostrarMoviles(ArrayList<Movil> lista_moviles) {
        for(Movil m: lista_moviles)
        {
            System.out.println(m);
        }
    }
}
