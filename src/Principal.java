import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefao");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(3);

        System.out.println("Total de avaliacoes" + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost;
        lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2009);
        lost.setAtiva(true);
        lost.setMinutosPorEpisodio(50);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.exibeFichaTecnica();
        System.out.println("Minutos para maratonar: " + lost.getDuracaoEmMinutos());
    }
}