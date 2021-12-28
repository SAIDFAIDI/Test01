package heritage;

public class VoitureTest {

	public static void main(String[] args) {
	Voiture v1 = new Voiture("vert");
	VoitureHeritage v2 = new VoitureHeritage("bleu");
	
	v1.demarre();
	v2.demarre();
	}

}
