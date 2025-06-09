package exercicis;

import classes.Criatura;
import java.util.*;

public class Exercici_01_apartat_B {

    public static void main(String[] args) {

        Criatura[] poblacio = {
                new Criatura("NIL", 0, Criatura.NEN),
                new Criatura("EVA", 1, Criatura.NENA),
                new Criatura("CARLES", 0, Criatura.NEN),
                new Criatura("ONA", 1, Criatura.NENA),
                new Criatura("DÍDAC", 0, Criatura.NEN),
                new Criatura("NIL", 1, Criatura.NEN),
                new Criatura("EVA", 3, Criatura.NENA),
                new Criatura("JORDI", 2, Criatura.NEN),
                new Criatura("ENIA", 3, Criatura.NENA)
        };

        List elsNens, lesNenes;
        elsNens = new LinkedList();
        lesNenes = new ArrayList();

         /* APARTAT B: poseu tots els nens de la taula població a la llista
          	elsNens i totes les nenes a la llista lesNenes.
          	Després calculeu l'edat mitjana dels nens i l'edat mitjana de les
          	nenes, iterant sobre les llistes emplenades en el pas anterior. 
          	Per tal d'iterar sobre les llistes, utilitzeu els seus mètodes get */
         double sumaEdatNens = 0; // per calcular la mitjana d'edat dels nens
        double sumaEdatNenes = 0; // per calcular la mitjana d'edat de les nenes
    
        for (Criatura criatura : poblacio){
            if (criatura.getSexe()== Criatura.NEN)
                elsNens.add(criatura);
            sumaEdatNens += criatura.getEdad();
            else{
                lesNenes.add(criatura);
                sumaEdatNenes+=criatura.getEdad();
            }
        }

        double mitjana = sumaEdatNens + sumEdatNenes / poblacio.length;

       

        /* ... poseu la vostra solució a partir d'aquí */
        for (int i = 0; i < poblacio.length; i++) {
            if(poblacio[i].getSexe() == Criatura.NENA) {
                lesNenes.add(poblacio[i]);
                sumaEdatNenes += poblacio[i].getEdat();
            } else {
                elsNens.add(poblacio[i]);
                sumaEdatNens += poblacio[i].getEdat();
            }
        }

        // donar el resultat
        System.out.println();
        System.out.println("L'edat mitjana dels nens és: " + sumaEdatNens / elsNens.size());
        System.out.println("L'edat mitjana de les nenes és: " + sumaEdatNenes / lesNenes.size());
        System.out.println();

    }
}
