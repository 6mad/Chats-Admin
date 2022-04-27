package com.hubin.chats.dao;

import com.hubin.chats.model.Xsbb;
import com.hubin.chats.model.XsbbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface XsbbDao {
    long countByExample(XsbbExample example);

    int deleteByExample(XsbbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xsbb record);

    int insertSelective(Xsbb record);

    List<Xsbb> selectByExample(XsbbExample example);

    Xsbb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xsbb record, @Param("example") XsbbExample example);

    int updateByExample(@Param("record") Xsbb record, @Param("example") XsbbExample example);

    int updateByPrimaryKeySelective(Xsbb record);

    int updateByPrimaryKey(Xsbb record);
}