package day9;

public abstract class Cloths {
	 
	int discount;
	
 
	public Cloths(int discount) {
		this.discount=15;
		
        System.out.println(discount);
	}
	public void man() {
		
		System.out.println("mans cloths");	

	}
	public int women() {
		System.out.println("womens cloths");	

		return 0;
	}
	public  abstract String kids();
}
