
package ISERVICES;

import MODEL.LoaiPhong;
import java.util.List;

 
public interface ILoaiPhongService {
    void insert(LoaiPhong loaiPhong);
    void update(LoaiPhong loaiPhong);
    void delete(LoaiPhong loaiPhong);
    List<LoaiPhong> getLstLoaiPhong();
}
