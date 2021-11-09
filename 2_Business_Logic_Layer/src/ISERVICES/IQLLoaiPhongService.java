
package ISERVICES;

import MODEL.LoaiPhong;
import java.util.List;


public interface IQLLoaiPhongService {
    void them(LoaiPhong loaiPhong);
    void capNhat(LoaiPhong loaiPhong);
    void xoa(String maLoaiPhong);
    List<LoaiPhong> timKiem();
}
