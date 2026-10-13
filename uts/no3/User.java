package uts.no3;


public class User {
    private UserProfile userProfile;

    public void login(int user_id, int password) {
        System.out.println("User logged in.");
    }

    public void recoverPassword() {
        System.out.println("Password recovery requested.");
    }

    public void logout() {
        System.out.println("User logged out.");
    }
}