 
package MODEL;

import java.util.Date;


public class HoaDon {
    private int maHoaDon;
    private Date ngayTao;
    private int maChiTietHopDong;
    private int trangThai; 

    public HoaDon() {
    }

    public HoaDon(int maHoaDon, Date ngayTao, int maChiTietHopDong, int trangThai) {
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.maChiTietHopDong = maChiTietHopDong;
        this.trangThai = trangThai;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getMaChiTietHopDong() {
        return maChiTietHopDong;
    }

    public void setMaChiTietHopDong(int maChiTietHopDong) {
        this.maChiTietHopDong = maChiTietHopDong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
