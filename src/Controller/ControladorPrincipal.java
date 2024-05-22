package Controller;

import Model.MateriaPrima;

import java.util.HashMap;

import static Model.LeerCSV.cargarDatosCSV;
import static Model.LeerCSV.materiasPrimas;

public class ControladorPrincipal {

    public static void main(String[] args) {

        cargarDatosCSV();

        HashMap<String, Float> componentesUsuarios = new HashMap<>();

        componentesUsuarios.put("sio2",63f);
        componentesUsuarios.put("al2o3",24f);
        componentesUsuarios.put("fe2o3",1.2f);
        componentesUsuarios.put("cao",0.8f);
        componentesUsuarios.put("mgo",0.4f);
        componentesUsuarios.put("na2o",0.4f);
        componentesUsuarios.put("k2o",2.6f);
        componentesUsuarios.put("tio2",1.3f);
        componentesUsuarios.put("ppc",6.8f);


    }

    public static MateriaPrima comprobarMaterias(HashMap<String,Float> componenteUsuario){

        for (int i = 0; i < materiasPrimas.size(); i++) {

            if (materiasPrimas.get(i).esMateriaPrima(componenteUsuario)){
                System.out.println("True");
                return  materiasPrimas.get(i);
            }
        }
        System.out.println("False");
        return null;
    }



}
