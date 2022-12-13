import tree.Arbre;

public class Main {
    public static void main(String[] args) {
        Arbre a = Arbre.getInstance();
        a.ajouter(4);
        a.ajouter(2);
        a.ajouter(1);
        a.ajouter(3);
        a.ajouter(6);
        a.ajouter(5);
        a.ajouter(7);
        System.out.println("Visitation Pré ordre");
        a.visiterPreOrdre();
        System.out.println("\nVisitation En Ordre");
        a.visiterInOrdre();
        System.out.println("\nViitation Post Ordre");
        a.visiterPostOrdre();
    }
}