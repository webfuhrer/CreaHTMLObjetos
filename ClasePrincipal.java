/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomovil;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion=EntradaSalida.pedirOpcion();//Saca el menú y espera input del usuario
        ArrayList<Movil> lista_moviles=new ArrayList();
     while(opcion!=4)
     {
                    switch(opcion)
                    {
                        case 1:
                            Movil m=EntradaSalida.pedirDatosMovil();
                            lista_moviles.add(m);
                            break;
                        case 2:
                            EntradaSalida.mostrarMoviles(lista_moviles);

                            break;
                        case 3: 
                            String html_tabla=PintaHML.crearTabla(lista_moviles);
                            AccesoFichero.grabarLinea(html_tabla, "C:\\rutainventada\\archivo.html");
                            break;
                    }
     }  
    }
   
}
