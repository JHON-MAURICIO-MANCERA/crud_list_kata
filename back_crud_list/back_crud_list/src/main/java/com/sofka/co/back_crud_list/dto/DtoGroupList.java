package com.sofka.co.back_crud_list.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DtoGroupList {

        private Long idDtoGroupList;
        private String name;
        private Set<DtoTodo> todos = new HashSet<>();

    public DtoGroupList() {
    }

    public DtoGroupList(Long idDtoGroupList, String name, Set<DtoTodo> todos) {
        this.idDtoGroupList = idDtoGroupList;
        this.name = name;
        this.todos = todos;
    }

    public Long getIdDtoGroupList() {
        return idDtoGroupList;
    }

    public void setIdDtoGroupList(Long idDtoGroupList) {
        this.idDtoGroupList = idDtoGroupList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<DtoTodo> getTodos() {
        return todos;
    }

    public void setTodos(Set<DtoTodo> todos) {
        this.todos = todos;
    }
}
