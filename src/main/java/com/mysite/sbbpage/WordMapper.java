package com.mysite.sbbpage;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WordMapper {
	Word getWordById(Integer id);
	List<Word> getWordList();
	List<Word> getWordListOffset(@Param("offset") Integer offset,@Param("size") Integer size);
}
