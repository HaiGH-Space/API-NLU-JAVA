package haigh.api.nlu.util;

public class APIUtil {
    private static String root = ConstantUtil.instance.getRoot();
    private static String prefix = ConstantUtil.instance.getPrefix();
    public static String getRequestURLFromParams(String root, String prefix, String api) {
        return root + prefix + api;
    }
    public static String requestWithAPI(String api) {
        return prefix + api;
    }
    public static String baseUrl() {
        return root + prefix;
    }
    public static String requestWithAPIUrlPublic(String api) {
        return root + "/public/api/" + api;
    }

    public static String requestWithAPIUrlDKMH(String api) {
        return root + "/dkmh/api/" + api;
    }

    public static String requestWithAPIUrl(String api) {
        return root + prefix + api;
    }

}
