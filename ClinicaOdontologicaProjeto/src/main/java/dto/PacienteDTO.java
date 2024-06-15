package dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import model.Cidade;
import model.Contato;
import model.Endereco;
import model.Paciente;
import model.Prontuario;

public class PacienteDTO extends DTO {

    public String nome;
    public String cpf;
    public Date dataNascimento;
    public EnderecoDTO endereco;
    public Integer numeroCasa;
    public String complemento;
    public String convenio;
    public String responsavel;
    public ProntuarioDTO prontuario;
    public List<ContatoDTO> contatos;

    @Override
    public Paciente builder() {
        Paciente paciente = new Paciente();
        paciente.setId(id != null ? Long.valueOf(id) : 01);
        paciente.setNome(nome);
        paciente.setCpf(cpf);
        paciente.setDataNascimento(dataNascimento);
        paciente.setNumeroCasa(numeroCasa);
        paciente.setComplemento(complemento);
        paciente.setConvenio(convenio);
        paciente.setResponsavel(responsavel);
        paciente.setEndereco((Endereco) endereco.builder());
        paciente.setProntuario((Prontuario) prontuario.builder());

        return paciente;
    }

    public List getListaDados(List<Paciente> dados) {
        List dadosDTO = new LinkedList();
        
        System.out.println("Tamanho lista : " + dados.size());
        for (Paciente dado : dados) {
            System.out.println("dadoooooo " + dado);
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    public Object converte(Paciente p) {
        
        System.out.println("pppppppppppppppp " + p);

        PacienteDTO dto = new PacienteDTO();
        dto.id = p.getId();
        dto.nome = p.getNome();
        dto.dataNascimento = p.getDataNascimento();
        dto.complemento = p.getComplemento();
        dto.convenio = p.getConvenio();
        dto.cpf = p.getCpf();
        dto.numeroCasa = p.getNumeroCasa();
        dto.responsavel = p.getResponsavel();

        ProntuarioDTO prontuarioDTO = new ProntuarioDTO();
        prontuarioDTO.id = p.getProntuario().getId();

        dto.prontuario = prontuarioDTO;

        EnderecoDTO enderecoDTO = new EnderecoDTO();
        dto.endereco = (EnderecoDTO) enderecoDTO.converte(p.getEndereco());

        List<ContatoDTO> contatoDTOs = new ArrayList<>();

        for (Contato contato : p.getContatos()) {
            ContatoDTO contatoDTO = new ContatoDTO();
            contatoDTO.id = contato.getId();
            contatoDTO.tipoContato = contato.getTipoContato();
            contatoDTO.informacao = contato.getInformacao();
            contatoDTO.idPaciente = contato.getPaciente().getId();
            contatoDTOs.add(contatoDTO);
        }

        return dto;
    }
}
