void main(){
    
    double deposito = Double.parseDouble(IO.readln("Informe o depósito mensal: "));
    double taxa = Double.parseDouble(IO.readln("Informe a taxa de juros (em %): "));
    int meses = Integer.parseInt(IO.readln("Informe a quantidade de meses: "));
    
    taxa = taxa / 100; // Divide a taxa por 100
    
    double montante = 0;
    
    System.out.println("\n=== CÁLCULO DE JUROS ===");
    System.out.println("Depósito Mensal: R$ " + deposito);
    System.out.println("Taxa de Juros: " + (taxa * 100) + "%");
    System.out.println("Meses: " + meses);
    System.out.println();
    
    for (int mes = 1; mes <= meses; mes++) {
        montante = (montante + deposito) * (1 + taxa);
        System.out.printf("Mês %d: R$ %.2f\n", mes, montante);
    }
    
    System.out.println();
    System.out.printf("Montante Final: R$ %.2f\n", montante);
    double totalDepositado = deposito * meses;
    double jurosGanhos = montante - totalDepositado;
    System.out.printf("Total Depositado: R$ %.2f\n", totalDepositado);
    System.out.printf("Juros Ganhos: R$ %.2f\n", jurosGanhos);
}
