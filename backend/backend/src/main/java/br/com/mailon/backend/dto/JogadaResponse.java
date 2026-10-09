package br.com.mailon.backend.dto;

import br.com.mailon.backend.model.Mao;
import br.com.mailon.backend.model.Resultado;

public record JogadaResponse(Mao jogadaJogador, Mao jogadaComputador, Resultado resultado) {
}