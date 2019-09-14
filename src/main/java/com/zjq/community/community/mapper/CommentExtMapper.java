package com.zjq.community.community.mapper;

import com.zjq.community.community.model.Comment;
import com.zjq.community.community.model.CommentExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int inCommentCount(Comment record);
}