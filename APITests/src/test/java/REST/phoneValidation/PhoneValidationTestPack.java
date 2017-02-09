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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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


    private JSONObject readJSON(HttpResponse res) throws IOException {
        String result = "", line = "";
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(res.getEntity().getContent()));
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        rd.close();
        JSONObject jsonObj = new JSONObject(result);
        return jsonObj;
    }

    @Test
    public void checkCorrectPhoneNumber() throws IOException {
        String number = "380958281020";
        request.addParameterWithManyValues("number", new String[]{number});
        String url = request.getUrl();
        get = new HttpGet(url);
        response = client.execute(get);
        Assert.assertTrue(readJSON(response).get("valid").toString().equals("true"));
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
}
