package aula10t;

import java.util.Objects;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String nome) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + " PessoaJuridica{" + "cnpj=" + cnpj + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cnpj);
        return hash;
    }
    
       //ajustar o equals para remocao
   //devemos modificar um pouco por causa da herança, primeiro checa se eh pessoa e depois pj

    @Override
    public boolean equals(Object obj) {

        if (super.equals(obj)) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final PessoaJuridica other = (PessoaJuridica) obj;
            return Objects.equals(this.cnpj, other.cnpj);
        } else {
            return false;
        }
    }

}
