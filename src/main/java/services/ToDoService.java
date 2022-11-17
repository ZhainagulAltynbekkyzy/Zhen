package services;

import entities.ToDo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ToDoService {
    @GetMapping
    public List<ToDo> getToDos(){
        return List.of(
                new ToDo(
                        "assignmentDemo1",
                        LocalDate.of(2000, Month.AUGUST, 5),
                        true
                )
        );
    }
}