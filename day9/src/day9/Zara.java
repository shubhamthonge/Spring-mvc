package day9;

public class Zara extends Cloths{

	public Zara(int discount) {
		super(discount);
		System.out.println(discount+5);

	}

	@Override
	public String kids() {
		System.out.println("kids cloths");
		return null;
	}

	public void returns() {
		System.out.println(" no returns policy");
	}
}
