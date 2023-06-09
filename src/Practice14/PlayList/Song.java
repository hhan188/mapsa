package Practice14.PlayList;

public class Song {
    String name;
    double duration;

    public Song(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Song :" +
                "name='" + name + '\'' +
                ", duration=" + duration;
    }
}
