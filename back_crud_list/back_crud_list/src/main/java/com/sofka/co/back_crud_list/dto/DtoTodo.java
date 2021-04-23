package com.sofka.co.back_crud_list.dto;


public class DtoTodo {

    private Long id;
    private String name;
    private boolean completed;
    private  Long groupListId;

    public DtoTodo(Long id, String name, boolean completed, Long groupListId) {
        this.id = id;
        this.name = name;
        this.completed = completed;
        this.groupListId = groupListId;
    }

    public DtoTodo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Long getGroupListId() {
        return groupListId;
    }

    public void setGroupListId(Long groupListId) {
        this.groupListId = groupListId;
    }
}
