package com.sofka.co.back_crud_list.entyties;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="grouplist")
public class GroupList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Todo> todo;


    public GroupList() {
    }


    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

