package wuhan.note.design.factory;

import java.util.concurrent.Callable;

public class Afactory implements TaskFactory {

	@SuppressWarnings("unchecked")
	@Override
	public  Callable<String> create() {
		return new ATask();
	}

}
