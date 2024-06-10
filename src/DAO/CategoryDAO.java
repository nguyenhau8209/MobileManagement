/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import interfaces.ITF_Category;
import java.util.ArrayList;
import java.util.List;
import model.Category;

/**
 *
 * @author nguyen-cong-hau
 */
public class CategoryDAO implements ITF_Category {

    // Tạo một danh sách tĩnh để lưu trữ các đối tượng Category
    public static List<Category> ls = new ArrayList<>();

    // Chèn một đối tượng Category vào danh sách
    @Override
    public int insert(Category category) {
        // Tìm vị trí của đối tượng Category trong danh sách theo ID
        int pos = findByID(category.getId());
        // Nếu không tìm thấy (pos < 0), thêm mới đối tượng Category vào danh sách
        if (pos < 0) {
            ls.add(category);
            return 1; // Trả về 1 để chỉ ra rằng thao tác chèn thành công
        }
        // Nếu tìm thấy, cập nhật đối tượng Category tại vị trí pos
        ls.set(pos, category);
        return 1; // Trả về 1 để chỉ ra rằng thao tác cập nhật thành công
    }

    // Xóa một đối tượng Category khỏi danh sách dựa trên ID của nó
    @Override
    public int delete(String id) {
        // Tìm vị trí của đối tượng Category trong danh sách theo ID
        int pos = findByID(id);
        // Nếu không tìm thấy (pos < 0), thông báo xóa thất bại và trả về -1
        if (pos < 0) {
            System.out.println("Delete false!");
            return -1;
        }
        // Nếu tìm thấy, xóa đối tượng Category khỏi danh sách
        ls.remove(pos);
        System.out.println("Delete Successfully");
        return 1; // Trả về 1 để chỉ ra rằng thao tác xóa thành công
    }

    // Tìm vị trí của đối tượng Category trong danh sách theo ID
    @Override
    public int findByID(String id) {
        int position = -1; // Khởi tạo vị trí ban đầu là -1 (không tìm thấy)
        // Duyệt qua danh sách để tìm đối tượng Category theo ID
        for (int i = 0; i < ls.size(); i++) {
            // Nếu tìm thấy ID khớp, gán vị trí hiện tại cho biến position và thoát khỏi vòng lặp
            if (ls.get(i).getId().equals(id)) {
                position = i;
                break;
            }
        }
        return position; // Trả về vị trí tìm thấy hoặc -1 nếu không tìm thấy
    }

    // Lấy đối tượng Category từ danh sách theo vị trí
    @Override
    public Category getCategoryByPossition(int index) {
        // Nếu vị trí hợp lệ (trong khoảng từ 0 đến kích thước danh sách - 1), trả về đối tượng Category tại vị trí đó
        if (index >= 0 && index < ls.size()) {
            return ls.get(index);
        }
        // Nếu vị trí không hợp lệ, trả về null
        return null;
    }

    // Mở và đọc danh sách các đối tượng Category từ một tệp
    @Override
    public List<Category> openFile() {
        // Ném ra ngoại lệ UnsupportedOperationException với thông báo "Not supported yet."
        throw new UnsupportedOperationException("Not supported yet."); // Được tạo tự động
    }

    // Lưu danh sách các đối tượng Category vào một tệp
    @Override
    public void saveFile(List<Category> ls) {
        // Ném ra ngoại lệ UnsupportedOperationException với thông báo "Not supported yet."
        throw new UnsupportedOperationException("Not supported yet."); // Được tạo tự động
    }

    // Lấy tất cả các đối tượng Category
    @Override
    public List<Category> getAlls() {
        // Ném ra ngoại lệ UnsupportedOperationException với thông báo "Not supported yet."
        throw new UnsupportedOperationException("Not supported yet."); // Được tạo tự động
    }
}

