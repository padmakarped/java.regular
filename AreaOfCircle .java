 class AreaOfCircle  {

    double Area(double radius)
    {
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        
        AreaOfCircle obj = new AreaOfCircle();

        double radius= 4.0;
        double result = obj.Area(radius );

        System.out.println("Area Of Circle:"+result);


    }

    
}