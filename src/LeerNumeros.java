import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerNumeros {
    //Método para leer los números
    public static void leer(String fichero){
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e){
            System.out.println("Error al leer el archivo. --> " + e.getMessage());
        }
    }
}
