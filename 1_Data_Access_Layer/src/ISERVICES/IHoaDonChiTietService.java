 
package ISERVICES;

import MODEL.HoaDonChiTiet;
import java.util.List;

public interface IHoaDonChiTietService {
    void insert();
    void update();
    void delete();
    List<HoaDonChiTiet> getLstIHoaDonChiTiet();
}
