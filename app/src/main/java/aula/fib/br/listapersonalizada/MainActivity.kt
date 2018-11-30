package aula.fib.br.listapersonalizada

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaContatos = ArrayList<Contato>()
        val c1 = Contato(1L, "Bill Gates", "William Henry Gates III KBE • GCIH (Seattle, 28 de outubro de 1955) mais conhecido como Bill Gates, é um magnata, empresário, diretor executivo, investidor, filantropo e autor americano, que ficou conhecido por fundar junto com Paul Allen a Microsoft,[2] a maior e mais conhecida empresa de software do mundo em termos de valor de mercado.\n" +
                "\n" +
                "Gates ocupa atualmente o cargo de presidente não-executivo da Microsoft,[3] além de ser classificado regularmente como a pessoa mais rica do mundo, posição ocupada por ele de 1995 a 2007,[4]2009,[5] e de 2014 a 2017.[6][7][8][9] É um dos pioneiros na revolução do computador pessoal")
        val c2 = Contato(2L, "Steve Jobs", "Como a maioria dos Caçadores de Demônios , Valla veio de uma aldeia atacada e destruída por demônios")
        val c3 = Contato(3L, "Elon Musk", "Kratos não é só um general espartano, é também um guerreiro treinado por um Deus a serviço dos deuses Gregos do Olimpo. É revelado, em uma série de flash back's, que Kratos foi um Capitão militar no exército de Esparta. Um guerreiro feroz, que guiava seu exército através de muitas vitórias, até que ele encontra com uma horda invasora de bárbaros. O Espartano é oprimido pelo grande número de inimigos, e está prestes a ser morto pelo Rei Bárbaro, quando, em um momento de desespero, ele clama pelo Deus da Guerra, Ares, e jurando ter uma vida de servidão à Ares, se este livrá-lo da morte e der-lhe poder para acabar com os inimigos.")
        val c4 = Contato(4L, "Stephen Hawking", "Master Chief Petty Officer John-117 é um soldado especial SPARTAN-II do Comando de Guerra Especial Naval da UNSC que se tornou um dos mais importantes heróis da UNSC durante a Guerra Humano-Covenant")


        listaContatos.add(c1)
        listaContatos.add(c2)
        listaContatos.add(c3)
        listaContatos.add(c4)

        val adapter = ContatoAdapter(applicationContext, listaContatos,assets)

        val lista = findViewById<ListView>(R.id.lista)
        lista.setAdapter(adapter)
        lista.setOnItemClickListener {parent, view, position, id ->
            val contato = listaContatos.get(position)
            val intent = Intent(this, DetalheContato::class.java)
            intent.putExtra("contato", contato)
            startActivity(intent)
        }


    }
}
