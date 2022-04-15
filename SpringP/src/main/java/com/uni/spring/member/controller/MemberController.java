package com.uni.spring.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.uni.spring.member.model.dto.Member;

@Controller
public class MemberController {
	
	
	//1.HttpServletRequest 를 통해 전송받기 (기존 jsp/servlet방식)
	/*@RequestMapping(value="login.do", method=RequestMethod.POST) //@RequestMapping 을 붙여 줌으로써 HandlerMapping 등록
	public String loginMember(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		System.out.println("ID : "+ userId);
		System.out.println("PWD : "+ userPwd);
		return "main";//리턴되는 문자열을 servlet-context.xml 의 viewressolver에 의해 사용자가 보게될 뷰로 포워딩
	}*/
	
	//2. @RequestParam 어노테이션 방식 - 스프링에서 제공하는 파라미터를 받아오는 방식
	/*@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String loginMember(@RequestParam("userId") String userId, @RequestParam("userPwd") String userPwd) {
		
		System.out.println("ID : "+ userId);
		System.out.println("PWD : "+ userPwd);
		return "main";//리턴되는 문자열을 servlet-context.xml 의 viewressolver에 의해 사용자가 보게될 뷰로 포워딩
	}*/
	
	//3. @RequestParam 오노테이션 생략 -매개변수 name 과 동일하게 작성해야 자동으로 값이 주입된다.
	/*@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String loginMember( String userId, String userPwd) {
		
		System.out.println("ID : "+ userId);
		System.out.println("PWD : "+ userPwd);
		return "main";//리턴되는 문자열을 servlet-context.xml 의 viewressolver에 의해 사용자가 보게될 뷰로 포워딩
	}*/
	
	//4. @ModelAttribute 를 이용한 방법 - 요청 파라미터가 많은경우 객체 타입으로 넘겨 받는데 기본생성자와 setter를 이용한 주입 방식이므로
	//없으면 에러 . 반드시 name 속성에 있는 값과 필드명이 동일 해야하고 setter 작성하는 규칙에 맞게 작성되어야한다.
	/*@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String loginMember( @ModelAttribute Member m) {
		
		System.out.println("ID : "+ m.getUserId());
		System.out.println("PWD : "+ m.getUserPwd());
		return "main";//리턴되는 문자열을 servlet-context.xml 의 viewressolver에 의해 사용자가 보게될 뷰로 포워딩
	}
	*/
	
	//@ModelAttribute 생략하고 객체를 바로 전달 받는 방식
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String loginMember( Member m) {
		
		System.out.println("ID : "+ m.getUserId());
		System.out.println("PWD : "+ m.getUserPwd());
		
		
		return "main";//리턴되는 문자열을 servlet-context.xml 의 viewressolver에 의해 사용자가 보게될 뷰로 포워딩
	}
}
