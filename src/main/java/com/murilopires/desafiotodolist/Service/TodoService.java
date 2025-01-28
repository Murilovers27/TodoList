package com.murilopires.desafiotodolist.Service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murilopires.desafiotodolist.Entity.Todo;
import com.murilopires.desafiotodolist.Repository.TodoRepository;

// A camada de serviços e onde contem as regras de negocios(metodos utilizados durante a aplicação)
@Service
public class TodoService {

  @Autowired
  private TodoRepository todoRepository;

  public List<Todo> create(Todo todo) {
    todoRepository.save(todo);
    return list();

  }

  public List<Todo> list() {
    Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
    return todoRepository.findAll(sort);
  }

  public List<Todo> update(Todo todo) {
    todoRepository.save(todo);
    return list();
  }

  public List<Todo> delete(Long id) {
    todoRepository.deleteById(id);
    return list();
  }
}
