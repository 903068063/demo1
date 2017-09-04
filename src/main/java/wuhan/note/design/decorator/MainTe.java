package wuhan.note.design.decorator;

public class MainTe {
	public static void main(String[] args) {
		Humburger humburger = new ChickenBurger();
		Lettuce lettuce = new Lettuce(humburger);
		Chilli chilli2 = new Chilli(lettuce);
		System.out.println(chilli2.getName()+"  价钱："+chilli2.getprice());
	}
}
