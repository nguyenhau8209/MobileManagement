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

    // Chèn một đối tượng MobilePhone mới vào hệ thống
    // @param phone Đối tượng MobilePhone cần chèn
    // @return Một số nguyên chỉ kết quả của thao tác
    //         (ví dụ: 1 là thành công, 0 là thất bại)
    public int insert(MobilePhone phone);

    // Xóa một đối tượng MobilePhone khỏi hệ thống dựa trên ID của nó
    // @param id ID của MobilePhone cần xóa
    // @return Một số nguyên chỉ kết quả của thao tác
    //         (ví dụ: 1 là thành công, 0 là thất bại)
    public int delete(String id);

    // Tìm một đối tượng MobilePhone theo ID của nó
    // @param id ID của MobilePhone cần tìm
    // @return Một số nguyên chỉ kết quả của thao tác
    //         (ví dụ: vị trí của MobilePhone tìm thấy hoặc -1 nếu không tìm thấy)
    public int findByID(String id);

    // Lấy một đối tượng MobilePhone dựa trên vị trí của nó trong danh sách
    // @param index Vị trí của MobilePhone trong danh sách
    // @return Đối tượng MobilePhone tại vị trí chỉ định
    public MobilePhone getMobilePhoneByPossition(int index);

    // Mở và đọc danh sách các đối tượng MobilePhone từ một tệp
    // @return Một danh sách các đối tượng MobilePhone được đọc từ tệp
    List<MobilePhone> openFile();

    // Lưu danh sách các đối tượng MobilePhone vào một tệp
    // @param ls Danh sách các đối tượng MobilePhone cần lưu vào tệp
    void saveFile(List<MobilePhone> ls);

    // Lấy tất cả các đối tượng MobilePhone
    // @return Một danh sách tất cả các đối tượng MobilePhone
    List<MobilePhone> getAlls();
    
    // Tìm các đối tượng MobilePhone theo ID của Category
    // @param categoryID ID của Category cần tìm
    // @return Một danh sách các đối tượng MobilePhone thuộc Category chỉ định
    List<MobilePhone> findProductByCategoryID(String categoryID);
}

