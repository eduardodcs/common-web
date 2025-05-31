package com.bank.common_web.crud;

import java.util.Optional;

public interface ICrudGateway<E, K> {

    E salvar(E entity);
    Optional<E> buscarPorId(K id);
    E atualizar(E entity);
    void ativarInativar(K id);

}
