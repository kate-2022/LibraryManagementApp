package ks.m5s.dao;

import org.springframework.data.repository.CrudRepository;
import ks.m5s.model.Librarian;

public interface ILibrarianDao extends CrudRepository<Librarian, Long> {

}
