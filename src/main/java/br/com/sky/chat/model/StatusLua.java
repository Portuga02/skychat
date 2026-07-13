package br.com.sky.chat.model;

public enum StatusLua {
    ONLINE("🌕", "Online - Disponível para conversar"),
    AUSENTE("🌒", "Ausente - Volto em breve"),
    OCUPADO("🌓", "Ocupado - Não quero ser interrompido"),
    OFFLINE("⚪", "Invisível - Aparecer offline"); // Ajustado o emoji aqui!

    private final String emoji;
    private final String descricao;

    StatusLua(String emoji, String descricao) {
        this.emoji = emoji;
        this.descricao = descricao;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getDescricao() {
        return descricao;
    }
}