package REST.phoneValidation;

import REST.currencies.RequestBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static REST.currencies.CurrenciesTestPack.readJSON;

/**
 * Created by olenka on 09.02.2017.
 */
public class PhoneValidationTestPack {

    public HttpClient client;
    public RequestBuilder request;
    public HttpGet get;
    public HttpResponse response;

    @Before
    public void setStartConditions() {
        client = HttpClientBuilder.create().build();
        request = new RequestBuilder("http://apilayer.net/api/validate");
        request.addParameter("access_key", "26c0ff5e7366504dc185e1f779b84097");
    }

    @After
    public void cleanUp() {
        request = null;
    }

    @Test
    public void checkCorrectPhoneNumber() throws IOException {
        String number = "380958281020";
        request.addParameterWithManyValues("number", new String[]{number});
        String url = request.getUrl();
        get = new HttpGet(url);
        response = client.execute(get);
        JSONObject jsonResponse = readJSON(response);
        Assert.assertTrue("Phone is invalid",jsonResponse.get("valid").toString().equals("true"));
        Assert.assertTrue("International format is incorrect",
                jsonResponse.get("international_format").toString().equals("+380958281020"));
        Assert.assertTrue("Coutry code is incorrect", jsonResponse.get("country_code").toString().equals("UA"));
        Assert.assertTrue("Line type is incorrect", jsonResponse.get("line_type").toString().equals("mobile"));
    }

    @Test
    public void checkInCorrectPhoneNumber() throws IOException {
        String number = "0958281020";
        request.addParameterWithManyValues("number", new String[]{number});
        String url = request.getUrl();
        get = new HttpGet(url);
        response = client.execute(get);
        Assert.assertTrue(readJSON(response).get("valid").toString().equals("false"));
    }

    @Test
    public void checkErrorWithoutNumberParameter() throws IOException {
        String url = request.getUrl();
        get = new HttpGet(url);
        response = client.execute(get);
        Assert.assertTrue(readJSON(response).get("error").toString().contains("\"code\":210"));
    }

    @Test
    public void checkErrorWithoutAccessKey() throws IOException {
        String number = "380958281020";
        request.addParameterWithManyValues("number", new String[]{number});
        request.addParameter("access_key", "");
        String url = request.getUrl();
        get = new HttpGet(url);
        response = client.execute(get);
        Assert.assertTrue(readJSON(response).get("error").toString().contains("\"code\":101"));
    }

    @Test
    public void check200Response() throws IOException {
        String number = "380958281020";
        request.addParameterWithManyValues("number", new String[]{number});
        request.addParameter("access_key", "");
        String url = request.getUrl();
        get = new HttpGet(url);
        response = client.execute(get);
        Assert.assertTrue("Status code is not 200",String.valueOf(response.getStatusLine().getStatusCode()).equals("200"));
    }
}
