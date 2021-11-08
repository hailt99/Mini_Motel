 
package MODEL;


public class ThietBi {
    private int maThietBi;
    private String tenThietBi;
    private float giaTien;
    private int trangThai;

    public ThietBi() {
    }

    public ThietBi(int maThietBi, String tenThietBi, float giaTien, int trangThai) {
        this.maThietBi = maThietBi;
        this.tenThietBi = tenThietBi;
        this.giaTien = giaTien;
        this.trangThai = trangThai;
    }

    public int getMaThietBi() {
        return maThietBi;
    }

    public void setMaThietBi(int maThietBi) {
        this.maThietBi = maThietBi;
    }

    public String getTenThietBi() {
        return tenThietBi;
    }

    public void setTenThietBi(String tenThietBi) {
        this.tenThietBi = tenThietBi;
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
