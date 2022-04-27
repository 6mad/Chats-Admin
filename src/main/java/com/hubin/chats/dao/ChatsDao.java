package com.hubin.chats.dao;

import com.hubin.chats.model.Chats;
import org.springframework.stereotype.Repository;

/**
 * ChatsDao继承基类
 */
@Repository
public interface ChatsDao extends MyBatisBaseDao<Chats, Integer> {
}