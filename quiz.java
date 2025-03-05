*** 
quiz application
output:
WELCOME TO QUIZ
Enter the name:
kushitha
Enter the age:
20
Enter the Email ID:
22hr1a3234@mtieat.org
Enter the Phone Number:
37407659
Enter the address:
nimmanapalle
kushitha
20
22hr1a3234@mtieat.org
37407659
nimmanapalle
Are you ready to take the quiz game? yes/no
yes
Welcome to the Quiz Game! Your goal is to answer all the questions correctly and score the highest points.
1. Each question has four options: A, B, C, and D. Choose the correct answer by typing the corresponding letter.
2. For every correct answer, you will earn 10 points. There are no points for incorrect answers.
3. You have two lifelines to assist you during the game:
   - The 50-50 Lifeline removes two incorrect options, leaving one correct and one incorrect option.
   - The Audience Poll Lifeline shows audience voting percentages for each option to help you decide.
4. Each lifeline can only be used once during the game.
5. If you answer incorrectly, the game ends immediately, and your final score will be displayed.
6. Try your best and enjoy the game! Good luck!
Which car company uses the slogan 'The Ultimate Driving Machine'?
A. BMW
B. Mercedes-Benz
C. Audi
D. Lexus
Enter your choice (A-D), or type '50-50' or 'poll':
a
Correct!
Current score: 10
What is the primary color of the Facebook logo?
A. Blue
B. Green
C. Red
D. Yellow
Enter your choice (A-D), or type '50-50' or 'poll':
a
Correct!
Current score: 20
Which brand is known for its 'Just Do It' slogan?
A. Nike
B. Adidas
C. Reebok
D. Under Armour
Enter your choice (A-D), or type '50-50' or 'poll':
a
Correct!
Current score: 30
Which company makes the iPhone?
A. Apple
B. Samsung
C. Google
D. Nokia
Enter your choice (A-D), or type '50-50' or 'poll':
a
Correct!
Current score: 40
Which video game company created the Mario franchise?
A. Nintendo
B. Sony
C. Microsoft
D. SEGA
Enter your choice (A-D), or type '50-50' or 'poll':
50-50
50-50 Lifeline: Remaining options:
Nintendo
Sony
Enter your choice (A-D), or type '50-50' or 'poll':
a
Correct!
Current score: 50
Which tech company is known for the Windows operating system?
A. Microsoft
B. Apple
C. IBM
D. Dell
Enter your choice (A-D), or type '50-50' or 'poll':
poll
Audience Poll Results:
A. Microsoft: 98%
B. Apple: 0%
C. IBM: 0%
D. Dell: 0%
Enter your choice (A-D), or type '50-50' or 'poll':
a
Correct!
Current score: 60
Which beverage brand is famous for its polar bear commercials?
A. Coca-Cola
B. Pepsi
C. Dr Pepper
D. Sprite
Enter your choice (A-D), or type '50-50' or 'poll':
a
Correct!
Current score: 70
Which airline is known for its kangaroo logo?
A. Qantas
B. Emirates
C. Delta
D. British Airways
Enter your choice (A-D), or type '50-50' or 'poll':
a
Correct!
Current score: 80
Which chocolate company uses the slogan 'Have a break, have a KitKat'?
A. Nestle
B. Mars
C. Hershey's
D. Cadbury
Enter your choice (A-D), or type '50-50' or 'poll':
a
Correct!
Current score: 90
Which search engine company owns YouTube?
A. Google
B. Yahoo
C. Bing
D. DuckDuckGo
Enter your choice (A-D), or type '50-50' or 'poll':
a
Correct!
Current score: 100
Congratulations! You completed the quiz with a score of: 100
***
code:
package quiz;

import java.util.*;

public class details {
    private String name;
    private int age;
    private String email;
    private long phone;
    private String address;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public long getPhone() {
        return phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void displayRules() {
        System.out.println("Welcome to the Quiz Game! Your goal is to answer all the questions correctly and score the highest points.");
        System.out.println("1. Each question has four options: A, B, C, and D. Choose the correct answer by typing the corresponding letter.");
        System.out.println("2. For every correct answer, you will earn 10 points. There are no points for incorrect answers.");
        System.out.println("3. You have two lifelines to assist you during the game:");
        System.out.println("   - The 50-50 Lifeline removes two incorrect options, leaving one correct and one incorrect option.");
        System.out.println("   - The Audience Poll Lifeline shows audience voting percentages for each option to help you decide.");
        System.out.println("4. Each lifeline can only be used once during the game.");
        System.out.println("5. If you answer incorrectly, the game ends immediately, and your final score will be displayed.");
        System.out.println("6. Try your best and enjoy the game! Good luck!");
    }
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        boolean lifelineUsed = false;
        boolean pollUsed = false;
        for (int i = 1; i <= 10; i++) {
            boolean correct = askQuestion(i, scanner, lifelineUsed, pollUsed);
            if (!correct) {
                System.out.println("Game over! Your final score is: " + score);
                return;
            }
            score += 10;
            System.out.println("Current score: " + score);
        }
        System.out.println("Congratulations! You completed the quiz with a score of: " + score);
    }
    private boolean askQuestion(int questionNumber, Scanner scanner, boolean lifelineUsed, boolean pollUsed) {
        String question = "";
        String[] options = {};
        String correctAnswer = "";
        switch (questionNumber) {
            case 1:
                question = "Which car company uses the slogan 'The Ultimate Driving Machine'?";
                options = new String[]{"BMW", "Mercedes-Benz", "Audi", "Lexus"};
                correctAnswer = "BMW";
                break;
            case 2:
                question = "What is the primary color of the Facebook logo?";
                options = new String[]{"Blue", "Green", "Red", "Yellow"};
                correctAnswer = "Blue";
                break;
            case 3:
                question = "Which brand is known for its 'Just Do It' slogan?";
                options = new String[]{"Nike", "Adidas", "Reebok", "Under Armour"};
                correctAnswer = "Nike";
                break;
            case 4:
                question = "Which company makes the iPhone?";
                options = new String[]{"Apple", "Samsung", "Google", "Nokia"};
                correctAnswer = "Apple";
                break;
            case 5:
                question = "Which video game company created the Mario franchise?";
                options = new String[]{"Nintendo", "Sony", "Microsoft", "SEGA"};
                correctAnswer = "Nintendo";
                break;
            case 6:
                question = "Which tech company is known for the Windows operating system?";
                options = new String[]{"Microsoft", "Apple", "IBM", "Dell"};
                correctAnswer = "Microsoft";
                break;
            case 7:
                question = "Which beverage brand is famous for its polar bear commercials?";
                options = new String[]{"Coca-Cola", "Pepsi", "Dr Pepper", "Sprite"};
                correctAnswer = "Coca-Cola";
                break;
            case 8:
                question = "Which airline is known for its kangaroo logo?";
                options = new String[]{"Qantas", "Emirates", "Delta", "British Airways"};
                correctAnswer = "Qantas";
                break;
            case 9:
                question = "Which chocolate company uses the slogan 'Have a break, have a KitKat'?";
                options = new String[]{"Nestle", "Mars", "Hershey's", "Cadbury"};
                correctAnswer = "Nestle";
                break;
            case 10:
                question = "Which search engine company owns YouTube?";
                options = new String[]{"Google", "Yahoo", "Bing", "DuckDuckGo"};
                correctAnswer = "Google";
                break;
        }
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((char) ('A' + i) + ". " + options[i]);
        }
        while (true) {
            System.out.println("Enter your choice (A-D), or type '50-50' or 'poll':");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("50-50") && !lifelineUsed) {
                lifelineUsed = true;
                String[] reducedOptions = get50_50(options, correctAnswer);
                System.out.println("50-50 Lifeline: Remaining options:");
                for (String option : reducedOptions) {
                    System.out.println(option);
                }
            } else if (input.equals("POLL") && !pollUsed) {
                pollUsed = true;
                showAudiencePoll(options, correctAnswer);
            } else if (input.length() == 1 && input.charAt(0) >= 'A' && input.charAt(0) <= 'D') {
                int choice = input.charAt(0) - 'A';
                if (options[choice].equals(correctAnswer)) {
                    System.out.println("Correct!");
                    return true;
                } else {
                    System.out.println("Incorrect. The correct answer was: " + correctAnswer);
                    return false;
                }
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
    }
    private String[] get50_50(String[] options, String correctAnswer) {
        Random random = new Random();
        List<String> incorrectOptions = new ArrayList<>();
        for (String option : options) {
            if (!option.equals(correctAnswer)) {
                incorrectOptions.add(option);
            }
        }
        String incorrect = incorrectOptions.get(random.nextInt(incorrectOptions.size()));
        return new String[]{correctAnswer, incorrect};
    }
    private void showAudiencePoll(String[] options, String correctAnswer) {
        Random random = new Random();
        int correctPercentage = random.nextInt(41) + 60; 
        int remainingPercentage = 100 - correctPercentage;
        int[] percentages = new int[options.length];
        percentages[Arrays.asList(options).indexOf(correctAnswer)] = correctPercentage;
        for (int i = 0; i < options.length; i++) {
            if (!options[i].equals(correctAnswer)) {
                percentages[i] = remainingPercentage / (options.length - 1);
            }
        }
        System.out.println("Audience Poll Results:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((char) ('A' + i) + ". " + options[i] + ": " + percentages[i] + "%");
        }
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			details d=new details();
			System.out.println("WELCOME TO QUIZ");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name:");
			d.setName(sc.next());
			System.out.println("Enter the age:");
		    d.setAge(sc.nextInt());
			System.out.println("Enter the Email ID:");
			d.setEmail(sc.next());
			System.out.println("Enter the Phone Number:");
		    d.setPhone(sc.nextLong());
			System.out.println("Enter the address:");
			d.setAddress(sc.next());
			System.out.println(d.getName());
			System.out.println(d.getAge());
			System.out.println(d.getEmail());
			System.out.println(d.getPhone());
			System.out.println(d.getAddress());
			System.out.println("Are you ready to take the quiz game? yes/no");
			String ready=sc.next();
			if(ready.equals("NO")) {
				System.exit(0);
				System.out.println("N|Game terminated");
			
			}
			d.displayRules();
			d.playGame();
			}
			catch(ArithmeticException e1) {
				e1.printStackTrace();
			}
			catch(InputMismatchException e) {
				e.printStackTrace();
			}
			catch(Exception e2) {
				e2.printStackTrace();
			}
	}

}
