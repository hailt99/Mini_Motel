 
package MODEL;


public class GoiThietBi {
    private int maGoiThietBi;
    private String tenGoi;
    private float giaTien;    
    private int trangThai;

    public GoiThietBi() {
    }

    public GoiThietBi(int maGoiThietBi, String tenGoi, float giaTien, int trangThai) {
        this.maGoiThietBi = maGoiThietBi;
        this.tenGoi = tenGoi;
        this.giaTien = giaTien;        
        this.trangThai = trangThai;
    }

    public int getMaGoiThietBi() {
        return maGoiThietBi;
    }

    public void setMaGoiThietBi(int maGoiThietBi) {
        this.maGoiThietBi = maGoiThietBi;
    }

    public String getTenGoi() {
        return tenGoi;
    }

    public void setTenGoi(String tenGoi) {
        this.tenGoi = tenGoi;
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
