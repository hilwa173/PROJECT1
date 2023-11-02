package example;

import java.util.Random;
import java.util.UUID;

public class  Student {
    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }
    public    Student(){

    }

    public Student(String firtName,String secondName, String gender, UUID uuid) {
        this.firtName = firtName;
        this.secondName = secondName;
        this.gender = gender;
        this.uuid = uuid;
    }

    private String firtName, secondName;
    public String gender;
    UUID uuid;
    public void setFirsName(String name){
        this.firtName=name;
    }
    public void setSecondName(String sname){
        this.secondName=sname;
    }

    public  void setGender(String gender){
        this.gender=gender;
    }
    public void setUuid(UUID uuid){
        this.uuid=uuid;

    }


    public String getFirtName()
    {
        return firtName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getGender() {
        return gender;
    }

    public UUID getUuid() {
        return uuid;
    }


}