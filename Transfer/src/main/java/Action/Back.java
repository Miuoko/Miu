package Action;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Back {
	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	@RequestMapping(value = "/personalSetting/personalSettingSaveAll.do", method = RequestMethod.POST)
	public void saveAll(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
	    response.setCharacterEncoding("UTF-8");
	    HttpSession session = request.getSession();
	    String userNO  = request.getParameter("userNO")+"";
	    String userName = request.getParameter("userName")+"";
	    String phoneNumber = request.getParameter("phoneNumber")+"";     
	    Person pSE = new Person();
	    String msg;
	    if(!("".equals(userNO))||"".equals(userName )||"".equals(phoneNumber )){ //如果都不为空  

	        pSE.setUserNO(userNO);
	        pSE.setUserName(userName);
	        pSE.setPhoneNumber(phoneNumber);
	        
	        msg = "保存成功";
	    }else{
	        msg = "填写不完整"; //可以在前台校验，这里为了举例子
	    }
	        response.getWriter().print(msg); //这里的msg是text数据，所以前台数据类型是text。
	}
}
