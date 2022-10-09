package ders3.Example2.dataAccess.jdbcDao;

import ders3.Example2.dataAccess.interfaceDao.IInstructorDao;
import ders3.Example2.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile veritabanına eklendi");
    }
}
