package com.hubin.chats.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * xsbb
 * @author 
 */
@Data
public class Xsbb implements Serializable {
    private Integer id;

    /**
     * 回复者id
     */
    private Integer responder;

    /**
     * 问题主题的id外键
     */
    private Integer chatsId;

    /**
     * 回复内容
     */
    private String respond;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Xsbb other = (Xsbb) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getResponder() == null ? other.getResponder() == null : this.getResponder().equals(other.getResponder()))
            && (this.getChatsId() == null ? other.getChatsId() == null : this.getChatsId().equals(other.getChatsId()))
            && (this.getRespond() == null ? other.getRespond() == null : this.getRespond().equals(other.getRespond()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getResponder() == null) ? 0 : getResponder().hashCode());
        result = prime * result + ((getChatsId() == null) ? 0 : getChatsId().hashCode());
        result = prime * result + ((getRespond() == null) ? 0 : getRespond().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", responder=").append(responder);
        sb.append(", chatsId=").append(chatsId);
        sb.append(", respond=").append(respond);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}