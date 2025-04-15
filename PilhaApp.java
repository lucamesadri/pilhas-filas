import estruturas.Pilha;

public class PilhaApp 
{
    public static void main(String[] args) 
    {
        Pilha pilha = new Pilha();
        pilha.empilhar("Texto1");
        pilha.empilhar("Testo2");
        pilha.empilhar("Testo3");
        pilha.empilhar("Testo4");
        pilha.empilhar("Testo5");
        pilha.empilhar("Testo6");
        pilha.desempilhar();
        pilha.estaVazia();
    }
}
