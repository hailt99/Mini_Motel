 
package SERVICES;

import ISERVICES.IQuanLyService;
import MODEL.QuanLy;
import java.util.List;


public class QuanLyService implements IQuanLyService{

    @Override
    public void insert(QuanLy quanLy) {
        String sql = "insert into quanLy values(?,?,?,?)";
        JDBC_Connect.JDBC_help.executeUpdate(sql, quanLy.getTenTaiKhoan(), quanLy.getMatKhau(),
                                                quanLy.getEmail(), quanLy.getSDT());
    }

    @Override
    public void update() {
        
    }

    @Override
    public void delete() {
        
    }

    @Override
    public List<QuanLy> getLstQuanLy() {
        
        return null;
    }
    
}
