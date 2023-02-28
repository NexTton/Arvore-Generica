/* Aluno: Gabriel Cruz Araujo 
   Aluno: Edson Augusto	
*/
package br.com.unit.ÁrvoreGenérica;
public class Main {

    public static void main(String[] args) {
        No<String> raiz = new No<String>("A");
        No<String> noB = new No<String>("B");
        No<String> noC = new No<String>("C");
        No<String> noD = new No<String>("D");
        No<String> noE = new No<String>("E");
        No<String> noF = new No<String>("F");
        No<String> noG = new No<String>("G");
       

        raiz.adicionarFilho(noB);
        raiz.adicionarFilho(noC);
        noB.adicionarFilho(noD);
        noB.adicionarFilho(noE);
        noB.adicionarFilho(noF);
        noC.adicionarFilho(noG);
       

       
        System.out.println("Raiz: " + raiz.getValor());
        System.out.print("Nós: ");
        for (No<String> no : raiz.getSubArvore()) {
            System.out.print(no.getValor() + " ");
        }
        System.out.println();

       
        System.out.print("Nós folhas: ");
        for (No<String> no : raiz.getSubArvore()) {
            if (no.isFolha()) {
                System.out.print(no.getValor() + " ");
            }
        }
        System.out.println();

        
        System.out.print("Grau de cada nó: ");
        for (No<String> no : raiz.getSubArvore()) {
            System.out.print(no.getGrau() + " ");
        }
        System.out.println();

      
        System.out.print("Altura de cada nó: ");
        for (No<String> no : raiz.getSubArvore()) {
            System.out.print(no.getAltura() + " ");
        }
        System.out.println();

       
        System.out.print("Profundidade de cada nó: ");
        for (No<String> no : raiz.getSubArvore()) {
            System.out.print(no.getProfundidade() + " ");
        }
        System.out.println();

        
        System.out.print("Nível de cada nó: ");
        for (No<String> no : raiz.getSubArvore()) {
            System.out.print(no.getNivel() + " ");
        }
        System.out.println();
        
    
        System.out.println("Subárvores de cada nó:");
        for (No<String> no : raiz.getSubArvore()) {
            System.out.println("Nó " + no.getValor() + ": " + no.getSubArvore());
        }
    }
}
