public class Driver {

    public int rec(int num){
        if (num == 0){
            return 0;
        }
        if (num == 1){
            return 1;
        }

        return rec(num-1)+rec(num-2);
    }

    public static void main(String[] args) {
        Driver s = new Driver();
        System.out.printf("uv"+s.rec(8));

    }
}
