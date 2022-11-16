public class exo4 {
    public static void main(String[] args) {
        String[] mots = { "the", "quick", "brown", "fox",
                "jumps", "over", "the", "lazy", "dog" };
        afficheTableau(mots);
        plusLongMot(mots);
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

    static String plusLongMot(String[] mots) {
        int grand = 0;
        String plusGrand = "a";
        for (String mot : mots) {
            if (mot.length() > grand) {
                grand = mot.length();
                plusGrand = mot;
            }
        }
        System.out.println(plusGrand);
        return null;
    }
}
