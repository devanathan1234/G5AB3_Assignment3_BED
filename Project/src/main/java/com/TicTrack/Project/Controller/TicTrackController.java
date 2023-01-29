package com.TicTrack.Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.TicTrack.Project.Service.TicTracService;

@Controller

public class TicTrackController {
	
	private TicTracService tictracService;

	public TicTrackController(TicTracService tictracService) {
		super();
		this.tictracService = tictracService;
	}
	
	@GetMapping("/tictracs")
	public String listTicTracs(Model model) {
		model.addAttribute("tictracs",tictracService.getallTracs());
		return "tictracs";
		
	}

}
