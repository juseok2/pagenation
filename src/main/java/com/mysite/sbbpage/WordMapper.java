package com.mysite.sbbpage;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WordMapper {
	Word getWordById(Integer id);
}
