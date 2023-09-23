
package intermediario ;
public class MetodoToString {
      private String nome;
    private int idade;
    private String endereco;
    
    public MetodoToString(String n, int i, String e) {
        this.nome = n;
        this.idade = i
        this.endereco = e;
    }
    
    public String toString() {
        return this.nome +",  "+this.idade +",  "+this.endereco ;
    }
    public static void main(String[] args) {
        MetodoToString =t = new MetodoToString("Jerson, 64, Rua tupipiniquin");
            System.out.println(mt.toString());
    }
}


