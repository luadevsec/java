package listas_encadeadas;

public class Lista {
    private Node head = null;

    public void listar(){
        Node pointer = head;

        while(pointer != null){
            System.out.println(pointer.getNum());
            pointer = pointer.getSeed();
        }
    }

    public void inserir(int num){
        Node node = new Node(num, null);
        if (head == null) head = node;
        else{
            Node pointer = head;
            while(null != pointer.getSeed()) pointer = pointer.getSeed();
            pointer.setSeed(node);
            
        }

    }

    public int excluir(int alvo){
        if (head == null)return 0;
        
        if (alvo == head.getNum()){
            head.setNum(0);
            head.setSeed(head.getSeed());
            return 1;
        }

        Node pointer = head;
        while((pointer.getSeed() != null) && pointer.getSeed().getNum() != alvo)
            pointer = pointer.getSeed();

        if (pointer.getSeed() != null) {
            pointer.getSeed().setNum(0);
            pointer.setSeed(pointer.getSeed().getSeed());
        }

        return 1;
    }
    /*
    public void excluir(Node alvo){
        if (head != null)
        else{
            if (head)
        }
    }
    */

    public static void main(String[] args) {
        Lista list = new Lista();
        
        for(int i=0; i <= 200000; i++){
            list.inserir(i);
        }
        list.listar();

        list.excluir(9);
        list.excluir(10);
        list.excluir(200000);
        list.listar();

    }
}
