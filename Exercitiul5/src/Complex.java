
public class Complex {

	private double a;
	private double b;
	private static int contor=0;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
		contor++;
	}
	
	public double Modul()
	{
		double modul = Math.sqrt((a*a+b*b));
		return modul;
	}

	public void Afisare()
	{
		System.out.println(a+" + i*"+b);
	}
	
	public Complex Suma(Complex z)
	{
		Complex S = new Complex(z.a, z.b);
		S.a = S.a + a;
		S.b = S.b + b;
		return S;
	}
	
	public int ContorComplexe()
	{
		return contor;
	}
	
	
}
