package estruturas;

public class EditorTexto 
{
    Pilha desfazer = new Pilha();
    Pilha refazer = new Pilha();

    public void inserirTexto(String texto)
    {
        desfazer.empilhar(texto);
        
    }
}
