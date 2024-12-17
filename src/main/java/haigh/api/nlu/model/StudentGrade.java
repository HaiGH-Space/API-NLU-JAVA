package haigh.api.nlu.model;

import java.util.List;

public class StudentGrade {
    List<SemesterGrade> ds_diem_hocky;
    private String mesage_diemk1;
    private String mesage_diemtk4;
    private String mesage_diemtk10;
    private String mesage_diemtkc;

    public List<SemesterGrade> getDs_diem_hocky() {
        return ds_diem_hocky;
    }

    public void setDs_diem_hocky(List<SemesterGrade> ds_diem_hocky) {
        this.ds_diem_hocky = ds_diem_hocky;
    }

    public String getMesage_diemk1() {
        return mesage_diemk1;
    }

    public void setMesage_diemk1(String mesage_diemk1) {
        this.mesage_diemk1 = mesage_diemk1;
    }

    public String getMesage_diemtk4() {
        return mesage_diemtk4;
    }

    public void setMesage_diemtk4(String mesage_diemtk4) {
        this.mesage_diemtk4 = mesage_diemtk4;
    }

    public String getMesage_diemtk10() {
        return mesage_diemtk10;
    }

    public void setMesage_diemtk10(String mesage_diemtk10) {
        this.mesage_diemtk10 = mesage_diemtk10;
    }

    public String getMesage_diemtkc() {
        return mesage_diemtkc;
    }

    public void setMesage_diemtkc(String mesage_diemtkc) {
        this.mesage_diemtkc = mesage_diemtkc;
    }


    @Override
    public String toString() {
        return "StudentGrade{" +
                "ds_diem_hocky=" + ds_diem_hocky +
                ", mesage_diemk1='" + mesage_diemk1 + '\'' +
                ", mesage_diemtk4='" + mesage_diemtk4 + '\'' +
                ", mesage_diemtk10='" + mesage_diemtk10 + '\'' +
                ", mesage_diemtkc='" + mesage_diemtkc + '\'' +
                '}';
    }
}
