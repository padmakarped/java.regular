package InputOutputSream.javaExamtoday;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayMenuProgram {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of array: ");
        int size = Integer.parseInt(br.readLine());

        if (size <= 0) {
            System.out.println("Invalid size! Size must be greater than 0.");
            return; 
        }

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Display all elements");
            System.out.println("2. Find the largest element");
            System.out.println("3. Calculate sum of elements");
            System.out.println("4. Search for an element");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            choice = Integer.parseInt(br.readLine());

            switch (choice) {

                case 1:
                    System.out.println("Array elements:");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int max = arr[0];
                    for (int num : arr) {
                        if (num > max)
                            max = num;
                    }
                    System.out.println("Largest element: " + max);
                    break;

                case 3:
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }
                    System.out.println("Sum of elements: " + sum);
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int key = Integer.parseInt(br.readLine());
                    
                    boolean found = false;
                    int position = -1;

                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == key) {
                            found = true;
                            position = i;
                            break;
                        }
                    }

                    if (found)
                        System.out.println("Element found at index: " + position);
                    else
                        System.out.println("Element not found!");
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter between 1–5.");
            }

        } while (choice != 5);
    }
}
