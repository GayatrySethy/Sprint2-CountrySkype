package CountriesSkype;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
public class GETCountry {

	@Test
	public void GetUsers() {
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.queryParam("page","2").get();
		
		
		ResponseBody body=response.getBody();
		System.out.println("Response Body is: "+body);
		System.out.println("Status recieved is: "+response.getStatusLine());
		
		int statusCode=response.getStatusCode();
		Assert.assertEquals("Correct stauts code returned", 200, statusCode);
		
		String statusLine=response.getStatusLine();
		Assert.assertEquals("Correct status line returned", "HTTP/1.1 200 OK",statusLine);
		
		Headers allHeaders=response.headers();
		System.out.println("------------------------");
		for(Header h:allHeaders) {
			System.out.println("Key: "+h.getName()+" Value: "+h.getValue());
		}
		System.out.println("-----------------------------");
		
		String contentType=response.header("Content-Type");
		System.out.println("Content-Type value: "+contentType);
		Assert.assertEquals("application/json; charset=utf-8", contentType);
		Assert.assertEquals(statusLine, contentType);
		String serverType=response.header("Server");
		System.out.println("Server value: "+serverType);
		Assert.assertEquals("cloudflare", serverType);
		
		String acceptLang=response.header("Content-Encoding");
		System.out.println("Content-Encoding"+acceptLang);
		
	}
}