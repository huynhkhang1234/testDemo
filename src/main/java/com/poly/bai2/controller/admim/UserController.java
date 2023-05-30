package com.poly.bai2.controller.admim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.bai2.DTO.UserDTO;
import com.poly.bai2.Repository.UserRepository;
import com.poly.bai2.entity.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;


@Controller
@RequestMapping(value = "/admim/user")
public class UserController {
	@Autowired
private	HttpServletRequest request;
	
	
	 @Autowired
	private UserRepository userRepository;
	 
	
	@GetMapping(value="index")
	public String index(Model m) {
		//System.out.println(this.userRepository.findAll());
	//	List<User> listUser = this.userRepository.findAll();
		//System.out.println(listUser);
		//m.addAttribute("listUser", listUser);
		//System.out.println("indexx");
		return "admim/user/index";
	}
	
	@GetMapping(value="{id}")
	public String show(@RequestParam(name="id") int i) {
	User user = new User();
	
	
		return "admim/user/show";
	}
	@GetMapping(value="/create")
	public String create() {
		System.out.println("create");
		return "admim/user/create";	
	}
	
	@GetMapping(value="/edit/{id}")
	public String edit(Model m) {
		User user = new User();
		user.setId(1);
		user.setEmail("khanghbpc04012");
		user.setUsername("huynh khang");
		user.setPhoto("2323");
		user.setPassWord("123");
		user.setAdmin(1);
		user.setActivated(1);				
		m.addAttribute("user", user);
		System.out.println("edit");
		return "admim/user/edit";
	}
	
	@PostMapping(value="/update/{id}")
	public String update
	(
			Model model,
			@Valid UserDTO userDTO,
			BindingResult result
	)
	{
		System.out.println("Sổ lõi: " + result.getAllErrors());
		if(result.hasErrors()) {
			System.out.println("có lỗi");
			model.addAttribute("errors", result.getAllErrors());
			model.addAttribute("user", userDTO);
			return "/admim/user/edit";
		}else {
			System.out.println("update");
			return "redirect:/admim/user/index";	
		}				
	}

	
	@PostMapping(value="/delete/{id}")
	public String delete() {
		System.out.println("delete");
		return "admim/user/index";
	}

	@PostMapping(value="/store")
	public String store
	(	
			Model model,
			@Valid UserDTO userDTO,
			BindingResult result
			
	) {
		System.out.println("Sổ lõi: " + result.getAllErrors());
		if(result.hasErrors()) {
			System.out.println("có lỗi");
			return "redirect:/admim/user/create";
		}else {
			System.out.println("store");
			return "redirect:/admim/user/index";	
		}
		
	}

}
