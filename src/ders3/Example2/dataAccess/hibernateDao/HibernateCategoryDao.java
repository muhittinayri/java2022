package ders3.Example2.dataAccess.hibernateDao;

import ders3.Example2.dataAccess.interfaceDao.ICategoryDao;
import ders3.Example2.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
