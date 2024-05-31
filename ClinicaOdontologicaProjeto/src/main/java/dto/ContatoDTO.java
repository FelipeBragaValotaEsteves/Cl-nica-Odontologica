package dto;

import java.util.LinkedList;
import java.util.List;
import model.Contato;
import model.TipoContato;
import persistence.paciente.PacienteImpl;

public class ContatoDTO extends DTO {

    public String informacao;
    public Integer tipo;
    public Long idPaciente;
    public TipoContato tipoContato;
    
    @Override
    public Object builder() {
        Contato contato = new Contato();
        contato.setId(id != null ? Long.valueOf(id) : 0l);
        contato.setTipo(tipo);
        PacienteImpl pac = new PacienteImpl();
        contato.setPaciente(pac.getPacienteById());
        contato.setTipoContato(tipoContato);

        return contato;
    }

    public List getListaDados(List<Contato> dados) {
        List dadosDTO = new LinkedList();
        for (Contato dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Contato c) {
        ContatoDTO dto = new ContatoDTO();
        dto.id = c.getId().toString();
        dto.informacao = c.getInformacao();
        dto.idPaciente = c.getPaciente().getId();
        dto.tipoContato = c.getTipoContato();

        return dto;
    }
}
