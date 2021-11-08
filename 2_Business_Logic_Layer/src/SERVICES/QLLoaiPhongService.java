
package SERVICES;

import ISERVICES.ILoaiPhongService;
import ISERVICES.IQLLoaiPhongService;
import MODEL.LoaiPhong;
import java.util.List;

public class QLLoaiPhongService implements IQLLoaiPhongService{
    ILoaiPhongService ILoaiPhongService ;
    @Override
    public void them(LoaiPhong loaiPhong) {
        try {
            ILoaiPhongService.getLstLoaiPhong();
            
            ILoaiPhongService.insert(loaiPhong);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void capNhat(LoaiPhong loaiPhong) {
        try {
            ILoaiPhongService.update(loaiPhong);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void xoa() {
        
    }

    @Override
    public List<LoaiPhong> timKiem() {
        
        return null;
    }
    
}
