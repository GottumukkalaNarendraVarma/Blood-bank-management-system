package org.hcl.controllers;

import java.util.List;

import org.hcl.entities.ApproveRequest;
import org.hcl.entities.BloodAvailability;
import org.hcl.entities.DonateBlood;
import org.hcl.entities.RequestBlood;
import org.hcl.entities.User;
import org.hcl.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("/register")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute(user);
		return "registration-form";
	}

	@PostMapping("/add")
	public String registerUser(@ModelAttribute("user") User user, Model model) {
		Integer i = userService.addUser(user);
		Integer z = i;
		String url = null;
		if (i != null) {
			url = "redirect:/success";
		} else
			model.addAttribute("msg", "Please try again after sometime");
		return url;
	}

	@GetMapping("/success")
	public String checkSuccess(Model model) {
		List<User> users = userService.getAll();
		model.addAttribute("persons", users);
		return "success-form";
	}

	@GetMapping("/check")
	public String displayForm(Model model) {
		BloodAvailability bloodAvailability = new BloodAvailability();
		model.addAttribute(bloodAvailability);
		return "blood-availability-form";
	}

	@GetMapping("/new")
	public String newUser() {
		String url = null;
		url = "redirect:/register";
		return url;
	}

	@PostMapping("/show")
	public String addAvailability(@ModelAttribute("bloodAvailability") BloodAvailability bloodAvailability,
			Model model) {
		Integer i = userService.addAvailability(bloodAvailability);
		String url = null;
		if (i != null) {
			url = "redirect:/display";
		} else {
			url = "redirect:/";
		}
		return url;
	}

	@GetMapping("/display")
	public String displayDetails(Model model) {
		List<User> users = userService.getAll();
		model.addAttribute("persons", users);
		return "donor-details";
	}

	@GetMapping("/request")
	public String viewForm(Model model) {
		RequestBlood requestBlood = new RequestBlood();
		model.addAttribute(requestBlood);
		return "request-form";

	}

	@PostMapping("/save")
	public String addRequest(@ModelAttribute("requestBlood") RequestBlood requestBlood, Model model) {
		Integer i = userService.addRequest(requestBlood);
		String url = null;
		if (i != null) {
			url = "redirect:/requestsuccess";

		} else
			model.addAttribute("msg", "Please enter valid Requesterid");
		return url;
	}

	@GetMapping("/requestsuccess")
	public String requestSuccess(Model model) {
		List<RequestBlood> users = userService.showDetails();
		model.addAttribute("users", users);
		return "request-successform";

	}

	@GetMapping("/donate")
	public String provideForm(Model model) {
		DonateBlood donateBlood = new DonateBlood();
		model.addAttribute(donateBlood);
		return "donate-form";
	}

	@PostMapping("/store")
	public String addDonate(@ModelAttribute("donateBlood") DonateBlood donateBlood, Model model) {
		Integer i = userService.addDonate(donateBlood);
		String url = null;
		if (i != null) {
			url = "redirect:/donatesuccess";
			model.addAttribute("msg", "Thank you for your concern towards your fellow human beings");
		} else
			model.addAttribute("msg", "Sorry for the Convinence Please try again after some time");
		return url;

	}

	@GetMapping("/donatesuccess")
	public String donateSuccess(Model model) {
		List<DonateBlood> donors = userService.getDonorDetails();
		model.addAttribute("users", donors);
		return "donate-successform";
	}

	@GetMapping("/process")
	public String requestForm(Model model) {
		ApproveRequest approveRequest = new ApproveRequest();
		model.addAttribute(approveRequest);
		return "approve-form";

	}

	@PostMapping("/decide")
	public String addApprove(@ModelAttribute("approveRequest") ApproveRequest approveRequest, Model model) {
		Integer i = userService.approveRequest(approveRequest);
		String url = null;
		if (i != null) {
			url = "redirect:/print";
		}
		return url;
	}

	@GetMapping("/print")
	public String printDetails(Model model) {
		List<RequestBlood> users = userService.showDetails();
		model.addAttribute("users", users);
		return "final-form";
	}

	@GetMapping("/finalapprove")
	public String finalApprove() {
		return "final-approveform";
	}

	@GetMapping("/finalreject")
	public String finalReject() {
		return "final-rejectform";
	}

}
