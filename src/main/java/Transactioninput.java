public class Transactioninput {
    public String transactionoutputId;
    public TransactionOutput UTXO; // Unspend Transaction Output

    public Transactioninput(String transactionoutputId) {
        this.transactionoutputId = transactionoutputId;
    }
}
