
public class Practice01MathRecursive implements Practice01Math {
    @Override
    public int fact(int n) throws Exception {
        if(n >=1) {

            if ( n == 1) {
                return n;
            }
            return fact(n - 1) * n;

        }
        else{
            throw new IllegalArgumentException();
        }
//        return 0;
    }

    @Override
    public int fib(int n) throws Exception {
        if (n >= 0) {

            if (n == 0 || n ==1) {
                return n;
            }
            else{
                return fib(n - 1) + fib(n - 2);
            }

        }
        return 0;
    }
}
