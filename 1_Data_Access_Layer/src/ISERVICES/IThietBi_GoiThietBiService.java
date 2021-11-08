 
package ISERVICES;

import MODEL.ThietBi_GoiThietBi;
import java.util.List;

 
public interface IThietBi_GoiThietBiService {
    void insert();
    void update();
    void delete();
    List<ThietBi_GoiThietBi> getLstThietBi_GoiThietBi();
}
