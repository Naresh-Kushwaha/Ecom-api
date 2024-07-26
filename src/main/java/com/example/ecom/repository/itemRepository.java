package com.example.ecom.repository;


import com.example.ecom.Model.itemModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface itemRepository extends CrudRepository<itemModel,Integer> {
}
