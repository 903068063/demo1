package wuhan.note.design.decorator;

public abstract class Condiment extends Humburger {
	private Humburger humburger;

	public Condiment(Humburger humburger) {
		this.humburger = humburger;
	}

	public abstract String getName();
}
