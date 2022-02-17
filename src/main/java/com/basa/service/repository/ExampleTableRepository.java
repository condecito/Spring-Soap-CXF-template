/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basa.service.repository;

import com.basa.service.entity.ExampleTable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ronya
 */
@Repository
public interface ExampleTableRepository extends JpaRepository<ExampleTable, Long> {
    
   // List<ExampleTable> findByContent(String  content);
    

//    public List<ExampleTable> findByTitle(String title);
//
//    public List<ExampleTable> findByContent(String content);

//    public List<ExampleTable> findById(int id);
//    public List<ExampleTable> findAll();

//    public List<ExampleTable> findByTitleContent(String content, String title);

}
