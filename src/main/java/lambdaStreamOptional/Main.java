package lambdaStreamOptional;

import lambdaStreamOptional.controller.UserController;
import lambdaStreamOptional.model.Permission;

public class Main {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addPermissionToUser(1, Permission.ROLE_ADMIN);
        uc.addPermissionToUser(2, Permission.ROLE_ADMIN);
        uc.addPermissionToUser(4, Permission.ROLE_ADMIN);
        uc.addPermissionToUser(6, Permission.ROLE_ADMIN);
        uc.changeStatusByUserId(1);
        uc.changeStatusByUserId(2);
        uc.changeStatusByUserId(3);
        uc.changeStatusByUserId(4);
        uc.changeStatusByUserId(5);
        uc.changeStatusByUserId(7);
        uc.getAllUsers();
        //        uc.getUsersByPermission(Permission.ROLE_ADMIN);
        //        uc.getUsersSortedByPermission();
    }
}
