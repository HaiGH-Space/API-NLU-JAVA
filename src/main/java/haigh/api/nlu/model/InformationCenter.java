package haigh.api.nlu.model;

import java.util.List;

public class InformationCenter {
    private int total_items;
    private boolean trong_thoi_gian_dang_ky;
    private List<Faculty> ds_khoa;
    private List<Class> ds_lop;
    private List<Subject> ds_mon_hoc;
    private List<Group> ds_nhom_to;

    public int getTotal_items() {
        return total_items;
    }

    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }

    public boolean isTrong_thoi_gian_dang_ky() {
        return trong_thoi_gian_dang_ky;
    }

    public void setTrong_thoi_gian_dang_ky(boolean trong_thoi_gian_dang_ky) {
        this.trong_thoi_gian_dang_ky = trong_thoi_gian_dang_ky;
    }

    public List<Faculty> getDs_khoa() {
        return ds_khoa;
    }

    public void setDs_khoa(List<Faculty> ds_khoa) {
        this.ds_khoa = ds_khoa;
    }

    public List<Class> getDs_lop() {
        return ds_lop;
    }

    public void setDs_lop(List<Class> ds_lop) {
        this.ds_lop = ds_lop;
    }

    public List<Subject> getDs_mon_hoc() {
        return ds_mon_hoc;
    }

    public void setDs_mon_hoc(List<Subject> ds_mon_hoc) {
        this.ds_mon_hoc = ds_mon_hoc;
    }

    public List<Group> getDs_nhom_to() {
        return ds_nhom_to;
    }

    public void setDs_nhom_to(List<Group> ds_nhom_to) {
        this.ds_nhom_to = ds_nhom_to;
    }

    @Override
    public String toString() {
        return "InformationCenter{" +
                "total_items=" + total_items +
                ", trong_thoi_gian_dang_ky=" + trong_thoi_gian_dang_ky +
                ", ds_khoa=" + ds_khoa +
                ", ds_lop=" + ds_lop +
                ", ds_mon_hoc=" + ds_mon_hoc +
                ", ds_nhom_to=" + ds_nhom_to +
                '}';
    }
}
