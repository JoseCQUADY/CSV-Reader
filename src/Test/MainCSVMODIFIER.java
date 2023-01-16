
package Test;

import Dominio.DAOArchivos;
import java.io.IOException;


public class MainCSVMODIFIER {

   
    public static void main(String[] args) throws IOException {
      DAOArchivos archivo = new DAOArchivos();
      String Archivo = "C:\\Users\\You\\Desktop\\Libro1.csv";
      archivo.archiveReader(Archivo);
      
    }
    
}
