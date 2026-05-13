void main () {

    var nome = new String[5];
    String aux;

    for (int cont=0;cont<nome.length;cont++)
        nome[cont] = IO.readln("Digite o NOME[" + cont + "]: ");
        
    IO.println("Estes foram os nomes digitados: ");
    for (int cont=0;cont<nome.length;cont++)
        IO.println("NOME[" + (cont) + "]: " + nome[cont]);

    for (int i=0;i<nome.length-1;i++)
        for (int j=i+1;j<nome.length;j++)
            if (nome[i].compareToIgnoreCase(nome[j]) > 0){
                aux = nome[i];
                nome[i] = nome[j];
                nome[j] = aux;
                }
    IO.println("Estes foram os nomes digitados e agora ordenados: ");
    for (int cont=0;cont<nome.length;cont++)
        IO.println("NOME[" + (cont) + "]: " + nome[cont]);
}