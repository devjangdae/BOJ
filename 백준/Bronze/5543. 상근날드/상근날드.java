import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minBurger = Integer.MAX_VALUE;
        int minBeverage = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int price = Integer.parseInt(br.readLine());
            if (minBurger > price) {
                minBurger = price;
            }
        }

        for (int i = 0; i < 2; i++) {
            int price = Integer.parseInt(br.readLine());
            if (minBeverage > price) {
                minBeverage = price;
            }
        }
        System.out.println(minBurger + minBeverage - 50);
    }
}