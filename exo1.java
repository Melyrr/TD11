public class exo1 {
    public static void main(String[] args) {
        int[] tab = { 2, 5, -3 };
        // System.out.println("taille: " + tab.length);
        // System.out.println("1er élément: " + tab[0]);
        // System.out.println("dernier élément: " + tab[tab.length - 1]);
        // System.out.println("autre élément: " + tab[2]);
        // System.out.println("affiche un drôle de truc: " + tab);
        afficherTab(tab);
        multiplier(tab, -2);
        afficherTab(tab);
        incrémenter(tab);
        afficherTab(tab);
    }

    static void afficherTab(int[] tab) {
        for (int valeur : tab) {
            System.out.print(valeur + " ");
        }
        System.out.println();
        System.out.println("----------------");
    }

    static void incrémenter(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }

    static void multiplier(int[] tab, int valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] * valeur;
        }
    }
}