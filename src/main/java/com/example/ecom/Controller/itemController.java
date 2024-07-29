package com.example.ecom.Controller;


import com.example.ecom.Model.itemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ecom.Service.itemService;
import java.util.List;

@RestController
@RequestMapping("/api")
public class itemController {
    @Autowired
    itemService itemService;
    @GetMapping("/user")
    public List<itemModel> helloWorld(){

        return itemService.getItem();
    }
    @PostMapping("/admin")
    public String create(@RequestBody itemModel item){
      return   itemService.createItem(item);

    
    }
    @DeleteMapping("/admin/{id}")
    public String DeleteItem(@PathVariable int id){
        itemService.itemDelete(id);

        return "item deleted sucessfully ";

    }


}
