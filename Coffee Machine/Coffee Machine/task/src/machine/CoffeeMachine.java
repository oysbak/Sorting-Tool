package machine;

import java.util.Scanner;

enum State {
    IDLE, BUY, FILL, TAKE, REMAINING, EXIT;
}

public class CoffeeMachine {
    private String userRequest;
    private int[] components;
    private int componentPointer;
    private State state;

    CoffeeMachine() {
        // Coffee machine has $550, 400 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.
        // Components = water, milk, coffee beans, disposable cups, money
        components = new int[]{400, 540, 120, 9, 550};
        componentPointer = -1;
        setIdleState();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        String inputString;
        do {
            inputString = scanner.nextLine();
            coffeeMachine.processUserRequest(inputString);
        } while (coffeeMachine.getState() != State.EXIT);
    }

    void processUserRequest(String userRequest) {
        switch (state) {
            case IDLE:
                if (userRequest.equals("buy")) {
                    buy(userRequest);
                }
                if (userRequest.equals("fill")) {
                    state = State.FILL;
                    componentPointer = -1;
                    fill(0);
                }
                if (userRequest.equals("take")) {
                    take();
                }
                if (userRequest.equals("remaining")) {
                    remaining();
                }
                if (userRequest.equals("exit")) {
                    state = State.EXIT;
                }
                break;
            case BUY:
                buy(userRequest);
                break;
            case FILL:
                fill(Integer.parseInt(userRequest));
                break;
            default:
                break;
        }
    }

    void fill(int addedAmount) {
        switch (componentPointer) {
            case -1:
                System.out.println("\nWrite how many ml of water do you want to add:");
                componentPointer++;
                break;
            case 0:
                components[0] += addedAmount;
                System.out.println("Write how many ml of milk do you want to add:");
                componentPointer++;
                break;
            case 1:
                components[1] += addedAmount;
                System.out.println("Write how many grams of coffee beans do you want to add:");
                componentPointer++;
                break;
            case 2:
                components[2] += addedAmount;
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                componentPointer++;
                break;
            case 3:
                components[3] += addedAmount;
                setIdleState();
                componentPointer = -1;
                break;
            default:
                break;
        }
    }

    void take() {
        System.out.printf("I gave you $%d%n", components[4]);
        components[4] = 0;
        setIdleState();
    }

    void remaining() {
        printStatus();
        setIdleState();
    }

    private void setIdleState() {
        state = State.IDLE;
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
    }

    void buy(String choice) {
        state = State.BUY;

        if (choice.equals("back")) {
            setIdleState();
        } else {
            if (choice.equals("buy")) {
                System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            } else {
                String[] words = {"water", "milk", "coffee beans", "disposable cups"};
                int[] ingredients = new int[3];
                switch (Integer.parseInt(choice)) {
                    case 1:
                        ingredients = new int[]{250, 0, 16, 1, 4};
                        break;
                    case 2:
                        ingredients = new int[]{350, 75, 20, 1, 7};
                        break;
                    case 3:
                        ingredients = new int[]{200, 100, 12, 1, 6};
                        break;
                    default:
                        break;
                }

                boolean canMakeCoffee = true;
                for (int i = 0; i < 4; i++) {
                    if (ingredients[i] > components[i]) {
                        System.out.printf("Sorry, not enough %s%n", words[i]);
                        canMakeCoffee = false;
                        break;
                    }
                }

                if (canMakeCoffee) {
                    System.out.println("I have enough resources, making you a coffee!");
                    for (int i = 0; i < 4; i++) {
                        components[i] -= ingredients[i];
                    }
                    components[4] += ingredients[4];
                }
                setIdleState();
            }
        }
    }

    void printStatus() {
        System.out.println("\nThe coffee machine has:");
        System.out.printf("%d of water%n", components[0]);
        System.out.printf("%d of milk%n", components[1]);
        System.out.printf("%d of coffee beans%n", components[2]);
        System.out.printf("%d of disposable cups%n", components[3]);
        if (components[4] == 0) {
            System.out.printf("%d of money%n", components[4]);
        } else {
            System.out.printf("$%d of money%n", components[4]);
        }
    }

    State getState() {
        return state;
    }
}
