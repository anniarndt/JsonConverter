package parser;


public class DataObject
{
    private String name;
    private Skills[] skills;
    private Integer importance;

    public Integer getImportance() {
        return this.importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skills[] getSkills() {
        return this.skills;
    }

    public void setSkills(Skills[] skills) {
        this.skills = skills;
    }

}
