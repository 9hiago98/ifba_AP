void main () {
    float salario, percentual, novoSalario;

    salario = Float.parseFloat(IO.readIn("Digite o salario: "));
    percentual = Float.parseFloat(IO.readIn("Digite o percentual: "));

    float novoSalario = salario * (1 + percentual/100);

    IO.printIn("Novo salario é " + novoSalario);
}