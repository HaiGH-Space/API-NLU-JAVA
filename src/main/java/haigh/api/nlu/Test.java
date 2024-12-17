package haigh.api.nlu;


import com.google.gson.Gson;
import haigh.api.nlu.model.*;
import haigh.api.nlu.util.ConstantUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
    static API api;
    public static void main(String[] args) throws Exception {
         api = new API();
        Account myAccount = readAccountJSON();
        /*
            Test Đăng nhập
        */
        Student sinh_vien = api.login(myAccount.username,myAccount.password);

        /*
            Test danh sách điều kiện lọc
        */
      List<FilteringCondition> dsDKLoc = api.dsDKLoc(sinh_vien.getAuthorization());

        /*
            Test danh sách kết quả các môn đã đăng ký
        */
      List<RegistrationResults> dsKetQuaDKMH =  api.dsKetQuaDKMH(sinh_vien.getAuthorization());

        /*
            Test InformationCenter
        */
        InformationCenter informationCenter = api.dsThongTin(sinh_vien.getAuthorization());

        List<Subject> dsMonHoc = informationCenter.getDs_mon_hoc();
        List<Group> dsNhomTo =  informationCenter.getDs_nhom_to();

        String tenMonHoc = "Pháp luật đại cương";// Tên môn học muốn tìm
        String maMonHoc = findIdSubject(tenMonHoc,dsMonHoc);// Tìm id theo tên môn học
        List<Group> ds_nhom_to_mon_PLDC = findGroupBySubjectID(maMonHoc,tenMonHoc,dsNhomTo);

        /*
            Test đăng ký môn học
        */
        // Lấy id của 1 lớp để dki học, Lấy vị trí đầu tiên làm ví dụ
        Group nhom_to_mon_PLDC = ds_nhom_to_mon_PLDC.get(0);
        dkmh(nhom_to_mon_PLDC,sinh_vien.getAuthorization(),true);//true để dk
        dkmh(nhom_to_mon_PLDC,sinh_vien.getAuthorization(),true);// false để hủy đk
    }
    private static void dkmh(Group nhom_to,String authorization,boolean isDK) throws IOException {
        String idMonHoc = nhom_to.getId_mon();
        RegisterCourse ketQuaDangKi = api.dkmh(authorization, idMonHoc,isDK);
        if (ketQuaDangKi.isIs_thanh_cong()) {
            System.out.println("Thực hiện thành công");
        }else {
            System.out.println("Lỗi: "+ketQuaDangKi.getThong_bao_loi());
        }
    }
    private static List<Group> findGroupBySubjectID(String maMonHoc,String tenMonHoc,List<Group> dsNhomTo) {
        List<Group> groups = new ArrayList<>();
        for (Group group : dsNhomTo) {
            String maMonG = group.getMa_mon();
            if (maMonG.equalsIgnoreCase(maMonHoc)) {
                if (tenMonHoc != null) {
                    group.setTen_mon(tenMonHoc); //Mặc định API trả về 0 có nên có thể thêm ở đây
                }
                groups.add(group);
            }
        }
        return groups;
    }
    private static String findIdSubject(String tenMonHoc,List<Subject> subjects){
        for (Subject monHoc : subjects) {
            if (monHoc.getTen().equalsIgnoreCase(tenMonHoc)) {
                return monHoc.getMa();
            }
        }
        return "";
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
