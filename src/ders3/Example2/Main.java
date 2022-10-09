package ders3.Example2;

import ders3.Example2.business.CategoryManager;
import ders3.Example2.business.CourseManager;
import ders3.Example2.business.InstructorManager;
import ders3.Example2.core.logging.DatabaseLogger;
import ders3.Example2.core.logging.EmailLogger;
import ders3.Example2.core.logging.FileLogger;
import ders3.Example2.core.logging.ILogger;
import ders3.Example2.dataAccess.hibernateDao.HibernateCategoryDao;
import ders3.Example2.dataAccess.hibernateDao.HibernateCourseDao;
import ders3.Example2.dataAccess.hibernateDao.HibernateInstructorDao;
import ders3.Example2.dataAccess.jdbcDao.JdbcCourseDao;
import ders3.Example2.entities.Category;
import ders3.Example2.entities.Course;
import ders3.Example2.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ILogger[] courseLoggers = {new DatabaseLogger()};
        ILogger[] categoryLoggers = {new DatabaseLogger(), new EmailLogger()};
        ILogger[] instructorLoggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger()};

        /*


        Category category1 = new Category(1, "Software");
        Category category2 = new Category(2, "Software");
        List<Category> categoryDb = new ArrayList<>();
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), categoryLoggers, categoryDb);
        categoryManager.add(category1);
        System.out.println("***************************");
        categoryManager.add(category2);

         */

        /*
        Course course1 = new Course(1,"Java",1500);
        Course course3 = new Course(3,"Java",1500);
        Course course2 = new Course(2,"c#",-1500);
        List<Course> courseDb = new ArrayList<>();
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), courseLoggers, courseDb);
        courseManager.add(course1);
        System.out.println("***************************");
        courseManager.add(course2);
        System.out.println("***************************");
        courseManager.add(course3);
        System.out.println("***************************");
         */

        Instructor instructor1 = new Instructor(1,"Muhittin", "AYRI");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), instructorLoggers);
        instructorManager.add(instructor1);
    }
}
