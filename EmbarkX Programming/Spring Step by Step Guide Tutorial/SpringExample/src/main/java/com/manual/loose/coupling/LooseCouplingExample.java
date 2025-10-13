package com.manual.loose.coupling;

public class LooseCouplingExample
{
    public static void main(String[] args)
    {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager newUserManagerWithDB = new UserManager(newDatabaseProvider);
        System.out.println(newUserManagerWithDB.getUserInfo());
    }
}
