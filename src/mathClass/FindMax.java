package mathClass;

public class FindMax {
    public static void main(String[] args){

        int x = 8;
        int y = 20;
        int z = 6;

        int maxValueOfXY = Math.max(x, y);

        int maxOfXYZ = Math.max(maxValueOfXY, z);

        System.out.println(maxValueOfXY);
        System.out.println(maxOfXYZ);


    }
}
