package jbc.mfh.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	//http://localhost:8080/hello?name=faysal
	@RequestMapping("/hello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}
	
//	   @PostMapping(value = "/login", produces = { MediaType.APPLICATION_JSON_VALUE })
//	   @ResponseBody
//	   public EmployeeJsonRespone login(@ModelAttribute @Valid Employee employee,
//	         BindingResult result) {
//
//	      
//	      if(result.hasErrors()){
//	         
//	         //Get error message
//	         
//	         respone.setValidated(false);
//	         respone.setErrorMessages(errors);
//	      }else{
//	         // Implement business logic to save employee into database
//	         //..
//	         respone.setValidated(true);
//	         respone.setEmployee(employee);
//	      }
//	      return respone;
//	   }

	public String test() {
		return "";
	}
}
