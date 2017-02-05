package REST.RESTTests;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by olenka on 27.01.2017.
 */
public class RESTTests {

    public static HttpClient client;
    public static RequestBuilder request;
    public static HttpGet get;

    @Before
    public void setStartConditions() {
        client = HttpClientBuilder.create().build();
        request = new RequestBuilder("http://apilayer.net/api/live");
        request.addParameter("access_key", "f208413b43c382be2f83281665d23bc0");
    }

    @Test
    public void checkStatus200() throws IOException {
        String[] currencies = {"EUR", "UAH", "RUB", "CAD"};
        request.addParameterWithManyValues("currencies", currencies);
        String url = request.getUrl();
        get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        Assert.assertTrue("Status code is not 200", String.valueOf(response.getStatusLine().getStatusCode()).equals("200"));
    }

    @Test
    public void checkBaseCurrency() throws IOException {
        String[] currencies = {"EUR", "UAH", "RUB", "CAD"};
        request.addParameterWithManyValues("currencies", currencies);
        String url = request.getUrl();
        get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        Assert.assertTrue("Status code is not 400", String.valueOf(response.getStatusLine().getStatusCode()).equals("200"));
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String result = "", line = "";
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        JSONObject jsonObj = new JSONObject(result);
        Assert.assertTrue(jsonObj.getString("source").equals("USD"));
    }

    //home task

    @Test
    public void checkKeys() throws IOException {
        String[] currencies = {"EUR"};
        request.addParameterWithManyValues("currencies", currencies);
        String url = request.getUrl();
        get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String result = "", line = "";
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        JSONObject jsonObj = new JSONObject(result);
        Assert.assertTrue("Success key is absent in response", jsonObj.toString().contains("success"));
        Assert.assertTrue("Terms key is absent in response", jsonObj.toString().contains("terms"));
        Assert.assertTrue("Privacy key is absent in response", jsonObj.toString().contains("privacy"));
        Assert.assertTrue("Timestamp key is absent in response", jsonObj.toString().contains("timestamp"));
        Assert.assertTrue("Source key is absent in response", jsonObj.toString().contains("source"));
        Assert.assertTrue("Quotes key is absent in response", jsonObj.toString().contains("quotes"));
    }

    @Test
    public void checkQuotesKey() throws IOException {
        String[] currencies = {"EUR,UAH,RUB"};
        request.addParameterWithManyValues("currencies", currencies);
        String url = request.getUrl();
        get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String result = "", line = "";
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        JSONObject jsonObj = new JSONObject(result);
        JSONObject jsonObjQuotes = (JSONObject) jsonObj.get("quotes");
        Iterator rs = jsonObjQuotes.keys();
        ArrayList<String> quotes = new ArrayList<String>(170);
        while (rs.hasNext()) {
            quotes.add((String) rs.next());
        }
        Assert.assertTrue("Quotes key does not contain USDEUR key",
                quotes.contains("USDEUR"));
        Assert.assertTrue("Quotes key does not contain USDUAH key",
                quotes.contains("USDUAH"));
        Assert.assertTrue("Quotes key does not contain USDRUB key",
                quotes.toString().contains("USDRUB"));
        Assert.assertTrue("Quotes key doesn't contain exactly USDEUR, USDUAH, USDRUB keys",
                quotes.size() == 3);
    }

    @Test
    public void checkNumberOfCurrencies() throws IOException {
        String[] currencies = {""};
        request.addParameterWithManyValues("currencies", currencies);
        String url = request.getUrl();
        get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String result = "", line = "";
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        JSONObject jsonObj = new JSONObject(result);
        JSONObject jsonObjQuotes = (JSONObject) jsonObj.get("quotes");
        Iterator rs = jsonObjQuotes.keys();
        ArrayList<String> quotes = new ArrayList<String>(170);
        while (rs.hasNext()) {
            quotes.add((String) rs.next());
        }
        Assert.assertTrue("Number of all currencies is not equal to 169", quotes.size() == 169);
    }

    @Test
    public void checkRatioUSDEUR() throws IOException {
        String[] currencies = {""};
        request.addParameterWithManyValues("currencies", currencies);
        String url = request.getUrl();
        get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String result = "", line = "";
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        JSONObject jsonObj = new JSONObject(result);
        JSONObject jsonObjQuotes = (JSONObject) jsonObj.get("quotes");
        Assert.assertTrue("Ratio between USD and EUR is not in range of 0.9-0.99",
                new Double(jsonObjQuotes.get("USDEUR").toString()) >=0.9);
        Assert.assertTrue("Ratio between USD and EUR is not in range of 0.9-0.99",
                new Double(jsonObjQuotes.get("USDEUR").toString()) <=0.99);
    }

    @Test
    public void checkError105() throws IOException {
        String[] currencies = {"UAH"};
        request.addParameterWithManyValues("source", currencies);
        String url = request.getUrl();
        get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String result = "", line = "";
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        Assert.assertTrue("No error 105 after passing incorrect parameters",
                result.contains("105"));
        Assert.assertTrue("No error 105 after passing incorrect parameters",
                result.contains("Access Restricted - Your current Subscription Plan does not support Source Currency Switching"));
    }
}
