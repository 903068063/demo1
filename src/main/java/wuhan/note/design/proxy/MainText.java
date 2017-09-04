package wuhan.note.design.proxy;

import java.lang.reflect.Proxy;


public class MainText {
	public static void main(String[] args) {
		OnePerson on=new OnePerson();
		Person meituan=new Meituan(on);
		ELema el=new ELema(on);
		Person proxy = (Person) Proxy.newProxyInstance(on.getClass().getClassLoader(), on.getClass().getInterfaces(), el);
		proxy.orderFood();
	}
}
