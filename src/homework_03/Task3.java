package homework_03;

public class Task3 {
    public static void main(String[] args) {
        int temperatureJanuary5 = 0;
        int temperatureJanuary6 = 2;
        int temperatureJanuary7 = 2;
        int temperatureJanuary8 = 6;
        int temperatureJanuary9 = 3;
        int temperatureJanuary10 = 5;
        int temperatureJanuary11 = 4;

        int sum = temperatureJanuary5 + temperatureJanuary6 + temperatureJanuary7 + temperatureJanuary8 + temperatureJanuary9 + temperatureJanuary10 + temperatureJanuary11;
        int numberOfDays = 7;
        int averageTemperature = sum / numberOfDays;

        System.out.println("Средняя температура за неделю: " + averageTemperature + " С");
    }
}
