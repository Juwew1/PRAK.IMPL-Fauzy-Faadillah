public class Group {
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        File file = new File(".");
        if (!file.exists())
            return users;

        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                users.add(new User(files[i].getName(), this));
            }
        }

        Collections.sort(users, new User.UserComparatorByDescendingRegistration());
        return users;
    }
}