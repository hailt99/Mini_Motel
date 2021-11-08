 
package MODEL;


public class ThietBi_GoiThietBi {
    private int maThietBi_GoiThietBi;
    private int maThietBi;
    private int maGoiThietBi;
    private float giaTien;
    private int soLuong;
    private int trangThai;

    public ThietBi_GoiThietBi() {
    }

    public ThietBi_GoiThietBi(int maThietBi_GoiThietBi, int maThietBi, int maGoiThietBi, float giaTien, int soLuong, int trangThai) {
        this.maThietBi_GoiThietBi = maThietBi_GoiThietBi;
        this.maThietBi = maThietBi;
        this.maGoiThietBi = maGoiThietBi;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public int getMaThietBi_GoiThietBi() {
        return maThietBi_GoiThietBi;
    }

    public void setMaThietBi_GoiThietBi(int maThietBi_GoiThietBi) {
        this.maThietBi_GoiThietBi = maThietBi_GoiThietBi;
    }

    public int getMaThietBi() {
        return maThietBi;
    }

    public void setMaThietBi(int maThietBi) {
        this.maThietBi = maThietBi;
    }

    public int getMaGoiThietBi() {
        return maGoiThietBi;
    }

    public void setMaGoiThietBi(int maGoiThietBi) {
        this.maGoiThietBi = maGoiThietBi;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
