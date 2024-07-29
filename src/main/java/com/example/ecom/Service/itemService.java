package com.example.ecom.Service;

import com.example.ecom.Model.itemModel;
import com.example.ecom.repository.itemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class itemService {
    @Autowired

    private itemRepository itemRepository;
    public List<itemModel> getItem(){
        List<itemModel> item=new ArrayList<>();
        item= (List<itemModel>) itemRepository.findAll();
        return item;

    }
    public String createItem(itemModel itemModel){
      itemRepository.save(itemModel);
      return "saved ";

    }
    public String itemDelete(int id){
         itemRepository.deleteById(id);
         return "deleted";
    }


}
