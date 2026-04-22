void main () {
    int ano = Integer.parseInt(IO.readln("Digite um ano: "));
   
    if (ano % 4 == 0) {
        IO.print(ano + " é bissexto");
    }
    else {
        IO.print(ano + " não é bissexto");
    }
}