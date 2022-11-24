public class Transactioninput {
    public String transactionOutputId;
    public TransactionOutput UTXO; // Unspend Transaction Output

    public Transactioninput(String transactionOutputId) {
        this.transactionOutputId = transactionOutputId;
    }
}