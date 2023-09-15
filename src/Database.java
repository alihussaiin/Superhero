public class Database {
    private Superhero[] superheroes;
    private int count;

    public  Database(int size) {
        superheroes = new Superhero[size];
        count = 0;
    }

    public void addSuperhero(Superhero superhero) {
        if (count < superheroes.length) {
            superheroes[count] = superhero;
            count++;
        } else {
            System.out.println("Database is full. Cannot ad more superheroe.");

        }
    }
}
