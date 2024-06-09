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
    public int insert(Category category);
//    public int update(Category category);
    public int delete(String id);
    public int findByID(String id);
    public Category getCategoryByPossition(int index);
    List<Category> openFile();
    void saveFile(List<Category> ls);
    List<Category> getAlls();
}
