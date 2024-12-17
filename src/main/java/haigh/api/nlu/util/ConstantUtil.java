package haigh.api.nlu.util;

import com.google.gson.Gson;

import java.io.*;

public class ConstantUtil {
    public static ConstantUtil instance;
    private String root;
    private String prefix;
    private String getUrl;
    private String locThongTin;
    private String login;
    private String loginPing;
    private String getCurrentLogin;
    private String logOut;
    private String getUserOnline;
    private String locDsNhomTo;
    private String locSinhVienInfo;
    private String locGiangVienInfo;
    private String locDsDiemSinhVien;
    private String locDsDieuKienLoc;
    private String locDsKQdkmhSinhVien;
    private String xuLydkmhSinhVien;


    public static void setInstance(ConstantUtil instance) {
        ConstantUtil.instance = instance;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getGetUrl() {
        return getUrl;
    }

    public void setGetUrl(String getUrl) {
        this.getUrl = getUrl;
    }

    public String getLocThongTin() {
        return locThongTin;
    }

    public void setLocThongTin(String locThongTin) {
        this.locThongTin = locThongTin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLoginPing() {
        return loginPing;
    }

    public void setLoginPing(String loginPing) {
        this.loginPing = loginPing;
    }

    public String getGetCurrentLogin() {
        return getCurrentLogin;
    }

    public void setGetCurrentLogin(String getCurrentLogin) {
        this.getCurrentLogin = getCurrentLogin;
    }

    public String getLogOut() {
        return logOut;
    }

    public void setLogOut(String logOut) {
        this.logOut = logOut;
    }

    public String getGetUserOnline() {
        return getUserOnline;
    }

    public void setGetUserOnline(String getUserOnline) {
        this.getUserOnline = getUserOnline;
    }

    public String getLocDsNhomTo() {
        return locDsNhomTo;
    }

    public void setLocDsNhomTo(String locDsNhomTo) {
        this.locDsNhomTo = locDsNhomTo;
    }

    public String getLocSinhVienInfo() {
        return locSinhVienInfo;
    }

    public void setLocSinhVienInfo(String locSinhVienInfo) {
        this.locSinhVienInfo = locSinhVienInfo;
    }

    public String getLocGiangVienInfo() {
        return locGiangVienInfo;
    }

    public void setLocGiangVienInfo(String locGiangVienInfo) {
        this.locGiangVienInfo = locGiangVienInfo;
    }

    public String getLocDsDiemSinhVien() {
        return locDsDiemSinhVien;
    }

    public void setLocDsDiemSinhVien(String locDsDiemSinhVien) {
        this.locDsDiemSinhVien = locDsDiemSinhVien;
    }

    public String getLocDsDieuKienLoc() {
        return locDsDieuKienLoc;
    }

    public void setLocDsDieuKienLoc(String locDsDieuKienLoc) {
        this.locDsDieuKienLoc = locDsDieuKienLoc;
    }

    public String getLocDsKQdkmhSinhVien() {
        return locDsKQdkmhSinhVien;
    }

    public void setLocDsKQdkmhSinhVien(String locDsKQdkmhSinhVien) {
        this.locDsKQdkmhSinhVien = locDsKQdkmhSinhVien;
    }

    public String getXuLydkmhSinhVien() {
        return xuLydkmhSinhVien;
    }

    public void setXuLydkmhSinhVien(String xuLydkmhSinhVien) {
        this.xuLydkmhSinhVien = xuLydkmhSinhVien;
    }

    static {
        InputStream inputStream = ConstantUtil.class.getClassLoader().getResourceAsStream("api.json");
        if (inputStream != null) {
            String json = "";
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    json+=line;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            Gson gson = new Gson();
            instance = gson.fromJson(json,ConstantUtil.class);
        }else {
            throw new RuntimeException("api.json can't found");
        }
    }
}
