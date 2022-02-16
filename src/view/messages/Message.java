package view.messages;

public enum Message {
    SUCCESS("Operação realizada com sucesso!"),
    ERROR("Valor de entrada inválida!"),
    TRY_AGAIN("Tente novamente!"),
    RESULT("Resultado");

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
