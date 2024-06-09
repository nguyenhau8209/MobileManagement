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

    public static List<MobilePhone> ls = new ArrayList<>();

    @Override
    public int insert(MobilePhone phone) {
        int pos = findByID(phone.getId());
        if (pos < 0) {
            ls.add(phone);
            return 1;
        }
        ls.set(pos, phone);
        return 1;
    }

    @Override
    public int delete(String id) {
        int pos = findByID(id);
        if (pos < 0) {
            System.out.println("Delete false");
            return -1;
        }
        ls.remove(pos);
        return 1;
    }

    @Override
    public int findByID(String id) {
        int position = -1;
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getId().equals(id)) {
                position = i;
                break;
            }
        }
        return position;
    }

    @Override
    public MobilePhone getMobilePhoneByPossition(int index) {
        if (index >= 0 && index < ls.size()) {
            return ls.get(index);
        }
        return null;
    }

    @Override
    public List<MobilePhone> openFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("./src/data/SanPham.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dienthoaiInfo = line.split(",");
                if (dienthoaiInfo.length < 5) {
                    System.err.println("Invalid line: " + line);
                    continue;  // Bỏ qua dòng không hợp lệ
                }
                try {
                    String id = dienthoaiInfo[0].trim();
                    String name = dienthoaiInfo[1].trim();
                    int quantity = Integer.parseInt(dienthoaiInfo[2].trim());
                    String categoryID = dienthoaiInfo[3].trim();
                    double price = Double.parseDouble(dienthoaiInfo[4].trim());

                    MobilePhone phone = new MobilePhone(id, name, quantity, categoryID, price);
                    ls.add(phone);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format in line: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ls;
    }

    @Override
    public void saveFile(List<MobilePhone> ls) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MobilePhone> getAlls() {
        return ls;
    }

    @Override
    public List<MobilePhone> findProductByCategoryID(String categoryID) {

        List<MobilePhone> result = new ArrayList<>();
        for (MobilePhone l : ls) {
            if (l.getCategoryID().equalsIgnoreCase(categoryID)) {
                result.add(l);
            }
        }
        return result;
    }

}
