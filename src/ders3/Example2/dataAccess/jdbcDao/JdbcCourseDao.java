package ders3.Example2.dataAccess.jdbcDao;

import ders3.Example2.dataAccess.interfaceDao.ICourseDao;
import ders3.Example2.entities.Course;

public class JdbcCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile veritabanına eklendi");
    }
}
