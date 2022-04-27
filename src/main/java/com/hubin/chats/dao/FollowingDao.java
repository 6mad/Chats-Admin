package com.hubin.chats.dao;

import com.hubin.chats.model.FollowingExample;
import com.hubin.chats.model.FollowingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowingDao {
    long countByExample(FollowingExample example);

    int deleteByExample(FollowingExample example);

    int deleteByPrimaryKey(FollowingKey key);

    int insert(FollowingKey record);

    int insertSelective(FollowingKey record);

    List<FollowingKey> selectByExample(FollowingExample example);

    int updateByExampleSelective(@Param("record") FollowingKey record, @Param("example") FollowingExample example);

    int updateByExample(@Param("record") FollowingKey record, @Param("example") FollowingExample example);
}