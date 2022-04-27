package com.hubin.chats.services.impl;

import com.hubin.chats.dao.ChatsDao;
import com.hubin.chats.model.ChatsExample;
import com.hubin.chats.model.WatchesExample;
import com.hubin.chats.services.ChatService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class ChatServiceImpl implements ChatService {

    private final ChatsDao chatsDao;

    ChatServiceImpl(ChatsDao chatsDao){
        this.chatsDao = chatsDao;
    }


    @Override
    public List<Map> getHotChatsList() {
        WatchesExample watchesExample = new WatchesExample();
        watchesExample.se
        WatchesExample.Criteria criteria = watchesExample.createCriteria();
        criteria.
                ChatsExample chatsExample = new ChatsExample();
        chatsExample.setOrderByClause("w ");
        ChatsExample.Criteria criteria = chatsExample.createCriteria();
        criteria.and
        return ;
    }
}
