package exercise;

// BEGIN
class Segment {
    private Point beginPoint;
    private Point endPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        var x = (beginPoint.getX() + endPoint.getX()) / 2;
        var y = (beginPoint.getY() + endPoint.getY()) / 2;
        Point midPoint = new Point(x, y);

        return midPoint;
    }
}
// END
