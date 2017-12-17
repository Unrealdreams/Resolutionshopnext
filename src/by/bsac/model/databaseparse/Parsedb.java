package by.bsac.model.databaseparse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.bsac.model.database.Camera;

public class Parsedb {

	String url = "jdbc:mysql://127.0.0.1:3306/db_shop";
	String login = "root";
	String password = "Unrealdreams1";
	String sql = "";
	String msg = null;
	int cost = 0;
	Camera camera = null;
	public Connection connection = null;
	List<Camera> cameralist = null;

	public Parsedb(String sql) {
		super();
		this.sql = sql;
	}

	public List<Camera> ParserCameraShow() {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(url, login, password);

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			cameralist = new ArrayList<Camera>();

			while (rs.next()) {
				camera = new Camera();
				camera.setMark(rs.getString("mark"));
				camera.setModel(rs.getString("modelofcamera"));
				camera.setCost(rs.getInt("cost"));
				camera.setIdMark(rs.getInt("id_mark"));

				cameralist.add(camera);
			}

		} catch (ClassNotFoundException | SQLException e) {
			// Log
			System.out.println(e);
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException exception) {
					// Log
					System.out.println(exception);

				}
			}
		}
		return cameralist;

	}

	public String ParserDeleteCamera() {
		msg = "Delete Succsesfull";
		try {

			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
		} catch (ClassNotFoundException | SQLException e) {
			// Log
			System.out.println(e);
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException exception) {
					// Log
					System.out.println(exception);

				}
			}
		}
		return msg;

	}

}