/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pspro.servicio;

import com.mycompany.pspro.DAOs.DAOPiscina;
import com.mycompany.pspro.modelo.Piscina;
import java.util.ArrayList;

/**
 *
 * @author Nitro
 */
public class Servicio {
    private static Servicio servicio = null;
    private static ArrayList<Piscina> listaPiscinas = null;

    private Servicio() {
        listaPiscinas = DAOPiscina.getInstance().getPiscinas();
    }

    public static Servicio getInstance() {
        
        if (listaPiscinas == null) {
            listaPiscinas = new ArrayList<Piscina>();
        }
        
        if (servicio == null) {
            servicio = new Servicio();
        }
        
        return servicio;

    }

    public ArrayList<Piscina> getPiscinas() {

        return listaPiscinas;

    }
    
    public Piscina getPiscina(Piscina piscina) {
        if(listaPiscinas.contains(piscina)){
            for(int i = 0; i < listaPiscinas.size(); i++){
                if(listaPiscinas.get(i).equals(piscina)){
                    return listaPiscinas.get(i);
                }
            }
        }
            
        return null;
    }
    
}
