import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirNumeros {
    //Método para escribir los números
    public static void escribir(String fichero) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(fichero))){
            for (int i = 1; i <= 10; i++) {
                br.write(i + " ");
            }
        } catch (IOException e) {
            System.out.println("Error: No se pudo escribir en el archivo --> " + e.getMessage());
        }
    }
}
