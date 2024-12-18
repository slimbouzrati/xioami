package Polymorphisme;

public class Dog implements Animal{

	@Override
	public void voyager() {
		// TODO Auto-generated method stub
		System.out.println("le chien peut voyager");
	}

	@Override
	public void manger() {
		// TODO Auto-generated method stub
		System.out.println("le chien peut manger");
	}

	@Override
	public void boire() {
		// TODO Auto-generated method stub
		System.out.println("le chien peut boire");
	}

}
