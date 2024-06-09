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

    public static List<Category> ls = new ArrayList<>();

    @Override
    public int insert(Category category) {
        int pos = findByID(category.getId());
        if (pos < 0) {
            ls.add(category);
            return 1;
        }
        ls.set(pos, category);
        return 1;
    }

    @Override
    public int delete(String id) {
        int pos = findByID(id);
        if (pos < 0) {
            System.out.println("Delete false!");
            return -1;
        }
        ls.remove(pos);
        System.out.println("Delete Successfully");
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
    public Category getCategoryByPossition(int index) {
        if (index >= 0 && index < ls.size()) {
            return ls.get(index);
        }
        return null;
    }

    @Override
    public List<Category> openFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveFile(List<Category> ls) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Category> getAlls() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
