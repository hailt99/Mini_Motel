 
package SERVICES;

import ISERVICES.ILoaiPhongService;
import MODEL.LoaiPhong;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

 
public class LoaiPhongService implements ILoaiPhongService{

    @Override
    public void insert(LoaiPhong loaiPhong) {
        String sql = "insert into loaiPhong(maLoaiPhong, tenLoaiPhong, giaTien, dienTich, trangThai, moTa) values(?,?,?,?,?,?)";
        JDBC_Connect.JDBC_help.executeUpdate(sql, loaiPhong.getMaLoaiPhong(), loaiPhong.getTenLoai(), loaiPhong.getGiaTien(),
                                                loaiPhong.getDienTich(), loaiPhong.getTrangThai(), loaiPhong.getMoTa());
    }

    @Override
    public void update(LoaiPhong loaiPhong) {
        String sql = "update loaiPhong set maLoaiPhong = ?, tenLoaiPhong = ?, giaTien = ?, dienTich = ?, moTa = ?, trangThai = ?";
        JDBC_Connect.JDBC_help.executeUpdate(sql, loaiPhong.getMaLoaiPhong(), loaiPhong.getTenLoai(), loaiPhong.getGiaTien(), 
                                                    loaiPhong.getDienTich(), loaiPhong.getMoTa(), loaiPhong.getTrangThai());
    }

    @Override
    public void delete(LoaiPhong loaiPhong) {
        String sql = "update loaiPhong set trangThai = 0 where id = ?";
        JDBC_Connect.JDBC_help.executeUpdate(sql, loaiPhong.getId());
    }

    @Override
    public List<LoaiPhong> getLstLoaiPhong() {
        List<LoaiPhong> lstLoaiPhong = new ArrayList<>();
        try {
            String sql = "select * from loaiPhong";
            ResultSet rs = JDBC_Connect.JDBC_help.executeQuery(sql);
            while(rs.next()){
                LoaiPhong loaiPhong = new LoaiPhong();
                loaiPhong.setMaLoaiPhong(rs.getString(sql));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
        return lstLoaiPhong;
    }
    
}
