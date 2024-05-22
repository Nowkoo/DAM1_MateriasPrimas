package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class LeerCSV {
    public static ArrayList<MateriaPrima> materiasPrimas = new ArrayList<>();

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

    public static ArrayList<MateriaPrima> getMateriasPrimas() {
        return materiasPrimas;
    }
}
