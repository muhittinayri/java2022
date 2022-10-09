package ders3.example.dataAccess.JdbcDao;

import ders3.example.Entities.Instructor;
import ders3.example.dataAccess.Interface.IInstructorDao;

public class JdbcInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile veritabanına eklendi");
    }
}
