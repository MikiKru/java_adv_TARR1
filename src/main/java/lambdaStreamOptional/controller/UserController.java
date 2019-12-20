package lambdaStreamOptional.controller;

import lambdaStreamOptional.model.Permission;
import lambdaStreamOptional.model.User;
import lambdaStreamOptional.util.InMemoryDB;

import java.util.Comparator;
import java.util.Optional;
import java.util.Set;

public class UserController {
    // wypisz wszystkich użytkowników
    public void getAllUsers(){
        InMemoryDB.users.forEach(System.out::println);
    }
    // metoda wypisująca wszystkich użytkowników posortowanych po uprawnieniach od Admina do Usera
    public void getUsersSortedByPermission(){
        InMemoryDB.users.stream()
                        .sorted(Comparator.comparing(u -> !u.getPermissions().contains(Permission.ROLE_ADMIN)))
                        .forEach(System.out::println);
    }
    // metoda wypisująca użytkowników posiadających zadane uprawnienia
    public void getUsersByPermission(Permission permission){
        InMemoryDB.users.stream()
                        .filter(u -> u.getPermissions().contains(permission))
                        .forEach(System.out::println);
    }
    // dodaj uprawnienia administratora dla użytkownika o danym id
    public boolean addPermissionToUser(int user_id, Permission premission){
        Optional<User> userOpt = InMemoryDB.users.stream()
                                .filter(u -> user_id == u.getUser_id())
                                .findAny();
        if(userOpt.isPresent()){
          User user = userOpt.get();    // pobieram wartość
          Set<Permission> permissions = user.getPermissions();  // zbiór uprawnień
          permissions.add(premission);                          // dodanie uprawnienia
          user.setPermissions(permissions);                     // zapisanie zmian
          return true;
        }
        return false;
    }
    // zmiana statusu na przeciwny użytkownika o podanym user_id
    public void changeStatusByUserId(int user_id){
        InMemoryDB.users.stream()
                .filter(u -> u.getUser_id() == user_id)
                .findAny()                                  // zawraca Optional
                .ifPresent(u -> u.setStatus(!u.isStatus()));
    }
    // zmień hasło użytkownika o danym id
    public boolean changePassword(int user_id, String password, String replayPassword){
        final boolean[] isChanged = {false};
        InMemoryDB.users.stream()
                .filter(u -> u.getUser_id() == user_id)
                .findAny()
                .ifPresent(u -> {
                    if (password.equals(replayPassword)) {
                        u.setPassword(password);
                        isChanged[0] = true;
                    }
                });
        return isChanged[0];
    }
    // wypisz wszystkich aktywnych administratorów
    public void getAllActiveAdmins(){
        InMemoryDB.users.stream()
                .filter(u -> u.getPermissions().contains(Permission.ROLE_ADMIN) && u.isStatus())
                .forEach(System.out::println);
    }
    // usuń użytkownika po id
    public boolean deleteUserById(int user_id){
        Optional<User> userOpt = InMemoryDB.users.stream()
                .filter(u -> u.getUser_id() == user_id)
                .findAny();
        if(userOpt.isPresent()){
            InMemoryDB.users.remove(userOpt.get());
            return true;
        }
        return false;
    }





}
