public class Wejsciowka1 {
    public static void main(String args[]) {

        System.out.println(sum(new String[]{"3","2","7"}));
    }

    public static String sum(String[]ar){
        int suma = 0;

        for(int i = 0; i < ar.length; i++) {
            suma = suma + Integer.parseInt(ar[i]);
        }

       return String.valueOf(suma);
    }

}
