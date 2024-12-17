package haigh.api.nlu.model;

import java.util.List;

public class SubjectGrade {
    private String ma_mon= "";
    private String nhom_to= "";
    private String ten_mon= "";
    private String ten_mon_eg= "";
    private boolean mon_hoc_nganh;
    private String so_tin_chi;
    private String diem_thi;
    private String diem_giua_ky;
    private String diem_tk;
    private String diem_tk_so;
    private String diem_tk_chu;
    private int loai_nganh;
    private List<SubjectGradeDetail> ds_diem_thanh_phan;


    public String getMa_mon() {
        return ma_mon;
    }

    public void setMa_mon(String ma_mon) {
        this.ma_mon = ma_mon;
    }

    public String getNhom_to() {
        return nhom_to;
    }

    public void setNhom_to(String nhom_to) {
        this.nhom_to = nhom_to;
    }

    public String getTen_mon() {
        return ten_mon;
    }

    public void setTen_mon(String ten_mon) {
        this.ten_mon = ten_mon;
    }

    public String getTen_mon_eg() {
        return ten_mon_eg;
    }

    public void setTen_mon_eg(String ten_mon_eg) {
        this.ten_mon_eg = ten_mon_eg;
    }

    public boolean isMon_hoc_nganh() {
        return mon_hoc_nganh;
    }

    public void setMon_hoc_nganh(boolean mon_hoc_nganh) {
        this.mon_hoc_nganh = mon_hoc_nganh;
    }

    public String getSo_tin_chi() {
        return so_tin_chi;
    }

    public void setSo_tin_chi(String so_tin_chi) {
        this.so_tin_chi = so_tin_chi;
    }

    public String getDiem_thi() {
        return diem_thi;
    }

    public void setDiem_thi(String diem_thi) {
        this.diem_thi = diem_thi;
    }

    public String getDiem_giua_ky() {
        return diem_giua_ky;
    }

    public void setDiem_giua_ky(String diem_giua_ky) {
        this.diem_giua_ky = diem_giua_ky;
    }

    public String getDiem_tk() {
        return diem_tk;
    }

    public void setDiem_tk(String diem_tk) {
        this.diem_tk = diem_tk;
    }

    public String getDiem_tk_so() {
        return diem_tk_so;
    }

    public void setDiem_tk_so(String diem_tk_so) {
        this.diem_tk_so = diem_tk_so;
    }

    public String getDiem_tk_chu() {
        return diem_tk_chu;
    }

    public void setDiem_tk_chu(String diem_tk_chu) {
        this.diem_tk_chu = diem_tk_chu;
    }

    public int getLoai_nganh() {
        return loai_nganh;
    }

    public void setLoai_nganh(int loai_nganh) {
        this.loai_nganh = loai_nganh;
    }

    public List<SubjectGradeDetail> getDs_diem_thanh_phan() {
        return ds_diem_thanh_phan;
    }

    public void setDs_diem_thanh_phan(List<SubjectGradeDetail> ds_diem_thanh_phan) {
        this.ds_diem_thanh_phan = ds_diem_thanh_phan;
    }

    @Override
    public String toString() {
        return "SubjectGrade{" +
                "ma_mon='" + ma_mon + '\'' +
                ", nhom_to='" + nhom_to + '\'' +
                ", ten_mon='" + ten_mon + '\'' +
                ", ten_mon_eg='" + ten_mon_eg + '\'' +
                ", mon_hoc_nganh=" + mon_hoc_nganh +
                ", so_tin_chi='" + so_tin_chi + '\'' +
                ", diem_thi='" + diem_thi + '\'' +
                ", diem_giua_ky='" + diem_giua_ky + '\'' +
                ", diem_tk='" + diem_tk + '\'' +
                ", diem_tk_so='" + diem_tk_so + '\'' +
                ", diem_tk_chu='" + diem_tk_chu + '\'' +
                ", loai_nganh=" + loai_nganh +
                ", ds_diem_thanh_phan=" + ds_diem_thanh_phan +
                '}';
    }
}
