package ks.m5s.dao;

import org.springframework.data.repository.CrudRepository;

import ks.m5s.model.Books;

public interface IBooksDao extends CrudRepository<Books, Integer> {

}
