package com.isika.projet.adrien.springbackpj4.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isika.projet.adrien.springbackpj4.modele.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
