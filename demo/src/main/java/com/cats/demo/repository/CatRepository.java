package com.cats.demo.repository;

import com.cats.demo.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository <Cat, String> {

}
