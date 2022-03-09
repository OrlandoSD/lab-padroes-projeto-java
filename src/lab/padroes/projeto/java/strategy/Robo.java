package lab.padroes.projeto.java.strategy;

public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }
    public void mover(){
        comportamento.mover();
    }
}
