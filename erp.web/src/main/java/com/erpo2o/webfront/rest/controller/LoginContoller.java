/**
 * 
 */
package com.erpo2o.webfront.rest.controller;


import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author LuSongchao
 *
 */
@Controller
public class LoginContoller {

	@RequestMapping(value="login.do")
	@ResponseBody
	public Object login()
	{
		Map<String, String> hello = new HashMap<String, String>();
		hello.put("name", "erpo2o");
		
		return hello;
	}
}
