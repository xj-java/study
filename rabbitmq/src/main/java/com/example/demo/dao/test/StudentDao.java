package com.example.demo.dao.test;

import com.example.demo.model.test.TbStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: xiejun
 * @Date: 2020/08/19/15:11
 * @Description:
 */
@Repository
public interface StudentDao extends JpaRepository<TbStudent,String>{
}
