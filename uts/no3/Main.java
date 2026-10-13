package uts.no3;

public class Main {
    public static void main(String[] args) {
        UserProfile profile = new UserProfile();

        System.out.println("=== User Profile ===");
        System.out.println("User ID: " + profile.getUserId());
        System.out.println("Password: " + profile.getPassword());
        System.out.println("Name: " + profile.getName());
        System.out.println("Age: " + profile.getAge());
        System.out.println("Email: " + profile.getEmail());

        profile.editProfile();
        profile.showDocuments();

        System.out.println("\n=== User ===");
        User user = new User();

        user.login(1, 12345);
        user.recoverPassword();
        user.logout();

        System.out.println("\n=== Customer ===");
        Customer customer = new Customer();

        System.out.println(
            "Verification Status: "
            + customer.get_verification_status()
        );

        customer.apply_verification("document.pdf");

        System.out.println("\n=== Admin ===");
        Admin admin = new Admin();

        admin.update_vehicle_details(101);
        admin.add_vehicle();
        admin.Retrieve_complain();
        admin.verify_user();
    }
}