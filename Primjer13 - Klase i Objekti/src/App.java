class Student {
	
	String ime;
	String prezime;
	String brojIndeksa;
	int godinaStudija;
	boolean aktivanStudent;
	boolean vanredniStudent;
	
}

// Naziv klase
class Person {
     
    // Atributi klase
    String name;
    int age;
     
     
    /* Klase mogu sadrzavati
     * - atribute
     * - metode
     */
}
 
// Glavna public klasa se mora zvati kao fajl
public class App {
 
    public static void main(String[] args) {
         
        String ime;
        Person osoba1;
        
        ime = "milan";
        osoba1 = new Person();
        
        osoba1.name = "neko ime";
        osoba1.age = 14;
        
        // U jednoj liniji koda
        Person nekaNovaOsoba = new Person();
    	
        // Kreiramo objekat person1 tipa klase Person
        Person person1 = new Person();  
        person1.name = "Marko Javic";
        person1.age = 37;
         
        // Kreiramo jos jedan objekat tipa klase Person
        Person person2 = new Person();
        person2.name = "Goran Eclipsic";
        person2.age = 20;
         
        System.out.println(person1.name);
         
    }
 
}

/*
 * Zadatak:
 * 1. Kreirati klasu Student
 * 2. Kreirati dva objekta (kreirati dvije instance) klase Student
*/