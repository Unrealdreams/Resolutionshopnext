package by.bsac.model.database;

public class Camera {

	private String Mark;
	private String Model;
	private int Cost;
	private int idMark;

	public int getIdMark() {
		return idMark;
	}

	public void setIdMark(int idMark) {
		this.idMark = idMark;
	}

	public String getMark() {
		return Mark;
	}

	public void setMark(String mark) {
		Mark = mark;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

	@Override
	public String toString() {
		return "Mark - " + Mark + ", Model - " + Model + ", Cost - " + Cost + "/n";
	}

}
