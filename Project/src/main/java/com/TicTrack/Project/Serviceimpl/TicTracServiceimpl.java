package com.TicTrack.Project.Serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.TicTrack.Project.Service.TicTracService;
import com.TicTrack.Project.entity.TicTrac;
import com.TicTrack.Project.repository.TicRepository;



@Service
public class TicTracServiceimpl implements TicTracService{
	
	private TicRepository ticRepository;
	
	

	public TicTracServiceimpl(TicRepository ticRepository) {
		super();
		this.ticRepository = ticRepository;
	}



	@Override
	public List<TicTrac> getallTracs() {
		
		return ticRepository.findAll();
	}

}
