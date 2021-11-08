 
package ISERVICES;

import MODEL.KhachHang;
import java.util.List;


public interface IKhachHangService {
    void insert();
    void update();
    void delete();
    List<KhachHang> getLstKhachHang();
}
