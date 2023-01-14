import java.util.List;

public class PokemonGymOwner {

  private  String town;
  private  String name;

    public PokemonGymOwner(String brock, String pewter_city, List<Pokemon> pokemons) {
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public String getName() {
        return name;
    }
}