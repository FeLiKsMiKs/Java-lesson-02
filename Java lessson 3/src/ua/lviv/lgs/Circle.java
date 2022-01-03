package ua.lviv.lgs;
public class Circle {
private String type;
private double radius;
private double diametr;
private double ploscha1;
private double dovzhyna;
Circle (){
	this.type = "Circle";
}
Circle (int length, int width){
	this.radius = length;
	this.diametr = width;
}

public String getType() {
	return type;
}

public double getRadius() {
	return radius;
}
public void setDiametr(double diametr) {
	this.diametr = diametr;
}
public double getDiametr() {
	return diametr;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public void setType(String type) {
	this.type = type;
}

public double getPloscha1() {
	return ploscha1;
}
public void setPloscha1(double ploscha1) {
	this.ploscha1 = ploscha1;
}
public double getDovzhyna() {
	return dovzhyna;
}
public void setDovzhyna(double dovzhyna) {
	this.dovzhyna = dovzhyna;
}
@Override
public String toString() {
	return "Circle [type=" + type + ", radius=" + radius + ", diametr=" + diametr +", ploscha=" + ploscha1 +", dovzhyna=" + dovzhyna +"]";
}
}