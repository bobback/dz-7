
public class Main {
    public static void main(String[] args) {

        for (Planets planet : Planets.values()) {
            System.out.println("Planet: " + planet.name());
            System.out.println("Number from sun: " + planet.getPositionFromSun());
            System.out.println("Distance from previous planet: " + planet.getDistanceFromPreviousPlanet());
            System.out.println("Distance from sun: " + planet.getDistanceFromSun());
            System.out.println("Radius: " + planet.getRadius());
            System.out.println("Next planet: " + planet.next());
            if (planet.getPreviousPlanet() != null) {
                System.out.println("Previous planet: " + planet.getPreviousPlanet().name());

            }
        }
    }
}