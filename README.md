In this branch, I attempt to create an authenticate flow using the following pattern:

`User user;`  
`try {`  
`UserAuthenticator userAuthenticator = new UserAuthenticator(accountUser);`  
`user = userAuthenticator.authenticateUser();`  
`} catch notAccountUserException {`  
`UserAuthenticator userAuthenticator = new UserAuthenticator(adminUser);`  
`user = userAuthenticator.authenticateUser();`  
`} catch notAdminUserException {`  
`/* do something */`  
`}`

Running the application.

If lastname and department are set, No exceptions are thrown and accountUser qualifies as AccountUser:
`accountUser.setLastname("Dagondon");`
`adminUser.setDepartment("Dev");`

output:
`Hi user@gmail.com you are authenticated as Account User.`

If accountUser.setLastname("Dagondon") is commented but adminUser.setDepartment("Dev") is not, adminUser qualifies as AdminUser:

`\\accountUser.setLastname("Dagondon");`
`adminUser.setDepartment("Dev");`

output:
`Hi admin@gmail.com you are authenticated as Admin User.`

If no lastname is set for accountUser and no department is set for adminUser (either commented or removed),
NotAdminUserException catch block is executed:
`//accountUser.setLastname("Dagondon");`
`//adminUser.setDepartment("Dev");`

output: `com.di.example.entity.NotAdminUserException: admin@gmail.com is not an Admin User`