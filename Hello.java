public class Hello{

    public static void main(String []args){
       

       int a =10;
       int b = 20;

       System.out.println(sub(a,b));
    }

    public static int add(int a, int b){

        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        if(b==0){
            return -1;
        }

        return a/b;
    }
}