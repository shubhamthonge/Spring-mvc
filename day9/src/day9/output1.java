package day9;

public class output1 {

	public static void main(String[] args) {
		Zudio z=new Zudio(12);	
		z.man();
		z.women();
		z.kids();
		
		System.out.println("-----inside Zara class------");	
		Zara s=new Zara(15);
		s.man();
		s.women();
		s.kids();
		s.returns();
	}
}
