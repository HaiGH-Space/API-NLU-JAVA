package haigh.api.nlu.model;

import java.util.List;

public class Group {
    private String id_mon;
    private String id_to_hoc;
    private String ma_mon;
    private String ten_mon;
    private String ten_mon_eg;
    private String so_tc;
    private String nhom_to;
    private List<String> ds_lop;
    private List<String> ds_khoa;
    private String to;
    private String lop;
    private int sl_dk;
    private int sl_cp;
    private int sl_cl;
    private String tkb;
    private boolean is_dk;
    private boolean is_ctdt;

    @Override
    public String toString() {
        return "Group{" +
                "id_mon='" + id_mon + '\'' +
                ", id_to_hoc='" + id_to_hoc + '\'' +
                ", ma_mon='" + ma_mon + '\'' +
                ", ten_mon='" + ten_mon + '\'' +
                ", ten_mon_eg='" + ten_mon_eg + '\'' +
                ", so_tc='" + so_tc + '\'' +
                ", nhom_to='" + nhom_to + '\'' +
                ", ds_lop=" + ds_lop +
                ", ds_khoa=" + ds_khoa +
                ", to='" + to + '\'' +
                ", lop='" + lop + '\'' +
                ", sl_dk=" + sl_dk +
                ", sl_cp=" + sl_cp +
                ", sl_cl=" + sl_cl +
                ", tkb='" + tkb + '\'' +
                ", is_dk=" + is_dk +
                ", is_ctdt=" + is_ctdt +
                '}';
    }

    public String getId_mon() {
        return id_mon;
    }

    public void setId_mon(String id_mon) {
        this.id_mon = id_mon;
    }

    public String getId_to_hoc() {
        return id_to_hoc;
    }

    public void setId_to_hoc(String id_to_hoc) {
        this.id_to_hoc = id_to_hoc;
    }

    public String getMa_mon() {
        return ma_mon;
    }

    public void setMa_mon(String ma_mon) {
        this.ma_mon = ma_mon;
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

    public String getSo_tc() {
        return so_tc;
    }

    public void setSo_tc(String so_tc) {
        this.so_tc = so_tc;
    }

    public String getNhom_to() {
        return nhom_to;
    }

    public void setNhom_to(String nhom_to) {
        this.nhom_to = nhom_to;
    }

    public List<String> getDs_lop() {
        return ds_lop;
    }

    public void setDs_lop(List<String> ds_lop) {
        this.ds_lop = ds_lop;
    }

    public List<String> getDs_khoa() {
        return ds_khoa;
    }

    public void setDs_khoa(List<String> ds_khoa) {
        this.ds_khoa = ds_khoa;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getSl_dk() {
        return sl_dk;
    }

    public void setSl_dk(int sl_dk) {
        this.sl_dk = sl_dk;
    }

    public int getSl_cp() {
        return sl_cp;
    }

    public void setSl_cp(int sl_cp) {
        this.sl_cp = sl_cp;
    }

    public int getSl_cl() {
        return sl_cl;
    }

    public void setSl_cl(int sl_cl) {
        this.sl_cl = sl_cl;
    }

    public String getTkb() {
        return tkb;
    }

    public void setTkb(String tkb) {
        this.tkb = tkb;
    }

    public boolean isIs_dk() {
        return is_dk;
    }

    public void setIs_dk(boolean is_dk) {
        this.is_dk = is_dk;
    }

    public boolean isIs_ctdt() {
        return is_ctdt;
    }

    public void setIs_ctdt(boolean is_ctdt) {
        this.is_ctdt = is_ctdt;
    }
}
