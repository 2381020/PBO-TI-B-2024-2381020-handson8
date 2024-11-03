package services;

import entities.TodoList;

public interface TodoListService {
    TodoList[] getTodoList();
    void addTodoList(String Todo);
    Boolean removeTodoList(Integer number);
    Boolean editTodoList(Integer number, String todo);
}
