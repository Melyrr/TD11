import java.util.Arrays;

public class exo5 {
    public static void main(String[] args) {
        int[] tableau = { 1, 2, 3, 4, 5 };
        affichertableau(tableau);
        int[] copie1 = copie(tableau);
        int[] copie2 = pasUneCopie(tableau);
        System.out.print("tableau: ");
        affichertableau(tableau);
        System.out.println("Miroir");
        miroir(tableau);
        // System.out.print("copie1: ");
        // afficherTab(copie1);
        // System.out.print("copie2: ");
        // afficherTab(copie2);
    }

    static int[] copie(int[] tableau) {
        int[] copie = new int[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            copie[i] = tableau[i];
        }
        return copie;
    }

    static int[] pasUneCopie(int[] tableau) {
        int[] copie = tableau;
        return copie;
    }

    static void affichertableau(int[] tableau) {
        for (int element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static int[] miroir(int[] tableau) {
        for (int i = 0; i < tableau.length / 2; i++) {
            int e = tableau[i];
            tableau[i] = tableau[tableau.length - i - 1];
            tableau[tableau.length - i - 1] = e;
        }
        System.out.println(Arrays.toString(tableau));
        return tableau;
    }
}