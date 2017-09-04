package wuhan.note.design.springProxy;

import java.lang.reflect.Proxy;

public class MainText {
	public static void main(String[] args) {
	/*	 ForumService target = new ForumServiceImpl();//被代理的类
		 PerformanceHandler handler = new PerformanceHandler(target);//代理类
		 ForumService proxy = (ForumService)
		 Proxy.newProxyInstance(target.getClass().getClassLoader(),
		 target.getClass().getInterfaces(), handler);
		 proxy.removeTopic(1);
*/
		CglibProxy proxy = new CglibProxy();
		ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
		forumService.removeTopic(1023);
	}
}
