package uts.no3;

class Admin extends User {
    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Vehicle details updated: " + vehicle_id);
    }

    public void add_vehicle() {
        System.out.println("Vehicle added.");
    }

    public void Retrieve_complain() {
        System.out.println("Complaint retrieved.");
    }

    public void verify_user() {
        System.out.println("User verification processed.");
    }
}
