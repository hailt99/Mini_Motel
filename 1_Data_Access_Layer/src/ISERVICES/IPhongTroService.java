 
package ISERVICES;

import MODEL.PhongTro;
import java.util.List;

 
public interface IPhongTroService {
    void insert();
    void update();
    void delete();
    List<PhongTro> getLstPhongTro();
}
