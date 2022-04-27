package com.hubin.chats.dao;

import com.hubin.chats.model.WatchesExample;
import com.hubin.chats.model.WatchesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchesDao {
    long countByExample(WatchesExample example);

    int deleteByExample(WatchesExample example);

    int deleteByPrimaryKey(WatchesKey key);

    int insert(WatchesKey record);

    int insertSelective(WatchesKey record);

    List<WatchesKey> selectByExample(WatchesExample example);

    int updateByExampleSelective(@Param("record") WatchesKey record, @Param("example") WatchesExample example);

    int updateByExample(@Param("record") WatchesKey record, @Param("example") WatchesExample example);
}