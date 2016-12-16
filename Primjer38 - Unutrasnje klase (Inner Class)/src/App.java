/*
 * Mr. Robot primjer
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robot = new Robot(7);
		robot.start();
		
		/* Robot.Brain se ne moze instancirati posto je private
		 * 
		Robot.Brain brain = robot.new Brain();
		brain.think();
		*/
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}

}

/*
 * Zadatak:
 * 
 * Kreirati unutrasnju klasu klase Robot
 * 1. Eye (oko) - klasa ima javnu metodu watch() koja ispisuje "Posmatranje.." na konzolu
 * 2. Nakon kreiranja robota treba inicijalizovati dva oka i pokrenuti metodu za posmatranje "progledati"
 *
 */