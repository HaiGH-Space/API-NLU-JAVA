package haigh.api.nlu.model;

public class FilteringCondition {
    private String gia_tri;
    private String mieu_ta;
    private String is_mac_dinh;


    public String getGia_tri() {
        return gia_tri;
    }

    public void setGia_tri(String gia_tri) {
        this.gia_tri = gia_tri;
    }

    public String getMieu_ta() {
        return mieu_ta;
    }

    public void setMieu_ta(String mieu_ta) {
        this.mieu_ta = mieu_ta;
    }

    public String getIs_mac_dinh() {
        return is_mac_dinh;
    }

    public void setIs_mac_dinh(String is_mac_dinh) {
        this.is_mac_dinh = is_mac_dinh;
    }

    @Override
    public String toString() {
        return "FilteringCondition{" +
                "gia_tri='" + gia_tri + '\'' +
                ", mieu_ta='" + mieu_ta + '\'' +
                ", is_mac_dinh='" + is_mac_dinh + '\'' +
                '}';
    }
}
