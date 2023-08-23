public class Personagem {

    private int vidas;
    private int visibilidade;
    private int poder;

    private Personagem(int visibilidade, int poder, int vidas) {
        this.vidas = vidas;
        this.poder = poder;
        this.visibilidade = visibilidade;
    }

    public static Personagem normal(){
        return new Personagem(10, 50, 3);
    }

    public static Personagem poderoso(int poder){
        if(poder > 100) return new Personagem(10, 100, 3);
        if(poder < 0) return new Personagem(10, 0, 3);
        
        return new Personagem(10, poder, 3);
    }

    public static Personagem soturno(int visibilidade){
        if(visibilidade > 10) return new Personagem(10, 50, 3);
        if(visibilidade < 0) return new Personagem(0, 50, 3);

        return new Personagem(visibilidade, 50, 3);
    }

    public static Personagem custom(int visibilidade, int poder, int vidas){
        return new Personagem(visibilidade, poder, vidas);
    }

    @Override
    public String toString(){
        return "vidas: " +vidas+ "\npoder: " +poder+ "\nvisibilidade: " +visibilidade+"\n";
    }
}