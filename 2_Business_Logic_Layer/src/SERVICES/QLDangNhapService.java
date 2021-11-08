
package SERVICES;

import ISERVICES.IQLDangNhapService;
import ISERVICES.IQuanLyService;
import MODEL.QuanLy;
import java.util.List;


public class QLDangNhapService implements IQLDangNhapService{
    
    IQuanLyService quanLyService;

//    @Override
//    public void checkLogin(String taiKhoan, String matKhau) {
//        try {
//            List<QuanLy> lstQuanLy = quanLyService.getLstQuanLy();
//            if(taiKhoan.equals("")){
//            
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public void checkLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
