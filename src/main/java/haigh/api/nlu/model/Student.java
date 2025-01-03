package haigh.api.nlu.model;

import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("principal")
    private String mail;
    private String name;
    private String refresh_token;
    private int expires_in;
    private String token_type;
    private String access_token;


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getAuthorization() {
        return token_type + " "+  access_token;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mail='" + mail + '\'' +
                ", name='" + name + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                ", expires_in=" + expires_in +
                ", token_type='" + token_type + '\'' +
                ", access_token='" + access_token + '\'' +
                '}';
    }
}
