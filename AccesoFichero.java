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
public class AccesoFichero {
    public static void grabarLinea(String linea, String ruta) {
		try {
			FileWriter fw=new FileWriter(ruta, false);
			
			fw.write(linea);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
