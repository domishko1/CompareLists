import java.util.Scanner;

public class Main {
    private static void menu(){
        System.out.println("What you want test: ");
        System.out.println("0 -  Exit;");
        System.out.println("1 -  Add element;");
        System.out.println("2 -  Delete element;");
        System.out.println("3 -  Get element;");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tester test = new Tester(new ListTest(new ArrayListFactory()), new ListTest(new LinkedListFactory()));


        menu();
        int choose = sc.nextInt();
        double time = 0;
        do {
            switch (choose) {
                case 0:
                    return;
                case 1:
                    time = test.compareOfAdding();
                    break;
                case 2:
                    time = test.compareOfDeleting();
                    break;
                case 3:
                    time = test.compareOfGetting();
                    break;
                default:
                    System.out.println("Error!");
            }

            if (time == 0) {
                System.out.println("No differences between array list and linked list.");
            }else {
                if (time < 0) {
                    time *= -1;
                    System.out.println("Array list faster than linked list on " + time + " ms");
                } else {
                    System.out.println("Linked list faster than array list on " + time + " ms");
                }
            }
            menu();
            choose = sc.nextInt();
        } while (choose != 0);
    }
}

