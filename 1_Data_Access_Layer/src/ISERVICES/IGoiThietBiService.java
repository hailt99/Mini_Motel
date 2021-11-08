 
package ISERVICES;

import MODEL.GoiThietBi;
import java.util.List;


public interface IGoiThietBiService {
    void insert();
    void update();
    void delete();
    List<GoiThietBi> getLstGoiThietBi();
}
