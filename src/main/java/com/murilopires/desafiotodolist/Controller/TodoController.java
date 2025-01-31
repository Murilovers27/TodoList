package com.murilopires.desafiotodolist.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murilopires.desafiotodolist.Entity.Todo;
import com.murilopires.desafiotodolist.Service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {

  @Autowired
  private TodoService todoService;

  @PostMapping
  List<Todo> create(@RequestBody Todo todo) {
    return todoService.create(todo);
  }

  @GetMapping
  List<Todo> list() {
    return todoService.list();
  }

  @PutMapping
  List<Todo> update(Todo todo) {
    return todoService.update(todo);
  }

  @DeleteMapping("{id}")
  List<Todo> delete(@PathVariable Long id) {
    return todoService.delete(null);
  }
}
