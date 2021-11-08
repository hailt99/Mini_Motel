 
package MODEL;


public class DichVu_GoiDichVu {
    private String maDichVu_goiDV;
    private String maDichVu;
    private String maGoiDV;
    private float giaTien;
    private int soLuong;
    private int trangThai;

    public DichVu_GoiDichVu() {
    }

    public DichVu_GoiDichVu(String maDichVu_goiDV, String maDichVu, String maGoiDV, float giaTien, int soLuong, int trangThai) {
        this.maDichVu_goiDV = maDichVu_goiDV;
        this.maDichVu = maDichVu;
        this.maGoiDV = maGoiDV;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public String getMaDichVu_goiDV() {
        return maDichVu_goiDV;
    }

    public void setMaDichVu_goiDV(String maDichVu_goiDV) {
        this.maDichVu_goiDV = maDichVu_goiDV;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getMaGoiDV() {
        return maGoiDV;
    }

    public void setMaGoiDV(String maGoiDV) {
        this.maGoiDV = maGoiDV;
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

    public void setTinhTrang(int tinhTrang) {
        this.trangThai = trangThai;
    }
    
    
}
