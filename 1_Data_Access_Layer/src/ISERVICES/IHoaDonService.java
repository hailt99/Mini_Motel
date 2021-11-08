
package ISERVICES;

import MODEL.HoaDon;
import java.util.List;


public interface IHoaDonService {
    void insert();
    void update();
    void delete();
    List<HoaDon> getLstHoaDon();
}
