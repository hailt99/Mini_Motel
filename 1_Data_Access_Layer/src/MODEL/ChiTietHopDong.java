 
package MODEL;

import java.util.Date;


public class ChiTietHopDong {
    private int maChiTietHopDong;
    private int maPhongTro;
    private int maHopDong;    
    private float giaTien;
    private int trangThai;

    public ChiTietHopDong() {
    }

    public ChiTietHopDong(int maChiTietHopDong, int maPhongTro, int maHopDong,  float giaTien, int trangThai) {
        this.maChiTietHopDong = maChiTietHopDong;
        this.maPhongTro = maPhongTro;
        this.maHopDong = maHopDong;        
        this.giaTien = giaTien;
        this.trangThai = trangThai;
    }

    public int getMaChiTietHopDong() {
        return maChiTietHopDong;
    }

    public void setMaChiTietHopDong(int maChiTietHopDong) {
        this.maChiTietHopDong = maChiTietHopDong;
    }

    public int getMaPhongTro() {
        return maPhongTro;
    }

    public void setMaPhongTro(int maPhongTro) {
        this.maPhongTro = maPhongTro;
    }

    public int getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
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
