public class exemple2 {
    public static void main(String[] args) {
        String[] mots = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
        for (String mot : mots) {
            System.out.print(mot + " ");
        }
        System.out.println();
        afficheTableau(mots);
    }

    static void afficheTableau(String[] mots) {
        for (String mot : mots) {
            System.out.print(mot + " ");
        }
        System.out.println();
    }
}
