package hbpojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {

    int id;
    private String name;
    private String age;
//    private String role;

    @Id
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getage() {
        return age;
    }
    public void setage(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student [id=" + id + ", name=" + name + ", age=" + age+"]";
    }




}
