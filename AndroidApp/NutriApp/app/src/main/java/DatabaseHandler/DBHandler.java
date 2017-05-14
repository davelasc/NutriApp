package DatabaseHandler;

/**
 * Created by davidvelasco on 5/13/17.
 * TODO: Create the entire logic to handler database connection
 */

public class DBHandler {


    public boolean validateLogIn(String userName, String userPassword) {
        return !userName.isEmpty() && !userPassword.isEmpty() ? true : false;
    }


}
