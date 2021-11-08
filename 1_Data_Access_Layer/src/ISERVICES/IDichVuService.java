/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISERVICES;

import MODEL.DichVu;
import java.util.List;


public interface IDichVuService {
    void insert();
    void update();
    void delete();
    List<DichVu> getLstDichVu(); 
}
