package letskode;

public abstract class AbstractCars {
	
	private int privateSpeed;
	public int publicSpeed;
	
	protected int protectedSpeed;
	
	int speedLimit = 100 ;
	
	public AbstractCars () {
		this(0);
	}
	
	public AbstractCars (int startSpeed) {
		privateSpeed = startSpeed;
	}
	
	public void setPrivateSpeed(int pSpeed) {
		privateSpeed = pSpeed;
	}
	
	public abstract void engineStart(String keyType, int numOfCyl);
}
