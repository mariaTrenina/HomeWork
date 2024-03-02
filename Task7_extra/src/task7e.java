import java.util.Scanner;

public class task7e {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");
        int D = scanner.nextInt();
        System.out.println("Enter the month");
        int M = scanner.nextInt();





        //Zodiac signs
        switch (M) {
                    case 1:
                        if (D >= 21 && D <= 31) {
                            System.out.println("Aquarius");
                            break;
                        } else {
                            System.out.println("Capricorn");
                            break;
                        }
                    case 2:
                        if (D >= 1 && D <= 18) {
                            System.out.println("Aquarius");
                            break;
                        } else {
                            System.out.println("Pisces");
                            break;
                        }
                    case 3:
                        if (D >= 21 && D <= 31) {
                            System.out.println("Aries");
                            break;
                        } else {
                            System.out.println("Pisces");
                            break;
                        }
                    case 4:
                        if (D >= 20 && D <= 30) {
                            System.out.println("Taurus");
                            break;
                        } else {
                            System.out.println("Aries");
                            break;
                        }
                    case 5:
                        if (D >= 21 && D <= 31) {
                            System.out.println("Gemini");
                            break;
                        } else {
                            System.out.println("Taurus");
                            break;
                        }
                    case 6:
                        if (D >= 22 && D <= 30) {
                            System.out.println("Cancer");
                            break;
                        } else {
                            System.out.println("Gemini");
                            break;
                        }
                    case 7:
                        if (D >= 23 && D <= 31) {
                            System.out.println("Leo");
                            break;
                        } else {
                            System.out.println("Cancer");
                            break;
                        }
                    case 8:
                        if (D >= 23 && D <= 31) {
                            System.out.println("Virgo");
                            break;
                        } else {
                            System.out.println("Leo");
                            break;
                        }
                    case 9:
                        if (D >= 23 && D <= 30) {
                            System.out.println("Libra");
                            break;
                        } else {
                            System.out.println("Virgo");
                            break;
                        }
                    case 10:
                        if (D >= 24 && D <= 31) {
                            System.out.println("Scorpio");
                            break;
                        } else {
                            System.out.println("Libra");
                            break;
                        }
                    case 11:
                        if (D >= 23 && D <= 30) {
                            System.out.println("Sagittarius");
                            break;
                        } else {
                            System.out.println("Scorpio");
                            break;
                        }
                    case 12:
                        if (D >= 22 && D <= 31) {
                            System.out.println("Capricorn");
                            break;
                        } else {
                            System.out.println("Sagittarius");
                            break;
                        }

                }

            }
        }
