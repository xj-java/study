package com.example.demo.web.student;

import com.example.demo.model.test.TbStudent;
import com.example.demo.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xiejun
 * @Date: 2020/08/19/15:18
 * @Description:
 */
@RestController
@RequestMapping("/student/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "getAll",method = RequestMethod.POST)
    @ResponseBody
    public List<TbStudent> getAll(){
        return studentService.getAll();
    }

    @RequestMapping(value = "addOrUpdate",method = RequestMethod.POST)
    public String addOrUpdate(@RequestBody TbStudent student){
        return studentService.addOrUpdate(student);
    }
}
