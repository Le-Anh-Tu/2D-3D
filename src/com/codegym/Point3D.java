package com.codegym;

public class Point3D extends Point2D {
    private float z;

    public Point3D(){
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public float[] getXYZ() {
        float arr[] = { this.getX(), this.getY(),this.getZ()};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{x = " + getX() + ", y =" + getY() + ",z = " + getZ() +" }";
    }
}
