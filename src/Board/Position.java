package Board;

public class Position {
	
	private int ROW;
	private int COLUMN;
	
	public Position(int row, int column) {
		setValues(row, column);
	}
	public void setValues(int row, int column) {
		ROW = row;
		COLUMN = column;
	}
	
	public int getROW() {
		return ROW;
	}
	public void setROW(int rOW) {
		ROW = rOW;
	}
	public int getCOLUMN() {
		return COLUMN;
	}
	public void setCOLUMN(int cOLUMN) {
		COLUMN = cOLUMN;
	}

	@Override
	public String toString() {
		return ROW + ", " + COLUMN;
	}
}