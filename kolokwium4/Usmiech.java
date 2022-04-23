public class Usmiech extends Buzka implements Skalowalny, Rysowalny {
    public Usmiech(char c) {
        super(c);
    }
    public Usmiech() {
        super('(');

    }

    @Override
    public void draw() {

    }

    @Override
    public void draw(int znak) {

    }
    @Override
    public boolean czySieUsmiecha() {
        return true;
    }
    @Override
    public boolean przestanSieUsmiechac() {
        return true;
    }
}
