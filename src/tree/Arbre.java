package tree;

public class Arbre {
    private class Node{
        public int nombre;
        public Node gauche;
        public Node droite;
    }

    private Node arb;
    private static Arbre instance;

    private Arbre(){
        arb = null;
    }

    public static synchronized Arbre getInstance(){
        if( instance == null){
            instance = new Arbre();
        }
        return instance;
    }
    //métodos internos
    private Node ajouter(Node arb, int valeur){
        if(arb == null){
            arb = new Node();
            arb.nombre = valeur;
            arb.gauche = null;
            arb.droite= null;
        }else if(valeur > arb.nombre){
            arb.droite = ajouter(arb.droite, valeur);
        }else{
            arb.gauche = ajouter(arb.gauche, valeur);
        }
        return arb;
    }

    private void preordre(Node arb){
        if(arb != null){
            System.out.print("(");
            System.out.print(arb.nombre);
            preordre(arb.gauche);
            preordre(arb.droite);
            System.out.print(")");
        }
    }

    private void inordre(Node arb){
        if(arb!=null){
            System.out.print("(");
            inordre(arb.gauche);
            System.out.print(arb.nombre);
            inordre(arb.droite);
            System.out.print(")");
        }
    }

    private void postordre(Node arb){
        if(arb != null){
            System.out.print("(");
            postordre(arb.gauche);
            postordre(arb.droite);
            System.out.print(arb.nombre);
            System.out.print(")");
        }
    }

    //métodos públicos
    public void ajouter(int valor){
        arb = ajouter(arb, valor);
    }
    public void visiterPreOrdre(){ preordre(arb);}
    public void visiterInOrdre(){ inordre(arb);}
    public void visiterPostOrdre(){ postordre(arb);}
}
