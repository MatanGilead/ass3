package reit;

public class Location {
private int fX;
private int fY;


public Location(int x, int y){
	fX=x;
	fY=y;
}

	public double CalculateDistance(Location other) {
	return Math.sqrt(Math.pow(fX-other.fX,2)+Math.pow(fY-other.fY,2));
}
	
}
