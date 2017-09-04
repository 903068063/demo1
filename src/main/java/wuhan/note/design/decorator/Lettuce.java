package wuhan.note.design.decorator;

public class Lettuce extends Condiment{
	Humburger humburger;
	public Lettuce(Humburger humburger) {
		super(humburger);
		this.humburger=humburger;
	}
	@Override
	public String getName() {
		 return humburger.getName()+" 加生菜";    
	}
	@Override
	public double getprice() {
		return humburger.getprice()+1;
	}

}
