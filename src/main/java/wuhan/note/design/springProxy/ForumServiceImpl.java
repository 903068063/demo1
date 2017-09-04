package wuhan.note.design.springProxy;

public class ForumServiceImpl implements ForumService{

	@Override
	public void removeTopic(int topicId) {
		System.err.println("模拟删除Topic记录:"+topicId);  
        try {  
            Thread.currentThread().sleep(20);  
        } catch (Exception e) {
            throw new RuntimeException(e);  
        }  
	}

}
