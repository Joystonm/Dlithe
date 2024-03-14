package Asignment_11;

public class prroblem2 {
        static int isValid(String s) {
            String[] parts = s.split("\\.");

            if (parts.length != 4)
                return 0;

            for (String part : parts) {
                if (part.isEmpty() || !part.matches("\\d+"))
                    return 0;

                int num = Integer.parseInt(part);

                if (num < 0 || num > 255)
                    return 0;

                if (part.length() > 1 && part.charAt(0) == '0')
                    return 0;
            }

            return 1;
        }

        public static void main(String[] args) {
            String ip1 = "222.111.111.111";
            System.out.println(isValid(ip1));

            String ip2 = "5555..555";
            System.out.println(isValid(ip2));
        }
    }