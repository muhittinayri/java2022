package ders3.example.business;

import ders3.example.Entities.Category;
import ders3.example.core.logging.Logger;
import ders3.example.dataAccess.Interface.ICategoryDao;

import java.util.List;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(ICategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category){
        for (Category ctgy : categories){
            if (ctgy.getCategoryName().equals(category.getCategoryName())){
                try {
                    throw new Exception("Kurs Mevcuttur");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            categoryDao.add(category);
            categories.add(category);

            for (Logger logger : loggers){
                logger.log(category.getCategoryName());
            }
        }
    }
}
