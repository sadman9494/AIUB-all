package controller;

import model.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class stdcontroller {

    public List<student> students = new ArrayList<>();
    @RequestMapping("/student")
    public String showform()
    {
        System.out.println("sakib");
        return "registration";
    }
    @RequestMapping(value = "/show", method = RequestMethod.POST)
    public String showinfo(@RequestParam("name") String name,
                           @RequestParam("id") int id,
                           @RequestParam("CGP")  double cgp, Model model)
    {
        student s = new student( name, id ,cgp);
        students.add(s);

        model.addAttribute("student" ,students);






        return "showinfo";
    }
}
