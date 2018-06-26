package slacklike;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Chanel> chanleList = new ArrayList<>();
        Chanel curChanel = new Chanel("Personal Chanel");
        System.out.println("Enter your display name:");
        String author = sc.nextLine();
        int choice = 0;
        while (choice != 8) {
            System.out.println("\n__________________________________________________" +
                    "Choose(enter the number of your choice):\n" +
                    "1: Create new Chanel\n" +
                    "2: Switch Chanel from list\n" +
                    "3: Post Message in current Chanel\n" +
                    "4: Like Message\n" +
                    "5: Download Message\n" +
                    "6: List Chanel history\n" +
                    "7: Clear Chanel history.\n" +
                    "8: Exit");


            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter cahnel name");
                    String chanName = sc.nextLine();
                    curChanel = new Chanel(chanName);
                    chanleList.add(curChanel);
                    break;
                case 2:
                    System.out.println("Choose chanel(enter it's number):");
                    for (int i = 0; i < chanleList.size(); i++) {
                        System.out.println((i + 1) + "Chanel " + chanleList.get(i).getName());
                    }
                    int chanelChoice = Integer.parseInt(sc.nextLine());
                    if (chanelChoice < 0 || chanelChoice >= chanleList.size())
                        System.out.println("Invalid choice!");
                    else
                        curChanel = chanleList.get(chanelChoice);
                    break;
                case 3:
                    System.out.println("Enter Message Type(enter the number of your choice):\n" +
                            "1: Text Message\n" +
                            "2: Image Message\n" +
                            "3: Icon Message\n" +
                            "4: File Message.");
                    int messageChoice = Integer.parseInt(sc.nextLine());
                    switch (messageChoice) {
                        case 1:
                            System.out.println("Entetr Text Message: ");
                            String message = sc.nextLine();
                            TextMessage tm = new TextMessage(author, message);
                            tm.setID(curChanel.getMessages().size() + 1);
                            curChanel.addMessage(tm);
                            break;
                        case 2:
                            System.out.println("Enter Image Name: ");
                            String imageName = sc.nextLine();
                            ImageMessage im = new ImageMessage(author, imageName);
                            im.setID(curChanel.getMessages().size() + 1);
                            curChanel.addMessage(im);
                            break;
                        case 3:
                            System.out.println("Enter Icon Type");
                            int count = 1;
                            for (Object s : java.util.Arrays.asList(IconType.values())) {
                                System.out.println(count + ": " + s.toString());
                                count++;
                            }
                            int iconType = Integer.parseInt(sc.nextLine());
                            IconMessage imm;
                            switch (iconType) {
                                case 1:
                                    imm = new IconMessage(author, IconType.SMILY);
                                    imm.setID(curChanel.getMessages().size() + 1);
                                    curChanel.addMessage(imm);
                                    break;
                                case 2:
                                    imm = new IconMessage(author, IconType.SAD);
                                    imm.setID(curChanel.getMessages().size() + 1);
                                    curChanel.addMessage(imm);
                                    break;
                                case 3:
                                    imm = new IconMessage(author, IconType.PARTY);
                                    imm.setID(curChanel.getMessages().size() + 1);
                                    curChanel.addMessage(imm);
                                    break;
                                case 4:
                                    imm = new IconMessage(author, IconType.THUMBSUP);
                                    imm.setID(curChanel.getMessages().size() + 1);
                                    curChanel.addMessage(imm);
                                    break;
                                default:
                                    System.out.println("Invalid Input!");
                            }
                            break;
                        case 4:
                            System.out.println("Enter File Name: ");
                            String fileName = sc.nextLine();
                            curChanel.addMessage(new FileMessage(author, fileName));
                            break;
                        default:
                            System.out.println("Invalid Input!");
                    }
                    break;
                case 4:
                    System.out.println("Choose a message to like(enter ID):");
                    for (Message m : curChanel.getMessages()) {
                        if (m instanceof Likeable)
                            m.show();
                    }
                    int messageID = Integer.parseInt(sc.nextLine());

                    for (Message m : curChanel.getMessages()) {
                        if (m instanceof Likeable) {
                            if (m.getID() == messageID)
                                ((Likeable) m).Like();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Choose a message to Download(enter ID):");
                    for (Message m : curChanel.getMessages()) {
                        if (m instanceof Downloadable)
                            m.show();
                    }
                    messageID = Integer.parseInt(sc.nextLine());

                    for (Message m : curChanel.getMessages()) {
                        if (m instanceof Downloadable) {
                            if (m.getID() == messageID)
                                ((Downloadable) m).Download();
                        }
                    }
                    break;
                case 6:
                    curChanel.listHistory();
                    break;
                case 7:
                    curChanel.clearHistory();
                default:
                    System.out.println("Invalid Input!");

            }
        }
    }
}
