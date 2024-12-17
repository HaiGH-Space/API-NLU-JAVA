package haigh.api.nlu.model;

public class AIdName {
    private String ma;
    private String ten;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) { this.ten = ten; }

    @Override
    public String toString() {
        return  this.getClass().getName() +"{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
