
public class main {
    public static void main(String[] args) {
        Personagem normal = Personagem.normal();

        Personagem poderoso = Personagem.poderoso(40);

        Personagem soturno = Personagem.soturno(2);

        Personagem custom = Personagem.custom(4, 70, 3);

        System.out.println("Normal");
        System.out.println(normal);
        System.out.println("Poderoso");
        System.out.println(poderoso);
        System.out.println("Soturno");
        System.out.println(soturno);
        System.out.println("Custom");
        System.out.println(custom);
    }
    
}
