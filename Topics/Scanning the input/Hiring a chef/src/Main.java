import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int years = scanner.nextInt();
        String cuisine = scanner.next();


        System.out.println("The form for " + name + " is completed." +
                " We will contact you if we need a chef who cooks " + cuisine +
                " dishes and has " + years+ " years of experience.");
    }
}