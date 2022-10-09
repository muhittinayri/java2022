package ders3.Example2.dataAccess.hibernateDao;

import ders3.Example2.dataAccess.interfaceDao.ICourseDao;
import ders3.Example2.entities.Course;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
