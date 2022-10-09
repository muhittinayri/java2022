package ders3.example;

import ders3.example.Entities.Category;
import ders3.example.Entities.Course;
import ders3.example.Entities.Instructor;
import ders3.example.business.CategoryManager;
import ders3.example.business.CourseManager;
import ders3.example.business.InstructorManager;
import ders3.example.core.logging.DatabaseLogger;
import ders3.example.core.logging.EmailLogger;
import ders3.example.core.logging.FileLogger;
import ders3.example.core.logging.Logger;
import ders3.example.dataAccess.HibernateDao.HibernateCourseDao;
import ders3.example.dataAccess.HibernateDao.HibernateInstructorDao;
import ders3.example.dataAccess.JdbcDao.JdbcCategoryDao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};

        Course course1 = new Course(1,"Java", 0);
        List<Course> courseDb = new ArrayList<>();
        CourseManager courseManager
                = new CourseManager(courseDb, new HibernateCourseDao(), loggers);
        courseManager.add(course1);
        System.out.println("----------------------------------------------------------");

        Category category1 = new Category(1, "Programlama");
        Category category2 = new Category(2, "Programlama");

        List<Category> categoryDb = new ArrayList<>();

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categoryDb);
        categoryManager.add(category1);
        categoryManager.add(category2);

        System.out.println("----------------------------------------------------------");

        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor);
    }
}
