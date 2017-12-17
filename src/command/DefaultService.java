package command;

import javax.servlet.http.HttpServletRequest;

public class DefaultService implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		
		return "/Error.jsp";
	}

}
