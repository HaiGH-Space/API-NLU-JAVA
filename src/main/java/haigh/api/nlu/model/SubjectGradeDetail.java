package haigh.api.nlu.model;

public class SubjectGradeDetail {

    private String ky_hieu;
    private String ten_thanh_phan;
    private String trong_so;
    private String diem_thanh_phan;


    public String getKy_hieu() {
        return ky_hieu;
    }

    public void setKy_hieu(String ky_hieu) {
        this.ky_hieu = ky_hieu;
    }

    public String getTen_thanh_phan() {
        return ten_thanh_phan;
    }

    public void setTen_thanh_phan(String ten_thanh_phan) {
        this.ten_thanh_phan = ten_thanh_phan;
    }

    public String getTrong_so() {
        return trong_so;
    }

    public void setTrong_so(String trong_so) {
        this.trong_so = trong_so;
    }

    public String getDiem_thanh_phan() {
        return diem_thanh_phan;
    }

    public void setDiem_thanh_phan(String diem_thanh_phan) {
        this.diem_thanh_phan = diem_thanh_phan;
    }
    @Override
    public String toString() {
        return "SubjectGradeDetail{" +
                "ky_hieu='" + ky_hieu + '\'' +
                ", ten_thanh_phan='" + ten_thanh_phan + '\'' +
                ", trong_so='" + trong_so + '\'' +
                ", diem_thanh_phan='" + diem_thanh_phan + '\'' +
                '}';
    }
}
