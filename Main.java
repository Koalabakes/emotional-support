import java.util.Scanner;
public class Main
{
    static String[] goodBye = {"Bye. Bye. Bye.", "Until next time!!!", "See you later alligator!!", "See you on the flip side!!"};

    static Counselor Moua = new Counselor("Mr.Moua", "bmoua@pleasantonusd.net");
    static Counselor Hashimi = new Counselor("Ms.Hashimi", "zhashimi@pleasantonusd.net");
    static Counselor Ponce = new Counselor("Ms.Ponce", "ymcenteeponce@pleasantonusd.net");
    static Counselor Pacheco = new Counselor("Ms.Pacheco", "spacheco@pleasantonusd.net");
    static Counselor Torres = new Counselor("Ms.Torres", "jtorres2@pleasantonusd.net");
    static Counselor Hashimi2 = new Counselor("Ms.Hashimi", "zhashimi@pleasantonusd.net");
    static Counselor Maloney = new Counselor("Ms.Maloney", "amaloney@pleasantonusd.net");
    
    static Counselor[] counselors = {Moua, Hashimi, Ponce, Pacheco, Torres, Hashimi2, Maloney};

    static String counselorEmail = "";
   
       public static void main(String[] args)
       {
        Scanner in = new Scanner (System.in);

                String userResp = "";
                int counter = 1;
                while(!userResp.contains("toodles")){
                        System.out.println("Hi, I am your emotional support chatbot. Are you stressed: yes or no? Type toodles to end the conversation.");
                        userResp = in.nextLine();
                        userResp.toLowerCase();

                        if(ifToodles(userResp) == true){
                                break;
                        }

                        if(userResp.contains("yes")){
                                System.out.println(respondStress());
                                userResp = in.nextLine();
                                userResp.toLowerCase();

                                if(ifToodles(userResp) == true){
                                        break;
                                }

                                while(!userResp.contains("yes") && !userResp.contains("no")){
                                        System.out.println("Would you like to schedule an appointment with the counselor: yes or no?");
                                        userResp = in.nextLine();
                                        userResp.toLowerCase();

                                        if(ifToodles(userResp) == true){
                                              break;
                                      }
                                }

                                if(userResp.contains("yes")){
                                     System.out.println("I think u should talk to the school counselor");
                                     System.out.println("What's ur last name - to determine your counselor");
                                     userResp = in.nextLine();
                                     userResp.toLowerCase();

                                     if(ifToodles(userResp) == true){
                                        break;
                                     }
                                     String counselor = callCounselor(userResp);
                                     System.out.println("Your counselor is " + counselor);
                                     System.out.println("Would you like to schedule an appointment with the counselor: yes or no?");
                                     userResp = in.nextLine();
                                     userResp.toLowerCase();

                                     if(ifToodles(userResp) == true){
                                        break;
                                     }

                                     while(!userResp.contains("yes") && !userResp.contains("no") ){
                                        ifConfused(userResp);
                                        System.out.println("DO U WANT TO SCHEDULE AN APPOINTMENT: YES OR NO");
                                        userResp = in.nextLine();
                                        userResp.toLowerCase();

                                        if(ifToodles(userResp) == true){
                                           break;
                                        }
                                        }

                                     if(userResp.contains("yes")){
                                             System.out.println("Your counselor's email is: " + counselorEmail);
                                             System.out.println("I think that " + counselor + " can take things from here. Goodbye.");
                                     }

                                     if(userResp.contains("no")){
                                        System.out.println("oh....");
                                        askPersonName();
                                        System.out.println("even if U DONT WANT TO HAVE A COUNSELING APPOINTMENT");
                                     }
                                     
                                }
                                else if(userResp.contains("no")){
                                        askPersonName();
                                        System.out.println("even if U DONT WANT STRESS RELIEF");
                                }
                                else{
                                     while(!userResp.contains("yes") && !userResp.contains("no") ){
                                                ifConfused(userResp);
                                                System.out.println("DO U WANT TO TALK TO THEM: YES OR NO");
                                                userResp = in.nextLine();
                                                userResp.toLowerCase();
        
                                                if(ifToodles(userResp) == true){
                                                   break;
                                                }
                                        }
                                     if(userResp.contains("yes")){
                                             System.out.println("I think you should talk to the school counselor.");
                                             System.out.println("What's your last name? I need it to determine your counselor.");
                                             userResp = in.nextLine();
                                             userResp.toLowerCase();

                                             if(ifToodles(userResp) == true){
                                                break;
                                             }

                                             String counselor = callCounselor(userResp);
                                             System.out.println("Your counselor is " + counselor);
                                             System.out.println("Would you like to schedule an appointment with the counselor: yes or no?");
                                             userResp = in.nextLine();
                                             userResp.toLowerCase();
                                             
                                             if(ifToodles(userResp) == true){
                                                break;
                                             }

                                             while(!userResp.contains("yes") && !userResp.contains("no") ){
                                                ifConfused(userResp);
                                                System.out.println("DO U WANT TO SCHEDULE AN APPOINTMENT: YES OR NO");
                                                userResp = in.nextLine();
                                                userResp.toLowerCase();
        
                                                if(ifToodles(userResp) == true){
                                                   break;
                                                }
                                                }

                                             if(userResp.contains("yes")){
                                                     System.out.println("Your counselor's email is: " + counselorEmail);
                                                     System.out.println("I think that " + counselor + " can take things from here. Goodbye.");
                                             }  
                                             
                                        }
                                        else if(userResp.contains("no")){
                                             System.out.println("If you don't want help, I can't help you. Goodbye. ");
                                        }
                                }
                             } 
                             else if(userResp.contains("no")){
                                System.out.println(noStress());
                                System.out.println("What's your last name? I need it to determine your counselor.");
                                userResp = in.nextLine();
                                userResp.toLowerCase();

                                if(ifToodles(userResp) == true){
                                        break;
                                }

                                String counselor = callCounselor(userResp);
                                System.out.println("Your counselor is " + counselor);
                                System.out.println("Would you like to know your counselor's email too: yes or no? ");
                                userResp = in.nextLine();
                                userResp.toLowerCase();

                                if(ifToodles(userResp) == true){
                                        break;
                                }

                                             if(userResp.contains("yes")){
                                                     System.out.println("Your counselor's email is: " + counselorEmail);
                                                     System.out.println("If you ever feel stressed, be sure to email or talk to " + counselor + ". I think I'm done here. Goodbye.");
                                             }
                                             else if(userResp.contains("no")){
                                                     System.out.println("Well if you are ever stressed, be sure to go and speak to " + counselor + " in person. Also...");
                                                     askPersonName();
                                             }
                                             else{
                                                     while(!userResp.contains("yes") && !userResp.contains("no") ){
                                                             ifConfused(userResp);
                                                             System.out.println("DO U WANT TO KNOW UR COUNSELOR's EMAIL: YES OR NO");
                                                             userResp = in.nextLine();
                                                             userResp.toLowerCase();

                                                             if(ifToodles(userResp) == true){
                                                                break;
                                                        }
                                                     }
                                                     if(userResp.contains("yes")){
                                                             System.out.println("Your counselor's email is: " + counselorEmail);
                                                             System.out.println("If you ever feel stressed, be sure to email or talk to " + counselor + ". I think I'm done here. Goodbye.");
                                                     }
                                                     else{
                                                             System.out.println("Well if you are ever stressed, be sure to go and speak to " + counselor + " in person.");
                                                     }
                                             }
                             }
                             else{
                                     while(!userResp.contains("yes") && !userResp.contains("no")){
                                             ifConfused(userResp);
                                             System.out.println("Are you stressed or not: YES OR NO? ");
                                             userResp = in.nextLine();
                                             userResp.toLowerCase();

                                             if(ifToodles(userResp) == true){
                                                break;
                                             }
                                     }
                                     if(userResp.contains("yes")){
                                             System.out.println(respondStress());
                                             userResp = in.nextLine();
                                             userResp.toLowerCase();

                                             if(ifToodles(userResp) == true){
                                                break;
                                                }

                                        while(!userResp.contains("yes") && !userResp.contains("no")){
                                                System.out.println("Would you like to schedule an appointment with the counselor: yes or no?");
                                                userResp = in.nextLine();
                                                userResp.toLowerCase();

                                                if(ifToodles(userResp) == true){
                                                      break;
                                              }
                                        }
                                             if(userResp.contains("yes")){
                                                  System.out.println("I think u should talk to the school counselor");
                                                  System.out.println("What's ur last name - to determine your counselor");
                                                  userResp = in.nextLine();
                                                  userResp.toLowerCase();

                                                  if(ifToodles(userResp) == true){
                                                        break;
                                                }
                                                  String counselor = callCounselor(userResp);
                                                  System.out.println("Your counselor is " + counselor);
                                                  System.out.println("Would you like to schedule an appointment with the counselor: yes or no?");
                                                  userResp = in.nextLine();
                                                  userResp.toLowerCase();

                                                  if(ifToodles(userResp) == true){
                                                        break;
                                                }
                                                  if(userResp.contains("yes")){
                                                          System.out.println("Your counselor's email is: " + counselorEmail);
                                                          System.out.println("I think that " + counselor + " can take things from here. Goodbye.");
                                                  }
                                                  
                                             }
                                             else if(userResp.contains("no")){
                                                  askPersonName();
                                                //System.out.println("If you don't want help, I can't help you. Goodbye. ");
                                             }
                                             else{
                                                  ifConfused(userResp);
                                                  while(!userResp.contains("yes") && !userResp.contains("no")){
                                                  System.out.println("Would you like to schedule an appointment with the counselor: yes or no?");
                                                  userResp = in.nextLine();
                                                  userResp.toLowerCase();

                                                  if(ifToodles(userResp) == true){
                                                        break;
                                                }
                                                  }
                                                  if(userResp.contains("yes")){
                                                          System.out.println("I think you should talk to the school counselor.");
                                                          System.out.println("What's your last name? I need it to determine your counselor.");
                                                          userResp = in.nextLine();
                                                          userResp.toLowerCase();

                                                          if(ifToodles(userResp) == true){
                                                                break;
                                                        }
                                                          String counselor = callCounselor(userResp);
                                                          System.out.println("Your counselor is " + counselor);
                                                          System.out.println("Would you like to schedule an appointment with the counselor: yes or no?");
                                                          userResp = in.nextLine();
                                                          userResp.toLowerCase();

                                                          if(ifToodles(userResp) == true){
                                                                break;
                                                        }
                                                          if(userResp.contains("yes")){
                                                                  System.out.println("Your counselor's email is: " + counselorEmail);
                                                                  System.out.println("I think that " + counselor + " can take things from here. Goodbye.");
                                                          }           
                                                     }
                                                     else if(userResp.contains("no")){
                                                          System.out.println("If you don't want help, I can't help you. Goodbye. ");
                                                     }
                                             }
                                          } 
                                          else if(userResp.contains("no")){
                                                  System.out.println(noStress());
                                                  System.out.println("What's your last name? I need it to determine your counselor.");
                                                  userResp = in.nextLine();
                                                  userResp.toLowerCase();

                                                          if(ifToodles(userResp) == true){
                                                                break;
                                                        }
                                                          String counselor = callCounselor(userResp);
                                                          System.out.println("Your counselor is " + counselor);
                                                          System.out.println("Would you like to know your counselor's email too: yes or no? ");
                                                          userResp = in.nextLine();
                                                          userResp.toLowerCase();

                                                          if(ifToodles(userResp) == true){
                                                                break;
                                                        }
                                                          if(userResp.contains("yes")){
                                                                  System.out.println("Your counselor's email is: " + counselorEmail);
                                                                  System.out.println("If you ever feel stressed, be sure to email or talk to " + counselor + ". I think I'm done here. Goodbye.");
                                                          }
                                                          else if(userResp.contains("no")){
                                                                  System.out.println("Well if you are ever stressed, be sure to go and speak to " + counselor + " in person.");
                                                          }
                                                          else{
                                                                  while(!userResp.contains("yes") && !userResp.contains("no") ){
                                                                          ifConfused(userResp);
                                                                          System.out.println("Would you like to know your counselor's email: yes or no? ");
                                                                          userResp = in.nextLine();
                                                                          userResp.toLowerCase();
                                                                          if(ifToodles(userResp) == true){
                                                                                break;
                                                                        }
                                                                  }
                                                                  if(userResp.contains("yes")){
                                                                          System.out.println("Your counselor's email is: " + counselorEmail);
                                                                          System.out.println("If you ever feel stressed, be sure to email or talk to " + counselor + ". I think I'm done here. Goodbye.");
                                                                  }
                                                                  else{
                                                                          System.out.println("Well if you are ever stressed, be sure to go and speak to " + counselor + " in person.");
                                                                  }
                                                          }
                                          }
                             }
                        if(!userResp.contains("toodles")){
                        counter++;
                        System.out.println("You are proceeding to conversation #" +counter+ ".");
                        }
                }
        }

       public static boolean ifToodles(String userResp){
                userResp.toLowerCase();
                if(userResp.contains("toodles")){
                        int rand = (int)(Math.random()*4);

                        final String BLUE_TEXT = "\u001B[34m";
                        final String RESET_TEXT = "\u001B[0m";

                        System.out.println(BLUE_TEXT + goodBye[rand] + RESET_TEXT);
                        return true;
                }
                return false;
       }

       public static void ifConfused(String input){
            String[] confused = new String[4];
            confused[0] = "I don't understand what " + input + " is.";
            confused[1] = "I think you are struggling too much to understand the prompt.";
            confused[2] = "I think you are too sleep deprived to have typed in " + input;
            confused[3] = input + " is not what I asked you for.";

            int rand = (int)(Math.random()*4);

            System.out.println(confused[rand]);

       }
       
       public static String respondStress(){
            String[] response = new String[4];
            response[0] = "I'm sorry you are feeling this way. Would you like some stress relief?";
            response[1] = "I'm sorry you feel stressed. Would you like some stress relief?";
            response[2] = "I think you may be sleep deprived. Would you like some stress relief?";
            response[3] = "Let out your frustrations and feel your emotions. Would you like some stress relief?";

            int rand = (int)(Math.random()*4);

            return response[rand];
       }

       public static String noStress(){
        String[] response = new String[4];
        response[0] = "Well, good that you aren't stressed. We should probably find out your conselor though, in case you feel stressed in the future.";
        response[1] = "Just in case you feel stressed in the future, let's figure out who your counselor is.";
        response[2] = "I'm glad to hear that! However, let's prepare you to meet your counselor in case you feel stressed in the future.";
        response[3] = "That's suprising. Most people come to talk with me when they are feeling stressed. Anyways, let's find out who your counselor is so that you can talk to them if you are ever stressed later on.";

        int rand = (int)(Math.random()*4);

        return response[rand];
   }
        public static void askPersonName(){
                Scanner scanner = new Scanner(System.in);

                System.out.println("Who is the name of ur FAV PERSON or BESTIE? Or if u dont have one type none :(");
                String personName = scanner.nextLine(); 
                personName = personName.toLowerCase();

                if(personName.contains("none")){
                        System.out.println("Go talk to Mr. Thai in room R211! He's very friendly and UNDERSTANDING");
                }
                else{
                        System.out.println("Got it! You should go talk to " + personName + " for some comfort ");
                }
        }
       public static String callCounselor (String input){
                input.toLowerCase();
                char firstChar = input.charAt(0);
                int ascii = firstChar;
                if(ascii >= 97 && ascii <= 99){
                        counselorEmail = counselors[0].getEmail();
                        return counselors[0].getName();
                }
                else if(ascii >= 100 && ascii <= 101){
                        counselorEmail = counselors[1].getEmail();
                        return counselors[1].getName();
                }
                else if(ascii >= 102 && ascii <= 104){
                        counselorEmail = counselors[2].getEmail();
                        return counselors[2].getName();
                }
                else if(ascii >= 105 && ascii <= 108){
                        counselorEmail = counselors[3].getEmail();
                        return counselors[3].getName();
                }
                else if(ascii >= 109 && ascii <= 111){
                        counselorEmail = counselors[4].getEmail();
                        return counselors[4].getName();
                }
                else if(ascii >= 112 && ascii <= 115){
                        counselorEmail = counselors[5].getEmail();
                        return counselors[5].getName();
                }
                else if(ascii >= 116 && ascii <= 122){
                        counselorEmail = counselors[6].getEmail();
                        return counselors[6].getName();
                }
                else{
                        while(ascii < 97 || ascii > 122){
                                Scanner in = new Scanner (System.in);
                                System.out.println("Please enter a valid last name: ");
                                String lastName = in.nextLine();
                                lastName.toLowerCase();

                                firstChar = lastName.charAt(0);
                                ascii = firstChar;
                        }

                        if(ascii >= 97 && ascii <= 99){
                                counselorEmail = counselors[0].getEmail();
                        return counselors[0].getName();
                                
                        }
                        else if(ascii >= 100 && ascii <= 101){
                                counselorEmail = counselors[1].getEmail();
                        return counselors[1].getName();
                        }
                        else if(ascii >= 102 && ascii <= 104){
                                counselorEmail = counselors[2].getEmail();
                        return counselors[2].getName();
                        }
                        else if(ascii >= 105 && ascii <= 108){
                                counselorEmail = counselors[3].getEmail();
                        return counselors[3].getName();
                        }
                        else if(ascii >= 109 && ascii <= 111){
                                counselorEmail = counselors[4].getEmail();
                        return counselors[4].getName();
                        }
                        else if(ascii >= 112 && ascii <= 115){
                                counselorEmail = counselors[5].getEmail();
                        return counselors[5].getName();
                        }
                        else{
                                counselorEmail = counselors[6].getEmail();
                        return counselors[6].getName();
                        }
                }
       }
}