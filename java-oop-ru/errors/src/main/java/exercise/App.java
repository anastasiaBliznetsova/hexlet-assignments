package exercise;

// BEGIN
class App {
    public static void printSquare(Circle circle) {
        try {
            int square = (int) Math.ceil(circle.getSquare());
            System.out.print(square + "\n");
        } catch (NegativeRadiusException e) {
            System.out.print("Не удалось посчитать площадь\n");
        } finally {
            System.out.print("Вычисление окончено");
        }
    }
}
// END
