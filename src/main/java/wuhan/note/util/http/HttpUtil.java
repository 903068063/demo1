package wuhan.note.util.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpUtil {
	/**
	 * 带参数头的请求
	 * @param url请求链接
	 * @param body请求内容
	 * @param headerMap请求头参数
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static String postHeader(String url, String body, Map<String, String> headerMap) throws ClientProtocolException, IOException {
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost method = new HttpPost(url);
		HttpResponse result;
		String resData = "";
		StringEntity entity = new StringEntity(body, "utf-8");
		entity.setContentEncoding("UTF-8");
		entity.setContentType("application/json");
		method.setEntity(entity);
		for (String key : headerMap.keySet()) {
			method.setHeader(key, headerMap.get(key));
		}
		result = httpClient.execute(method);
		resData = EntityUtils.toString(result.getEntity());
		return resData;
	}
}
