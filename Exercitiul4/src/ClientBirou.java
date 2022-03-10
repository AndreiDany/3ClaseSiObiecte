
public class ClientBirou {

	public static void main(String[] args) {
		
		Sertar s1 = new Sertar(2,4,2);
		Sertar s2 = new Sertar(2,4,2);
		Birou b = new Birou(5,9,5,s1,s2);
		b.Tipareste();
	}

}
