package com.mysite.sbbpage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {
	@Autowired
	private WordMapper wordMapper;
	
	public Word getWord(Integer id){
		return wordMapper.getWordById(id);
	}
	public List<Word>getWordList(){
		return wordMapper.getWordList();
	}
	public List<Word> getWordList(int page, int size) {
		int offset = (page - 1) * size;
		// TODO Auto-generated method stub
		return wordMapper.getWordListOffset(offset, size);
	}
}
