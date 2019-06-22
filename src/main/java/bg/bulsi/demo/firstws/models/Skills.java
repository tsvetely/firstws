package bg.bulsi.demo.firstws.models;

import javax.annotation.ManagedBean;


public enum Skills {
    TECHNICAL_KNOWLEDGE("Technical knowledge"),
    TEAMWORK("Teamwork"),
    ORGANIZE("Organize"),
    COMMITMENT("Commitment"),
    LEADERSHIP("Leadership"),
    FLEXIBILITY("Flexibility");

    private String stringSkill;

    Skills(String stringSkill) {
        this.stringSkill = stringSkill;
    }

    public String getStringSkill() {
        return stringSkill;
    }
}
