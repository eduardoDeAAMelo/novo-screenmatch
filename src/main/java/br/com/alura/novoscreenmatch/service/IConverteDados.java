package br.com.alura.novoscreenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
