 
package ISERVICES;

import MODEL.HopDong;
import java.util.List;


public interface IHopDongService {
    void insert();
    void update();
    void delete();
    List<HopDong> getLstHopDong();
}
