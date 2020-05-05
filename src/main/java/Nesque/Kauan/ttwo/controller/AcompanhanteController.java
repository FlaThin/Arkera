package Nesque.Kauan.ttwo.controller;

import Nesque.Kauan.ttwo.model.Acompanhante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AcompanhanteController{
    @GetMapping("/acompanhante")
    public Acompanhante getAcompanhante(){
        Acompanhante a = new Acompanhante();
        a.setNome("Pamela");
        a.setId("0002");
        a.setValorHora(150.99);
        a.setTipo("Morena");
        return a;
    }
    @GetMapping("/acompanhantes")
    public ArrayList<Acompanhante> getListaAcompanhantes(){
        Acompanhante a1 = new Acompanhante();
        Acompanhante a2 = new Acompanhante();
        a1.setNome("Andreia");
        a1.setId("0003");
        a1.setValorHora(300.50);
        a1.setTipo("Ruiva");
        a2.setNome("Pamela");
        a2.setId("0002");
        a2.setValorHora(150.99);
        a2.setTipo("Morena");
        ArrayList<Acompanhante> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        return list;
    }
}
