package com.kumarbhuyan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/admin/getdata")
	public String getAdminData() {
		return "Accessed Admin Data.";
	}

	@GetMapping("/public/getdata")
	public String getPublicData() {
		return "Accessed Public Data.";
	}

	@GetMapping("/private/getdata")
	public String getPrivateData() {
		return "Accessed Private Data.";
	}

}
