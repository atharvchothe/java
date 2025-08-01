interface A{
	public void calcarea();// abstract class dose not have  body
}
 class B implements  A{
	private int lenght;
	private int weight;
	 
	public final  void calcarea() 
	{
		lenght=10;
		weight=2;
		int area= lenght*weight;
		System.out.println("area : "+area);
	}
}
public class Interface {

	
	public static void main(String[] args) {
		B a = new B();
		a.calcarea();

	}

}
