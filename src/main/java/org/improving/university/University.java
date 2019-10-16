package org.improving.university;
import javax.persistence.*;
import java.util.List;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany
    private List<Student> students;

    public University(){
    }

    public University(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


}
