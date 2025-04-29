import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Game  implements Serializable{
    boolean Gamecontinue = true;
    int option;
    boolean loop = true;


  ArrayList<Integer> questionnumber = new ArrayList<>() {{

      for (int i = 0; i < 27; i++) {

          add((i+1));
      }

  }};


    String question;

    String answer1;
    String answer2;
    String answer3;
    String answer4;

    int answer;

    int questionset;

    int player = 1;

    int playercount=1;

    int questionstobeplayed = 0;

    Player player1 = new Player();

    Player player2 = new Player();

    Player player3 = new Player();

    Player player4 = new Player();




    public void question1(){
        question= "Who said, \"You were right about one thing, Master. The negotiations were short.\"?";
        answer1 = "Anakin Skywalker";
        answer2 = "Qui-Gon Jinn";
        answer3 = "Obi-Wan Kenobi";
        answer4 = "Yoda";
        answer = 3;

}
    public void question2(){
        question= "What did Jar Jar Binks owe Qui-Gon Jinn after Jinn rescued him during the Trade Federation invasion of Naboo";
        answer1 = "A trip to Otoh Gunga";
        answer2 = "A bongo";
        answer3 = "A life debt";
        answer4 = "9,000 Republic credits";
        answer = 3;


    }
    public void question3(){
        question= "Who did Qui-Gon Jinn run into in the swamps of Naboo";
        answer1 = "Captain Tarpals";
        answer2 = "Boss Nass";
        answer3 = "Jar Jar Binks";
        answer4 = "Rep Been";
        answer = 3;




    }

    public void question4(){
        question= "How old was Padmé Amidala when she was elected Queen of Naboo";
        answer1 = "Fourteen";
        answer2 = "Eleven";
        answer3 = "Nineteen";
        answer4 = "Sixteen";
        answer = 1;




    }
    public void question5(){
        question= "Who owned Anakin Skywalker before Watto bought him?";
        answer1 = "Sebulba";
        answer2 = "Lana";
        answer3 = "Gardulla the Hutt";
        answer4 = "Cliegg Lars";
        answer = 3;




    }
    public void question6(){
        question= "What does Anakin Skywalker do that makes Qui-Gon Jinn think he has Jedi reflexes?";
        answer1 = "He levitates";
        answer2 = "He trains eopies";
        answer3 = "He is a Podracer";
        answer4 = "He has a high midi-chlorian count";
        answer = 3;





    }
    public void question7(){
        question= "Who said, \" Dis sun doen murder to mesa skin\"?";
        answer1 = "Watto";
        answer2 = "Sebulba";
        answer3 = "Jar Jar Binks";
        answer4 = "Anakin Skywalker";
        answer = 3;


    }

    public void question8(){
        question= "What Rodian accompanied Jabba the Hutt to confront Han Solo in Mos Eisley?";
        answer1 = "Greedo";
        answer2 = "Greeata";
        answer3 = "Thuku";
        answer4 = "Thulu";
        answer = 3;


    }
    public void question9(){
        question= "Who was Anakin Skywalker's father?";
        answer1 = "Mildro Skywalker";
        answer2 = "T'Mell Skywalker";
        answer3 = "Orkan Skywalker";
        answer4 = "He didm't have a father";
        answer = 4;





    }
    public void question10(){
        question= "Which aspect of the Force was most important to Qui-Gon Jinn";
        answer1 = "The unifying Force";
        answer2 = "The light side of the Force";
        answer3 = "The living Force";
        answer4 = "The dark side of the Force";
        answer = 3;





    }
    public void question11() {
        question = "To what phrase did C-3PO reply, \"How rude!\"?";
        answer1 = "Tee chuta hhat yudd!";
        answer2 = "E chu ta!";
        answer3 = "Lana!";
        answer4 = "Paploo";
        answer = 2;
    }

    public void question12() {
        question = "Into what did Luke Skywalker allow himself to fall on Cloud City?";
        answer1 = "A tibanna duct";
        answer2 = "A ventilation trench";
        answer3 = "A sewage tunnel";
        answer4 = "A reactor shaft";
        answer = 4;
    }

    public void question13() {
        question = "What bounty hunter flew the Hound's Tooth?";
        answer1 = "Skorr";
        answer2 = "Zuckuss";
        answer3 = "Bossek";
        answer4 = "Boba Fett";
        answer = 3;
    }
    public void question14() {
        question = "Who used a Merr-Sonn Munitions GRS-1 snare rifle?";
        answer1 = "Zuckuss";
        answer2 = "IG-88";
        answer3 = "4-LOM";
        answer4 = "Dengar";
        answer = 1;
    }
    public void question15() {
        question = "What was the name of the AT-AT assault group on Hoth?";
        answer1 = "Blizzard Force";
        answer2 = "Tundra Force";
        answer3 = "Snowstorm Armada";
        answer4 = "Snowblast Assault Force";
        answer = 1;
    }
    public void question16() {
        question = "What did the Rebel Alliance use on Hoth to allow its transports to get past teh Imperial blockade?";
        answer1 = "Cloaking devices";
        answer2 = "A plasma cannon";
        answer3 = "An ion cannon";
        answer4 = "A planetary turbolase";
        answer = 3;
    }
    public void question17() {
        question = "How tall are AT-ATs?";
        answer1 = "10.5 meters";
        answer2 = "15.5 meters";
        answer3 = "20.5 meters";
        answer4 = "30.5 meters";
        answer = 2;
    }
    public void question18() {
        question = "What anti-infantry device did hte Rebels use in the ground battle on Hoth?";
        answer1 = "Atgar 1.4 FD P-Tower Laser Cannon";
        answer2 = "KDY w-165 Planetary Turbolaser";
        answer3 = "Golan Arms DF.9";
        answer4 = "Borstel NK-7 Ion Cannon";
        answer = 3;
    }
    public void question19() {
        question = "Who was 2-1B's assistant in Echo Base?";
        answer1 = "FX-12";
        answer2 = "FY-9";
        answer3 = "FX-7";
        answer4 = "FY-12";
        answer = 3;
    }
    public void question20() {
        question = "Where was the rendezvous point Luke Skywalker told Lando Calrissian he would meet him?";
        answer1 = "Dantoonie";
        answer2 = "Tatooine";
        answer3 = "Dagobah";
        answer4 = "Hoth";
        answer = 2;
    }
    public void question21() {
        question = "What was in zone twelve moving east?";
        answer1 = "The";
        answer2 = "Tatooine";
        answer3 = "Dagobah";
        answer4 = "Hoth";
        answer = 2;
    }
    public void question22(){
        question = "Who said, \"Feel. Don't think. Trust your instincts.\"?";
        answer1 = "Obi-Wan Kenobi";
        answer2 = "Shmi Skywalker";
        answer3 = "Qui-Gon Jinn";
        answer4 = "Padme Naberrie";
        answer = 3;

    }
    public void question23() {
        question = "What was Obi-Wan Kenobi's final promise to Qui-Gon Jinn?";
        answer1 = "To carry on the fight against the Sith.";
        answer2 = "To train Anakin Skywalker.";
        answer3 = "To avenge Qui-Gon's death";
        answer4 = "To find a Padawan worthy of his training";
        answer = 2;


    }
    public void question24(){
        question = "Who led the cantina band?";
        answer1 = "Ickabel G'ont";
        answer2 = "Doikk Na'ts'";
        answer3 = "Figrin D'an";
        answer4 = "Lirin Car'n";
        answer = 3;


    }

    public  void  question25(){
        question = "Who was a colonel in the Imperial Security Bureau assigned to work with Grand Moff Tarkin?";
        answer1 = "Cassio Tagge";
        answer2 = "Jan Dodonna";
        answer3 = "Wullf Yularen";
        answer4 = "Maximillian Veers";
        answer = 3;


    }
    public  void question26(){
        question = "What ship did Bail Organa take to find Master Yoda?";
        answer1 = "Alderaan Queen II";
        answer2 = "Radiant VII";
        answer3 = "Tantive IV";
        answer4 = "Alderaan Star II";
        answer = 3;


    }
    public void question27(){
        question = "What ship did Padme Amidala take to Mustafar?";



    }

    public void question28(){
        question = "What did hibernation sickness do to Han Solo?";
        answer1 = "He couldn't see";
        answer2 = "He was emaciated";
        answer3 = "He couldn't Walk";
        answer4 = "He was dehydrated";
        answer = 1;

    }
    public void question29(){
        question = "Who claimed that a maneuver at the Battle of Taanab was what promoted  him to General?";
        answer1 =  "Luke Skywalker";
        answer2 = "Han Solo";
        answer3 = "Wedge Antilles";
        answer4 = " Lando Calrissian";
        answer = 4;


    }

    public void question30(){
        question = "Who was Gold Leader in the Battle of Endor";
        answer1 = "Lando Calrissian";
        answer2 = "Luke Skywalker";
        answer3 = "Han Solo";
        answer4 = "Wedge Antilles";
        answer = 1;


    }
    public void question31(){
        question = "Who played the clumsy and stupid Admiral Ozzel";
        answer1 = "Julian Glover";
        answer2 = "Milton Johns";
        answer3 = "Michael Sheard";
        answer4 = "Oliver Maguire";
        answer = 3;


    }

    public void question32(){
        question = "Captain Piett was promoted to Admiral. Who played him?";
        answer1 = "John Dicks";
        answer2 = "Michael Culver";
        answer3 = "Kenneth Colley";
        answer4 = "Clive Revill";
        answer = 3;

    }
    public void question33(){
        question = "Who was in charge of set decoration?";
        answer1 = "John Mollo";
        answer2 = "Lesile Dilley";
        answer3 = "Michael Ford";
        answer4 = "Barbara Ritchie";
        answer = 3;


    }
    public void question34(){
        question = "Who portrayed the Emperor in the second version special edition in The Empire Strikes Back";
        answer1  = "Clive Revill";
        answer2 = "Ian McDiarmid";



    }
    public void question35(){
        question = "Who was the costume designer?";
        answer1 = "John Mollo";
        answer2 = "Harry Lange";
        answer3 = "Alan Tomkins";
        answer4 = "Stuart Freeborn";
        answer = 1;



    }
    public void question36(){
        question = "What company manufactured the ARC-170 Fighter?";
        answer1 = "Kuat Drive Yards";
        answer2 = "Kuat Systems Engineering";
        answer3 = "Hoersh-Kessel Drive Inc.";
        answer4 = "Incom/Subpro";
        answer = 4;



    }
    public void question37(){
        question = "What Separatist organization produced the Mankvim-814 interceptor during the occupation of Utapau";
        answer1 = "Trade Federation";
        answer2 = "Techno Union";
        answer3 = " IG Banking Clan";
        answer4 = "Commerce Guild";
        answer = 2;

    }

    public void question38(){
        question = "What was the HAVw A6 Juggernaut's maximum land speed?";
        answer1 = "90 kph";
        answer2 = "160 kph";
        answer3 = "190 kph";
        answer4 = "50 kph";
        answer = 2;
    }
    public void question39(){
        question = "How many twin turbolaser cannons were in place on the Banking Clan's Munificent-class frigates";
        answer1 = "Thirty-six";
        answer2 = "Ten";
        answer3 = "Forty";
        answer = 3;



    }
    public void question40(){
        question = "What was wrong with R5-D4?";
        answer1 = "It had a bad motivator.";
        answer2 = "It has a bad servomotor.";
        answer3 = "It had a bad communicator.";
        answer4 = "It had a bad power coupling.";
        answer = 1;



    }










    //Completed cards 10, 13, 14, 62, 63, 64






    public void startgame(){

        Scanner input = new Scanner(System.in);

        System.out.println("How many are playing the game?");
        playercount = input.nextInt();

        System.out.println("How many questions would you like to play?");
         questionstobeplayed = input.nextInt();
         input.nextLine();

         if (playercount >= 1){
             System.out.println("What is the First Player's name");
             player1.name = input.nextLine();


         }
        if (playercount >= 2){
            System.out.println("What is the Second Player's name");
            player2.name = input.nextLine();


        }
        if (playercount >= 3){
            System.out.println("What is the Third Player's name");
            player3.name = input.nextLine();


        }
        if (playercount >= 4){
            System.out.println("What is the Fourth Player's name");
            player4.name = input.nextLine();


        }



        do {

            do {
                try {
                    if (player == 1) {
                        if ((questionnumber.isEmpty()) || (questionstobeplayed == 0)) {
                            System.out.println("That was all the questions");
                            System.out.println("First Player Points " + player1.playerpoints);

                            if (playercount >=  2) {
                                System.out.println("Second Player Points " + player2.playerpoints);
                            }

                            if (playercount >=  3) {
                                System.out.println("Third Player Points " + player3.playerpoints);
                            }

                            if (playercount >=  4) {
                                System.out.println("Fourth Player Points " + player4.playerpoints);
                            }

                            if (playercount == 2){
                                if (player1.playerpoints > player2.playerpoints) {
                                    System.out.println("The Force is Strong With the First Player");

                                } else if (player1.playerpoints < player2.playerpoints) {
                                    System.out.println("The Force is Strong With the Second Player");

                                } else {
                                    System.out.println("Both players have used the force");

                                }
                            }else if (playercount == 3) {
                                if ((player1.playerpoints > player2.playerpoints) && (player1.playerpoints > player3.playerpoints)) {
                                    System.out.println("The Force is Strong With the First Player");

                                } else if ((player2.playerpoints > player1.playerpoints) && (player2.playerpoints > player3.playerpoints)) {
                                    System.out.println("The Force is Strong With the Second Player");

                                } else if ((player3.playerpoints > player1.playerpoints) && (player3.playerpoints > player2.playerpoints)) {
                                    System.out.println("The Force is Strong With the Third Player");

                                } else {
                                    System.out.println("All players have used the force");

                                }
                            }
                                else if (playercount == 4) {
                                if ((player1.playerpoints > player2.playerpoints) && (player1.playerpoints > player3.playerpoints) && (player1.playerpoints > player4.playerpoints)) {
                                    System.out.println("The Force is Strong With the First Player");

                                } else if ((player2.playerpoints > player1.playerpoints) && (player2.playerpoints > player3.playerpoints)&& (player2.playerpoints > player4.playerpoints)) {
                                    System.out.println("The Force is Strong With the Second Player");

                                } else if ((player3.playerpoints > player1.playerpoints) && (player3.playerpoints > player2.playerpoints)&& (player3.playerpoints > player4.playerpoints)) {
                                    System.out.println("The Force is Strong With the Third Player");

                                } else if ((player4.playerpoints > player1.playerpoints) && (player4.playerpoints > player2.playerpoints)&& (player4.playerpoints > player3.playerpoints)) {
                                    System.out.println("The Force is Strong With the Fourth Player");

                                } else {
                                    System.out.println("All players have used the force");

                                }

                            }
                            System.exit(0);
                        }


                        questionset = new Random().nextInt(questionnumber.size());
                        if (questionnumber.get(questionset) == 1) {
                            question1();

                        } else if (questionnumber.get(questionset) == 2) {
                            question2();

                        } else if (questionnumber.get(questionset) == 3) {
                            question3();

                        } else if (questionnumber.get(questionset) == 4) {
                            question4();

                        } else if (questionnumber.get(questionset) == 5) {
                            question5();

                        } else if (questionnumber.get(questionset) == 6) {
                            question6();

                        } else if (questionnumber.get(questionset) == 7) {
                            question7();

                        } else if (questionnumber.get(questionset) == 8) {
                            question8();

                        } else if (questionnumber.get(questionset) == 9) {
                            question9();

                        } else if (questionnumber.get(questionset) == 10) {
                            question10();

                        } else if (questionnumber.get(questionset) == 11) {
                            question11();

                        } else if (questionnumber.get(questionset) == 12) {
                            question12();

                        }else if (questionnumber.get(questionset) == 13) {
                            question13();

                        }else if (questionnumber.get(questionset) == 14) {
                            question14();

                        }else if (questionnumber.get(questionset) == 15) {
                            question15();

                        }else if (questionnumber.get(questionset) == 16) {
                            question16();

                        }else if (questionnumber.get(questionset) == 17) {
                            question17();

                        }else if (questionnumber.get(questionset) == 18) {
                            question18();

                        }else if (questionnumber.get(questionset) == 19) {
                            question19();

                        }else if (questionnumber.get(questionset) == 20) {
                            question20();

                        }else if (questionnumber.get(questionset) == 21) {
                            question21();

                        }else if (questionnumber.get(questionset) == 22) {
                            question22();

                        }else if (questionnumber.get(questionset) == 23) {
                            question23();

                        }else if (questionnumber.get(questionset) == 24) {
                            question24();

                        }else if (questionnumber.get(questionset) == 25) {
                            question25();

                        }else if (questionnumber.get(questionset) == 26) {
                            question26();

                        }else if (questionnumber.get(questionset) == 27) {
                            question27();

                        }

                    }


                    System.out.println(question);


                    option = gamemenu(input);


                    if (option == answer) {
                        System.out.println("That is correct");
                        if (player == 1) {
                            player1.playerpoints = player1.playerpoints + 50;
                        }else if (player == 2){
                            player2.playerpoints = player2.playerpoints + 50;
                        }else if (player == 3){
                            player3.playerpoints = player3.playerpoints + 50;
                        }else if (player == 4){
                            player4.playerpoints = player4.playerpoints + 50;
                        }


                    }else {

                        System.out.println("That is not correct");
                    }

                    if (player == playercount) {
                        questionnumber.remove(questionset);
                        questionstobeplayed--;
                        player = 1;
                    }else{
                        player++;
                    }








                } catch (Exception e) {
                    System.out.println("That is not a valid input");
                    input.nextLine();

                }

            }while(!loop);



            this.save_game();

        } while (Gamecontinue);


        save_game();



    }

    public int gamemenu(Scanner input){
        System.out.println("Please pick an option");
        System.out.println("1) " + answer1 + " 2) " + answer2 + " 3) " + answer3 + " 4) " + answer4);

        return input.nextInt();
    }


    public void save_game(){
        try {
            FileOutputStream st = new FileOutputStream("Game.txt");
            ObjectOutputStream ot = new ObjectOutputStream(st);
            ot.writeObject(this);
            ot.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }



}
