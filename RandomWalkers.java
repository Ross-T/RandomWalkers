public class RandomWalkers {

    public static void main(String[] args) {
        
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int x = 0;
        int y = 0;

        int j;
        double i = 0;

        for (j = 1; j <= trials; j++) {
            x = 0;
            y = 0;
            while (Math.abs(x) != r - Math.abs(y)) {
                double direction = Math.random();
                if (direction <= 0.25) {
                    y += 1;
                } else if (direction <= 0.5 && direction > 0.25) {
                    x += 1;
                } else if (direction <= 0.75 && direction > 0.5) {
                    y -= 1;
                } else if (direction > 0.75) {
                    x -= 1;
                }
                i += 1;
            }
        }
        
        double average = i / trials;
        System.out.println("average number of steps = " + average);

    }

}