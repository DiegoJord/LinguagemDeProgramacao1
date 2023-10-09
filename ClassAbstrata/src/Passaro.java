public class Passaro extends Animal implements levantarVoo {
    @Override
    public void emitirSom() {
        System.out.println("Piuiui");
    }

    @Override
    public void Voar() {
        System.out.println("Levantou voo");
    }
}
