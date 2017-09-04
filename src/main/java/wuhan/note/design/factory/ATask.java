package wuhan.note.design.factory;

import java.util.concurrent.Callable;

public class ATask implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.err.println("String   ATask");
		return "String   ATask";
	}

}
