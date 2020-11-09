class ContaCorrente {
    private float saldo;

    public void saque(float valor) {
        System.out.println("Solicitado saque de valor R$ " + valor);
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
                System.out.println("valor do saque deve ser positivo");
        }
    }
}
