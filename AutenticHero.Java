public abstract class AutenticHero implements Prototype {
    protected String name;
    protected String skill;
    protected int experience;
    protected int level;
    protected int skillPoints;
    protected String appearance;

    public AutenticHero(String name, String skill, int experience, int level, int skillPoints, String appearance) {
        this.name = name;
        this.skill = skill;
        this.experience = experience;
        this.level = level;
        this.skillPoints = skillPoints;
        this.appearance = appearance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public void showHeroInfo() {
        System.out.println("Name: " + name + ", Skill: " + skill + ", Experience: " + experience + ", Level: " + level + ", Skill Points: " + skillPoints + ", Appearance: " + appearance);
    }

    @Override
    public abstract AutenticHero clone();
}
