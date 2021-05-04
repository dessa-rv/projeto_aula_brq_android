package br.com.app.projetoaulabrq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.security.ConfirmationNotAvailableException
import br.com.app.projetoaulabrq.animal.Animal
import br.com.app.projetoaulabrq.animal.Cachorro
import br.com.app.projetoaulabrq.animal.Cavalo
import br.com.app.projetoaulabrq.animal.Gato
import br.com.app.projetoaulabrq.cor.Amarelo
import br.com.app.projetoaulabrq.cor.Cor
import br.com.app.projetoaulabrq.pessoa.Homem
import br.com.app.projetoaulabrq.pessoa.Mulher
import br.com.app.projetoaulabrq.pessoa.Pessoa

class PrimeiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira)

        val corAmarelo =
            Amarelo(nome = "amarelo claro")
        val corAzul = Amarelo(nome = "Azul escuto")

        pintar(corAmarelo)
        pintar(corAzul)

        val cachorro = Cachorro(nome = "Meu cachorro", raca = "pitbull", tipoDePelo = "curto")
        val gato = Gato(nome = "Meu gato")
        val cavalo = Cavalo(nome = "Meu cavalo")

        levarAoPetShop(cachorro)
        levarAoPetShop(gato)
        levarAoPetShop(cavalo)

        val homem = Homem(nome = "andre")
        val mulher = Mulher(nome = "andressa")
        meDigaQualOSexo(homem)
        meDigaQualOSexo(mulher)
    }


    fun pintar(cor: Cor){
        println("Estou pintando um objeto com a cor: ${cor.nome}")
    }

    fun levarAoPetShop (animal : Animal){
        println("levando o(a): ${animal.nome}")

    }

    fun meDigaQualOSexo(pessoa: Pessoa) {
        println("O sexo é ${pessoa.sexo} ")
    }
}