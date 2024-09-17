package konst.web_app.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "ENTER a Name")
    @Size(min = 1, max = 15, message = "Name should be between 1 and 15 characters")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "ENTER a SurName")
    @Size(min = 1, max = 15, message = "Name should be between 1 and 15 characters")
    @Column(name = "surName")
    private String surName;

    public User() {}

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
