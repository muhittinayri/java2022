package ders3.Example2.dataAccess.hibernateDao;

import ders3.Example2.dataAccess.interfaceDao.IInstructorDao;
import ders3.Example2.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
