package wuhan.note.design.decorator;

public class Chilli extends Condiment {
	Humburger humburger;

	public Chilli(Humburger humburger) {
		super(humburger);
		this.humburger = humburger;
	}

	@Override
	public String getName() {
		return humburger.getName()+" 加辣椒";
	}

	@Override
	public double getprice() {
		return humburger.getprice()+2;
	}

}
