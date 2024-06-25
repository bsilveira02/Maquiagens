import java.util.ArrayList;
import java.util.List;

public class ServicoEstoque {
    private List<Batom> batons = new ArrayList<>();
    private List<Base> bases = new ArrayList<>();

    public void adicionarBatom(Batom batom) {
        batons.add(batom);
    }

    public void adicionarBase(Base base) {
        bases.add(base);
    }

    public List<Batom> listarBatons() {
        return batons;
    }

    public List<Base> listarBases() {
        return bases;
    }

    public boolean removerBatom(Batom batom) {
        return batons.remove(batom);
    }

    public boolean removerBase(Base base) {
        return bases.remove(base);
    }
}

