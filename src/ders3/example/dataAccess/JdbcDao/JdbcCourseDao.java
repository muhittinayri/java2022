package ders3.example.dataAccess.JdbcDao;

import ders3.example.Entities.Course;
import ders3.example.dataAccess.Interface.ICourseDao;

public class JdbcCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile veritabanına eklendi");
    }
}
