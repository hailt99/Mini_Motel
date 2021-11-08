 
package MODEL;


public class GoiThietBi_CTHopDong {
    private int maGoiThietBi_CTHopDong;
    private int maGoiThietBi;
    private int maChiTietHopDong;    
    private int soLuong;
    private int trangThai;

    public GoiThietBi_CTHopDong() {
    }

    public GoiThietBi_CTHopDong(int maGoiThietBi_CTHopDong, int maGoiThietBi, int maChiTietHopDong, int soLuong, int trangThai) {
        this.maGoiThietBi_CTHopDong = maGoiThietBi_CTHopDong;
        this.maGoiThietBi = maGoiThietBi;
        this.maChiTietHopDong = maChiTietHopDong;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public int getMaThietBiHopDong() {
        return maGoiThietBi_CTHopDong;
    }

    public void setMaThietBiHopDong(int maThietBiHopDong) {
        this.maGoiThietBi_CTHopDong = maThietBiHopDong;
    }

    public int getMaGoiThietBi() {
        return maGoiThietBi;
    }

    public void setMaGoiThietBi(int maGoiThietBi) {
        this.maGoiThietBi = maGoiThietBi;
    }

    public int getMaChiTietHopDong() {
        return maChiTietHopDong;
    }

    public void setMaChiTietHopDong(int maChiTietHopDong) {
        this.maChiTietHopDong = maChiTietHopDong;
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
