package br.com.az.academicnet.data;

import br.com.az.academicnet.modelo.Aluno;
import br.com.az.academicnet.repositorio.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Instant;

@Component
public class CarregaData {

    @Value("${habilitar.carregar.massa.dados}")
    private boolean podeCarregarDados;

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @PostConstruct
    public void loadData() {

        if (podeCarregarDados) {
            for (int x = 0; x < 50; x++) {
                alunoRepositorio.save(new Aluno((long) x, "Jose da Silva" + x, "99662-554" + x, "jose@az.com.br", Instant.now()));
            }

        }
    }
}
