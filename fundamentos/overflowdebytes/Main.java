package fundamentos.overflowdebytes;

public class Main {
    public static void main(String[] args) {
        int n = 260;
        byte _n = (byte) n;

        // O programa imprimirá 4 pois o mesmo estaŕa percorrendo os valores do byte pela 2 vez.
        System.out.println(_n);
    }
}
