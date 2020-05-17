public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
        if (width < 0) {
            width = 0;
        } else if (length < 0) {
            length = 0;
        } else {
            this.length = length;
        }
    }

        public double getArea(){
            return this.width * this.length;
        }

    }








