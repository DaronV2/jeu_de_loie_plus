package fr.louis.daron;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        boolean resultat = false;
        int nbreDexe = 0;
        while (resultat == false) {
            Random generateur = new Random();
            int nbreDeCasesRest = 20;
            int caseEndroit = 0;

            /*
             * for(int i = 1; i <= 5; i++){
             * int lancer = generateur.nextInt(6) + 1;
             * caseEndroit += lancer;
             * nbreDeCasesRest = nbreDeCasesRest - lancer;
             * System.out.println("Lancer "+ i +" : Vous avez fait " + lancer +
             * ". Vous etes sur la case " + caseEndroit + " (encore " + nbreDeCasesRest +
             * " cases)" );
             * }
             */

            nbreDeCasesRest = jouerPartie(generateur, caseEndroit, nbreDeCasesRest);
            nbreDexe += 1;

            /*
             * if (nbreDeCasesRest != 0){
             * System.out.println("Vous avez perdu ! ");
             * nbreDexe += 1;
             * }else{
             * System.out.println("Vous avez gagné ! ");
             * nbreDexe += 1;
             * resultat = true;
             * System.out.println("Vous avez effectué "+ nbreDexe +
             * " execution(s) avant de gagner");
             * }
             */
            resultat = resultat(nbreDeCasesRest, nbreDexe, resultat);
        }
    }

    public static int jouerPartie(Random generateur, int caseEndroit, int nbreDeCasesRest) {
        for (int i = 1; i <= 5; i++) {
            int lancer = generateur.nextInt(6) + 1;
            caseEndroit += lancer;
            nbreDeCasesRest = nbreDeCasesRest - lancer;
            System.out.println("Lancer " + i + " : Vous avez fait " + lancer + ". Vous etes sur la case " + caseEndroit
                    + " (encore " + nbreDeCasesRest + " cases)");

        }
        return nbreDeCasesRest;
    }

    public static boolean resultat(int reste, int nbreExec, boolean res) {
        if (reste != 0) {
            System.out.println("Vous avez perdu ! ");
        } else {
            System.err.println("Vous avez gagné ! ");
            res = true;
            System.out.println("Vous avez effectué " + nbreExec + " execution(s) avant de gagner");
        }
        return res;
    }
}
