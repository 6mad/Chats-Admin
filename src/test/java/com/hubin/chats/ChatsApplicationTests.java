package com.hubin.chats;

import com.hubin.chats.dao.UserDao;
import com.hubin.chats.model.User;
import com.hubin.chats.model.UserExample;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class ChatsApplicationTests {

    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
    }

    @Test
    public void testExample() {

        UserExample example = new UserExample();
//设置排序规则
        example.setOrderByClause("id desc");
//设置是否 distinct 去重
        example.setDistinct(true);
//创建条件
        UserExample.Criteria criteria = example.createCriteria();
//id >= 1
        criteria.andTokenEqualTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjgiLCJleHAiOjE2NDc4NjI4NDd9.AImD1NRQtesuY4U5xqIlfLeZnuk_vVkjZKZt-R_4dEw");
//id< 4
//            criteria.andidLessThan(4) ;
////countrycode like ’ %U% ’ //；最容易 出错的地方，注意 like 必须自己写上通配符的位直
//            criteria.andCountrycodeLike( "%U% " );
//or 的情况
//            CountryExample.Criteria or= example.or();
////countryname＝中国
//            or.andCountrynameEqualTo （ "中国");
//执行查询

        List<User> list = userDao.selectByExample(example);
        for(User user: list){
            System.out.println("test result:"+user.getEmail()+user.getName());
        }

    }
}


