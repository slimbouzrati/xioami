package calcul;

public class ExecCalcul {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Calculatrice casio = new Calculatrice();
		int c = casio.multiply(7, 8);
		System.out.println(c);
		
		double r = casio.racine(14);
		System.out.println(r);
		
		int s = casio.somme(5, 17);
		System.out.println(s);
	}

}
