package wuhan.note.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ELema implements InvocationHandler {
	private Object target;

	public ELema(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.err.println("开始");
		Object obj = method.invoke(target, args);
		System.err.println("结束");
		return obj;
	}
}
