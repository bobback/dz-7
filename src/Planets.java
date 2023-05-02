public enum Planets {
    MERCURY(1, 0, 57.91, 2439.7, null),
    VENUS(2, 108.2, 108.2 + 57.91, 6051.8, MERCURY),
    EARTH(3, 149.6, 149.6 + 108.2, 6371.0, VENUS),
    MARS(4, 227.9, 227.9 + 149.6, 3389.5, EARTH),
    JUPITER(5, 778.3, 778.3 + 227.9, 69911, MARS),
    SATURN(6, 1426.7, 1426.7 + 778.3, 58232, JUPITER),
    URANUS(7, 2870.9, 2870.9 + 1426.7, 25362, SATURN),
    NEPTUNE(8, 4498.3, 4498.3 + 2870.9, 24622, URANUS);

    private final int positionFromSun;
    private final double distanceFromPreviousPlanet;
    private final double distanceFromSun;
    private final double radius;
    private final Planets previousPlanet;

    // Конструктор enum
    Planets(int positionFromSun, double distanceFromPreviousPlanet, double distanceFromSun, double radius, Planets previousPlanet) {
        this.positionFromSun = positionFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
    }

    // Геттери для доступу
    public int getPositionFromSun() {
        return positionFromSun;
    }

    public double getDistanceFromPreviousPlanet() {
        return distanceFromPreviousPlanet;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public Planets getPreviousPlanet() {
        return previousPlanet;
    }

    // Наступна планета
    public Planets next() {
        int nextIndex = (this.ordinal() + 1) % Planets.values().length;
        return Planets.values()[nextIndex];
    }
}
