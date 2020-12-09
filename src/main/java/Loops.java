public class Loops {
    public static void main(String[] args){
        int[] numbers = new int[] {1,2,3,4,5,6};
        int sum = 0;
        for(int i = numbers.length -1;i >= 0; i--) {
            sum = sum + numbers[i];
        };

        System.out.println(sum);
    }
}
