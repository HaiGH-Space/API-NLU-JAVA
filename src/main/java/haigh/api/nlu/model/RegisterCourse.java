package haigh.api.nlu.model;

public class RegisterCourse {
    private boolean is_thanh_cong;
    private String thong_bao_loi;
    private boolean is_chung_nhom_mon_hoc;
    private RegistrationResult ket_qua_dang_ky;

    public boolean isIs_thanh_cong() {
        return is_thanh_cong;
    }

    public void setIs_thanh_cong(boolean is_thanh_cong) {
        this.is_thanh_cong = is_thanh_cong;
    }

    public String getThong_bao_loi() {
        return thong_bao_loi;
    }

    public void setThong_bao_loi(String thong_bao_loi) {
        this.thong_bao_loi = thong_bao_loi;
    }

    public boolean isIs_chung_nhom_mon_hoc() {
        return is_chung_nhom_mon_hoc;
    }

    public void setIs_chung_nhom_mon_hoc(boolean is_chung_nhom_mon_hoc) {
        this.is_chung_nhom_mon_hoc = is_chung_nhom_mon_hoc;
    }

    public RegistrationResult getKet_qua_dang_ky() {
        return ket_qua_dang_ky;
    }

    public void setKet_qua_dang_ky(RegistrationResult ket_qua_dang_ky) {
        this.ket_qua_dang_ky = ket_qua_dang_ky;
    }


    @Override
    public String toString() {
        return "RegisterCourse{" +
                "is_thanh_cong=" + is_thanh_cong +
                ", thong_bao_loi='" + thong_bao_loi + '\'' +
                ", is_chung_nhom_mon_hoc=" + is_chung_nhom_mon_hoc +
                ", ket_qua_dang_ky=" + ket_qua_dang_ky +
                '}';
    }
}
