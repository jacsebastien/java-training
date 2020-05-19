public class HelloUniverse {

    public static void main(String... args) {
        for (int numberOfPlanets = 8; numberOfPlanets < 11; numberOfPlanets++) {
            switch (numberOfPlanets) {
                case 8:
                    System.out.println("Aux dernières nouvelles, le nombre de planètes dans le système solaire est de : " + numberOfPlanets);
                    break;
                case 9:
                    System.out.println("Il y a quelques années cependant, elles étaient au nombre de : " + numberOfPlanets);
                    break;
                default:
                    System.out.println("Au cours de l'ère moderne, le nombre de planètes n'a jamais été officiellement de : " + numberOfPlanets);
            }
        }
    }
}