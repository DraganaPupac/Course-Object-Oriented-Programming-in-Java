package demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
 
 
 
public class App {
 
    @SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args)  {
         
    	String fajl = "test.txt";
        File file = new File(fajl);
         
        try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Greska: fajl " + fajl + "ne postoji na sistemu." );
			System.out.println("Vise detalja / report : ");
			System.out.println("----------------------------------------------------");
			e.printStackTrace();
			System.out.println("----------------------------------------------------");
			
		}
    }
 
}