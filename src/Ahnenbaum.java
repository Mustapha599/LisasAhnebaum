import utils.*;

public class Ahnenbaum {

    private BinaryTree<Ahne> lisasAhnnenbaum;

    public Ahnenbaum() {
        lisasAhnnenbaum = new BinaryTree<Ahne>();
        BinaryTree b1 = new BinaryTree<Ahne>(new Ahne("Jacqueline", "Bouvier", 'w'));
        BinaryTree b2 = new BinaryTree<Ahne>(new Ahne("Clancy", "Bouvier", 'm'));
        BinaryTree b3 = new BinaryTree<Ahne>(new Ahne("Marge", "Simpson", 'w'));
        BinaryTree b4 = new BinaryTree<Ahne>(new Ahne("Mona", "Simpson", 'w'), b1, b2);
        BinaryTree b5 = new BinaryTree<Ahne>(new Ahne("Abraham", "Simpson", 'm'));
        BinaryTree b6 = new BinaryTree<Ahne>(new Ahne("Hommer", "Simpson", 'm'), b4, b5);
        lisasAhnnenbaum = new BinaryTree<Ahne>(new Ahne("Lisa", "Simpson", 'w'), b3, b6);


    }

    public void preorderAusgabe() {
        besuche(lisasAhnnenbaum);
    }

    private void besuche(BinaryTree<Ahne> b) {
        if (!b.isEmpty()) {
            System.out.println(b.getContent().getVorname());
        }
        if (!b.getLeftTree()) {
            besuche(b.getLeftTree());
        }
        if (!b.getRightTree()) {
            besuche(b.getRightTree());
        }


    }

public void inorderAusgabe(){
        besuche(lisasAhnnenbaum);
}

private void besuche(BinaryTree<Ahne>){

}










}
