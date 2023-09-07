class Sum{
    public static void main(String[] a){
        System.out.println(new SumProc().sum2(10,10));
    }
}

class SumProc {

    public int sum2(int num1, int num2){
        int r;
        r = num1 + num2 + 5;
        
        return r;
    }

}
