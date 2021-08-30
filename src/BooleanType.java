public class BooleanType {
    public static void main(String[] args) {
        boolean isTall = false;
        int height = 120;

        isTall = height >= 180;
        System.out.println("czy osoba jest wysoka: " + isTall);

        String isVeryTall = height > 185 ? "Jestes bardzo wysoki" : "Nie jestes bardzo wysoki";
        System.out.println(isVeryTall);
    }
}
