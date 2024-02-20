class PrimeNumber {
    public static void main(String[] args) {
        int[] numbers = new int[1000000]; 
        generateRandomNumber(numbers);

        long startTime = System.nanoTime();
        int[] counts = count(numbers);
        long endTime = System.nanoTime();
        long duration = endTime - startTime; 
        System.out.println("Time taken for normal Aproach " + duration);

        startTime = System.nanoTime();
        int[] invertedCounts = countInverted(numbers);
        endTime = System.nanoTime();
        duration = endTime - startTime; 
        System.out.println("Time taken for inverted if-else approach: " + duration);

        System.out.println("Total Even Numbers in Array: " + counts[0]);
        System.out.println("Total Odd Numbers in Array: " + counts[1]);
    }

    public static void generateRandomNumber(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int number = 0;
            for (int j = 0; j < 7; j++) {
                number = number * 10 + (int) (Math.random() * 10); 
            }
            a[i] = number;
        }
    }

    public static int[] count(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return new int[]{evenCount, oddCount};
    }

    public static int[] countInverted(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }
        }
        return new int[]{evenCount, oddCount};
    }
}
