package com.murilopires.desafiotodolist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilopires.desafiotodolist.Entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
