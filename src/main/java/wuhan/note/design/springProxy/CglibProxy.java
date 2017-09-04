package wuhan.note.design.springProxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();

	public Object getProxy(Class clazz) {
		enhancer.setSuperclass(clazz); //设置需要创建子类的类
		enhancer.setCallback(this);
		return enhancer.create(); //通过字节码技术动态创建子类实例
	}

	// ③拦截父类所有方法的调用
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.err.println("开始");
		Object result = proxy.invokeSuper(obj, args);
		System.err.println("结束");
		return result;
	}
}
