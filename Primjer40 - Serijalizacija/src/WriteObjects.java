import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * Zadatak:
 * 
 * 1. Napraviti novu klasu Machine, sa atributima id, name (String), status (int), working (true/false)
 * 2. Kreirati dva objekta tipa Machine
 * 3. Serijalizovati objekte
 * 4. Deserijalizovati objekte unutar ReadObjects.java primjera
 */

public class WriteObjects {
	
		public static void main(String[] args) {
			System.out.println("Writting objects...");
			
			Person mike = new Person(543, "Mike");
			Person sue = new Person(123, "Sue");
			
			System.out.println(mike);
			System.out.println(sue);
			
			// Sve do ovog momenta, nije se dogodila serijalizacija..
			
			try(FileOutputStream fs = new FileOutputStream("people.bin")) {
			
				ObjectOutputStream os = new ObjectOutputStream(fs);
				
				os.writeObject(mike);
				os.writeObject(sue);
				
				os.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

}
