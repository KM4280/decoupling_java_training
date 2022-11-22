package decoupling_java_training.src.main.java.fr.lernejo.guessgame;

public interface Player {
    long askNextGuess();

    void respond(boolean lowerOrGreater);

}
