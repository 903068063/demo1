package wuhan.note.design.factory;

import java.util.concurrent.Callable;

public interface TaskFactory {
	public abstract <T> Callable<T> create();
}
