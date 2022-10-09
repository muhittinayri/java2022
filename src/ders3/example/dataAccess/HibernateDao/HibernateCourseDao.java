package ders3.example.dataAccess.HibernateDao;

import ders3.example.Entities.Course;
import ders3.example.dataAccess.Interface.ICourseDao;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
