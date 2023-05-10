package HWClass19;

public class AreaMath {


    class square{
        void calculateArea(int side){
            System.out.println("Area the square: "+side+side);
        }
    }

    class rectangle{
       void area(int a, int b) {
           System.out.println("Area of rectangle : "+a*b);
       }
    }

    public void main(String[] args) {

       square obj=new square();
       obj.calculateArea(10);

       rectangle obj1=new rectangle();
       obj1.area(10,5);





        





    }
}
