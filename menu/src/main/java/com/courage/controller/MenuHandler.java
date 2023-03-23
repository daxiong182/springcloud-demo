package com.courage.controller;

import com.courage.entity.Menu;
import com.courage.entity.MenuVO;
import com.courage.entity.Type;
import com.courage.repostories.MenuRepository;
import com.courage.repostories.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private MenuRepository menuRrepository;

    @Autowired
    private TypeRepository typeRepository;

    @GetMapping("/index")
    public String index(){
        return "111";
    }

    @GetMapping("/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index,@PathVariable("limit") int limit){
        return new MenuVO(0,"",menuRrepository.count(),menuRrepository.findAll(index,limit));
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        menuRrepository.deleteById(id);
    }

    @GetMapping("/findTypes")
    public List<Type> findTypes(){
        return typeRepository.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
        menuRrepository.save(menu);
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") long id){
        return menuRrepository.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Menu menu){
        menuRrepository.update(menu);
    }


}

















