package ders3.example.dataAccess.HibernateDao;

import ders3.example.Entities.Instructor;
import ders3.example.dataAccess.Interface.IInstructorDao;

public class HibernateInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
