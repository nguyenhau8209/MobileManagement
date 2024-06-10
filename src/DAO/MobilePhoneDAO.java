/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import interfaces.ITF_MobilePhone;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.MobilePhone;

/**
 *
 * @author nguyen-cong-hau
 */
public class MobilePhoneDAO implements ITF_MobilePhone {

    // Tạo một danh sách tĩnh để lưu trữ các đối tượng MobilePhone
    public static List<MobilePhone> ls = new ArrayList<>();

    // Chèn một đối tượng MobilePhone vào danh sách
    @Override
    public int insert(MobilePhone phone) {
        // Tìm vị trí của đối tượng MobilePhone trong danh sách theo ID
        int pos = findByID(phone.getId());
        // Nếu không tìm thấy (pos < 0), thêm mới đối tượng MobilePhone vào danh sách
        if (pos < 0) {
            ls.add(phone);
            return 1; // Trả về 1 để chỉ ra rằng thao tác chèn thành công
        }
        // Nếu tìm thấy, cập nhật đối tượng MobilePhone tại vị trí pos
        ls.set(pos, phone);
        return 1; // Trả về 1 để chỉ ra rằng thao tác cập nhật thành công
    }

    // Xóa một đối tượng MobilePhone khỏi danh sách dựa trên ID của nó
    @Override
    public int delete(String id) {
        // Tìm vị trí của đối tượng MobilePhone trong danh sách theo ID
        int pos = findByID(id);
        // Nếu không tìm thấy (pos < 0), thông báo xóa thất bại và trả về -1
        if (pos < 0) {
            System.out.println("Delete false");
            return -1;
        }
        // Nếu tìm thấy, xóa đối tượng MobilePhone khỏi danh sách
        ls.remove(pos);
        return 1; // Trả về 1 để chỉ ra rằng thao tác xóa thành công
    }

    // Tìm vị trí của đối tượng MobilePhone trong danh sách theo ID
    @Override
    public int findByID(String id) {
        int position = -1; // Khởi tạo vị trí ban đầu là -1 (không tìm thấy)
        // Duyệt qua danh sách để tìm đối tượng MobilePhone theo ID
        for (int i = 0; i < ls.size(); i++) {
            // Nếu tìm thấy ID khớp, gán vị trí hiện tại cho biến position và thoát khỏi vòng lặp
            if (ls.get(i).getId().equals(id)) {
                position = i;
                break;
            }
        }
        return position; // Trả về vị trí tìm thấy hoặc -1 nếu không tìm thấy
    }

    // Lấy đối tượng MobilePhone từ danh sách theo vị trí
    @Override
    public MobilePhone getMobilePhoneByPossition(int index) {
        // Nếu vị trí hợp lệ (trong khoảng từ 0 đến kích thước danh sách - 1), trả về đối tượng MobilePhone tại vị trí đó
        if (index >= 0 && index < ls.size()) {
            return ls.get(index);
        }
        // Nếu vị trí không hợp lệ, trả về null
        return null;
    }

    // Mở và đọc danh sách các đối tượng MobilePhone từ một tệp
    @Override
    public List<MobilePhone> openFile() {
        // Sử dụng BufferedReader để đọc tệp văn bản
        try (BufferedReader br = new BufferedReader(new FileReader("./src/data/SanPham.txt"))) {
            String line;
            // Đọc từng dòng trong tệp
            while ((line = br.readLine()) != null) {
                // Tách thông tin từng dòng thành các phần tử
                String[] dienthoaiInfo = line.split(",");
                // Nếu dòng không đủ thông tin (ít hơn 5 phần tử), báo lỗi và bỏ qua dòng đó
                if (dienthoaiInfo.length < 5) {
                    System.err.println("Invalid line: " + line);
                    continue;  // Bỏ qua dòng không hợp lệ
                }
                try {
                    // Lấy thông tin từ các phần tử và tạo đối tượng MobilePhone
                    String id = dienthoaiInfo[0].trim();
                    String name = dienthoaiInfo[1].trim();
                    int quantity = Integer.parseInt(dienthoaiInfo[2].trim());
                    String categoryID = dienthoaiInfo[3].trim();
                    double price = Double.parseDouble(dienthoaiInfo[4].trim());

                    MobilePhone phone = new MobilePhone(id, name, quantity, categoryID, price);
                    // Thêm đối tượng MobilePhone vào danh sách
                    ls.add(phone);
                } catch (NumberFormatException e) {
                    // Báo lỗi nếu định dạng số không hợp lệ và tiếp tục đọc dòng kế tiếp
                    System.err.println("Invalid number format in line: " + line);
                }
            }
        } catch (IOException e) {
            // Báo lỗi nếu có vấn đề khi đọc tệp
            e.printStackTrace();
        }
        return ls; // Trả về danh sách các đối tượng MobilePhone đã đọc từ tệp
    }

    // Lưu danh sách các đối tượng MobilePhone vào một tệp
    @Override
    public void saveFile(List<MobilePhone> ls) {
        // Hiện tại chưa được triển khai, ném ra ngoại lệ UnsupportedOperationException
        throw new UnsupportedOperationException("Not supported yet."); // Được tạo tự động
    }

    // Lấy tất cả các đối tượng MobilePhone
    @Override
    public List<MobilePhone> getAlls() {
        return ls; // Trả về danh sách tất cả các đối tượng MobilePhone
    }

    // Tìm các đối tượng MobilePhone theo ID của Category
    @Override
    public List<MobilePhone> findProductByCategoryID(String categoryID) {
        // Tạo danh sách kết quả để lưu trữ các đối tượng tìm thấy
        List<MobilePhone> result = new ArrayList<>();
        // Duyệt qua danh sách các đối tượng MobilePhone
        for (MobilePhone l : ls) {
            // Nếu CategoryID của đối tượng MobilePhone khớp với categoryID truyền vào, thêm đối tượng vào danh sách kết quả
            if (l.getCategoryID().equalsIgnoreCase(categoryID)) {
                result.add(l);
            }
        }
        return result; // Trả về danh sách các đối tượng MobilePhone thuộc Category chỉ định
    }

}

