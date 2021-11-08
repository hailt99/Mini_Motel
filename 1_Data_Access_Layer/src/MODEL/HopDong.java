 
package MODEL;

import java.util.Date;


public class HopDong {
    private int maHopDong;
    private String maKhachHang;
    private String maQuanLy;
    private Date ngayKy;
    private Date ngayHetHan;
    private float tienCoc;
    private String banMemHD;
    private int trangThai;

    public HopDong() {
    }

    public HopDong(int maHopDong, String maKhachHang, String maQuanLy, Date ngayKy, Date ngayHetHan, float tienCoc, String banMemHD, int trangThai) {
        this.maHopDong = maHopDong;
        this.maKhachHang = maKhachHang;
        this.maQuanLy = maQuanLy;
        this.ngayKy = ngayKy;
        this.ngayHetHan = ngayHetHan;
        this.tienCoc = tienCoc;
        this.banMemHD = banMemHD;
        this.trangThai = trangThai;
    }

    

    public int getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaQuanLy() {
        return maQuanLy;
    }

    public void setMaQuanLy(String maQuanLy) {
        this.maQuanLy = maQuanLy;
    }   

    public Date getNgayKy() {
        return ngayKy;
    }

    public void setNgayKy(Date ngayKy) {
        this.ngayKy = ngayKy;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public float getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(float tienCoc) {
        this.tienCoc = tienCoc;
    }

    public String getBanMemHD() {
        return banMemHD;
    }

    public void setBanMemHD(String banMemHD) {
        this.banMemHD = banMemHD;
    }
   
    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
