/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISERVICES;

import MODEL.ChiTietHopDong;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IChiTietHopDongService {
    void insert();
    void update();
    void delete();
    List<ChiTietHopDong> getLstChiTietHopDong(); 
}
