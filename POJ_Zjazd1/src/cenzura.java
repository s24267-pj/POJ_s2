public class cenzura {
    public static void main(String args[]) {
        int a = 0;
        String cenzor = "k*o ma m*je l*tery!";
        String decenzor = "toi";
        char[] A_cenzor = cenzor.toCharArray();
        char[] A_decenzor = decenzor.toCharArray();

        System.out.println(cenzor);
        System.out.println(decenzor);
        System.out.println("");

        for (int i = 0; i < cenzor.length(); i++) {
            if (A_cenzor[i] == '*') {
                A_cenzor[i] = A_decenzor[a];
                a++;
            }
        }

        System.out.println("Zdanie po odszyfrowaniu: ");

        for (int i = 0; i < cenzor.length(); i++) {

            System.out.print(A_cenzor[i]);
        }
    }
}
