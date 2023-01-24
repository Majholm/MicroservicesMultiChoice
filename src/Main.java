import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner USER_INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<Question>();
        questions = addQuestions(questions);
        Collections.shuffle(questions);

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            for (int i = 0; i < question.getAnswers().length; i++) {
                System.out.println((i + 1) + ": " + question.getAnswers()[i]);
            }
            int answer = input();
            if (answer == question.getCorrectAnswer()) {
                question.setNumCorrect(question.getNumCorrect() + 1);
                System.out.println("Correct!\n");
            } else {
                if(answer > 0 && answer < 5) {
                    System.out.println("Incorrect. The correct answer is " + (question.getCorrectAnswer()) + "\n");
                }
                else{

                }
            }
        }

        // print out the number of correct answers
        int totalCorrect = 0;
        for (Question question : questions) {
            totalCorrect += question.getNumCorrect();
        }
        System.out.println("You got " + totalCorrect + " out of " + questions.size() + " questions correct.");
    }

    public static int input() {
        int input;
        int num;

        while (true) {
            if (USER_INPUT.hasNextInt()) {
                num = USER_INPUT.nextInt();
                if(num > 0 && num < 5) {
                    input = Math.abs(num);
                    break;
                }
                else {
                    System.out.println("Plases enter a number between 1-4!");
                }
            }
            else {
                System.out.println("Plases enter a number between 1-4!");
                USER_INPUT.next();
            }
        }
        return input;
    }
    public static ArrayList<Question> addQuestions(ArrayList<Question> questions)
    {
        // add questions to the list
        questions.add(new Question("What is Spring Boot used for?",
                new String[]{"Building web applications using the Spring Framework", "Creating and running stand-alone applications", "Configuring Spring applications", "All of the above"}, 4, 0));
        questions.add(new Question("What does CI/CD stand for?",
                new String[]{"Continuous Integration and Continuous Deployment", "Continual Improvement and Continuous Development", "Constant Integration and Constant Deployment", "Continual Inspection and Continuous Deployment"}, 1, 0));
        questions.add(new Question("What is the purpose of Continuous Integration in the CI/CD process?",
                new String[]{"To frequently integrate code changes into a shared repository", "To automatically build, test, and deploy code changes", "To ensure the codebase remains in a stable and releasable state", "All of the above"}, 1, 0));
        questions.add(new Question("What are some benefits of using a microservices architecture?",
                new String[]{"Scalability", "Flexibility", "Resilience", "All of the above"}, 4, 0));
        questions.add(new Question("What are some challenges of using a microservices architecture?",
                new String[]{"Increased complexity", "More difficult to debug", "Higher operational cost", "All of the above"}, 4, 0));
        questions.add(new Question("What are some benefits of using Docker?",
                new String[]{"Portability", "Isolation", "Scalability", "All of the above"}, 4, 0));
        questions.add(new Question("What is the purpose of versioning in Docker?",
                new String[]{"To easily rollback to a previous version of a container", "To keep track of changes in the container", "To ensure the container is always up to date", "All of the above"}, 1, 0));
        questions.add(new Question("What is the main benefit of using Spring Boot?",
                new String[]{"Quickly creating and running stand-alone, production-grade Spring-based applications with minimal configuration", "Providing a way to automatically configure Spring applications, including auto-configuration of beans, database connectivity, and security", "Including a number of built-in plugins, such as an embedded web server, for ease of development and deployment", "All of the above"}, 4, 0));
        questions.add(new Question("Which of the following is not a part of the CI/CD process?",
                new String[]{"Continuous Integration", "Continuous Deployment", "Continuous Inspection", "Continuous Improvement"}, 3, 0));
        questions.add(new Question("What is the main benefit of using Continuous Deployment in the CI/CD process?",
                new String[]{"Automatically building, testing, and deploying code changes to production", "Deploying code to other environments such as staging or testing", "Ensuring the codebase remains in a stable and releasable state", "All of the above"}, 1, 0));
        questions.add(new Question("Which of the following is not a benefit of using a microservices architecture?",
                new String[]{"Scalability: Each service can be scaled individually based on the load it receives", "Centralized management of services", "Flexibility: Services can be developed and deployed in any programming language or technology that is best suited for the task", "Resilience: If one service fails, the others can continue to function, reducing the impact of downtime."}, 2, 0));
        questions.add(new Question("Which of the following is not a challenge of using a microservices architecture?",
                new String[]{"Increased complexity in terms of service discovery, communication, and testing", "More difficult to debug with many services running", "Lower operational cost with more services running", "Dependency Management: With many services dependent on each other, a failure in one service may cause cascading failures across the system."}, 3, 0));
        questions.add(new Question("Which of the following is not a benefit of using Docker?",
                new String[]{"Portability: Docker containers allow you to package an application with all its dependencies and run it on any machine that has Docker installed", "Isolation: Docker allows you to run multiple applications on the same machine without them interfering with each other", "Ease of maintenance: Docker allows you to easily update and manage containers", "Decrease in infrastructure costs: Docker allows you to scale applications by adding or removing containers as needed."},4,0));
        questions.add(new Question("What is Spring Data?",
                new String[]{"A set of libraries that provide a consistent and easy-to-use interface for accessing various types of data stores", "A way to automatically generate implementations of the repository interface", "A way to define query methods by simply declaring the method name and the parameters", "All of the above"}, 4, 0));
        questions.add(new Question("What are some of the features of Spring Cloud?",
                new String[]{"Service Discovery, Configuration Management, Routing and Load Balancing, Distributed Tracing, Distributed Messaging, Security, Circuit Breaker", "Service Discovery, Load Balancing, Distributed Tracing, Distributed Messaging, Security", "Service Discovery, Configuration Management, Routing and Load Balancing, Security", "Service Discovery, Configuration Management, Routing and Load Balancing, Distributed Messaging"}, 1, 0));
        questions.add(new Question("What is the difference between monitoring and logging in Spring Boot?",
                new String[]{"Monitoring refers to the process of collecting and analyzing performance metrics of a Spring Boot application, while logging refers to the process of recording events and messages in a structured format", "Monitoring refers to the process of recording events and messages in a structured format, while logging refers to the process of collecting and analyzing performance metrics of a Spring Boot application", "Monitoring refers to the process of collecting and analyzing performance metrics of a Spring Boot application, while logging refers to the process of debugging issues in a distributed system", "Monitoring refers to the process of debugging issues in a distributed system, while logging refers to the process of recording events and messages in a structured format"}, 1, 0));
        questions.add(new Question("What command is used to initialize a new Git repository?",
                new String[]{"git init", "git new", "git create", "git repo"}, 1, 0));
        questions.add(new Question("What command is used to push changes to a remote Git repository?",
                new String[]{"git push", "git upload", "git send", "git deploy"}, 1, 0));
        questions.add(new Question("What command is used to check the status of files in a Git repository?",
                new String[]{"git status", "git check", "git diff", "git show"}, 1, 0));
        questions.add(new Question("What command is used to create a new branch in a Git repository?",
                new String[]{"git branch", "git new-branch", "git create-branch", "git switch-branch"}, 1, 0));
        questions.add(new Question("What is the purpose of Maven?",
                new String[]{"To manage dependencies and build Java projects", "To manage database connections", "To handle server deployment", "To provide a user interface for code editing"}, 1, 0));
        questions.add(new Question("What is the main configuration file in a Maven project?",
                new String[]{"pom.xml", "build.xml", "config.properties", "settings.xml"}, 1, 0));
        questions.add(new Question("What is the command to build a Maven project?",
                new String[]{"maven build", "maven run", "mvn compile", "mvn package"}, 4, 0));
        questions.add(new Question("What is the command to install a dependency in a Maven project?",
                new String[]{"maven install", "mvn add", "mvn install dependency", "mvn install -DartifactId=<dependency>" }, 4, 0));
        questions.add(new Question("What is the command to run test cases in a Maven project?",
                new String[]{"maven test", "mvn test", "mvn run test", "mvn test -Dtest=<test_name>"}, 2, 0));
        return questions;
    }
}

