package by.bsac.model.databaseparse;

public class SQLcommand {
	private String sqlshowcanon = "select m.mark,c.modelofcamera,c.cost,m.id_mark from markofcamera m inner join cameras c on m.id_mark=c.id_mark where m.id_mark=1";
	private String sqlshowsony = "select m.mark,c.modelofcamera,c.cost,m.id_mark from markofcamera m inner join cameras c on m.id_mark=c.id_mark where m.id_mark=2";
	private String sqlshowpanasonic = "select m.mark,c.modelofcamera,c.cost,m.id_mark from markofcamera m inner join cameras c on m.id_mark=c.id_mark where m.id_mark=3";
	private String sqldeleteadmintest = "";
	
	public String getSqlshowpanasonic() {
		return sqlshowpanasonic;
	}

	public void setSqlshowpanasonic(String sqlshowpanasonic) {
		this.sqlshowpanasonic = sqlshowpanasonic;
	}

	// private String sqldeleteadmintest="";
	public String getSqldeleteadmintest() {
		return sqldeleteadmintest;
	}

	public void setSqldeleteadmintest(String sqldeleteadmintest) {
		this.sqldeleteadmintest = sqldeleteadmintest;
	}

	public SQLcommand() {
		super();
	}

	public String getSqlshowcanon() {
		return sqlshowcanon;
	}

	public void setSqlshowcanon(String sqlshowcanon) {
		this.sqlshowcanon = sqlshowcanon;
	}

	public String getSqlshowsony() {
		return sqlshowsony;
	}

	public void setSqlshowsony(String sqlshowsony) {
		this.sqlshowsony = sqlshowsony;
	}
}