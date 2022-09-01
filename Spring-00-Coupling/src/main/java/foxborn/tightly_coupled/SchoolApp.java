package foxborn.tightly_coupled;

public class SchoolApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTime,partTime); //MI
        mentor.manageAccount();

        //MI
    }
}
