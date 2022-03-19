public class main {
    public static void main(String args[]) {

        int wysokosc = 10;

        for (int wiersz = 0; wiersz <= wysokosc; wiersz++) {
            for (int wciecie = 0; wciecie < wysokosc - wiersz; wciecie++) {
                System.out.print(' ');
            }

            for (int gwiazdka = 0; gwiazdka < wiersz * 2 - 1; gwiazdka++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int l = 0; l < wysokosc - 1; l++) {
            System.out.print(" ");
        }
        System.out.print("*");
    }
}