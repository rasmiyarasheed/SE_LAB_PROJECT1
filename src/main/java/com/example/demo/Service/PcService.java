package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Pc;
import com.example.demo.repository.PcRepo;

@Service
public class PcService {

	
	@Autowired
	private PcRepo pcRepo;
	
	public Pc saveDetails(Pc pc) {
		return pcRepo.save(pc);
	}

}
