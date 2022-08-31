package com.foxborn.loosely_coupled;

public class CydeoApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        //PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTime);

        mentor.manageAccount();

    }
}
