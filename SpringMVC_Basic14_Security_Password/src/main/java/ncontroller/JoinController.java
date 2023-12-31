package ncontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.MemberDao;
import service.MemberService;
import vo.Member;

@Controller
@RequestMapping("/joinus/")
public class JoinController {

	// memberdao 의존
	private MemberService memberservice;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	public void setMemberservice(MemberService memberservice) {
		this.memberservice = memberservice;
	}
	
	//GET 요청
	//join.jsp 화면
	@GetMapping("join.htm")  //  /joinus/join.htm
	public String join() {
		return "joinus/join";
	}
	
	

	//POST 요청
	@PostMapping("join.htm")
	public String join(Member member) {
		 String url= null;
		 member.setPwd(this.bCryptPasswordEncoder.encode(member.getPwd()));
		 try {
			   url = memberservice.insert(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return url;

	}
	
	//로그인 요청
	@GetMapping(value="login.htm")
	public String login() {
		return "joinus/login";
	}
	
	
}
