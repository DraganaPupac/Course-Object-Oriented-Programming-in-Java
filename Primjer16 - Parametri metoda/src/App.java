class Frog {
    private String name;
    private int age;
     
    public void setName(String name) {
        this.name = name;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
     
    public String getName() {
        return name;
    }
     
    public int getAge() {
        return age;
    }
     
    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}
 
public class App {
 
    public static void main(String[] args) {
     
        Frog frog1 = new Frog();
         
        frog1.setName("Zabac");
        frog1.setAge(1);
         
        System.out.println(frog1.getName());
    }
 
}

/*
 * Zadatak:
 * 
 * 1 - Zaba treba da ima i atribut koji opisuje njenu boju
 * 2 - Kreirati jos jedan objekat 
 * 3 - Iskoristiti funkciju setInfo (inicijalizovati novi objekat pomocu ove funkcije), npr. frog2.setInfo...
 * 4 - Napisati funkciju makeSound() koja "ispisuje zvuk na konzolu"
 * 
 * Napomena: Kada napravite treci atribut, potrebno je prosiriti funkciju setInfo sa novim atributom
 */