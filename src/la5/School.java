package la5;

import example.Student;

import java.util.UUID;

public class School {


    public void connMethod() {
        UUID uuid=UUID.randomUUID();
        Student stud=new Student();
        Student student = new Student("sura","Surafel","",uuid);
        stud.setFirsName("bena");
        String name=stud.getFirtName();
        System.out.println(student.getFirtName());
    }

}