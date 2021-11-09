
package SERVICES;

import ISERVICES.IQLDangNhapService;
import ISERVICES.IQuanLyService;
import MODEL.QuanLy;
import java.util.List;


public class QLDangNhapService implements IQLDangNhapService{
    
    IQuanLyService iquanLyService;

    @Override
    public boolean checkLogin(String taiKhoan, String matKhau) {
        try {
            List<QuanLy> lstQuanLy = iquanLyService.getLstQuanLy();
            for(QuanLy quanLy : lstQuanLy){
                if(taiKhoan.equals(quanLy.getTenTaiKhoan()) && matKhau.equals(quanLy.getMatKhau())){
                    return true;
                } else{
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public void dangKy(QuanLy quanLy) {
        try {
            iquanLyService.insert(quanLy);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    
    
    
}
