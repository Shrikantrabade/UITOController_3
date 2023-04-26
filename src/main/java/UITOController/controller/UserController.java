package UITOController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	
	@GetMapping("/loadForm")
	public String loadform() {
		return "RegForm";
		
		
	}
}
