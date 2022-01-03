package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		double p = 3.14;
		Rectangle a1 = new Rectangle();
		a1.setLength(10);
		a1.setWidth(16);
		a1.setPloscha(10*16);
		a1.setPerymetr((10+16)*2);
		Rectangle a2 = new Rectangle();
		a2.Width();
		a2.Length();
		a2.Ploscha();
		a2.Perymetr();
		System.out.println(a1);
		System.out.println(a2);
		Circle a3 = new Circle();
		a3.setRadius(12);
		a3.setDiametr(3);
		a3.setPloscha1((p*3*3)/4);
		a3.setDovzhyna(2*p*12);
		System.out.println(a3);
	} 

}
