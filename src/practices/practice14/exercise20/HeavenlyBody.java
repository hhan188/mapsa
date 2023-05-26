package practices.practice14.exercise20;

/*
    Only add/edit code where it is stated in the description.
*/

import com.google.gson.Gson;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {
    private Key key;
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.key=new Key(name,BodyTypes.MOON);
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }





    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }











    //nested enum BodyType
    public static enum BodyTypes {
        PLANET,
        DWARF_PLANET,
        MOON
    }

    //nested class Key
    public static class Key {

        private String name;
        private BodyTypes bodyTypes;

        private Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyTypes = bodyTypes;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return Objects.equals(name, key.name) && bodyTypes == key.bodyTypes;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, bodyTypes);
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }
    }




    //
    //methods
    //




}
