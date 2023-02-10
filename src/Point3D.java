public class Point3D extends Point2D{

    // class attributes
    private float z = 0.0f;

    // constructor without parameters
    public Point3D() {
        super();
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

    public float[] getXY(){
        float[] arrayXY = new float[3];
        arrayXY[0] = super.getXY()[0];
        arrayXY[1] = super.getXY()[1];
        arrayXY[2] = getZ();
        return arrayXY;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.setY(z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                super.toString()
                +
                '}';
    }
}
