package haigh.api.nlu.model;

public class RegistrationResult {
    private String id_kqdk;
    private String  ngay_dang_ky;
    private boolean is_da_rut_mon_hoc;
    private boolean enable_xoa;

    public String getId_kqdk() {
        return id_kqdk;
    }

    public void setId_kqdk(String id_kqdk) {
        this.id_kqdk = id_kqdk;
    }

    public String getNgay_dang_ky() {
        return ngay_dang_ky;
    }

    public void setNgay_dang_ky(String ngay_dang_ky) {
        this.ngay_dang_ky = ngay_dang_ky;
    }

    public boolean isIs_da_rut_mon_hoc() {
        return is_da_rut_mon_hoc;
    }

    public void setIs_da_rut_mon_hoc(boolean is_da_rut_mon_hoc) {
        this.is_da_rut_mon_hoc = is_da_rut_mon_hoc;
    }

    public boolean isEnable_xoa() {
        return enable_xoa;
    }

    public void setEnable_xoa(boolean enable_xoa) {
        this.enable_xoa = enable_xoa;
    }


    @Override
    public String toString() {
        return "RegistrationResult{" +
                "id_kqdk='" + id_kqdk + '\'' +
                ", ngay_dang_ky='" + ngay_dang_ky + '\'' +
                ", is_da_rut_mon_hoc=" + is_da_rut_mon_hoc +
                ", enable_xoa=" + enable_xoa +
                '}';
    }
}
