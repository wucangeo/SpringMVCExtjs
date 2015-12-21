package cn.edu.bnu.land.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.bnu.land.service.UsersService;

@Controller
public class UsersWeb {
	private UsersService usersService;

	@Autowired
	public UsersWeb(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping(value = "/get_users")
	// ,method=RequestMethod.POST
	@ResponseBody
	public Map<String, Object> confirm(
	// @RequestParam("searchKey") String searchKey
	) {
		System.out.print("查询users");
		return usersService.getUserData("");

	}
}
