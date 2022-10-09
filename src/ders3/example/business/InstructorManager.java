package ders3.example.business;

import ders3.example.Entities.Instructor;
import ders3.example.core.logging.Logger;
import ders3.example.dataAccess.Interface.IInstructorDao;

public class InstructorManager {
    private IInstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(IInstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for (Logger logger : loggers){
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }
}
