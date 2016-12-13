// Klasa Person...
class Person {
 
	// Klasa ima dva atributa, ime i godine
    String name;
    int age;
     
    // Klasa ima vise funkcija
    
    /*
     * Funkcija speak() ima parametar void 
     * void - ne vraca vrijednost
     */
    void speak() {
        for(int i=0; i<3; i++) {
            System.out.println("Moje ime je: " + name + " i ja imam " + age + " godina. ");
        }
    }
     
    void sayHello() {
        System.out.println("Pozdrav svima!");
    }
}

/*
 * Primjeri nasljedjivanja
class Student extends Person {
	String index;
}

class Profesor extends Person {
	String radnaKnjizica;
	boolean zaposlen;
}

class Izvjestaj {
 int id;
 String datum;
}

class IzvjestajSaIspita extends Izvjestaj {
	int ocjena;
	Student student;
	Profesor profesor;
}
*/



 
public class App {
 
    public static void main(String[] args) {
    	/*
    	 * Primjeri koji sljede
    	IzvjestajSaIspita izvjestaj = new IzvjestajSaIspita();
    	izvjestaj.profesor.name = "Goran";
    	izvjestaj.student.name = "Marko";
    	izvjestaj.datum = "21.01.2016";
    	izvjestaj.ocjena = 7;
    	 */
        Person person1 = new Person();
        person1.name = "Marko Javic";
        person1.age = 37;
        person1.speak();
        person1.sayHello();
 
        Person person2 = new Person();
        person2.name = "Goran Eclipsic";
        person2.age = 20;
        person2.speak();
        person2.sayHello();
 
        System.out.println(person1.name);
 
    }
 
}