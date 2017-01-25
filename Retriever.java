package dog;

public class Retriever extends Dog {
	public Retriever (int a, String b, String v){
		super(a, b, v);
	}
	public void fetch(){
		System.out.println("drops bird at your feet");
	}

}
