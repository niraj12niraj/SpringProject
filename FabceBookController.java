package com.my.spring.controller;


import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.spring.fb.FbConnection;
import com.my.spring.fb.FbGraph;


@Controller
@RequestMapping("/fbhome")
public class FabceBookController{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -8142738398328434282L;
	private String code="";
	
	/*@RequestMapping("/")
	public String fbHome() {
		return "fbHome";
	}*/
	
	/*@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, res);
		code=req.getParameter("code");
		System.out.println("code--"+code);
		if(code==null||code.equals("")) {
			throw new RuntimeException("ERROR: Didn't get code parameter in callback.");
		}
		FbConnection fbConn=new FbConnection();
		String accessToken=fbConn.getAccessToken(code);
		System.out.println("Access Token --"+accessToken);
		FbGraph fbGraph=new FbGraph(accessToken);
		String graph = fbGraph.getFBGraph();
		Map<String, String> fbProfileData = fbGraph.getGraphData(graph);
		//model.addAllAttributes(fbProfileData);
		for(Map.Entry<String, String>entry:fbProfileData.entrySet()) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println("key--"+key+", value--"+value);
		}
		
	}*/
	
	@RequestMapping(value="/fb",method=RequestMethod.POST)
	public String loginFb(HttpServletRequest req, HttpServletResponse res,ModelMap model) {
		//String uName=req.getParameter("name");
		code=req.getParameter("code");
		System.out.println("code--"+code);
		if(code==null||code.equals("")) {
			throw new RuntimeException("ERROR: Didn't get code parameter in callback.");
		}
		FbConnection fbConn=new FbConnection();
		String accessToken=fbConn.getAccessToken(code);
		System.out.println("Access Token --"+accessToken);
		FbGraph fbGraph=new FbGraph(accessToken);
		String graph = fbGraph.getFBGraph();
		Map<String, String> fbProfileData = fbGraph.getGraphData(graph);
		model.addAllAttributes(fbProfileData);
		for(Map.Entry<String, String>entry:fbProfileData.entrySet()) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println("key--"+key+", value--"+value);
		}
		
		return "fbHome";
	}
}
