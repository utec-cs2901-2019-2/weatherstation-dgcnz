package cs2901.utec.edu.pe;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);
    void notifyObservers();
}
