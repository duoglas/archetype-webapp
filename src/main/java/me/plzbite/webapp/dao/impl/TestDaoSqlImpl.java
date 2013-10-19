package me.plzbite.webapp.dao.impl;


import me.plzbite.webapp.dao.TestDao;
import me.plzbite.webapp.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("testDao")
public class TestDaoSqlImpl implements TestDao {

    @Autowired
    @Qualifier("sqlMapClientTemplateR")
    private SqlMapClientTemplate rTemplate;
    @Override
    public List<Test> getAll() {
        return rTemplate.queryForList("Test.getAll");
    }
}
