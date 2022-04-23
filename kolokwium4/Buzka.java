public class Buzka implements PrzedstawiaEmocje, Rysowalny {

    public Buzka() {

    }

    public Buzka(char c) {

    }

    @Override
    public void draw(int znak) {

    }

    @Override
    public void draw() {

    }

    @Override
    public boolean czySieUsmiecha() {
        return false;
    }

    @Override
    public boolean przestanSieUsmiechac() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }
}
