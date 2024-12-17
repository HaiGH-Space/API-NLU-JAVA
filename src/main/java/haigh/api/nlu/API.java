package haigh.api.nlu;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import haigh.api.nlu.model.*;
import haigh.api.nlu.util.*;
import okhttp3.*;

import java.io.IOException;
import java.util.List;

public class API {
    private static OkHttpClient client = new OkHttpClient();
    private Gson gson;
    private static Headers headersGeneral;
    private static Headers headers;
    private ConstantUtil constantUtil = ConstantUtil.instance;

    public API() {
        headersGeneral = new Headers.Builder()
                .add("user-agent", ClientUtil.USER_AGENT).build();
        gson = new Gson();
    }

    private static ProcessUtil processUtil = ProcessUtil.instance;

    private String getUA(String apiParam) {
        return processUtil.gc(processUtil.isapi(APIUtil.requestWithAPI(apiParam)));
    }
    public RegisterCourse dkmh(String authorization,String id_to_hoc, boolean isDK) throws IOException {
        String apiParam = constantUtil.getXuLydkmhSinhVien();
        setHeadersUA(apiParam,authorization);
        String params = "{\"filter\": {\"id_to_hoc\": "+id_to_hoc+", \"is_checked\": "+isDK+", \"sv_nganh\": 1}}";
        Response response = request("POST", APIUtil.requestWithAPIUrlPublic(apiParam), headers, params);
        if (response.isSuccessful()) {
            return gson.fromJson(gson.fromJson(response.body().string(), JsonObject.class).getAsJsonObject("data"),RegisterCourse.class);
        }
        return null;
    }
    public InformationCenter dsThongTin(String authorization) throws IOException {
        String apiParam = constantUtil.getLocDsNhomTo();
        setHeadersUA(apiParam,authorization);
        String params = " {\"is_CVHT\": false,\"additional\": {\"paging\": {\"limit\": 99999, \"page\": 1}, \"ordering\": [{\"name\": \"\", \"order_type\": \"\"}]}\n}" ;
        Response response = request("POST", APIUtil.requestWithAPIUrlPublic(apiParam), headers, params);
        if (response.isSuccessful()) {
            return gson.fromJson(gson.fromJson(response.body().string(), JsonObject.class).getAsJsonObject("data"),InformationCenter.class);
        }
        return null;
    }
    public List<RegistrationResults> dsKetQuaDKMH(String authorization) throws IOException {
        String apiParam = constantUtil.getLocDsKQdkmhSinhVien();
        setHeadersUA(apiParam,authorization);
        String params = " {\"is_CVHT\": false, \"is_Clear\": false}" ;
        Response response = request("POST", APIUtil.requestWithAPIUrlPublic(apiParam), headers, params);
        if (response.isSuccessful()) {
            JsonObject jsonObject = gson.fromJson(response.body().string(), JsonObject.class);
            return gson.fromJson(jsonObject.getAsJsonObject("data").getAsJsonArray("ds_kqdkmh").toString(),ListTypeUtil.dsKetQuaDKMH);
        }
        return null;
    }
    public List<FilteringCondition> dsDKLoc(String authorization) throws IOException {
        String apiParam = constantUtil.getLocDsDieuKienLoc();
        setHeadersUA(apiParam,authorization);
        Response response = request("POST", APIUtil.requestWithAPIUrl(apiParam), headers, null);
        if (response.isSuccessful()) {
            return gson.fromJson(response.body().string(), ListTypeUtil.dsDKLocType);
        }
        return null;
    }

    public Student login(String username, String password) throws IOException {
        headers = headersGeneral.newBuilder()
                .add("ua", getUA(constantUtil.getLogin()))
                .build();
        String params = "username=" + username +
                "&password=" + password +
                "&grant_type=password";

        Response response = request("POST", APIUtil.requestWithAPIUrl(constantUtil.getLogin()), headers, params);
        if (response.isSuccessful()) {
            return gson.fromJson(response.body().string(), Student.class);
        }
        return null;
    }
    private void setHeadersUA(String apiParam,String  authorization){
        headers =  headersGeneral.newBuilder()
                .add("ua", getUA(apiParam))
                .add("authorization", authorization)
                .build();
    }
    private static Response request(String method, String url, Headers headers, String params) throws IOException {
        Request.Builder builder = new Request.Builder().url(url).headers(headers);
        if (!method.equalsIgnoreCase("GET")) {
            RequestBody body;
            if (params != null) {
                body = RequestBody.create(params, MediaType.parse("application/json; charset=utf-8"));
            } else {
                body = RequestBody.create("", MediaType.parse("application/json"));
            }
            builder = builder.method(method, body);
        }
        Request request = builder.build();
        return client.newCall(request).execute();

    }
}
