package leemulta;
import java.io.*;
public class LeeMulta {
    
    public static void main(String[] args)throws IOException {
 
        FileInputStream fichero; 
        BufferedReader buffer;
        
        InputStreamReader isr;
        
          
       fichero = new FileInputStream("E:\\Pandemia\\Programación\\multas-master\\multaa25.txt");
        
        isr = new InputStreamReader(fichero, "UTF8");
        
        buffer = new BufferedReader(isr);
        
        String linea;
        while ((linea = buffer.readLine()) != null) {
            
            /* lee toda una linea y la mostramos */
            
            System.out.println (" > > > "+ linea);
            
            /* pero podemos obtener los datos de la linea por separado */
            
            if (linea.length() != 0) { // filtra líneas en blanco
             String datos[] = linea.split(" +");//el + es para q identifique mas de un caracter en blanco en doc.origen
        // Mostramos los elementos
                System.out.print("Matricula: ");
                System.out.print(datos[1]);
                System.out.print(" fecha: ");
                System.out.println (datos[2]);
                System.out.print(" codigo: ");
                System.out.println (datos[3]);
                System.out.print(" agente: ");
                System.out.println (datos[4]);
                System.out.print(" importe: ");
                System.out.println (datos[5]);
                
            }
           
            }
        
        buffer.close();   /* cerramos el fichero */
    }
}

