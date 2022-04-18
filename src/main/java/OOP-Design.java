public class OOPDesign {
    public static void main(String[] args) {

        abstract class Shape {
            protected String color;
            protected boolean filled;

            public Shape() {
                color = "green";
                filled = true;

            }

            private Shape(String color, boolean filled){
                this.color = color;
                this.filled = filled;

            }

            public abstract void getArea() {
                this.area = area;
            }
            public abstract void getPerimeter();


        }

    }



}

//Parties involved in project is Gian, Zaylet, and Serena.
