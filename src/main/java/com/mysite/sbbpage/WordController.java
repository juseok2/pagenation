package com.mysite.sbbpage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WordController {
	@Autowired
	private WordService wordService;
	
	@GetMapping("/words/{id}")
	@ResponseBody
	public Word getWord(@PathVariable("id") Integer id) {
		return wordService.getWord(id);
	}
	
	@GetMapping("/words/list")
	@ResponseBody
	public List<Word>getWordList(){
		return wordService.getWordList();
	}
}
