package com.example.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    private List<String> tasks = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("tasks", tasks);

        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String task) {

        tasks.add(task);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id) {

        tasks.remove(id);

        return "redirect:/";
    }
}
