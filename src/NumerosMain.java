public class NumerosMain {
    public static void main(String[] args) {
        String fichero = "numeros.txt";

        //Llamar a los métodos
        EscribirNumeros.escribir(fichero);
        LeerNumeros.leer(fichero);
    }
}
