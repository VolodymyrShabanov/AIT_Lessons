package lesson_09_2023_09_15_practice;

import java.util.Scanner;

/**
 * 9/15/2023
 * Menu
 *
 * @author Marsel Sidikov (AIT TR)
 */
// TOD: 1. предлагать ближайшую сумму, которая кратна, всего 40 купюр может выдать за 1 задачу
public class Main_Tither {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Банкомат");

        // каждая переменная хранит КОЛИЧЕСТВО купюр определенного наминала
        // TOD: для тестирования положили данные в программу
        int count5 = 4;
        int count10 = 10;
        int count20 = 23;
        int count50 = 54;
        int count100 = 11;
        int count200 = 15;

        int newBanknotes; // переменная, которую мы используем для считывания денег пользователя (когда он их вносит)

        int sum = 0; // баланс пользователя, изначально 0, мы его будем считать, только когда вносим деньги

        // TOD: для тестирования сразу считаем баланс пользователя, потому что есть тестовые данные, потом убрать
        sum = count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200;

        while (true) { // бесконечный цикл, все время заставляет программу выводить меню и реагировать на действия пользователя
            // печатаем меню
            System.out.println("Меню:");
            System.out.println("1. Получить деньги");
            System.out.println("2. Внести деньги");
            System.out.println("3. Проверить баланс");
            System.out.println("0. Завершить работу");

            int command = scanner.nextInt(); // ожидаем команды пользователя

            switch (command) {  //  в зависимости от того, какую команду ввел пользователь, принимаем то или иное решение о действии
                case 1: { // если выбрали получение денег
                    System.out.println("Получение денег");

                    int requestSum = scanner.nextInt(); // в requestSum кладем сумму, которую хочет пользователь

                    if (requestSum > sum) { // проверяем, на балансе у пользователя достаточно денег или нет?
                        System.err.println("Недостаточно денег на счете");
                    } else { // если баланс в порядке, работаем дальше
                        if (requestSum % 5 == 0) { // проверяем, а кратна ли запрашиваемая сумма 5, потому что мы не можем монеты

                            // РАБОТА с 200
                            int candidate200 = requestSum / 200; // candidate200 - содержит количество 200-ок, которыми МОЖНО выдать эту сумму
                            // например, запросили 2250, значит можно выдать 11-ю 200-ками, останется 50 евро

                            int requestSum200;

                            if (count200 < candidate200) { // если у нас в банкомате 200-ок меньше, чем МОЖНО выдать
                                // например, запросили 2250, а у нас только 6 200-ок
                                requestSum200 = count200 * 200; // посчитаем, а сколько можем выдать нашими 200-ками
                                count200 = 0; // раз мы все их потратим, значит надо обнулить, и больше их не будет
                            } else { // если у нас 200-ок достаточно
                                requestSum200 = candidate200 * 200; // посчитаем, сколько нужно выдать
                                count200 = count200 - candidate200; // отнимем то количество 200-ок, которое мы отдаем, от того, что у нас было
                            }
                            // из запрашиваемой суммы отнимаем то, что выдали 200-ками
                            requestSum = requestSum - requestSum200;
                            // печатаем результат работы
                            System.out.println("Выдаем 200-ками " + requestSum200 + " осталось выдать - " + requestSum);

                            // РАБОТА с 100
                            int candidate100 = requestSum / 100; // candidate200 - содержит количество 200-ок, которыми МОЖНО выдать эту сумму
                            // например, запросили 2250, значит можно выдать 11-ю 200-ками, останется 50 евро

                            int requestSum100;

                            if (count100 < candidate100) { // если у нас в банкомате 100-ок меньше, чем МОЖНО выдать
                                // например, запросили 2250, а у нас только 6 100-ок
                                requestSum100 = count100 * 100; // посчитаем, а сколько можем выдать нашими 100-ками
                                count100 = 0; // раз мы все их потратим, значит надо обнулить, и больше их не будет
                            } else { // если у нас 100-ок достаточно
                                requestSum100 = candidate100 * 100; // посчитаем, сколько нужно выдать
                                count100 = count100 - candidate100; // отнимем то количество 100-ок, которое мы отдаем, от того, что у нас было
                            }
                            // из запрашиваемой суммы отнимаем то, что выдали 100-ками
                            requestSum = requestSum - requestSum100;
                            // печатаем результат работы
                            System.out.println("Выдаем 100-ками " + requestSum100 + " осталось выдать - " + requestSum);

                            // РАБОТА с 50
                            int candidate50 = requestSum / 50; // candidate200 - содержит количество 50-ок, которыми МОЖНО выдать эту сумму
                            // например, запросили 2250, значит можно выдать 11-ю 200-ками, останется 50 евро

                            int requestSum50;

                            if (count50 < candidate50) { // если у нас в банкомате 50-ок меньше, чем МОЖНО выдать
                                // например, запросили 2250, а у нас только 6 50-ок
                                requestSum50 = count50 * 50; // посчитаем, а сколько можем выдать нашими 50-ками
                                count50 = 0; // раз мы все их потратим, значит надо обнулить, и больше их не будет
                            } else { // если у нас 50-ок достаточно
                                requestSum50 = candidate50 * 50; // посчитаем, сколько нужно выдать
                                count50 = count50 - candidate50; // отнимем то количество 50-ок, которое мы отдаем, от того, что у нас было
                            }
                            // из запрашиваемой суммы отнимаем то, что выдали 50-ками
                            requestSum = requestSum - requestSum50;
                            // печатаем результат работы
                            System.out.println("Выдаем 50-ками " + requestSum50 + " осталось выдать - " + requestSum);

                            // РАБОТА с 20
                            int candidate20 = requestSum / 20; // candidate200 - содержит количество 20-ок, которыми МОЖНО выдать эту сумму
                            // например, запросили 2220, значит можно выдать 11-ю 200-ками, останется 20 евро

                            int requestSum20;

                            if (count20 < candidate20) { // если у нас в банкомате 20-ок меньше, чем МОЖНО выдать
                                // например, запросили 2250, а у нас только 6 20-ок
                                requestSum20 = count20 * 20; // посчитаем, а сколько можем выдать нашими 20-ками
                                count20 = 0; // раз мы все их потратим, значит надо обнулить, и больше их не будет
                            } else { // если у нас 20-ок достаточно
                                requestSum20 = candidate20 * 20; // посчитаем, сколько нужно выдать
                                count20 = count20 - candidate20; // отнимем то количество 20-ок, которое мы отдаем, от того, что у нас было
                            }
                            // из запрашиваемой суммы отнимаем то, что выдали 20-ками
                            requestSum = requestSum - requestSum20;
                            // печатаем результат работы
                            System.out.println("Выдаем 20-ками " + requestSum20 + " осталось выдать - " + requestSum);

                            // РАБОТА с 10
                            int candidate10 = requestSum / 10; // candidate10 - содержит количество 10-ок, которыми МОЖНО выдать эту сумму
                            // например, запросили 2210, значит можно выдать 11-ю 10-ками, останется 10 евро

                            int requestSum10;

                            if (count10 < candidate10) { // если у нас в банкомате 10-ок меньше, чем МОЖНО выдать
                                // например, запросили 2250, а у нас только 6 10-ок
                                requestSum10 = count10 * 10; // посчитаем, а сколько можем выдать нашими 10-ками
                                count10 = 0; // раз мы все их потратим, значит надо обнулить, и больше их не будет
                            } else { // если у нас 10-ок достаточно
                                requestSum10 = candidate10 * 10; // посчитаем, сколько нужно выдать
                                count10 = count10 - candidate10; // отнимем то количество 10-ок, которое мы отдаем, от того, что у нас было
                            }
                            // из запрашиваемой суммы отнимаем то, что выдали 10-ками
                            requestSum = requestSum - requestSum10;
                            // печатаем результат работы
                            System.out.println("Выдаем 10-ками " + requestSum10 + " осталось выдать - " + requestSum);

                            // РАБОТА с 5
                            int candidate5 = requestSum / 5; // candidate5 - содержит количество 5-ок, которыми МОЖНО выдать эту сумму
                            // например, запросили 225, значит можно выдать 11-ю 5-ками, останется 5 евро

                            int requestSum5;

                            if (count5 < candidate5) { // если у нас в банкомате 5-ок меньше, чем МОЖНО выдать
                                // например, запросили 2250, а у нас только 6 5-ок
                                requestSum5 = count5 * 5; // посчитаем, а сколько можем выдать нашими 5-ками
                                count5 = 0; // раз мы все их потратим, значит надо обнулить, и больше их не будет
                            } else { // если у нас 5-ок достаточно
                                requestSum5 = candidate5 * 5; // посчитаем, сколько нужно выдать
                                count5 = count5 - candidate5; // отнимем то количество 5-ок, которое мы отдаем, от того, что у нас было
                            }
                            // из запрашиваемой суммы отнимаем то, что выдали 5-ками
                            requestSum = requestSum - requestSum5;
                            // печатаем результат работы
                            System.out.println("Выдаем 5-ками " + requestSum5 + " осталось выдать - " + requestSum);
                            // перерасчет баланса
                            sum = count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200;
                            System.out.println("--> Осталось " + sum + " EUR");
                        }
                    }
                }
                break;

                case 2: {
                    System.out.println("Внесение денег");

                    System.out.println("Введите количество купюр, номинала 5");
                    newBanknotes = scanner.nextInt(); // считали это количество купюр
                    count5 = count5 + newBanknotes; // добавили эти купюры к тому, что уже есть
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 5 EUR");

                    System.out.println("Введите количество купюр, номинала 10");
                    newBanknotes = scanner.nextInt(); // считали это количество купюр
                    count10 = count10 + newBanknotes; // добавили эти купюры к тому, что уже есть
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 10 EUR");

                    System.out.println("Введите количество купюр, номинала 20");
                    newBanknotes = scanner.nextInt(); // считали это количество купюр
                    count20 = count20 + newBanknotes; // добавили эти купюры к тому, что уже есть
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 20 EUR");

                    System.out.println("Введите количество купюр, номинала 50");
                    newBanknotes = scanner.nextInt(); // считали это количество купюр
                    count50 = count50 + newBanknotes; // добавили эти купюры к тому, что уже есть
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 50 EUR");

                    System.out.println("Введите количество купюр, номинала 100");
                    newBanknotes = scanner.nextInt(); // считали это количество купюр
                    count100 = count100 + newBanknotes; // добавили эти купюры к тому, что уже есть
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 100 EUR");

                    System.out.println("Введите количество купюр, номинала 200");
                    newBanknotes = scanner.nextInt(); // считали это количество купюр
                    count200 = count200 + newBanknotes; // добавили эти купюры к тому, что уже есть
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 200 EUR");
                    // пересчитываем баланс

                    sum = count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200; // умножаем 5 на количество купюр номиналом 5 в нашем банкомате, чтобы получить их сумму
                }
                break;

                case 3: {
                    System.out.println("Проверка баланса");
                    System.out.println("--> Ваш баланс равен: " + sum + " EUR");
                }
                break;

                case 0: {
                    System.out.println("Завершение работы");
                    System.exit(0); // принудительное завершение работы Java-приложения
                }

                default:
                    System.err.println("Команда не распознана");
            }
        }
    }
}

