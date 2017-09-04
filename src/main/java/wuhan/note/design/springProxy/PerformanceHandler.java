package wuhan.note.design.springProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler{
	 private Object target; 
	 public PerformanceHandler(Object target) {
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
