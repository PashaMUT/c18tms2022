public class Zodiac {
    public String getZodiacName(int month, int day) {
        switch (month) {
            case 1:
                return checkDay(day, 21, 31) ? "Водолей" : checkDay(day, 1, 20) ? "Козерог" : null;
            case 2:
                return checkDay(day, 1, 19) ? "Водолей" : checkDay(day, 20, 29) ? "Рыбы" : null;
            case 3:
                return checkDay(day, 1, 20) ? "Рыбы" : checkDay(day, 21, 31) ? "Овен" : null;
            case 4:
                return checkDay(day, 1, 20) ? "Овен" : checkDay(day, 21, 30) ? "Телец" : null;
            case 5:
                return checkDay(day, 1, 21) ? "Телец" : checkDay(day, 22, 31) ? "Близнецы" : null;
            case 6:
                return checkDay(day, 1,21 ) ? "Близнецы" : checkDay(day, 22, 30) ? "Рак" : null;
            case 7:
                return checkDay(day, 1, 22) ? "Рак" : checkDay(day, 23, 31) ? "Лев" : null;
            case 8:
                return checkDay(day, 1, 21) ? "Лев" : checkDay(day, 22, 31) ? "Дева" : null;
            case 9:
                return checkDay(day, 1, 23) ? "Дева" : checkDay(day, 24, 30) ? "Весы" : null;
            case 10:
                return checkDay(day, 1, 23) ? "Весы" : checkDay(day, 24, 31) ? "Скорпион" : null;
            case 11:
                return checkDay(day, 1, 23) ? "Скорпион" : checkDay(day, 24, 30) ? "Стрелец" : null;
            case 12:
                return checkDay(day, 1, 22) ? "Стрелец" : checkDay(day, 23, 31) ? "Козерог" : null;
        }
        return null;
    }

    private boolean checkDay(int day, int from, int to) {
        return day >= from && day <= to;
    }

}

