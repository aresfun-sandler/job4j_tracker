package ru.job4j.collection;

import java.util.*;

/**
 * Класс описывает банковскую систему
 * @author ALEX SANDLER
 * @version 1.0
 */
public class BankService {

    /**
     * Пользователи системы с привязанными к ним счетами хранятся в колекции типа HashMap
     */
    private Map<User, List<AccountBank>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему
     * @param user новый пользователь
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет пользователю новый аккаунт, предварительно проверяя
     * отсутствие данного аккаунта в системе: если совпадений не найдено - добавление.
     * @param passport паспорт пользователя
     * @param accountBank аккаунт пользователя
     */
    public void addAccount(String passport, AccountBank accountBank) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<AccountBank> accountList = users.get(user.get());
            if (!accountList.contains(accountBank)) {
                accountList.add(accountBank);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport паспорт пользователя
     * @return возвращает пользователя или null, если пользователь не найден.
     */
    public Optional<User> findByPassport(String passport) {
           return users.keySet().stream()
                   .filter(s -> s.getPassport()
                           .equals(passport))
                   .findFirst();
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport  паспорт пользователя.
     * @param requisite реквизиты пользователя.
     * @return возвращает счёт пользователя или null, если счёт не найден.
     */
    public AccountBank findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value).stream()
                .filter(s -> s.getRequisite().equals(requisite))
                .findFirst()).orElse(null);
    }

    /**
     * метод для перечисления денег с одного счета, на другой.
     * @param srcPassport   паспорт пользователя, откуда будет производится перечисление
     * @param srcRequisite  реквизиты пользователя, откуда будет производится перечисление
     * @param destPassport  паспорт пользователя, куда будет производится перечисление
     * @param destRequisite реквизиты пользователя, куда будет производится перечисление
     * @param amount        сумма перечисления.
     * @return возвращает успешность перевода
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        AccountBank srcAccount = findByRequisite(srcPassport, srcRequisite);
        AccountBank destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            return true;
        }
        return false;
    }
}