void main() {
    // Задача 1
    System.out.println("--|| Задача 1 ||--");

    int friday = 4;

    for (; friday <= 31; friday += 7) {
        System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
    }

    System.out.println();


    // Задача 2
    System.out.println("--|| Задача 2 ||--");

    int distanse = 0;

    do {
        System.out.println("Держитесь! Осталось " + distanse + " метров");
        distanse += 500;
    } while (distanse <= 42_195);

    // Та-же логика с циклом for

    int dist = 0;
    for (; dist <= 42_195; dist += 500) {
        System.out.println("Держитесь! Осталось " + distanse + " метров");
    }

    System.out.println();


    // Задача 3
    System.out.println("--|| Задача 3 ||--");

    int day = 0;
    int summ = 500;

    while (summ > 0) {

        day++;

        if (day % 5 == 0) {
            continue;
        }

        summ -= 100;
    }

    System.out.println("Количество оставшихся дней: " + day);

    // Та-же логика с циклом for
    int money = 2500;
    int days = 0;

    for (; money > 0; ) {

        days++;

        if (days % 5 == 0) {
            continue;
        }

        money -= 100;
    }

    System.out.println("Количество оставшихся дней: " + days);

    System.out.println();


    // Задача 4
    System.out.println("--|| Задача 4 ||--");

    int month = 0;
    int total = 0;

    do {
        month += 1;
        total += 15000;

        if (month % 6 == 0) {
            total += total * 7 / 100;
        }

        System.out.println("Месяц: " + month + ", сумма: " + total);

        if (total >= 12_000_000) {
            break;
        }

    } while (true);

    System.out.println();


    // Задача 5
    System.out.println("--|| Задача 5 ||--");

    int charge = 20;
    int minute = 0;
    int overheats = 0;

    while (charge < 100 && overheats <= 3) {
        minute++;

        if (minute % 10 == 0) {
            overheats++;
            System.out.println("Перегрев! Зарядка прекращена на 2 минуты");
            minute += 2;
            continue;
        }

        charge += 2;

        if (overheats == 3) {
            System.out.println("Досрочное завершение зарядки в связи с перегревом");
            break;
        }
    }

    System.out.println("Время зарядки составило " + minute + " минут");

}
