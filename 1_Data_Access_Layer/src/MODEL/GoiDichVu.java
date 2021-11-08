 
package MODEL;


public class GoiDichVu {
    private String maGoiDV;
    private String tenGoiDV;
    private float giaTien;
    private int trangThai;

    public GoiDichVu() {
    }

    public GoiDichVu(String maGoiDV, String tenGoiDV, float giaTien, int trangThai) {
        this.maGoiDV = maGoiDV;
        this.tenGoiDV = tenGoiDV;
        this.giaTien = giaTien;
        this.trangThai = trangThai;
    }

    public String getMaGoiDV() {
        return maGoiDV;
    }

    public void setMaGoiDV(String maGoiDV) {
        this.maGoiDV = maGoiDV;
    }

    public String getTenGoiDV() {
        return tenGoiDV;
    }

    public void setTenGoiDV(String tenGoiDV) {
        this.tenGoiDV = tenGoiDV;
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

    public void setTinhTrang(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
