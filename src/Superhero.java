public class Superhero {
    private String secretIdentity;

    private String realName;

    private String superPower;

    private int yearCreated;

    private boolean isHuman;

    private int strength;

    //Constructor - et objekt består af attributer

    public Superhero(String secretIdentity, String superPower, int yearCreated, boolean isHuman, int strength) {
        this.secretIdentity = secretIdentity;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    //Get
    public String getSecretIdentity() {
        return secretIdentity;
    }

    public String getRealName() {
        return realName;
    }

    public String getsuperPower() {
        return superPower;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean getsisHUman() {
        return isHuman;
    }

    public int getstrength() {
        return strength;
    }


    //Set

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setisHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }

    public void setyearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "secretIdentity='" + secretIdentity + '\'' +
                ", realName='" + realName + '\'' +
                ", superPower='" + superPower + '\'' +
                ", yearCreated=" + yearCreated +
                ", isHUman='" + isHuman + '\'' +
                ", strength=" + strength +
                '}';
    }
}
