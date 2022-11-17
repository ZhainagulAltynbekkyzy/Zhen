package controller;

import entities.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ToDoService;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class ToDoController {

    private final ToDoService todoService;

    @Autowired
    public ToDoController(ToDoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<ToDo> getToDos(){
        return todoService.getToDos();
    }
}
