/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomovil;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
class PintaHML {
    public static String crearTabla(ArrayList<Movil> lista)
    {
        String html="<html><head></head><body><table>";
        for (Movil x: lista)
        {
            html=html+"<tr><td>"+x.getMarca()+"</td><td>"+x.getModelo()+"</td><td>"+x.getGama()+"</td></tr>";
        }
        html=html+"</table></body></html>";
        return html;
    }
}
