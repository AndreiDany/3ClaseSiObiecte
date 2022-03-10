
public class Birou {
	
	private Sertar s1, s2;
	private int l, L, H;

	public Birou(int l, int L, int H, Sertar s1, Sertar s2) {
		this.l = l;
		this.L = L;
		this.H = H;
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void Tipareste()
	{
		System.out.println("Birou "+l+" "+L+" "+H);
		s1.Tipareste();
		s2.Tipareste();
	}

}
