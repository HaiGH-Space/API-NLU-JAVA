package haigh.api.nlu.model;

public class RegistrationResults {

    private boolean enable_xoa;
    private double hoc_phi_tam_tinh;
    private String id_dia_diem_thi;
    private String id_kqdk;
    private String ngay_dang_ky;
    private String nguoi_dang_ky;
    private Group to_hoc;

    public boolean isEnable_xoa() {
        return enable_xoa;
    }

    public void setEnable_xoa(boolean enable_xoa) {
        this.enable_xoa = enable_xoa;
    }

    public double getHoc_phi_tam_tinh() {
        return hoc_phi_tam_tinh;
    }

    public void setHoc_phi_tam_tinh(double hoc_phi_tam_tinh) {
        this.hoc_phi_tam_tinh = hoc_phi_tam_tinh;
    }

    public String getId_dia_diem_thi() {
        return id_dia_diem_thi;
    }

    public void setId_dia_diem_thi(String id_dia_diem_thi) {
        this.id_dia_diem_thi = id_dia_diem_thi;
    }

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

    public String getNguoi_dang_ky() {
        return nguoi_dang_ky;
    }

    public void setNguoi_dang_ky(String nguoi_dang_ky) {
        this.nguoi_dang_ky = nguoi_dang_ky;
    }

    public Group getTo_hoc() {
        return to_hoc;
    }

    public void setTo_hoc(Group to_hoc) {
        this.to_hoc = to_hoc;
    }

    class Group {
        private boolean enable;
        private String id_mon;
        private String id_to_hoc;
        private String lop;
        private String ma_mon;
        private String nhom_to;
        private String sl_cl;
        private String ten_mon;
        private String so_tc;

        public boolean isEnable() {
            return enable;
        }

        public void setEnable(boolean enable) {
            this.enable = enable;
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

        public String getLop() {
            return lop;
        }

        public void setLop(String lop) {
            this.lop = lop;
        }

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

        public String getSl_cl() {
            return sl_cl;
        }

        public void setSl_cl(String sl_cl) {
            this.sl_cl = sl_cl;
        }

        public String getTen_mon() {
            return ten_mon;
        }

        public void setTen_mon(String ten_mon) {
            this.ten_mon = ten_mon;
        }

        public String getSo_tc() {
            return so_tc;
        }

        public void setSo_tc(String so_tc) {
            this.so_tc = so_tc;
        }

        @Override
        public String toString() {
            return "Group{" +
                    "enable=" + enable +
                    ", id_mon='" + id_mon + '\'' +
                    ", id_to_hoc='" + id_to_hoc + '\'' +
                    ", lop='" + lop + '\'' +
                    ", ma_mon='" + ma_mon + '\'' +
                    ", nhom_to='" + nhom_to + '\'' +
                    ", sl_cl='" + sl_cl + '\'' +
                    ", ten_mon='" + ten_mon + '\'' +
                    ", so_tc='" + so_tc + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "RegistrationResults{" +
                "enable_xoa=" + enable_xoa +
                ", hoc_phi_tam_tinh=" + hoc_phi_tam_tinh +
                ", id_dia_diem_thi='" + id_dia_diem_thi + '\'' +
                ", id_kqdk='" + id_kqdk + '\'' +
                ", ngay_dang_ky='" + ngay_dang_ky + '\'' +
                ", nguoi_dang_ky='" + nguoi_dang_ky + '\'' +
                ", to_hoc=" + to_hoc +
                '}';
    }
}


