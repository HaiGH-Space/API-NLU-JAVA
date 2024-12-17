package haigh.api.nlu.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProcessUtil {
    public static ProcessUtil instance = new ProcessUtil();
    private static String a = "Phapix";
    private static Random random = new Random();
    private static ConstantUtil constantUtil = ConstantUtil.instance;
    private static OkHttpClient httpClient = ClientUtil.okHttpClient;
    public static String gc(String e) {
        e = e.length() > 22 ? e.substring(0, 22) : e;
        long offset = 2000;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((rnd(89) + 10));
        stringBuilder.append((System.currentTimeMillis() - offset));
        stringBuilder.append((rnd(89) + 10));
        stringBuilder.append(e);
        String r =   stringBuilder.toString();
        int i = rnd(31);
        int[] ecResult = ec(r, i);
        StringBuilder sb = new StringBuilder();
        for (int codePoint : ecResult) {
            sb.append((char) codePoint);
        }

        return new String(Base64.getEncoder().encode(sb.toString().getBytes(StandardCharsets.ISO_8859_1)));
    }
    public static long getOffset() {
        String serverTimeAPI = APIUtil.requestWithAPIUrl(constantUtil.getLogin()).toLowerCase().replace("/auth/login", "/servertime");
        Request request = new Request.Builder()
                .url(serverTimeAPI)
                .build();
        long startTime = System.currentTimeMillis();
        try (Response response = httpClient.newCall(request).execute()) {
            long endTime = System.currentTimeMillis();
            if (response.isSuccessful()) {
                long duration = endTime - startTime;
                String responseData = response.body().string().replace("\"","");
                long serverTime = parseServerTime(responseData);
                return endTime - serverTime - duration;
            } else {
                return 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public static String isapi(String e) {
        String r = mc(a, 4, 1);
        String i = (e != null) ? e.toLowerCase() : "";

        if (i.startsWith(r + "/")) {
            i = "/" + i;
        }
        if (i.indexOf("/" + r + "/") >= 0) {
            return i.split("/" + r + "/")[1].toUpperCase();
        }
        return "";
    }
    private static int rnd(int e) {
        Random random = new Random();
        return random.nextInt(e) + 1;
    }

    private static String mc(String e, int r, int i) {
        int startIndex = e.length() - r;
        int endIndex = startIndex + r - i;
        return e.substring(startIndex, endIndex);
    }
    private static int[] ec(String t, int e) {
        int[] r = reverse(rk(e));
        byte[] bytes = t.getBytes(StandardCharsets.UTF_8);
        int[] i = new int[bytes.length];
        for (int j = 0; j < bytes.length; j++) {
            i[j] = bytes[j] & 0xFF;  // Chuyển byte thành unsigned int
        }

        // Tạo mảng o với độ dài đủ
        int[] o = new int[i.length];
        int rLength = r.length;

        // Copy r vào o
        for (int index = 0; index < o.length; index += rLength) {
            int copyLength = Math.min(rLength, o.length - index);
            System.arraycopy(r, 0, o, index, copyLength);
        }

        // XOR operation
        int[] result = new int[i.length+1];
        result[0] = e + 32;
        for (int u = 1; u < i.length+1; u++) {
            result[u] = i[u-1] ^ o[u-1];
        }
        return result;
    }
    private static int[] rk(int t) {
        int[] e = sc(); // Assuming sc() is defined as before
        int r = t % 3 + 1;
        int[] result = new int[10];

        for (int i = 0; i < 10; i++) {
            int index = (t + i * r) % e.length;
            result[i] = e[index];
        }
        return result;

    }
    private static int[] sc() {
        int[] numbers = {58, 43, 197, 133, 4, 165, 110, 3, 44, 202, 186, 28, 118, 177, 32, 94, 219, 6, 199, 27, 101, 191, 66, 115, 234, 120, 10, 236, 104, 108, 74, 247, 68, 198, 62, 203, 17, 102, 185, 42};
        int[] result = new int[32];
        System.arraycopy(numbers, numbers.length - 36, result, 0, 32);
        return result;
    }
        public static int[] reverse(int[] array) {
            int[] reversed = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversed[i] = array[array.length - 1 - i];
            }
            return reversed;
        }
    private static long parseServerTime(String serverTimeString) {
        try {
            // Định dạng chuỗi thời gian
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+7")); // Thiết lập múi giờ
            Date date = dateFormat.parse(serverTimeString);
            return date.getTime();
        } catch (Exception e) {
            System.err.println("Error parsing server time: " + e.getMessage());
            return 0L;
        }
    }
}
