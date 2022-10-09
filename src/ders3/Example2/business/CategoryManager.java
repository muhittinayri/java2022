package ders3.Example2.business;

import ders3.Example2.core.logging.ILogger;
import ders3.Example2.dataAccess.interfaceDao.ICategoryDao;
import ders3.Example2.entities.Category;

import java.util.List;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private ILogger[] loggers;
    private List<Category> categories;

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) {
        for (Category ctgy : categories) {
            if (ctgy.getCategoryName().equals(category.getCategoryName())) {
                System.out.println("Kurs Mevcuttur !");
            }
        }

        categoryDao.add(category);
        categories.add(category);

        for (ILogger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }
}

