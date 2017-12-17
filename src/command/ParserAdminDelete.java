package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import by.bsac.model.database.Camera;
import by.bsac.model.databaseparse.Parsedb;
import by.bsac.model.databaseparse.SQLcommand;

public class ParserAdminDelete implements Command {

	@Override
	public String execute(HttpServletRequest request) {
		SQLcommand sqlcommand = new SQLcommand();
		Parsedb db = new Parsedb(sqlcommand.getSqldeleteadmintest());
		String msg = null;
		msg = db.ParserDeleteCamera();
		request.setAttribute("msg", msg);
		return "/adminshow.jsp";
	}

}
