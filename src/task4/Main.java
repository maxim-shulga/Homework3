package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DocumentWorker documentWorker;
        String userCommand;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter key");

        String key = in.nextLine();
        switch (key){
            case ExpertDocumentWorker.key:
                documentWorker = new ExpertDocumentWorker();
                break;
            case ProDocumentWorker.key:
                documentWorker = new ProDocumentWorker();
                break;
            default:
                documentWorker = new DocumentWorker();
        }

        System.out.println("1 - Open document");
        System.out.println("2 - Edit document");
        System.out.println("3 - Save document");
        System.out.println("4 - Exit");
        do {
            userCommand = in.next();
            switch (userCommand){
                case "1":
                    documentWorker.openDocument();
                    break;
                case "2":
                    documentWorker.editDocument();
                    break;
                case "3":
                    documentWorker.saveDocument();
                    break;
                case "4":
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Unknown command");
            }
        } while (!userCommand.equals("4"));


    }
}
