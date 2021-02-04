import java.util.Random;
public class RandomNumbers {
    Random random = new Random();
    public void startGeneratingNumbers(){
        int sum;
        int lowestRandomNumber = 30;
        int highestRandomNumber = 0;

        for (sum = 0; sum < 5000;){
            int randomNumber = getRandomNumber(31);
            sum = sum + randomNumber;
            System.out.println(randomNumber);
            if(randomNumber < lowestRandomNumber){
                lowestRandomNumber = randomNumber;
            }
            else if(randomNumber > highestRandomNumber){
                highestRandomNumber = randomNumber;
            }

        }
        System.out.println(sum);
        System.out.println("lowest generated number is " + lowestRandomNumber);
        System.out.println("highest generated number is " + highestRandomNumber);

    }
    public int getRandomNumber(int upperBound){
        int randomNumber = random.nextInt(upperBound);
        return randomNumber;
    }
}
