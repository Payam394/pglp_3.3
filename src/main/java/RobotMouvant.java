
public class RobotMouvant extends Robot{

	public RobotMouvant(Position position) {
		super(position);
	}
	
	

	public void avance () {
		switch (getDirection()) {
		 
		 case up :
			 this.position.y +=10;
		 
		 case left :
			 this.position.x -=10;
		 
		 case down :
			 this.position.y -=10;
			 
		 case right :
			 this.position.x +=10;
		 }
	}
	
	

	public void tourne () {				// tourner 90˚ a gauche
		 switch (getDirection()) {
		 
		 case up :
			 setDirection(Direction.left);
		 
		 case left :
			 setDirection(Direction.down);
		 
		 case down :
			 setDirection(Direction.right);
			 
		 case right :
			 setDirection(Direction.up);
		 }
	 }
	
	

}
