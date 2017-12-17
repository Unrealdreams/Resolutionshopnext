package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import by.bsac.model.database.Camera;
import by.bsac.model.databaseparse.Parsedb;
import by.bsac.model.databaseparse.SQLcommand;

public class ParserPanasonic implements Command {

	@Override
	public String execute(HttpServletRequest request) {
		SQLcommand sqlcommand = new SQLcommand();
		Parsedb db = new Parsedb(sqlcommand.getSqlshowpanasonic());
		List<Camera> cameralist = null;
		cameralist = db.ParserCameraShow();
		request.setAttribute("cameralist", cameralist);
		return "/camerashow.jsp";
	}

}