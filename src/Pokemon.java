import java.util.List;

public abstract class Pokemon {

    //instance variabele
    public String name;
    public int hp;
    public int level;
    public String food;
    public String sound;

    // constructor
    public Pokemon(String nm, int hp, int lvl, String food, String sound) {
        this.name = nm;
        this.hp = hp;
        this.level = lvl;
        this.food = food;
        this.sound = sound;
    }


    //getter en setters

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    // methods
    public void attacksAmount() {
    }
}



