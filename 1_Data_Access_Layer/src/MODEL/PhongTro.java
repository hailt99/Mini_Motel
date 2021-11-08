 package MODEL;

public class PhongTro {
    private int id;
    private String maPhongTro;    
    private int tang;
    private String moTa;
    private int trangThai;
    private String maLoaiPhong;

    public PhongTro() {
    }

    public PhongTro(int id,String maPhongTro, int tang, String moTa, int trangThai, String maLoaiPhong) {
        this.id = id;
        this.maPhongTro = maPhongTro;        
        this.tang = tang;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.maLoaiPhong = maLoaiPhong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }        
    
    public String getMaPhongTro() {
        return maPhongTro;
    }

    public void setMaPhongTro(String maPhongTro) {
        this.maPhongTro = maPhongTro;
    }   

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
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

    public String getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }
    
    
    
}
