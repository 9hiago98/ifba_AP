void main(){

    int numero = Integer.parseInt(IO.readln("Informe o numero: "));

    for (int multiplicador=1; multiplicador<=5; multiplicador++) 
        System.out.printf("%d x %d = %d \n", numero, multiplicador, numero*multiplicador);
}