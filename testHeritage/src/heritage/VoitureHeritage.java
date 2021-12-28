package heritage;

public class VoitureHeritage  extends  Voiture{
	
    public VoitureHeritage(String color)
    {
    	super(color);
    }
	public void demarre()
	{
		super.demarre();
		System.out.println("plus voitureheritage");
	}
	public void affichage()
	{
		System.out.println("haak dem "+dem);
	}
}
