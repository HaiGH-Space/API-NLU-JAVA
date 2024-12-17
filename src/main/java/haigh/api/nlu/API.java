package haigh.api.nlu;

import com.google.gson.Gson;
import haigh.api.nlu.model.Student;
import haigh.api.nlu.util.APIUtil;
import haigh.api.nlu.util.ClientUtil;
import haigh.api.nlu.util.ConstantUtil;
import haigh.api.nlu.util.ProcessUtil;
import okhttp3.*;

import java.io.IOException;

public class API {
    private static OkHttpClient client = ClientUtil.okHttpClient;
    Gson gson;
    ConstantUtil constantUtil = ConstantUtil.instance;
    public API(){
        gson = new Gson();
    }
    private static ProcessUtil processUtil = ProcessUtil.instance;
    private String getUA(String apiParam) {
        return processUtil.gc(processUtil.isapi(APIUtil.requestWithAPI(apiParam)));
    }
    public void dsDKLoc(String authorization) {

    }
    public Student login(String username,String password) {
        Headers headers = new Headers.Builder()
                .add("user-agent",ClientUtil.USER_AGENT)
                .add("ua", getUA(constantUtil.getLogin()))
                .build();
        String params = "username=" + username +
                "&password=" + password +
                "&grant_type=password";
        try {
            Response response = request("POST",APIUtil.requestWithAPIUrl(constantUtil.getLogin()),headers,params);
            if (response.isSuccessful()) {
                return  gson.fromJson(response.body().string(),Student.class);
            }

        } catch (IOException e) {
           return null;
        }
        return null;
    }

    private static Response request(String method, String url, Headers headers, String params) throws IOException {
        Request.Builder builder = new Request.Builder().url(url).headers(headers);
        if (!method.equalsIgnoreCase("GET")) {
            RequestBody body = RequestBody.create(params, MediaType.parse("application/json; charset=utf-8"));
            builder = builder.method(method,body);
        }
        Request request = builder.build();
        return client.newCall(request).execute();

    }
}
