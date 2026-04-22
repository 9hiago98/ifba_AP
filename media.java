void main () {
    float n1 = Float.parseFloat(IO.readln("Digite o primeiro número: "));
    float n2 = Float.parseFloat(IO.readln("Digite o segundo número: "));
    float n3 = Float.parseFloat(IO.readln("Digite o terceiro número: "));

    float media = (n1 + n2 + n3) / 3;

    if(media >=7)
        System.out.printf("prvado com media %.2f \n", media);
    else 
        System.out.printf("reprovado com media %.2f \n", media);
    
}
