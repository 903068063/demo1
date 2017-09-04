package wuhan.note.design.proxy;

public class OnePerson implements Person{

	@Override
	public void orderFood() {
		System.err.println("我自己要吃饭");
	}

}
