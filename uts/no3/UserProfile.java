package uts.no3;

class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String email;
    private String documents;

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void editProfile() {
        System.out.println("Profile edited.");
    }

    public void showDocuments() {
        System.out.println("Documents: " + documents);
    }
}
