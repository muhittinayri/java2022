package ders3.example.dataAccess.JdbcDao;

import ders3.example.Entities.Category;
import ders3.example.dataAccess.Interface.ICategoryDao;

public class JdbcCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile veritabanına eklendi");
    }
}
