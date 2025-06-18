public class Main {
    public static void main(String[] args) {
        Fool fool = new Fool("怠け者", 80);
        fool.talk();
        fool.watch();
        fool.hear();
        fool.attack(new Matango());
        fool.run();
    }
}