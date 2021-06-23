//package ru.job4j.collection;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class BankService {
//    private Map<User, List<AccountBank>> users = new HashMap<>();
//
//    public void addUser(User user) {
//        if (!users.containsKey(user)) {
//            users.put(user, new ArrayList<AccountBank>());
//        }
//    }
//
//    public void addAccount(String passport, AccountBank accountBank) {
//        User user = findByPassport(passport);
//        if (!users.containsKey(user)) {
//            users.put(user, new ArrayList<AccountBank> accountBank);
//        }
//    }
//
//    public User findByPassport(String passport) {
//        User user = null;
//        for (User key : users.keySet()) {
//            List<AccountBank> value = users.get(key);
//            if (key.getPassport().contains(passport)) {
//                user = key;
//            }
//        }
//        return user;
//    }
//
//        public AccountBank findByRequisite (String passport, String requisite) {
//        AccountBank accountBank = null;
//        User user = findByPassport(passport);
//        if (user.contains(requisite)) {
//            accountBank = r
//        }
//            return accountBank;
//        }
//
//        public boolean transferMoney (String srcPassport, String srcRequisite,
//                String destPassport, String destRequisite,double amount){
//            boolean rsl = false;
//            return rsl;
//        }
//    }
//}