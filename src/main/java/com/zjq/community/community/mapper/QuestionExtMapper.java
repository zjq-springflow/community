package com.zjq.community.community.mapper;

import com.zjq.community.community.dto.QuestionQueryDTO;
import com.zjq.community.community.model.Question;
import com.zjq.community.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {
    int incView(Question record);

    int inCommentCount(Question record);

    List<Question> selectRelated(Question question);

    Integer countBySearch(QuestionQueryDTO questionQueryDTO);

    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);
}