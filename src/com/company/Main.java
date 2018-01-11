package com.company;

import java.util.*;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String Answer = "", Name;
    static int WE;
    static boolean alreadyPlayed = false;
    static boolean done = false;

    //hey my dude

    public static void main(String args[]) {
        startGame();
    }

    public static void startGame() {
        WE = 5;
        while (!Answer.equalsIgnoreCase("start")) {
            System.out.println("type 'start' to begin Hack to the Top. ");
            Answer = input.next();
        }
        if (Answer.equalsIgnoreCase("start")) {
            introduceGame();
        }
    }

    public static void introduceGame() {
        System.out.print('\u000C');
        System.out.println("You will be playing as Jamie, a top programmer in their college class." +
                "\nAll throughout college they were known for their programming skills, and during it even" +
                "\ngot offered a job rom a big company named Poogle Inc. " +
                "\nYou, Jamie, were so excited, but after a " +
                "\nwhile you suspected something from the company, " +
                "\nseeing some skeptical code.");
        continued();
        if (Answer.equalsIgnoreCase("continue")) {
            System.out.print('\u000C');
            System.out.println("So you did the thing any compulsive programmer would do . . .  you hacked into their interface. " +
                    "\nUnfortunately being the big company that Poogle Inc. is, they immediately discovered " +
                    "\nyou and fired you on the spot, putting it on your record, and prohibiting you from ever getting a " +
                    "\njob like that again. You have been living off of small projects you can get her hands on, but nothing " +
                    "\n amounting to the jobs you could have had. " +
                    "\n" +
                    "\nThis will go through something that changed your life forever. Remember that you are trying to " +
                    "\nbuild your life back up and you are (very) desperate to do so. Keep this in mind  " +
                    "\nas you go through your journey. To answer type out anything" +
                    "\nin '' (single quotes), to guide " +
                    "\nthe story to where you can be successful in the end.  ");
            System.out.println();
            continued();
            game();
        }
    }

    public static void game() {
        WE = 10;
        if (alreadyPlayed == true) {
            System.out.println("You currently have " + WE + " WE points");
        }
        if (WE > 0) {
            email1();
            missionAccepted();
            choosePath();
            passwordDecode();
            flashDriveIn();
            teamBuilding();
            alreadyPlayed = true;
            nameChange();
            alreadyPlayed = false;
            hackingIn();
            if (WE > 0) {
                finalCountdown();
            }
            //clearscreen
        }
    }

    public static void email1() {
        System.out.print('\u000C');
        Answer = "";
        System.out.print("You were just going about your day one day, when you suddenly received an email" +
                "\nfrom an encrypted address. " +
                "\nDo you 'read' or 'ignore' ?");
        System.out.println();
        Answer = input.next();
        while (!Answer.equalsIgnoreCase("read") && !Answer.equalsIgnoreCase("ignore") && !Answer.equalsIgnoreCase("respond")) {
            System.out.println("Type 'read' or 'ignore' to choose your option");
            Answer = input.next();
        }
        if (Answer.equalsIgnoreCase("read")) {
            System.out.print('\u000C');
            System.out.println("You opened the message, cause why not, and then you read it. It reads : " +
                    "\n \"Dear Jamie Coodes, we are contacting you on behalf of a very important job offer. We are led to " +
                    "\nbelieve that the company Poogle Inc. is using their power for evil, taking personal information from " +
                    "\nit's users and using it as a way to to hack their accounts and commit various counts of identity theft." +
                    "\nWe know that you have worked for this company, and recognize your amazing abilities, please respond if you are" +
                    "\nwilling to accept this offer.\"");
            System.out.println();
            Answer = "";
        }
        while (!Answer.equalsIgnoreCase("ignore") && !Answer.equalsIgnoreCase("respond") && !Answer.equalsIgnoreCase("respond")) {
            System.out.println("Type 'respond' or 'ignore' to choose your option");
            Answer = input.next();
        }
        if (Answer.equalsIgnoreCase("respond")) {
            System.out.print('\u000C');
            System.out.println("You responded, accepting the offer.");
            continued();
            Answer = "respond";
        } else if (Answer.equalsIgnoreCase("ignore")) {
            System.out.print('\u000C');
            System.out.println("Come on, do you really want to live your life in this sad life?" +
                    "\nYou can reconsider or keep going.");
            Answer = "";
            while (!Answer.equalsIgnoreCase("ignore") && !Answer.equalsIgnoreCase("reconsider") && !Answer.equalsIgnoreCase("respond")) {
                System.out.println("Type 'reconsider' to respond or 'ignore' to continue being sad your whole life");
                Answer = input.next();
            }
            if (Answer.equalsIgnoreCase("ignore")) {
                ignored();
            } else {
                continued();
                email1();
            }
        }
    }

    public static void missionAccepted() {
        System.out.print('\u000C');
        System.out.println("Now that you have accepted the offer, you need to know some basic things. " +
                "\n" +
                "\nRemember that you will be judged on WE (Work Ethic) throughout the game, so" +
                "\nchoose options that improve your work ethic, or you will risk getting fired, " +
                "\n and return to the sad life you were living before. " +
                "\n" +
                "\nAs of now you have " + WE + " WE points, so choose wisely.");
        continued();
        System.out.print('\u000C');
        System.out.println("After two days of responding the email, you think it was just a scam, but then you get " +
                "\nanother email from the same address. It tells you to meet somewhere. It's a hotel nearby Poogle Inc." +
                "\n database. You know it's a far drive, and you need" +
                "\nto leave now to arrive on time.");
        System.out.println();
        if (WE > 0) {
            while (!Answer.equalsIgnoreCase("leave") && !Answer.equalsIgnoreCase("wait")) {
                System.out.println("Type ''leave' or 'wait'");
                Answer = input.next();
            }
            if (Answer.equalsIgnoreCase("leave")) {
                System.out.print('\u000C');
                System.out.println("You arrive at the lobby of the hotel and immediately you are taken into a nearby seating area" +
                        "\nwhere you finally meet the group of people that hired you. They seem like nice people, and" +
                        "\nwell dressed. They introduce themselves as Arthur, Bethany, and John. They explain to you that" +
                        "\nthe plan consists of getting a flash drive into Poogle Inc. 's databases, so that you can access their files." +
                        "\nThey say they will explain the rest of the plan later. You agree and go into the hotel room they " +
                        "\nreserved.");
                continued();
            } else if (Answer.equalsIgnoreCase("wait")) {
                WE -= 2;
                System.out.print('\u000C');
                System.out.println("You wait to go and arrive late. The team seems a little annoyed by " +
                        "\nyour actions. You continue but you get 2 WE points deducted. " +
                        "\n" +
                        "\nYou arrive at the lobby of the hotel and immediately you are taken into a nearby seating area" +
                        "\nwhere you finally meet the group of people that hired you. They seem like nice people, and" +
                        "\nwell dressed. They introduce themselves as Arthur, Bethany, and John. They explain to you that" +
                        "\nthe plan consists of getting a flash drive into Poogle Inc. 's databases, so that you can access their files." +
                        "\nThey say they will explain the rest of the plan later. You agree and go into the hotel room they" +
                        "\nreserved.");
                sayWEPoints();
                continued();
                Answer = "";
            }
        } else {
            fired();
        }
    }

    public static void choosePath() {
        if (WE > 0) {
            System.out.print('\u000C');
            System.out.println("After you get access to security, Arthur manages to successfully " +
                    "\nget into Poogle Inc., but there are two" +
                    "\npaths he can go in a safe, but slow one, or a risky and fast one.");
            while (!Answer.equalsIgnoreCase("safe") && !Answer.equalsIgnoreCase("risky")) {
                System.out.println("Do you tell him to go the 'safe' path of 'risky'");
                Answer = input.next();
            }
            choosenPath();
            continued();
        } else {
            fired();
        }
    }

    public static void passwordDecode() {
        if (WE > 0) {
            System.out.print('\u000C');
            System.out.println("You got to the room now, but there is a three part password to complete" +
                    "\nyou tell Arthur you have the three combinations narrowed down which are " +
                    "\n" +
                    "\n '2135' '5373' and '5234'");
            Answer = "";
            while (!Answer.equalsIgnoreCase("2135") && !Answer.equalsIgnoreCase("5373") && !Answer.equalsIgnoreCase("5234")) {
                System.out.println("Which password do you use first?'");
                Answer = input.next();
            }
            passwordChosen();
        } else {
            caught();
        }
    }

    public static void flashDriveIn() {
        Answer = "";
        if ((WE > 0) && !Answer.equalsIgnoreCase("continue") && done == false) {
            System.out.print('\u000C');
            System.out.println("Arthur manages to put the flash drive in. As you open up the accessed" +
                    "\nfiles you see two folders, but neither area labeled.");
            Answer = "";
            while (!Answer.equalsIgnoreCase("right") && !Answer.equalsIgnoreCase("left")) {
                System.out.println("Do you click 'right' or 'left' folder?");
                Answer = input.next();
            }
            fileChosen();
            continued();
        }
    }

    public static void teamBuilding() {
        System.out.print('\u000C');
        System.out.println("You now have the files, and you are able to successfully get Arthur out. " +
                "\nEveryone is together at the hotel, and you are about to leave until you are offered " +
                "\nto 'stay' with the team, or 'leave' on your own. They tell you it's risky to " +
                "\nleave due to Poogle Inc. not taking long to figure out what you've done. ");
        while (!Answer.equalsIgnoreCase("leave") && !Answer.equalsIgnoreCase("stay")) {
            System.out.println("Do you 'stay' or 'leave' ? ");
            Answer = input.next();
        }
        if (Answer.equalsIgnoreCase("leave")) {
            WE--;
            System.out.println("You leave but start noticing you are being followed by" +
                    "\na strange group of people dressed in black. You manage to get back" +
                    "\ninto the hotel safely, and your team tells you they told you so. " +
                    "\nYou are deducted 1 WE points for being stubborn.");
            sayWEPoints();
        } else if (Answer.equalsIgnoreCase("stay")) {
            System.out.print('\u000C');
            System.out.println("You decide to stay and sit down next to Arthur. He thanks you" +
                    "\nfor all you did. How do you respond?");
        }
        while (!Answer.equalsIgnoreCase("brag") && !Answer.equalsIgnoreCase("thank")) {
            System.out.println("Do you 'brag' to or 'thank' Arthur? ");
            Answer = input.next();
        }
        System.out.print('\u000C');
        if (Answer.equalsIgnoreCase("brag")) {
            WE--;
            System.out.println("The team overhears and they think you are" +
                    "\nself-entitled. 1 WE point has been deducted. You " +
                    "\nnow have " + WE + " WE.");
        } else if (Answer.equalsIgnoreCase("thank")) {
            WE +=2;
            System.out.println("Arthur says it's no problem! He thinks " +
                    "\nyou are pretty nice and you get 2 WE points!");
            sayWEPoints();
        }
        continued();
        System.out.print('\u000C');
        System.out.println("After that,Bethany and John say that they are going to go buy" +
                "\nsome dinner. They ask if you want 'Italian' or 'Chinese' ?");
        Answer = input.next();
        while (!Answer.equalsIgnoreCase("Italian") && !Answer.equalsIgnoreCase("chinese")) {
            System.out.println("It's either 'Italian' or 'Chinese'.");
            Answer = input.next();
        }
        System.out.print('\u000C');
        System.out.println("They ask you if you are completely sure of what you want" +
                "\nfor it is a very important decision. Do you stick with your option " +
                "\nor change it. You can type 'Italian' or 'Chinese'.");
        Answer = input.next();
        while (!Answer.equalsIgnoreCase("Italian") && !Answer.equalsIgnoreCase("chinese")) {
            System.out.println("It's either 'Italian' or 'Chinese'.");
            Answer = input.next();
        }
        System.out.print('\u000C');
        System.out.println("The rest of the team agrees with you on what to get. As Bethany and John go to buy dinner.  " +
                "\n Arthur asks you about your time at Poogle Inc.. You can tell him the 'truth' that you hacked Poogle Inc. " +
                "\nand were fired, or 'lie' that you just resigned, cause you didn't like it. ");
        while (!Answer.equalsIgnoreCase("truth") && !Answer.equalsIgnoreCase("lie")) {
            System.out.println("Do tell the 'truth' or 'lie' to Arthur? ");
            Answer = input.next();
        }
        System.out.print('\u000C');
        if (Answer.equalsIgnoreCase("truth")) {
            System.out.println("Arthur understands, and appreciates you being honest" +
                    "\nwith the team. You talk until dinner arrives. You have earned 1" +
                    "\nWE point. You now have " + WE + " WE points.");
        } else {
            System.out.print('\u000C');
            System.out.println("Arthur suspects you aren't telling the truth but doesn't" +
                    "\npush. You sit in awkward silence for a while.");
        }
        continued();
        System.out.print('\u000C');
        System.out.println("Afterwards, you can choose to 'speak' up and start a conversation, " +
                "\nor you can choose to stay 'silent'" +
                "\nuntil your food arrives?");
        Answer = input.next();
        while (!Answer.equalsIgnoreCase("speak") && !Answer.equalsIgnoreCase("silent")) {
            System.out.println("Do you choose to 'speak', or stay 'silent'. ");
            Answer = input.next();
        }
        if (Answer.equalsIgnoreCase("speak")) {
            System.out.print('\u000C');
            WE += 2;
            System.out.println("You actually have a good conversation with Arthur, and " +
                    "\nhe tells you that he got into the mission because his mother" +
                    "\nwas a victim to Poogle Inc.'s crimes, resulting in her eviction" +
                    "\nand debt. You share your experience before Poogle Inc. and have a " +
                    "\ngood talk. You earned 2 WE points!");

            sayWEPoints();

        } else {
            System.out.print('\u000C');
            System.out.println("You refuse to break the ice. Maybe it's cause of your lack" +
                    "\nof human interaction over the past months since being fired, but you " +
                    "\nsure have perfected your skills at being the most awkward human " +
                    "\nbeing alive. Arthur leaves to do something after a while, seeing " +
                    "\nthat you aren't going to talk. He suspects you are kind of weird.");
        }
        continued();
        System.out.print('\u000C');
        System.out.println("Dinner arrives and you finally hear what the next part of the" +
                "\nplan is. It consists of a person going in, plugging in the flash drive with " +
                "\nthe evidence along with a virus that will broadcast everything about Poogle Inc.." +
                "\nAs you eat, you question who is the person going into the building." +
                "\nBethany casually says it's you, and you choke on your food. You can either play " +
                "\nit off or act natural.");
        while (!Answer.equalsIgnoreCase("freak") && !Answer.equalsIgnoreCase("natural")) {
            System.out.println("Do 'freak' and reject the offer, or do you act 'natural and question calmly?");
            Answer = input.next();
        }
        if (Answer.equalsIgnoreCase("freak")) {
            System.out.print('\u000C');
            System.out.println("The team is apprehensive towards you but calms you down before" +
                    "\nexplaining why you need to do it. ");
            continued();
        } else if (Answer.equalsIgnoreCase("natural")) {
            System.out.print('\u000C');
            System.out.println("The team appreciates your calm, and you question why" +
                    "\nyou need to be the one to do it.");
            continued();
        }
        System.out.print('\u000C');
        System.out.println("The team explains that since the information can only be broadcasted" +
                "\nthrough a staff computer, you need to access your employee file and clear yourself" +
                "\nto enter an employee computer. After you do that, you will be able to show the world" +
                "\nall that Poogle Inc. has done. You can either 'agree', but if you 'disagree', the team" +
                "\nwill kick you off, and you will have to go back to your life before.");
        while (!Answer.equalsIgnoreCase("agree") && !Answer.equalsIgnoreCase("disagree")) {
            System.out.println("Do 'agree' to going inside Poogle Inc., or do you act 'disagree' quit" +
                    "\nthe team?");
            Answer = input.next();
        }
        if (Answer.equalsIgnoreCase("agree")) {
            WE += 4;
            System.out.print('\u000C');
            System.out.println("The team is happy that you agree and you earn 4 WE." +
                    "\nYou dismiss yourself to your room" +
                    "\nand start hatching up a plan.");
            sayWEPoints();
            continued();
        } else if (Answer.equalsIgnoreCase("disagree")) {
            System.out.println("The team is disappointed, but understands. You leave afterwards and " +
                    "\ngo back to programming small games. After a month, you hear in the news that Poogle" +
                    "\nInc. got sued for breaching the privacy policy, because you were part of helping get " +
                    "\nthe files, you are contacted by the team and pardoned. This leaves you able to get" +
                    "\nany job you want. Although you didn't go through completely. It all worked out in" +
                    "\nthe end.");
            System.out.println();
            System.out.println();
            System.out.print("Your last ending : ");
            System.out.println("It took a while but your record was cleared after Poogle Inc. was seen" +
                    "\nguilty for violating privacy policy. You were able to go back to the succesfull" +
                    "\nlife you planned for yourself." +
                    "\nPlay again to get a different ending."); //possibly add an exit game.
            System.out.println();
            System.out.println();
            alreadyPlayed = true;
            startGame();
        }
    }

    public static void nameChange() {
        System.out.print('\u000C');
        System.out.println("As you sit in your room, you access the employee files from the flash drive." +
                "\nYou need to make your ID valid. Luckily you have your old ID in your wallet, and you can " +
                "\nuse the code on it to change its validity. You go and get it and it says '6712'" +
                "\nType it in to access your information.");
        while (!Answer.equalsIgnoreCase("6712")) {
            System.out.println("Type in the correct number to access your information.");
            Answer = input.next();
        }
        if (Answer.equalsIgnoreCase("6712")) {
            System.out.println("You got in, and you read your information. You just need to change your name " +
                    "\nto something other than what your name is already along with activating your ID to get into places." +
                    "\n" +
                    "\nYou change your name to something different, what is it?");
            Name = input.next();
            continued();
            Answer = "";
            done = false;
        }
    }

    public static void hackingIn() {
        Answer = "";
        if ((WE > 0) && (!Answer.equalsIgnoreCase("continue")) && done == false) {
            System.out.print('\u000C');
            sayWEPoints();
            System.out.println("Now that you have your name. You go to change your accessibility to different rooms. You " +
                    "\nhave to enter your old three part password though and you forgot which set you used." +
                    "\nYou pull up the notes section on your phones and  remember you used one of three sets. You" +
                    "\ndon't know which one though, so you think you better try one at a time.");
            System.out.println();
            chooseSetOfPasswords();
        }
    }

    public static void finalCountdown() {
        System.out.print('\u000C');
        sayWEPoints();
        System.out.println("When the day came, precisely three days, when there was a big event at Poogle Inc," +
                "\nis when your team decided it would be ideal to infiltrate and broadcast the message. On that day" +
                "\nyou already have your badge, that reads " + Name + " Coodes. You enter the already crowded building" +
                "\nas an employee, and get to the room where that is controlling all the broadcasting devices at the event. ");
        continued();
        System.out.println("As you make your way into the room, you bump into your old supervisor. You hope he doesn't recognize" +
                "\nyou, but after looking at your badge and at your face, something seems to click. \"You don't look like a " +
                "\n " + Name + " to me . . . Jamie? Is that you?\", he asks.");
        while (!Answer.equalsIgnoreCase("deny") && !Answer.equalsIgnoreCase("talk")) {
            System.out.println("Do you 'deny' or 'talk' around the subject?");
            Answer = input.next();
        }
        if (Answer.equalsIgnoreCase("deny")) {
            WE -= 6;
            System.out.println("You deny, and he looks at you suspiciously. Through the communicator you have" +
                    "\nJohn tells you how that is the easiest way to blow your cover. You get deducted 6 we points." +
                    "\nYou now have " + WE + " WE points");
        } else {
            WE += 2;
            System.out.println("You talk around the subject and smoothly avert from"  +
                    "\nthe topic. You get awarded" + "3 WE points.");

        }
        continued();
        System.out.println("He then tries to get you to talk more. You know you have at least ten " +
                "\nminutes before the ideal point to plug the flash drive in, so you decide" +
                "\nto entertain his suspicion. You can 'accuse' him of not knowing who you are" +
                "\nor you can 'praise' him for being SUCH a great boss.");
        while (!Answer.equalsIgnoreCase("accuse") && !Answer.equalsIgnoreCase("praise")) {
            System.out.println("Do you 'accuse' or 'praise' ?");
            Answer = input.next();
        }
        if (Answer.equalsIgnoreCase("accuse")) {
            System.out.println("You accuse him of mistaking you for someone such as a Jamie, and tell " +
                    "him that you, " + Name + " Coodes have no relation to this \"Jamie\" character he " +
                    "\nis talking about. He seems surprised at the accusation, but still doesn't " +
                    "\nconfront you about anything. ");
        } else {
            System.out.println("You say that you think he is a great boss, and that he shouldn't do " +
                    "\nanything differently, For you, " + Name + " Coodes approves of everything " +
                    "\nhe is doing. He looks at you weird and you awkwardly smile.");
        }
        System.out.println("After a couple moments, you start talking more. Something seems off about the conversation, and " +
                "\nyou try to exit, until he stops you and immediately says, \"Stop playing these games Jamie\", the " +
                "\nsudden sentence shocks you and you stop trying to get away.");
        continued();
        System.out.println("You question why he would ever assume your name was 'Jamie' when your ID clearly says" +
                "\n " + Name + " Coodes. He doesn't buy it, and you face the fact that you are discovered " +
                "\nand are probably going to have to live your days in prison and be a lonely person for the " +
                "\nrest of your life until he gives you" +
                "\nan option . . . ");
        continued();
        System.out.println("He says he knows that you know what is going on at Poogle Inc. , and that you tried to hack them. For" +
                "\nhe is the one that fired you. He gives you a deal though. " +
                "\n" +
                "\nHe says that you can return to Poogle Inc., with your previous job title, and a secure job and stable" +
                "\nincome, something that isn't gauranteed if you continue with the 'mission'. He says that your record" +
                "\nwould be cleaned, and you would even get a down payment of $300,000 if you accept." +
                "\n" +
                "\nYou notice that as he says this, he allows easy access to the room where you can out the company for " +
                "\nall they have done and bring justice to all that has been going on. You are left with a choice of 'accepting' the " +
                "\njob offer or 'running' into the room and completing the mission.");
        while (!Answer.equalsIgnoreCase("accepting") && !Answer.equalsIgnoreCase("running")) {
            System.out.println("Do you think of 'accepting' the offer' or do you carry out with 'running' into" +
                    "\nthe room and outing the company?");
            Answer = input.next();
        }
        if (Answer.equalsIgnoreCase("accepting")) {
            System.out.println("You accept the offer. You give your boss all the information about the mission and" +
                    "\nyou out your friends, resulting them being arrested and thrown in jail. As promised, you get your share" +
                    "\nof the deal. You have a stable job and are even able to continue to create you own bussiness." +
                    "\nPoogle Inc. is still doing what they are doing, but it is something you don't try to pay" +
                    "\nmuch attention to. ");
            System.out.println();
            System.out.println();
            System.out.println("Thank you for playing and hoped you enjoyed!");
            WEPoints();
            alreadyPlayed = false;
        } else {
            System.out.println("You ran into the room, plugging in the flash drive, and immediately on every sing;e" +
                    "\nscreen there was videos and files exposing Poogle Inc., along with files distributed widely to" +
                    "\nlocal new's outlets." +
                    "\nPoogle Inc. was put to a stop, and you got to get any job you wanted. Able to retire at 25 " +
                    "\nyears old and travel the world with the new friends you made along the way. ");
            System.out.println();
            System.out.println();
            System.out.println("Thank you for playing and hoped you enjoyed!");
            alreadyPlayed = false;
        }
    }

    //constant methods
    public static void WEPoints() {
        System.out.println();
        System.out.println("You ended the game with " + WE + " WE points.");
    }

    public static void sayWEPoints() {
        System.out.println();
        System.out.println("You have " + WE + " WE points.");
        System.out.println();
    }

    public static void ignored() {
        System.out.print('\u000C');
        WEPoints();
        System.out.print("You ignore the email and delete it, thinking it is spam. In the following year you hear something " +
                "\nabout Poogle Inc. being sued for breaching the privacy policy ensured to all users. You hear that it's the same " +
                "\npeople who contacted you, and you feel like you missed an opportunity, still living in sadness and not able to get" +
                "\na stable job.");
        System.out.println();
        System.out.println();
        System.out.print("Your last ending : ");
        System.out.println("You missed an opportunity to do something great! :( " +
                "\nPlay again to get a different ending."); //possibly add an exit game.
        System.out.println();
        System.out.println();
        alreadyPlayed = false;
        startGame();
    }

    public static void continued() {
        Answer = "";
        if (WE > 0) {
            while (!Answer.equalsIgnoreCase("continue")) {
                System.out.println();
                System.out.println();
                if (WE > 0) {
                    System.out.println("Type continue to continue.");
                    Answer = input.next();
                    System.out.println();
                } else {
                    fired();
                }
            }
        } else {
            fired();
        }
    }

    public static void fired() {
        System.out.print('\u000C');
        System.out.println("Due yo your lack of work ethic, the team kicks " +
                "\nyou off, thinking you aren't fit for the job." +
                "\n A few days later, you \"mysteriously disappear\" and" +
                "\nare never heard from again.");
        System.out.println();
        System.out.println();
        System.out.print("Your last ending : ");
        System.out.println("You got fired and killed." +
                "\nPlay again to get a different ending."); //possibly add an exit game.
        System.out.println();
        System.out.println();
        alreadyPlayed = true;
        startGame();
    }

    public static void caught() {
        System.out.print('\u000C');
        System.out.println("You failed your team and you get caught. " +
                "\nIn the end you are convicted of hacking by Poogle Inc. and get " +
                "\nthrown in jail. Poogle Inc., still not stopped.");
        System.out.print("Your last ending : ");
        System.out.println("You got caught and thrown in jail." +
                "\nPlay again to get a different ending."); //possibly add an exit game.
        System.out.println();
        System.out.println();
        alreadyPlayed = true;
        startGame();
    }

    public static void tracked() {
        System.out.print('\u000C');
        System.out.println("Your IP addressed got tracked and your team never hears" +
                "\nfrom you again. You family then reports you \"mysteriosuly\" missing");
        System.out.print("Your last ending : ");
        System.out.println("You got tracked and killed." +
                "\nPlay again to get a different ending."); //possibly add an exit game.
        System.out.println();
        System.out.println();
        alreadyPlayed = true;
        startGame();
    }

    public static void choosenPath() {
        if (Answer.equalsIgnoreCase("safe")) {
            System.out.print('\u000C');
            WE -= 2;
            System.out.println("Turns out that as Arthur went the safe path, he drew suspicion to him on" +
                    "\nthe security cameras, having to get off track to not get caught, going down the risky" +
                    "\npath after all." +
                    "\nYou have been deducted 2 WE points. You now have " + WE + " WE points.");
        } else if (Answer.equalsIgnoreCase("risky")) {
            System.out.print('\u000C');
            System.out.println("Bethany hears what you tell Arthur and she asks you " +
                    "\nif you are sure that is the best option.");
            System.out.println("Do you say yes to continue 'risky' path or do you tell" +
                    "Arthur to go the 'safe' path' ?");
            Answer = input.next();
            while (!Answer.equalsIgnoreCase("safe") && !Answer.equalsIgnoreCase("risky")) {
                System.out.println("Type ''safe' or 'risky' to choose a path.");
                Answer = input.next();
            }
            if (Answer.equalsIgnoreCase("risky")) {
                System.out.print('\u000C');
                WE += 2;
                System.out.println("The team gains more confidence in you as Arthur successfully" +
                        "\nmakes it to the room where the flash drive needs to be put in. You" +
                        "\nhave been rewarded 2 WE points. " +
                        "\nYou now have " + WE + " WE points.");
            } else if (Answer.equalsIgnoreCase("safe")) {
                Answer = "safe";
                choosenPath();
            }
        }
    }

    public static void passwordChosen() {
        if (WE > 0) {
            if (Answer.equalsIgnoreCase("5373")) {
                System.out.println();
                System.out.println("Your first option was 5373, that's correct" +
                        "\n now what is your second option?");
            } else {
                if (WE > 0) {

                    System.out.println("Arthur typed it in, but it was wrong. You have been deducted" +
                            "\n2 WE points.");
                    WE -= 2;
                    sayWEPoints();
                    continued();
                    passwordDecode();
                } else {
                    fired();
                }
            }
            while (!Answer.equalsIgnoreCase("2135") && !Answer.equalsIgnoreCase("5234")) {
                System.out.println("Choose '2135' or '5234' as your second option");
                Answer = input.next();
            }
            if (WE > 0) {
                if (Answer.equalsIgnoreCase("2135")) {
                    System.out.println("You are correct!");
                    if (WE > 0) {
                        while (!Answer.equalsIgnoreCase("5234")) {
                            System.out.println("You now have one more left. It may be a LITTLE hard" +
                                    "\nbut type in the last number. (Remember you literally have only one " +
                                    "\nmore combination left).");
                            Answer = input.next();
                            WE -= 2;
                            System.out.println();
                            System.out.println("You got deducted 2 WE points. ");
                            sayWEPoints();
                        }
                    }
                    if (Answer.equalsIgnoreCase("5234")) {
                        System.out.println();
                        System.out.print('\u000C');
                        WE += 6;
                        System.out.println("You got through! And you get 6 WE points, now" +
                                "\nyou have " + WE + " WE points.");
                        continued();
                        Answer = "";
                        flashDriveIn();
                    } else {
                        System.out.println();
                        System.out.print('\u000C');
                        WE -= 4;
                        System.out.println("You got it wrong, and it looks like you have" +
                                "\nto start over, hope you were keeping track. Oh and also" +
                                "\nyou got deducted 4 WE points." +
                                "\n You now have " + WE + " WE points.");
                        continued();
                        passwordDecode();
                    }
                } else {
                    WE -= 4;
                    System.out.print('\u000C');
                    System.out.print("You got it wrong, and it looks like you have" +
                            "\nto start over, hope you were keeping track. Oh and also" +
                            "\nyou got deducted 4 WE points. You now have " + WE + " WE points.");
                    continued();
                    passwordDecode();
                }
            } else {
                continued();
                fired();
            }
        }
    }

    public static void fileChosen() {
        if (WE > 0) {
            if (Answer.equalsIgnoreCase("right")) {
                System.out.print('\u000C');
                System.out.println("You access the right folder and it supplies all the evidence" +
                        "\nneeded to out Poogle Inc. for all they have done. You can 'copy' the files " +
                        "\nto your PC, or you can go 'back'.");
                while (!Answer.equalsIgnoreCase("copy") && !Answer.equalsIgnoreCase("back")) {
                    System.out.println("'Do you 'copy' the files or go 'back'?");
                    Answer = input.next();
                }
                if (Answer.equalsIgnoreCase("copy")) {
                    System.out.print('\u000C');
                    WE += 4;
                    System.out.println("You successfully copied the files and you get 4 WE points!" +
                            "\nNow you have " + WE + " WE points.");
                    sayWEPoints();
                    done = true;
                } else {
                    flashDriveIn();
                }
            } else if (Answer.equalsIgnoreCase("left")) {
                WE++;
                System.out.print('\u000C');
                System.out.println("You click on the left folder and you see that it's employee files." +
                        "\nYou realize you can clear your file now and do whatever you want" +
                        "\nIt is not ensured that this will be successful though, and you are better" +
                        "\noff helping your team. Do you try to clear your name?");
                while (!Answer.equalsIgnoreCase("yes") && !Answer.equalsIgnoreCase("no")) {
                    System.out.println("'Yes' or 'no' ?");
                    Answer = input.next();
                }
                if (Answer.equalsIgnoreCase("yes")) {
                    WE -= 4;
                    System.out.print('\u000C');
                    System.out.println("Bethany and John notice what you are doing and you refuse to " +
                            "\nlisten to them to continue the mission, set on clearing your name In the end,  " +
                            "\nArthur has to escape quickly. You have to get him into the building again, and your " +
                            "\nteam is not happy. You have been deducted 4 WE points. When everything is ready" +
                            "\nand your team is together again, you give it another go.");
                    sayWEPoints();
                    continued();
                    choosePath();
                } else if (Answer.equalsIgnoreCase("no")) {
                    WE += 2;
                    System.out.println("John sees that you ignored an opportunity to help yourself." +
                            "\nYou are rewarded 2 WE point.");
                    sayWEPoints();
                    continued();
                    flashDriveIn();
                }
            }
        } else {
            fired();
        }
    }

    public static void chooseSetOfPasswords() {
        if (WE > 0) {
            while (!Answer.equalsIgnoreCase("1") && !Answer.equalsIgnoreCase("2") && !Answer.equalsIgnoreCase("3")) {
                System.out.println("Type in '1' '2' or '3' to use that set.");
                Answer = input.next();
            }
            if (Answer.equalsIgnoreCase("1")) {
                System.out.println("You choose set 1, which consists of '1234' '5678' and '9101'" +
                        "\nYou can choose to put in a password, or go 'back' to choose a " +
                        "\ndifferent set.");
                while (!Answer.equalsIgnoreCase("1234") && !Answer.equalsIgnoreCase("5678") && !Answer.equalsIgnoreCase("9101") && !Answer.equalsIgnoreCase("back")) {
                    System.out.println("Type a valid number.");
                    Answer = input.next();
                }
                if (Answer.equalsIgnoreCase("1234") || Answer.equalsIgnoreCase("5678") || Answer.equalsIgnoreCase("9101")) {
                    WE -= 4;
                    System.out.println("You tried the number in each spot, but it didn't work" +
                            "\n, and because of how much you tried it," +
                            "\nyou have been deducted 4 WE points, you now have " + WE + " WE points. " +
                            "\nIf you have tried other numbers in this set, maybe you should return to another set.");
                    while (!Answer.equalsIgnoreCase("1") && !Answer.equalsIgnoreCase("return")) {
                        System.out.println("Type '1' to continue trying set 1 or type 'return' to continue to sets.");
                        Answer = input.next();
                    }
                    if (Answer.equalsIgnoreCase("1")) {
                        Answer = "1";
                        chooseSetOfPasswords();
                    } else {
                        Answer = "";
                        hackingIn();
                    }
                } else {
                    System.out.println("You chose to return to sets.");
                    Answer = "";
                    continued();
                    hackingIn();
                }
            }
            if (WE > 0) {
                if (Answer.equalsIgnoreCase("3")) {
                    System.out.println("You choose set 3, which consists of '0098' '0000' and '9998'" +
                            "\nYou can choose to put in a password, or go 'back' to choose a " +
                            "\ndifferent set.");
                    while (!Answer.equalsIgnoreCase("0098") && !Answer.equalsIgnoreCase("0000") && !Answer.equalsIgnoreCase("9998") && !Answer.equalsIgnoreCase("back")) {
                        System.out.println("Type a valid number or 'back' to return to sets;");
                        Answer = input.next();
                    }
                    if (Answer.equalsIgnoreCase("0098") || Answer.equalsIgnoreCase("0000") || Answer.equalsIgnoreCase("9998")) {
                        WE -= 4;
                        System.out.println("You tried the number in each spot, but it didn't work" +
                                "\n, and because of how much you tried it," +
                                "\nyou have been deducted 4 WE points, you now have " + WE + " WE points. " +
                                "\nIf you have tried other numbers in this set, maybe you should 'return to another set.");
                        while (!Answer.equalsIgnoreCase("3") && !Answer.equalsIgnoreCase("return")) {
                            System.out.println("Type '3' to continue trying set 3 or type 'return' to continue to sets.");
                            Answer = input.next();
                        }
                        if (Answer.equalsIgnoreCase("3")) {
                            Answer = "3";
                            chooseSetOfPasswords();
                        } else {
                            Answer = "";
                            hackingIn();
                        }
                    } else {
                        System.out.println("You chose to return to sets.");
                        Answer = "";
                        continued();
                        hackingIn();
                    }
                }
            }
            if (WE > 0) {
                if (Answer.equalsIgnoreCase("2")) {
                    System.out.println();
                    System.out.println("You chose set 2, which consists of '9765' '1254' and '7584'" +
                            "\nYou can choose to put in a password, or go back to choose a " +
                            "\ndifferent set.");
                    while (!Answer.equalsIgnoreCase("9765") && !Answer.equalsIgnoreCase("1254") && !Answer.equalsIgnoreCase("7584") && !Answer.equalsIgnoreCase("back")) {
                        System.out.println("Type a valid number or go 'back'.");
                        Answer = input.next();
                    }

                    if (Answer.equalsIgnoreCase("9765") || Answer.equalsIgnoreCase("7584")) {
                        WE -= 4;
                        System.out.println("You typed it in, but it was wrong. You have been deducted" +
                                "\n4 WE points. You now have " + WE + " WE points. ");
                        Answer = "2";
                        continued();

                        chooseSetOfPasswords();
                    } else if (Answer.equalsIgnoreCase("back")) {
                        System.out.println("You returned to the sets");
                        Answer = "";
                        hackingIn();
                    } else if (Answer.equalsIgnoreCase("1254")) {
                        System.out.println("Your first option was 1254, that's correct, keep going" +
                                "\nyou might be on to something ." +
                                "\n now what is your second option?");


                        while (!Answer.equalsIgnoreCase("9765") && !Answer.equalsIgnoreCase("7584")) {
                            System.out.println("Choose '9765' or '7584' as your second option");
                            Answer = input.next();
                        }
                        if (WE > 0) {
                            if (Answer.equalsIgnoreCase("9765")) {
                                System.out.println("It was wrong, but you if the first number was right" +
                                        "\nthen you must be on thr right track. You can choose to put in the " +
                                        "\nremaining number number or return to sets. You have been dedcuted " +
                                        "\n2 WE points.");

                                sayWEPoints();
                                continued();

                                while (!Answer.equalsIgnoreCase("2") && !Answer.equalsIgnoreCase("return")) {
                                    System.out.println("Type '2' to continue trying set 2 or type 'return' to continue to sets.");
                                    Answer = input.next();
                                }
                                if (Answer.equalsIgnoreCase("2")) {
                                    Answer = "2";
                                    chooseSetOfPasswords();
                                } else {
                                    hackingIn();
                                }
                            }
                            if (Answer.equalsIgnoreCase("7584")) {
                                System.out.println("You got it right! Keep going!");
                                while (!Answer.equalsIgnoreCase("9765")) {
                                    System.out.println("You now have one more left. It may be a LITTLE hard" +
                                            "\nbut type in the last number. (Remember you literally have only one " +
                                            "\nmore combination left)");
                                    Answer = input.next();

                                }
                                if (Answer.equalsIgnoreCase("9765")) {
                                    System.out.println();
                                    WE += 2;
                                    System.out.println("You got finally cracked the code! All you have to do now " +
                                            "\nis wait until the big Poogle Event so you can out the company for all they have " +
                                            "\ndone. You also get 2 WE points, now." +
                                            "\nyou have " + WE + " WE points.");
                                    done = true;
                                    continued();
                                } else if (Answer.equalsIgnoreCase("7484")) {
                                    System.out.println();
                                    WE -= 4;
                                    System.out.println("You got it wrong, and also" +
                                            "\nyou got deducted 4 WE points.");
                                    sayWEPoints();
                                    continued();
                                    chooseSetOfPasswords();
                                }
                            }
                        }

                    }
                }
            } else {
                fired();
            }
        }
    }
}