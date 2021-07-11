package ru.job4j.collection;

import java.util.*;

public class BankService {
    private Map<User, List<AccountBank>> users = new HashMap<>();

    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, AccountBank accountBank) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<AccountBank> accountList = users.get(user.get());
            if (!accountList.contains(accountBank)) {
                accountList.add(accountBank);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
           return users.keySet().stream()
                   .filter(s -> s.getPassport()
                           .equals(passport))
                   .findFirst();
    }

    public AccountBank findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value).stream()
                .filter(s -> s.getRequisite().equals(requisite))
                .findFirst()).orElse(null);
    }

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
