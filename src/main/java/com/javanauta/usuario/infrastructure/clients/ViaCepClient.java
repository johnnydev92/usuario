package com.javanauta.usuario.infrastructure.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "via-cep", url = "${via.cep.url}")
public interface ViaCepClient {

    @GetMapping("/ws/{cep}/json/")
    ViaCepDto buscaDadosEndereco(@RequestParam("cep") String cep);


}
