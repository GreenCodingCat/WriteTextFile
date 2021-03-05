
package writetextfile;

import java.util.Scanner;
import java.io.*;

public class WriteTextFile {

    
    public static void main(String[] args)throws IOException {
        
        Scanner probe = new Scanner(new File("F:\\numbers.txt"));
        PrintWriter pen = new PrintWriter(new File("F:\\Newnumbers.txt"));        
        int number = 0;
        
        while (probe.hasNext()){
            number = probe.nextInt();
            
            if (number != 0){
                pen.print(number + " ");
            }
            
        }
        
        System.out.println("The operation is complete!");
        
        pen.close();
        
    }
    
}
