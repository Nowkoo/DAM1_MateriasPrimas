package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class LeerCSV {

    public static ArrayList<MateriaPrima> materiasPrimas = new ArrayList<>();
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


        for (int i = 0; i < materiasPrimas.size(); i++) {


            if (materiasPrimas.get(i).comprobar(componentesUsuarios)){
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }

    public static void cargarDatosCSV(){

        try {
            BufferedReader f_ent = new BufferedReader(new FileReader(new File("./src/Model/materiasprimas.csv")));

            String linea = f_ent.readLine();


            while (linea != null){

                String[] dividir = linea.split(",");

                String nombreMateria = dividir[0];
                ArrayList<Componente> componentes = new ArrayList<>();

                for (int i = 1; i < dividir.length; i+= 3) {

                    Componente componente = new Componente(dividir[i],Float.parseFloat(dividir[i+1]),
                            Float.parseFloat(dividir[i+2]) );

                    componentes.add(componente);

                }

                MateriaPrima materiaPrima= new MateriaPrima(nombreMateria,componentes);
                materiasPrimas.add(materiaPrima);

                linea = f_ent.readLine();

            }


        }catch (IOException e){
            System.out.println(e.getMessage());

        }




    }


}
