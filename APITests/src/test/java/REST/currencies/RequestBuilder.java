package REST.currencies;

/**
 * Created by pixtart on 1/26/2017.
 */
public class RequestBuilder {

    private String url;
    private boolean alreadywithParameters;
    public RequestBuilder(String url){
        this.url = url;
        alreadywithParameters = false;
    }
    public String getUrl(){
        return url;
    }

    public void addParameter(String name, String value){
        if(!alreadywithParameters){
            url = url + "?";
            alreadywithParameters = true;
        }
        url = url + name + "=" + value + "&";
    }
    public void addParameterWithManyValues(String name, String[] values){
        if(!alreadywithParameters){
            url = url + "?";
            alreadywithParameters = true;
        }
        url = url + name + "=" + String.join(",", values) + "&";
    }
}
