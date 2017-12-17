package command;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ServiceManager {

	public static Command getservice(HttpServletRequest request) {
		String cmd = request.getParameter("cmd");
		if (cmd == null) {
			return new DefaultService();
		}

		Command com = null;

		switch (cmd) {
		case "showcanon":
			com = new ParserCanon();
			break;
		case "showsony":
			com = new ParserSony();
			break;
		case "showpanasonic":
			com = new ParserPanasonic();
			break;
		case "signin": {
			com = new ParserLogin();
		}
		case "delete":
			// Cookie[] abc = request.getCookies();
			// String role = abc[0].getValue();
			// Cookie cook = new Cookie("Role","Admin");
			// resp
			// if(role == "Admin")
			com = new ParserAdminDelete();

		}
		return com;
	}
}