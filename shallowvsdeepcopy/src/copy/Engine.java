package copy;

public class Engine
{
	private static int idGen = 1000;

	private int id;
	private String manufacturer;
	private boolean broken;


	public Engine(String manufacturer)
	{
		this.id = idGen;
		idGen++;
		this.manufacturer = manufacturer;
		this.broken = false;
	}

	// Note: primitive fields are not stored as references so you do not
	// have to worry about shallow versus deep memory copies
	public Engine(Engine other){
		this.id = other.id;
		this.manufacturer = other.manufacturer;
		this.broken = other.broken;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public int getId() {
		return id;
	}
	public boolean isBroken() {
		return broken;
	}
	public void breakEngine()
	{
		broken = true;
	}
	
	public void fixEngine()
	{
		broken = false;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString()
	{
		return "Engine [id=" + getId() +", manufacturer=" + getManufacturer() +  ", broken=" + isBroken() + "]";
	}
}
