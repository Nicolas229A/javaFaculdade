package aula10t;

import java.util.Objects;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + " - PessoaFisica{" + "cpf=" + cpf + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.cpf);
        return hash;
    }
    
    
    //ajustar o equals para remocao
   //devemos modificar um pouco por causa da herança, primeiro checa se eh pessoa e depois pf


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
            final PessoaFisica other = (PessoaFisica) obj;
            return Objects.equals(this.cpf, other.cpf);
        } else {
            return false;
        }
    }

}
