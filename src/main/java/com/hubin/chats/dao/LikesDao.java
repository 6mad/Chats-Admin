package com.hubin.chats.dao;

import com.hubin.chats.model.LikesExample;
import com.hubin.chats.model.LikesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesDao {
    long countByExample(LikesExample example);

    int deleteByExample(LikesExample example);

    int deleteByPrimaryKey(LikesKey key);

    int insert(LikesKey record);

    int insertSelective(LikesKey record);

    List<LikesKey> selectByExample(LikesExample example);

    int updateByExampleSelective(@Param("record") LikesKey record, @Param("example") LikesExample example);

    int updateByExample(@Param("record") LikesKey record, @Param("example") LikesExample example);
}