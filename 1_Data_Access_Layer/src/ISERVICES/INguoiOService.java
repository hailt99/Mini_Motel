
package ISERVICES;

import MODEL.NguoiO;
import java.util.List;

public interface INguoiOService {

    void insert();
    void update();
    void delete();
    List<NguoiO> getLstNguoiO();
}
