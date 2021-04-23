package com.sofka.co.back_crud_list.services;

import com.sofka.co.back_crud_list.entyties.GroupList;
import com.sofka.co.back_crud_list.repositories.GroupListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class GroupListService {
    @Autowired
    private GroupListRepository repository;

    public Iterable<GroupList> list(){
        return repository.findAll();
    }

    public GroupList save(GroupList groupList){
        return repository.save(groupList);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }

    public GroupList get(Long id){
        return repository.findById(id).orElseThrow();
    }
}
