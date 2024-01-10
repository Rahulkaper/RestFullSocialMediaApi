package Rahul.Devs.restfulwebservices.User;

import java.time.LocalDate;

public class user {
    private int ID;
    private String Name;
   private LocalDate BirthDate;
   
public user(int iD, String name, LocalDate birthDate) {
    ID = iD;
    Name = name;
    BirthDate = birthDate;
}

public void setID(int iD) {
    ID = iD;
}

public void setName(String name) {
    Name = name;
}

public void setBirthDate(LocalDate birthDate) {
    BirthDate = birthDate;
}

public int getID() {
    return ID;
}

public String getName() {
    return Name;
}

public LocalDate getBirthDate() {
    return BirthDate;
}

@Override
public String toString() {
    return "user [ID=" + ID + ", Name=" + Name + ", BirthDate=" + BirthDate + "]";
}    
   
}
