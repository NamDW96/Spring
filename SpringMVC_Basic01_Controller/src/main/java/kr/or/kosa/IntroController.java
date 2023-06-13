package kr.or.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class IntroController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav2 = new ModelAndView();
		mav2.addObject("name","namdong"); //request.setAtttribute
		mav2.setViewName("Intro"); //> 
		return mav2;
	}

}
