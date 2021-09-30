package day3;
package com.geometry.core.*;
public class Point2D {

    private int x, y;

    public Point2D (int x, int y){
        this.x=x;
        this.y=y;
    }

    public String getDetails(){
        return "("+this.x+","+this.y+")";
    }
    public boolean equalsTo(Point2D p){
        return this.x == p.x && this.y == p.y;
    }
    public Point2D createNewPoint(int xoff, int yoff){
        Point2D newPoint= new Point2D(this.x+xoff,this.y+yoff);
        return newPoint;
    }
    public double calculateDistance(Point2D p){
        //int a = this.x-p.x;
        //int b = this.y-p.y;
        //double distance=Math.sqrt((a*a)+(b*b));
        double distance= Math.sqrt(((this.x*this.x-2*this.x*p.x+p.x*p.x)+(this.y*this.y-2*this.y*p.y+p.y*p.y)));
        return distance;
    }
}
