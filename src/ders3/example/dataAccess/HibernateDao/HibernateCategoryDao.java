package ders3.example.dataAccess.HibernateDao;

import ders3.example.Entities.Category;
import ders3.example.dataAccess.Interface.ICategoryDao;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
