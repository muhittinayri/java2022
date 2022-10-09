package ders3.Example2.dataAccess.jdbcDao;

import ders3.Example2.dataAccess.interfaceDao.ICategoryDao;
import ders3.Example2.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile veritabanına eklendi");
    }
}
