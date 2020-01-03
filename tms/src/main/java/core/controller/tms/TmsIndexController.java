package core.controller.tms;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TmsIndexController {

	@RequestMapping(value = "/tms/login.do")
	public String tmsLoginView(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		
		return "tms/login";
	}
}
