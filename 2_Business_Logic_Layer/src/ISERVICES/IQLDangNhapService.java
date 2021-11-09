
package ISERVICES;

import MODEL.QuanLy;


public interface IQLDangNhapService {
    boolean checkLogin(String taiKhoan, String matKhau);
    void dangKy(QuanLy quanLy);
}
