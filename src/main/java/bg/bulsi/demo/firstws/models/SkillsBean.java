package bg.bulsi.demo.firstws.models;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@ManagedBean(value = "skillsBean")
public class SkillsBean implements Serializable {
    private Skills skill;

    public SkillsBean() {
    }

    public List<Skills> getSkillsValues(){
        return Arrays.asList(Skills.values());
    }

    public Skills getSkill() {
        return skill;
    }

    public void setSkill(Skills skill) {
        this.skill = skill;
    }
}
