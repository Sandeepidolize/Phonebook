package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import bean.PhoneBean;

@Controller
public class PhoneBookController {

	@PostMapping("/savePhone")
    public String savePhone(PhoneBean phoneBean, Model model) {
        
		return String;
}
}
