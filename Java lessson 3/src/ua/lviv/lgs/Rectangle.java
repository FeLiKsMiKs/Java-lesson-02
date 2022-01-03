package ua.lviv.lgs;

public class Rectangle {
private String type;
private double length;
private double width;
private double ploscha;
private double perymetr;
Rectangle (){
	this.type = "Rectangle";
}
Rectangle (double length, double width){
	this.length = length;
	this.width = width;
}
public void Width() {
	this.width = 17;
}
public void Length() {
	this.length = 12;
}
public void Ploscha() {
	this.ploscha = 12*17;
}
public void Perymetr() {
	this.perymetr = (17+12)*2;
}
public String getType() {
	return type;
}

public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public void setType(String type) {
	this.type = type;
}

public double getPloscha() {
	return ploscha;
}
public void setPloscha(double ploscha) {
	this.ploscha = ploscha;
}
public double getPerymetr() {
	return perymetr;
}
public void setPerymetr(double perymetr) {
	this.perymetr = perymetr;
}
@Override
public String toString() {
	return "Rectangle [type=" + type + ", length=" + length + ", width=" + width +", ploscha=" + ploscha +", perymetr=" + perymetr +"]";
}
}