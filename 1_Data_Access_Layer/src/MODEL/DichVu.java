 
package MODEL;
 
public class DichVu {
    private String maDichVu;
    private String tenDichVu;
    private float giaTien;
    private int trangThai;

    public DichVu() {
    }

    public DichVu(String maDichVu, String tenDichVu, float giaTien, int trangThai) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.giaTien = giaTien;
        this.trangThai = trangThai;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
