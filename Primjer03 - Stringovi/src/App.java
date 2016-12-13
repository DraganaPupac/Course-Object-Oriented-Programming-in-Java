public class App {
	
	public static void main(String[] args) {
		
		// Deklarisanje niza (niza stringova)
		String[] words = new String[3];
		
		// Unos vrijednosti za string
		words[0] = "Pozdrav, ";
		words[1] = "kako si ";
		words[2] = "ti ?";
		
		// Deklarisanje i definisanje stringa istovremeno
		String[] fruits = {"jabuka", "banana", "jagoda", "kivi", "jagoda" };
		
		// Kratka forma FOR petlje 
		// Ovaj dio se radi tek na sljedecim primjerima, za sada ga usvojiti ovakvog
		for(String fruit : fruits) {
			// Kompletan kod koji obradjuje instancu - fruit
			System.out.println(fruit);
		}
		
		/*
		 * Podsjecanje na konkatenaciju Stringova
		 */
		String ime = "Marko";
		String prezime = "Markovic";
		// Zelimo ispisati ime i prezime
		System.out.println(ime + " " + prezime);
			
		/*
		 * Zadatak:
		 * Napraviti program koji sadrzi NIZ Stringova unutar koga se nalaze
		 * imena i prezimena clanova grupe
		 * Ovaj Niz ispisati petljom.
		 */
	}

}