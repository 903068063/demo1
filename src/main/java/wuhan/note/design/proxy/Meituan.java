package wuhan.note.design.proxy;

public class Meituan implements Person {

	private Person oneperson;

	public Meituan() {

	}

	public Meituan(Person oneperson) {
		this.oneperson = oneperson;
	}

	@Override
	public void orderFood() {
		oneperson.orderFood();
	}
}
