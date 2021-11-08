 
package ISERVICES;

import MODEL.ThietBi;
import java.util.List;


public interface IThietBiService {
    void insert();
    void update();
    void delete();
    List<ThietBi> getLstThietBi();
}
