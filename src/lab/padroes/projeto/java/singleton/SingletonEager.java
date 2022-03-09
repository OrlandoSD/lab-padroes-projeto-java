package lab.padroes.projeto.java.singleton;

/**
 * Singleton "apressado".
 *
 * @author falvojr
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
