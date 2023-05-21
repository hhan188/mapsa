package Tamrin9.generic;


public class Pair<T, U> {

        private T t;
        private U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }

        public T getT() {
            return t;
        }

        public U getU() {
            return u;
        }

        //Implement a generic method called map that takes a collection of objects
        // and a function that transforms each object into a new object.
        // Return a new collection that contains the transformed objects.


        /*public Collection<Object> map(Collection<Object> a){

        }*/
    }
