import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(8);
        setB.add(9);
        setB.add(10);

        System.out.println("Unión: " + union(setA, setB));
        System.out.println("Intersección: " + intersect(setA, setB));
        System.out.println("Diferencia (A - B): " + diff(setA, setB));
        System.out.println("B es subconjunto de A: " + isSubset(setA, setB));
        System.out.println("Producto Cartesiano: " + cartesiano(setA, setB));

    }

    public  static Set union(Set a, Set b) {
        Set result = new HashSet(a);
        result.addAll(b);
        return result;
    }

    public static Set intersect(Set a, Set b) {
        Set result = new HashSet(a);
        result.retainAll(b);
        return result;
    }

    public static Set diff(Set a, Set b) {
        Set result = new HashSet(a);
        result.removeAll(b);
        return result;
    }

    public static boolean isSubset(Set a, Set b) {
        return b.containsAll(a);
    }

    public static <T> Set<Pair<T, T>> cartesiano(Set<T> a, Set<T> b) {
        Set<Pair<T, T>> result = new HashSet<>();
        for (T elementA : a) {
            for (T elementB : b) {
                result.add(new Pair<>(elementA, elementB));
            }
        }
        return result;
    }
    public static class Pair<T, U> {
        private final T first;
        private final U second;
        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
        public T getFirst() {
            return first;
        }
        public U getSecond() {
            return second;
        }
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return first.equals(pair.first) && second.equals(pair.second);
        }
        public int hashCode() {
            return first.hashCode() * 31 + second.hashCode();
        }
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}


