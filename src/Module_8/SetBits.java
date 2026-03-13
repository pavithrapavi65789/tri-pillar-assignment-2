package Module_8;

public class SetBits {
    public static void main(String[] args) {
        int num = 5;
        int count = 0;

        while(num > 0){
            count += num & 1;
            num >>= 1;
        }

        System.out.println("Set bits: " + count);
    }
}
