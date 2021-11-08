 
package ISERVICES;

import MODEL.QuanLy;
import java.util.List;


public interface IQuanLyService {
    void insert();
    void update();
    void delete();
    List<QuanLy> getLstQuanLy();
}
