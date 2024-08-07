public class Client {
    public static void main(String[] args) {
        // Crear héroes base
        Arqueros arquero = new Arqueros("Original Archer", "Arrow Shot", 800, 4, 8, "ArcherAppearance");
        Guerreros guerrero = new Guerreros("Original Warrior", "Slash", 1000, 5, 10, "WarriorAppearance");
        Magos mago = new Magos("Original Mage", "Fireball", 1200, 6, 12, "MageAppearance");

        // Clonar héroes
        Arqueros clonedArcher = (Arqueros) arquero.clone();
        Guerreros clonedWarrior = (Guerreros) guerrero.clone();
        Magos clonedMage = (Magos) mago.clone();

        // Personalizar héroes clonados
        clonedArcher.setName("Cloned Archer");
        clonedArcher.setAppearance("ClonedArcherAppearance");

        clonedWarrior.setName("Cloned Warrior");
        clonedWarrior.setAppearance("ClonedWarriorAppearance");

        clonedMage.setName("Cloned Mage");
        clonedMage.setAppearance("ClonedMageAppearance");

        // Imprimir detalles de los héroes clonados
        clonedArcher.showHeroInfo();
        clonedWarrior.showHeroInfo();
        clonedMage.showHeroInfo();
    }
}
