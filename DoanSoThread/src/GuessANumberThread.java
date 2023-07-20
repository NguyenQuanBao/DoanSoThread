public class GuessANumberThread extends Thread {
    int guessNumber = 0;
    int count = 0;

    public GuessANumberThread(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 50 + 1 );
            count++;
            System.out.println(getName() + " Đoán số " + randomNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (randomNumber != guessNumber);
        System.out.println(getName() + " đã đoán được số " + guessNumber + " trong " + count + " lần");
    }
}
