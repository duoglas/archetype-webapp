package me.plzbite.webapp.web;

import me.plzbite.webapp.dao.TestDao;
import me.plzbite.webapp.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test/*")
public class TestController {
    @Autowired
    @Qualifier("testDao")
    private TestDao testDao;

    @RequestMapping("/test/index.htm")
    public String showIndex(){

        List<Test> test=testDao.getAll();

        return "index.vm";
    }
}
