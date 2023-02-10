public class Point2D {
    // class attributes
    protected float x = 0.0f;
    protected float y = 0.0f;

    // constructor without parameters

    public Point2D() {
        super();
    }

    // constructor with  parameters

    public Point2D(float x, float y) {
        super();
        this.x = x;
        this.y = y;
    }

    // getters and setters

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] arrayXY = new float[2];
        arrayXY[0] = this.getX();
        arrayXY[1] = this.getY();
        return arrayXY;
    }

    public void setXY(float x, float y){
        this.setX(x);
        this.setY(y);
    }
    // class methods

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

