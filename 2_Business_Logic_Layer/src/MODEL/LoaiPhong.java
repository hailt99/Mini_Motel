 
package MODEL;


public class LoaiPhong {
    private String id;
    private String maLoaiPhong;
    private String tenLoai;
    private float giaTien;
    private float dienTich;    
    private String moTa;
    private int trangThai;

    public LoaiPhong() {
    }

    public LoaiPhong(String id, String maLoaiPhong, String tenLoai, float giaTien, float dienTich, String moTa, int trangThai) {
        this.id = id;
        this.maLoaiPhong = maLoaiPhong;
        this.tenLoai = tenLoai;
        this.giaTien = giaTien;
        this.dienTich = dienTich;
        this.moTa = moTa;
        this.trangThai = trangThai;
    }

    

    public String getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }  

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
