package Asssingment1;

public class Rectangle {

        double lenght;
        double width;
        double perimeter;
        double area;

        public  Rectangle (double lenght,double width){
            this.lenght=lenght;
            this.width=width;

        }

        public void calculateArea(){
            area=lenght*width;
            return;

        }
        public void calculatePerimeter(){
            perimeter=(2*lenght)+(2*width);
            return;
        }

    }


