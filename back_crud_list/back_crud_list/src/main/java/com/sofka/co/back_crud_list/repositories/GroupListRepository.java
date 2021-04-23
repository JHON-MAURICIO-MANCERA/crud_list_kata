package com.sofka.co.back_crud_list.repositories;

import com.sofka.co.back_crud_list.entyties.GroupList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GroupListRepository extends CrudRepository<GroupList, Long> {
}