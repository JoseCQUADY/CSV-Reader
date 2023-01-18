
package Dominio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Archivos {
    
    public void LeerCSV(String url) throws FileNotFoundException, IOException {

        try (DataInputStream entrada = new DataInputStream(new FileInputStream(url))) {
            Archivos a = new Archivos();
            a.getRecords(entrada);
        }
    }
    
    public String[][] getRecords(DataInputStream entrada) throws IOException{
        int i=0;
        String linea = null; 
        String[][] datos = new String[0][];
        
            while ((linea = entrada.readLine()) != null) {
                ++i;
                String[][] datosn = new String[i][2];
                String strar[] = linea.split(";");
                datosn[i-1] = strar;
                System.arraycopy(datos, 0, datosn, 0, i-1 );
                datos = datosn;

            }
            for (String[] strings : datos) {
                for (String string : strings) {
                    System.out.print("\t" + string);
        }
                System.out.println();
        }
            return datos;
    }
        

   
    }
