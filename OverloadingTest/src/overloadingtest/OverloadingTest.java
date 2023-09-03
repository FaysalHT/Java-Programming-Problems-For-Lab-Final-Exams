package overloadingtest;

class Calculator{
    int add(int x, int y){
        return x+y;
    }
    int add(int x, int y, int z){
        return x+y+z;
    }
    int add(int[] x){
        int sum = 0;
        for (int flag:x) {
            sum += flag;
        }
        return sum;
    }
    double add(double x, double y){
        return x+y;
    }
    double add(double x, double y, double z){
        return x+y+z;
    }
}

public class OverloadingTest {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("SUM OF 5 & 10 = " +c.add(5, 10));
        System.out.println("SUM OF 5 & 10 & 15 = " +c.add(5, 10, 15));
        System.out.println("SUM OF 2.3 & 1.1 = " +c.add(2.3, 1.1));
        System.out.println("SUM OF 2.3 & 1.1 & 5.5 = " +c.add(2.3, 1.1, 5.5));
        System.out.println("SUM OF array [1,2,3,4,5] = " +c.add(new int[]{1,2,3,4,5}));
    }
    
}
