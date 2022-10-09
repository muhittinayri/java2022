package ders3.Example2.business;

import ders3.Example2.core.logging.ILogger;
import ders3.Example2.dataAccess.interfaceDao.ICourseDao;
import ders3.Example2.entities.Course;

import java.util.List;

public class CourseManager {
    private ICourseDao courseDao;
    private ILogger[] loggers;
    private List<Course> courses;

    public CourseManager(ICourseDao courseDao, ILogger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course){
        if (course.getCoursePrice() < 0){
            System.out.println("Kurs Fiyatı 0'dan küçük olamaz !");
        }
        for (Course crs : courses){
            if (crs.getCourseName().equals(course.getCourseName())){
                System.out.println("Kurs Mevcuttur !");
            }
        }


        courses.add(course);
        courseDao.add(course);

        for (ILogger logger : loggers){
            logger.log(course.getCourseName());
        }
    }
}
