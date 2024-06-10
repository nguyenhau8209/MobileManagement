/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import model.Category;

/**
 *
 * @author nguyen-cong-hau
 */
public interface ITF_Category {

    // Chèn một đối tượng Category mới vào hệ thống
    // @param category Đối tượng Category cần chèn
    // @return Một số nguyên chỉ kết quả của thao tác
    //         (ví dụ: 1 là thành công, 0 là thất bại)
    public int insert(Category category);

    // Xóa một đối tượng Category khỏi hệ thống dựa trên ID của nó
    // @param id ID của Category cần xóa
    // @return Một số nguyên chỉ kết quả của thao tác
    //         (ví dụ: 1 là thành công, 0 là thất bại)
    public int delete(String id);

    // Tìm một đối tượng Category theo ID của nó
    // @param id ID của Category cần tìm
    // @return Một số nguyên chỉ kết quả của thao tác
    //         (ví dụ: vị trí của Category tìm thấy hoặc -1 nếu không tìm thấy)
    public int findByID(String id);

    // Lấy một đối tượng Category dựa trên vị trí của nó trong danh sách
    // @param index Vị trí của Category trong danh sách
    // @return Đối tượng Category tại vị trí chỉ định
    public Category getCategoryByPossition(int index);

    // Mở và đọc danh sách các đối tượng Category từ một tệp
    // @return Một danh sách các đối tượng Category được đọc từ tệp
    List<Category> openFile();

    // Lưu danh sách các đối tượng Category vào một tệp
    // @param ls Danh sách các đối tượng Category cần lưu vào tệp
    void saveFile(List<Category> ls);

    // Lấy tất cả các đối tượng Category
    // @return Một danh sách tất cả các đối tượng Category
    List<Category> getAlls();
}
