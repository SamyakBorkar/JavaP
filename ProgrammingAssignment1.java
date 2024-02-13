import java.util.Random;

class SY2022bit037 {

    public static void main(String[] args) {
        int[] dataSizes = {5000, 10000, 20000, 50000};

        System.out.println("Data Size\tApr1\tApr2\tApr3\tApr4\tApr5");
        for (int size : dataSizes) {
            long[] times = measureApproaches(size);
            System.out.print(size + "\t\t");
            for (long time : times) {
                System.out.print(time + "\t");
            }
            System.out.println();
        }
    }

    public static long[] measureApproaches(int size) {
        long[] times = new long[5];
        String[] registrationNumbers = generateRandomRegistrationNumbers(size);

        times[0] = timeapr1(registrationNumbers);
        times[1] = timeapr2(registrationNumbers);
        times[2] = timeapr3(registrationNumbers);
        times[3] = timeapr4(registrationNumbers);
        times[4] = timeapr5(registrationNumbers);

        return times;
    }

    public static int getValidRegistrationsCountLE501(String[] registrations) {
        int validCount = 0;

        for (String reg : registrations) {
            if (isValidRegno(reg) && isValidID(getId(reg)) == 1 && isValidYear(getYear(reg)) == 1 && isValidNum1(getNum(reg))) {
                validCount++;
            }
        }

        return validCount;
    }

    public static int getValidRegistrationsCountLE502(String[] registrations) {
        int validCount = 0;

        for (String reg : registrations) {
            if (isValidRegno(reg) && isValidID(getId(reg)) == 1 && isValidYear(getYear(reg)) == 1 && isValidNum2(getNum(reg))) {
                validCount++;
            }
        }

        return validCount;
    }

    public static int getValidRegistrationsCountLE503(String[] registrations) {
        int validCount = 0;

        for (String reg : registrations) {
            if (isValidRegno(reg) && isValidID(getId(reg)) == 1 && isValidYear(getYear(reg)) == 1 && isValidNum3(getNum(reg))) {
                validCount++;
            }
        }

        return validCount;
    }

    public static int getValidRegistrationsCountLE504(String[] registrations) {
        int validCount = 0;

        for (String reg : registrations) {
            if (isValidRegno(reg) && isValidID(getId(reg)) == 1 && isValidYear(getYear(reg)) == 1 && isValidNum4(getNum(reg))) {
                validCount++;
            }
        }

        return validCount;
    }

    public static int getValidRegistrationsCountLE505(String[] registrations) {
        int validCount = 0;

        for (String reg : registrations) {
            if (isValidRegno(reg) && isValidID(getId(reg)) == 1 && isValidYear(getYear(reg)) == 1 && isValidNum5(getNum(reg))) {
                validCount++;
            }
        }

        return validCount;
    }

    public static boolean isValidRegno(String reg) {
        return reg.matches("\\d{4}[a-zA-Z]{3}\\d{3}");
    }

    public static String getId(String reg) {
        return reg.substring(4, 7);
    }

    public static String getYear(String y) {
        return y.substring(0, 4);
    }

    public static String getNum(String y) {
        return y.substring(7, 10);
    }

    public static boolean isValidNum1(String k) {
        int a = Integer.parseInt(k);
        return a >= 1 && a <= 50;
    }

    public static boolean isValidNum2(String k) {
        int num = Integer.parseInt(k);
        return (num <= 50 && num >= 1) || (num == 500);
    }

    public static boolean isValidNum3(String k) {
        int num = Integer.parseInt(k);
        return (num >= 1 && num <= 50) || (num == 500);
    }

    public static boolean isValidNum4(String k) {
        int num = Integer.parseInt(k);
        return (num >= 1 && num <= 50) || (num == 500);
    }

    public static boolean isValidNum5(String k) {
        int num = Integer.parseInt(k);
        return (num >= 1 && num <= 50) || (num == 500);
    }

    public static int isValidID(String S) {
        if (S.equalsIgnoreCase("bit") || S.equalsIgnoreCase("bcs") || S.equalsIgnoreCase("bch") || S.equalsIgnoreCase("bme")) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int isValidYear(String y) {
        int a = Integer.parseInt(y);
        return a >= 2000 && a <= 2024 ? 1 : 0;
    }

    public static String randomRegristrationNoGenerator() {
        Random random = new Random();
        StringBuilder registrationNo = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            registrationNo.append(random.nextInt(10));
        }

        for (int i = 0; i < 3; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            registrationNo.append(c);
        }

        for (int i = 0; i < 3; i++) {
            registrationNo.append(random.nextInt(10));
        }

        return registrationNo.toString();
    }

    public static String[] generateRandomRegistrationNumbers(int count) {
        String[] registrationNumbers = new String[count];

        for (int i = 0; i < count; i++) {
            registrationNumbers[i] = randomRegristrationNoGenerator();
        }

        return registrationNumbers;
    }

    public static long timeapr1(String[] Reg_no) {
        SY2022bit037 c = new SY2022bit037();
        long starttime = System.nanoTime();
        int count = c.getValidRegistrationsCountLE501(Reg_no);
        long endtime = System.nanoTime();
        return endtime - starttime;
    }

    public static long timeapr2(String[] Reg_no) {
        SY2022bit037 c = new SY2022bit037();
        long starttime = System.nanoTime();
        int count = c.getValidRegistrationsCountLE502(Reg_no);
        long endtime = System.nanoTime();
        return endtime - starttime;
    }

    public static long timeapr3(String[] Reg_no) {
        SY2022bit037 c = new SY2022bit037();
        long starttime = System.nanoTime();
        int count = c.getValidRegistrationsCountLE503(Reg_no);
        long endtime = System.nanoTime();
        return endtime - starttime;
    }

    public static long timeapr4(String[] Reg_no) {
        SY2022bit037 c = new SY2022bit037();
        long starttime = System.nanoTime();
        int count = c.getValidRegistrationsCountLE504(Reg_no);
        long endtime = System.nanoTime();
        return endtime - starttime;
    }

    public static long timeapr5(String[] Reg_no) {
        SY2022bit037 c = new SY2022bit037();
        long starttime = System.nanoTime();
        int count = c.getValidRegistrationsCountLE505(Reg_no);
        long endtime = System.nanoTime();
        return endtime - starttime;
    }
}

