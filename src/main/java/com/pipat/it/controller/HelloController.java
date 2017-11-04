package com.pipat.it.controller;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pipat.it.util.JDBCService;
import com.pipat.it.util.SqlUtils;
import com.pipat.it.util.StringUtils;

@Controller
public class HelloController {
	final static Logger logger = Logger.getLogger(HelloController.class);
	private final SqlUtils m = new SqlUtils();
	private final JDBCService jdbc = new JDBCService();
//	SqlUtils m = new SqlUtils();
//	JDBCService jdbc = new JDBCService();
	@RequestMapping("/index")
	public String index(HttpSession session ,Locale locale, HttpServletResponse response,
			HttpServletRequest request, Model model) {
		String page = StringUtils.convertDBNullValue(request.getParameter("PAGE"));
//		String id = StringUtils.convertDBNullValue(request.getParameter("ID"));
//		String state = StringUtils.convertDBNullValue(request.getParameter("STATE"));
		logger.info(page);
		String url ="";
		try{
			url = page;
			model.addAttribute("message4","GotMenu");
		}catch(Exception e){
			e.printStackTrace();
		}
		return url;
		
		
	}
	@RequestMapping("/welcome2")
	public String testSubmit(HttpSession session ,Locale locale, HttpServletResponse response,HttpServletRequest request, Model model) {
		MDC.put("sessionId", session.getId());
		logger.info("This is info : /welcome2"  );
		String sql = String.valueOf(m.readSQLfile("" ,"SelectAll"));
		List<Map<String,Object>> list = null;
		list = JDBCService.getInstance().getJdbcTemplate().queryForList(sql);
		model.addAttribute("message",list);
		model.addAttribute("message1","GotMenu");
		
		return "welcome";
		
		
	}
	@RequestMapping("/hello")  
    public ModelAndView helloWorld() {  
        String message = "Hello World, Spring MVC @ Javatpoint";  
        return new ModelAndView(":hello", "message", message);  
    }
	@RequestMapping(value="/got/gotinclude" , method = RequestMethod.GET )  
    public @ResponseBody void helloWorld1(HttpSession session ,Locale locale, HttpServletResponse response,HttpServletRequest request, Model model) throws IOException {
        String message = "{\"flag\":\""+"1"+"\",\"text\":\""+"Pipat Pratumwan"+"\"}";;  
        response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(message);
    }
	
}
