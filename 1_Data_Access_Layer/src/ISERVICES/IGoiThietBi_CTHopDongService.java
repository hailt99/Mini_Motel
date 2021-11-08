 
package ISERVICES;

import MODEL.GoiThietBi_CTHopDong;
import java.util.List;


public interface IGoiThietBi_CTHopDongService {
    void insert();
    void update();
    void delete();
    List<GoiThietBi_CTHopDong> getLstThietBi_CTHopDong();
}
