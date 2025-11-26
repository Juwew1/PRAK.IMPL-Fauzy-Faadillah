package Tugas;

class User {
    private String username;
    private String password;

    public void saveUser(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("User " + username + " berhasil disimpan.");
    }

    public static void main(String[] args) {
        User user = new User();
        user.saveUser("BobSmith", "securepass");
    }
}
