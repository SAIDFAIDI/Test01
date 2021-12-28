package heritage;

public class Voiture {
	public String color;
	public boolean dem = true;
	
	
	public Voiture(String color)
	{
		this.color = color ;
	}
	
	public void demarre()
	{
		System.out.println(dem);
		System.out.println(color);
	}
}
