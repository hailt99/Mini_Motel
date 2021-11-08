
package ISERVICES;

import MODEL.DichVu_GoiDichVu;
import java.util.List;


public interface IDichVu_goiDVService {
    void insert();
    void update();
    void delete();
    List<DichVu_GoiDichVu> getLstDichVu_goiDV();
}
