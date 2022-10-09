package ders3.example.business;

import ders3.example.Entities.Course;
import ders3.example.core.logging.Logger;
import ders3.example.dataAccess.Interface.ICourseDao;

import java.util.List;

public class CourseManager {
    private List<Course> courses;
    private ICourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(List<Course> courses, ICourseDao courseDao, Logger[] loggers) {
        this.courses = courses;
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course){
        if (course.getCoursePrice() < 0){
            try {
                throw new Exception("Ürün fiyatı 0'dan küçük olamaz !");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        for (Course crs : courses){
            if (crs.getCourseName().equals(course.getCourseName())){
                try {
                    throw new Exception("Kurs Mevcuttur");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        courseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers){
            logger.log(course.getCourseName());
        }


    }
}
