package ru.job4j.collection;

import java.util.*;

public class BankService {
    private Map<User, List<AccountBank>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<AccountBank>());
        }
    }

    public void addAccount(String passport, AccountBank accountBank) {
        User user = findByPassport(passport);
        if (user != null) {
            List<AccountBank> accountList = users.get(user);
            if (!accountList.contains(accountBank)) {
                accountList.add(accountBank);
            }
        }
    }

    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(s -> s.getPassport()
                        .equals(passport))
                .findFirst()
                .orElse(null);
    }

    public AccountBank findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user).stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
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