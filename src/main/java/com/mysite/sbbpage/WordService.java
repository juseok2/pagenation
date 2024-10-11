package com.mysite.sbbpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {
	@Autowired
	private WordMapper wordMapper;
	
	public Word getWord(Integer id){
		return wordMapper.getWordById(id);
	}
}
