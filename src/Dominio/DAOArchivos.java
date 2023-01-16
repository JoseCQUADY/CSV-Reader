
package Dominio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class DAOArchivos {
    private BufferedReader reader = null;
    private String line = null;
    private String parts[] = null;
    
    public void archiveReader(String archivo) throws FileNotFoundException, IOException{
        reader = new BufferedReader(new FileReader(archivo));
        while((line = reader.readLine()) != null){
            parts = line.split(",");
            for (int i = 0; parts.length > i; i++ ) {
                System.out.print(parts[i] + "  |  ");
            }
             System.out.println();
        }
        reader.close();
        line= null;
        parts = null;
    }
    
}
