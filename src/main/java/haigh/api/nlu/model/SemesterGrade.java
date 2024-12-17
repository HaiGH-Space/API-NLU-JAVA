package haigh.api.nlu.model;

import java.util.List;

public class SemesterGrade {
    List<SubjectGrade> ds_diem_mon_hoc;
    private int loai_nganh;
    private String hoc_ky;
    private String ten_hoc_ky;
    private String dtb_hk_he10;
    private String dtb_hk_he4;
    private String dtb_tich_luy_he_10;
    private String dtb_tich_luy_he_4;
    private String so_tin_chi_dat_hk;
    private String so_tin_chi_dat_tich_luy;
    private String xep_loai_tkb_hk;

    public List<SubjectGrade> getDs_diem_mon_hoc() {
        return ds_diem_mon_hoc;
    }

    public void setDs_diem_mon_hoc(List<SubjectGrade> ds_diem_mon_hoc) {
        this.ds_diem_mon_hoc = ds_diem_mon_hoc;
    }

    public int getLoai_nganh() {
        return loai_nganh;
    }

    public void setLoai_nganh(int loai_nganh) {
        this.loai_nganh = loai_nganh;
    }

    public String getHoc_ky() {
        return hoc_ky;
    }

    public void setHoc_ky(String hoc_ky) {
        this.hoc_ky = hoc_ky;
    }

    public String getTen_hoc_ky() {
        return ten_hoc_ky;
    }

    public void setTen_hoc_ky(String ten_hoc_ky) {
        this.ten_hoc_ky = ten_hoc_ky;
    }

    public String getDtb_hk_he10() {
        return dtb_hk_he10;
    }

    public void setDtb_hk_he10(String dtb_hk_he10) {
        this.dtb_hk_he10 = dtb_hk_he10;
    }

    public String getDtb_hk_he4() {
        return dtb_hk_he4;
    }

    public void setDtb_hk_he4(String dtb_hk_he4) {
        this.dtb_hk_he4 = dtb_hk_he4;
    }

    public String getDtb_tich_luy_he_10() {
        return dtb_tich_luy_he_10;
    }

    public void setDtb_tich_luy_he_10(String dtb_tich_luy_he_10) {
        this.dtb_tich_luy_he_10 = dtb_tich_luy_he_10;
    }

    public String getDtb_tich_luy_he_4() {
        return dtb_tich_luy_he_4;
    }

    public void setDtb_tich_luy_he_4(String dtb_tich_luy_he_4) {
        this.dtb_tich_luy_he_4 = dtb_tich_luy_he_4;
    }

    public String getSo_tin_chi_dat_hk() {
        return so_tin_chi_dat_hk;
    }

    public void setSo_tin_chi_dat_hk(String so_tin_chi_dat_hk) {
        this.so_tin_chi_dat_hk = so_tin_chi_dat_hk;
    }

    public String getSo_tin_chi_dat_tich_luy() {
        return so_tin_chi_dat_tich_luy;
    }

    public void setSo_tin_chi_dat_tich_luy(String so_tin_chi_dat_tich_luy) {
        this.so_tin_chi_dat_tich_luy = so_tin_chi_dat_tich_luy;
    }

    public String getXep_loai_tkb_hk() {
        return xep_loai_tkb_hk;
    }

    public void setXep_loai_tkb_hk(String xep_loai_tkb_hk) {
        this.xep_loai_tkb_hk = xep_loai_tkb_hk;
    }


    @Override
    public String toString() {
        return "SemesterGrade{" +
                "ds_diem_mon_hoc=" + ds_diem_mon_hoc +
                ", loai_nganh=" + loai_nganh +
                ", hoc_ky='" + hoc_ky + '\'' +
                ", ten_hoc_ky='" + ten_hoc_ky + '\'' +
                ", dtb_hk_he10='" + dtb_hk_he10 + '\'' +
                ", dtb_hk_he4='" + dtb_hk_he4 + '\'' +
                ", dtb_tich_luy_he_10='" + dtb_tich_luy_he_10 + '\'' +
                ", dtb_tich_luy_he_4='" + dtb_tich_luy_he_4 + '\'' +
                ", so_tin_chi_dat_hk='" + so_tin_chi_dat_hk + '\'' +
                ", so_tin_chi_dat_tich_luy='" + so_tin_chi_dat_tich_luy + '\'' +
                ", xep_loai_tkb_hk='" + xep_loai_tkb_hk + '\'' +
                '}';
    }
}
