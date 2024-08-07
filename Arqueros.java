public class Arqueros extends AutenticHero {
    public Arqueros(String name, String skill, int experience, int level, int skillPoints, String appearance) {
        super(name, skill, experience, level, skillPoints, appearance);
    }

    @Override
    public Arqueros clone() {
        return new Arqueros(this.name, this.skill, this.experience, this.level, this.skillPoints, this.appearance);

    
     
    }
}
