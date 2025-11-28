package com.ioc.loose.coupling;

import com.ioc.loose.coupling.UserManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample
{
    public static void main(String[] args)
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");

        // UserDataProvider databaseProvider = new UserDatabaseProvider();
        // UserManager userManagerWithDB = new UserManager(databaseProvider);
        com.ioc.loose.coupling.UserManager userManagerWithDB = context.getBean("userManagerWithUserDataProvider",
                                                                                          UserManager.class);
        System.out.println(userManagerWithDB.getUserInfo());

        // UserDataProvider webServiceProvider = new WebServiceDataProvider();
        // UserManager userManagerWithWS = new UserManager(webServiceProvider);
        UserManager userManagerWithWS = context.getBean("userManagerWithWebServiceProvider", UserManager.class);
        System.out.println(userManagerWithWS.getUserInfo());

        // UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        // UserManager newUserManagerWithDB = new UserManager(newDatabaseProvider);
        UserManager userManagerWithNewDB = context.getBean("userManagerWithNewDataBaseProvider", UserManager.class);
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
