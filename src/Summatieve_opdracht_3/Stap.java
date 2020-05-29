package Summatieve_opdracht_3;

import java.util.ArrayList;
import java.util.List;

public class Stap {
    String id;
    String naam;


    public Stap(String id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    public String getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Stap other = (Stap) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Stap{" +
                "naam='" + naam + '\'' +
                '}';
    }
}
