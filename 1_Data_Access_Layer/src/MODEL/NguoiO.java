  
package MODEL;

 
public class NguoiO {
    private String maNguoiO;
    private String ten;
    private int SDT;
    private int CCCD;
    private String diaChi;
    private String email;
    private int trangThai;
    private String maChiTietHopDong;

    public NguoiO() {
    }

    public NguoiO(String maNguoiO, String ten, int SDT, int CCCD, String diaChi, String email, int trangThai, String maChiTietHopDong) {
        this.maNguoiO = maNguoiO;
        this.ten = ten;
        this.SDT = SDT;
        this.CCCD = CCCD;
        this.diaChi = diaChi;
        this.email = email;
        this.trangThai = trangThai;
        this.maChiTietHopDong = maChiTietHopDong;
    }

    public String getMaNguoiO() {
        return maNguoiO;
    }

    public void setMaNguoiO(String maNguoiO) {
        this.maNguoiO = maNguoiO;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public int getCCCD() {
        return CCCD;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaChiTietHopDong() {
        return maChiTietHopDong;
    }

    public void setMaChiTietHopDong(String maChiTietHopDong) {
        this.maChiTietHopDong = maChiTietHopDong;
    }
    
    
}
