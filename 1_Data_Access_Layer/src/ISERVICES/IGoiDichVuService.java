
package ISERVICES;

import MODEL.GoiDichVu;
import java.util.List;


public interface IGoiDichVuService {
    void insert();
    void update();
    void delete();
    List<GoiDichVu> getLstGoiDichVu();
}
