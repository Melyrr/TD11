public class exo3 {
    public static void main(String[] args) {
        String[] mots = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
        afficheTableau(mots);
        afficherTailles(mots);
    }

    static void afficheTableau(String[] mots) {
        for (String mot : mots) {
            System.out.print(mot + " ");
        }
        System.out.println();
    }

    static void afficherTailles(String[] mots) {
        for (String mot : mots) {
            System.out.print(mot.length() + " ");
        }
    }
}
