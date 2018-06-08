/**
 * 
 */
package com.zn.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.zn.controller.pojo.Suser;

/**
 * 学生控制器
 * @author zhengnan
 *
 */
@Controller("studentController")
@RequestMapping("/stu")
public class StudentController { 
	/**
	 * restApi
	 * @param name
	 * @param age
	 * @return
	 *
	 * @author zhengnan
	 */
	@RequestMapping("login/{age}")
	public String login(String name,@PathVariable("age") String age) {
		System.out.println(name+"="+age);
		return "main";
	}
	
	/**
	 * 参数自动设置进Suser
	 * @param user
	 * @param req
	 * @return
	 *
	 * @author zhengnan
	 */
	@RequestMapping("suser")
	public String sUser(Suser user,HttpServletRequest req) {
		System.out.println(user.getKemu()+":"+user.getScore()+":"+user.getCtime());
		System.out.println(req.getRemoteAddr()+":"+req.getRemotePort());
		return "main";
	}
	
	/**
	 * 返回json对象
	 * @param name
	 * @return
	 *
	 * @author zhengnan
	 */
	@RequestMapping("json")
	@ResponseBody
	public JSONObject json(String name) {
		JSONObject r = new JSONObject();
		r.put("key", name);
		
		return r;
	}
	
	/**
	 * 返回map对象，也同样被转换为json
	 * @return
	 *
	 * @author zhengnan
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping("map")
	@ResponseBody
	public Map map() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "张三");
		map.put("age", 10);
		Suser u = new Suser();
		u.setKemu("语文");
		u.setScore(100);
		map.put("sUser", u);
		
		return map;
	}
}
