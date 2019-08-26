

public class Practice01MathIterative implements Practice01Math {
    @Override
    public int fact(int n) throws Exception {
        int result = 1;
        if(n>=1) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        else{
           throw new IllegalArgumentException();
        }
        return result;
    }

    @Override
    public int fib(int n) throws Exception {

        if(n <= 1) {
            return n;
        }
        int num1 = 1;
        int num2 = 1;

        for(int i=2; i<n; ++i) {
            int temp = num1;
            num1+= num2;
            num2 = temp;
        }
        return num1;
    }
}
