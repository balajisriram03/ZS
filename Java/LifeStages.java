public class LifeStages{
    float age = 0.0f;

    public String findStage(){
        String stage = "Invalid Age";
        if (age == 0) {
            stage = "Foetus";
        }
        else if (age <= 1) {
            stage = "Infant";
        }
        else if (age > 1 && age < 6) {
            stage = "Pre-schooler";
        }
        else if (age >= 6 && age < 12) {
            stage = "Childhood";
        }
        else if (age >= 12 && age < 19) {
            stage = "Adolescent";
        }
        else if (age >= 19 && age < 60) {
            stage = "Adult";
        }
        else if (age >= 60 && age < 100) {
            stage = "Old Age";
        }
        return stage;
    }

    public boolean isEligibleToVote(){
        boolean isEligible = false;
        if (age >= 18) {
            isEligible = true;
        }
        return isEligible;
    }

    public boolean isSeniorCitizen(){
        boolean isSenior = false;
        if (age >= 55.5) {
            isSenior = true;
        }
        return isSenior;
    }

    public String medicalGuidance(){
        String guidance = "";
        if (age < 18) {
            guidance = "Please consult a pediatrician for medical guidance.";
        }
        else if (age >= 18 && age < 100) {
            guidance = "Please consult a General Doctor for medical guidance.";
        }
        
        return guidance;
    }

    public static void main(String[] args){
        LifeStages person = new LifeStages();
        person.age = 55.5;
        String stage = person.findStage();
        System.out.println("The person is currently in the stage of " + stage);
        boolean isEligibleToVote = person.isEligibleToVote();
        System.out.println("Is the person eligible to vote? " + isEligibleToVote);
        boolean isSeniorCitizen = person.isSeniorCitizen();
        System.out.println("Is the person a senior citizen? " + isSeniorCitizen);
        String medicalGuidance = person.medicalGuidance();
        System.out.println("Medical guidance for the person: " + medicalGuidance);
    }
}