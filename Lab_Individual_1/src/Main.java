import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Main");		
	}
	
	public static PApplet app;

	Logica log;
	
	public void settings () {
		size(1200,700);
	}
	

	public void setup() {
		
		noStroke();
		rectMode(CENTER);
		this.app = this;
		frameRate = 60;
		log = new Logica();
	}
	
	public void draw() {

		log.pintar();
		    
	}
	public void mouseClicked(){
		// log.clickear(pmouseX, pmouseY);

	}
	
	public void mouseMoved(){
		log.moverMouse();
	}
	
	public void keyPressed() {
		
		// log.teclear();
		
	}
	
	
		
	
	
	
	


}
	

