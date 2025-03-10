package com.wipro.Thyme_sb_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Thyme_sb_project.mode.User;
import com.wipro.Thyme_sb_project.service.UserService;
@RestController
public class UserController {
	    @Autowired
	    private UserService userService;

	    @GetMapping
	    public String getAllUsers(Model model) {
	        List<User> users = userService.getAllUsers();
	        model.addAttribute("users", users);
	        return "user-list";
	    }

	    @GetMapping("/new")
	    public String showCreateForm(Model model) {
	        model.addAttribute("user", new User());
	        return "user-form";
	    }

	    @PostMapping
	    public String createUser(User user) {
	        userService.createUser(user);
	        return "redirect:/users";
	    }

	    @GetMapping("/edit/{id}")
	    public String showEditForm(@PathVariable("id") Long userId, Model model) {
	        User user = userService.getUserById(userId);
	        model.addAttribute("user", user);
	        return "user-form";
	    }

	    @PostMapping("/update/{id}")
	    public String updateUser(@PathVariable("id") Long userId, User user) {
	        user.setId(userId);
	        userService.updateUser(user);
	        return "redirect:/users";
	    }

	    @GetMapping("/{id}")
	    public String viewUser(@PathVariable("id") Long userId, Model model) {
	        User user = userService.getUserById(userId);
	        model.addAttribute("user", user);
	        return "user-detail";
	    }

	    @GetMapping("/delete/{id}")
	    public String deleteUser(@PathVariable("id") Long userId) {
	        userService.deleteUser(userId);
	        return "redirect:/users";
	    }
	    
	    
}
