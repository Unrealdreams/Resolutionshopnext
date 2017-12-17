package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.mysql.fabric.Response;

import by.bsac.model.database.Camera;
import by.bsac.model.databaseparse.Parsedb;
import by.bsac.model.databaseparse.SQLcommand;

public class ParserLogin implements Command {

	@Override
	public String execute(HttpServletRequest request) {
//		SQLcommand sqlcommand = new SQLcommand();
//	
//		System.out.println(email);
//		System.out.println(password);
//		request.setAttribute("email", email);
		return "/adminshow.jsp";

	}

}
