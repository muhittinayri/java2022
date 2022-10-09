package ders3.Example2.business;

import ders3.Example2.core.logging.ILogger;
import ders3.Example2.dataAccess.interfaceDao.IInstructorDao;
import ders3.Example2.entities.Instructor;

import java.util.List;

public class InstructorManager {
    private IInstructorDao instructorDao;
    private ILogger[] loggers;

    public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for (ILogger logger : loggers){
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }
}
