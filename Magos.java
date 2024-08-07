public class Magos extends AutenticHero {
    public Magos(String name, String skill, int experience, int level, int skillPoints, String appearance) {
        super(name, skill, experience, level, skillPoints, appearance);
    }

    @Override
    public Magos clone() {
        return new Magos(this.name, this.skill, this.experience, this.level, this.skillPoints, this.appearance);
    }
}