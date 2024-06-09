/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import model.MobilePhone;

/**
 *
 * @author nguyen-cong-hau
 */
public interface ITF_MobilePhone {

    public int insert(MobilePhone phone);

    public int delete(String id);

    public int findByID(String id);

    public MobilePhone getMobilePhoneByPossition(int index);

    List<MobilePhone> openFile();

    void saveFile(List<MobilePhone> ls);

    List<MobilePhone> getAlls();
    
    List<MobilePhone> findProductByCategoryID(String categoryID);
}
