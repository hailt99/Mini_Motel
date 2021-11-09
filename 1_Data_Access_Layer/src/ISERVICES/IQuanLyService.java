 
package ISERVICES;

import MODEL.QuanLy;
import java.util.List;


public interface IQuanLyService {
    void insert(QuanLy quanLy);
    void update();
    void delete();
    List<QuanLy> getLstQuanLy();
}
