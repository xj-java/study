package com.example.demo.service.student;

import com.example.demo.dao.test.StudentDao;
import com.example.demo.model.test.TbStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xiejun
 * @Date: 2020/08/19/15:16
 * @Description:
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public List<TbStudent> getAll(){
        return studentDao.findAll();
    }

    public String addOrUpdate(TbStudent student){
        studentDao.save(student);
        return "success";
    }

}
