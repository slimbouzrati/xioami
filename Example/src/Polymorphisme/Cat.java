package Polymorphisme;

public class Cat implements Animal{

	@Override
	public void voyager() {
		// TODO Auto-generated method stub
		System.out.println("le chat peut voyager");
	}

	@Override
	public void manger() {
		// TODO Auto-generated method stub
		System.out.println("le chat peut manger");
	}

	@Override
	public void boire() {
		// TODO Auto-generated method stub
		System.out.println("le chat peut boire");
	}

}
