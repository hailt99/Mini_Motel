 
package MODEL;


public class HoaDonChiTiet {
    private int maHoaDonChiTiet;
    private String maGoiDV;
    private int maHoaDon;
    private float giaTien;   
    private int trangThai;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int maHoaDonChiTiet, String maGoiDV, int maHoaDon, float giaTien, int trangThai) {
        this.maHoaDonChiTiet = maHoaDonChiTiet;
        this.maGoiDV = maGoiDV;
        this.maHoaDon = maHoaDon;
        this.giaTien = giaTien;        
        this.trangThai = trangThai;
    }

    public int getMaHoaDonChiTiet() {
        return maHoaDonChiTiet;
    }

    public void setMaHoaDonChiTiet(int maHoaDonChiTiet) {
        this.maHoaDonChiTiet = maHoaDonChiTiet;
    }

    public String getMaGoiDV() {
        return maGoiDV;
    }

    public void setMaGoiDV(String maGoiDV) {
        this.maGoiDV = maGoiDV;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
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
