package personal_trainer;

public abstract class User {

    protected String email;
    protected String password;

        public User(String email, String password){
            this.email = email;
            this.password = password;
        }

}
