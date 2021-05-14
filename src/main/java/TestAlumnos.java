
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandi
 */
public class TestAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AlumnoPrimaria panchito=new AlumnoPrimaria('H', 12, "Francisco", 6);
        AlumnoPrimaria Gabi=new AlumnoPrimaria('M', 10, "Gabriela", 4);
        Gabi.presentacion();
        Gabi.randomGrado();
        Gabi.grado();
        Gabi.toString();
        AlumnoLicenciatura Armando=new AlumnoLicenciatura('H', 20, "Armando", 4, "Ingenieria", "computacion");
        AlumnoMaestria Teofilo=new AlumnoMaestria('H', 26, "Teofilo", 2, 3, "gestion empresas");
        AlumnoDoctorado Roberto=new AlumnoDoctorado('H',30, "Roberto", 1, 6, "Ondas y particulas");
        System.out.println("con ARRAYS");
        ArrayList<Alumnos> misAlumnos=new ArrayList <Alumnos>();
        misAlumnos.add(Gabi);
        misAlumnos.add(panchito);
        misAlumnos.add(Armando);
        misAlumnos.add(Teofilo);
        misAlumnos.add(Roberto);
        for(Alumnos a:misAlumnos)
        {
            a.grado();
            System.out.println(a.toString());
        }
        
    }
    
}
