package haigh.api.nlu;


import com.google.gson.Gson;
import haigh.api.nlu.util.ConstantUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        API api = new API();
        Account myAccount = readAccountJSON();
        System.out.println(api.login(myAccount.username,myAccount.password));
    }
    private static Account readAccountJSON() {
        InputStream inputStream = ConstantUtil.class.getClassLoader().getResourceAsStream("account.json");
        if (inputStream != null) {
            String json = "";
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    json += line;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            Gson gson = new Gson();
            return gson.fromJson(json, Account.class);
        }
        return null;
    }
    class Account{
        public String username;
        public String password;
    }
}
