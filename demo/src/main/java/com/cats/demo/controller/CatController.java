package com.cats.demo.controller;

import com.cats.demo.dto.CatDto;
import com.cats.demo.entity.Cat;
import com.cats.demo.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;


    @PostMapping
    public Cat save (@RequestBody CatDto catDto){
        return catService.save(catDto);
    }

    @GetMapping
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }
}
