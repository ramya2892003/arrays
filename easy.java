import java.util.*;
import java.util.Scanner;

public class easy {
    public static void main(String[] args) {

    }

    class Compute {

        public int largest(int arr[], int n) {
            int largest = arr[0];

            for (int i = 0; i < n; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }

            return largest;

        }
    }
}