package ks.m5s.dao;

import org.springframework.data.repository.CrudRepository;

import ks.m5s.model.BookCatalogue;

public interface IBooksDao extends CrudRepository<BookCatalogue, Integer> {

}
