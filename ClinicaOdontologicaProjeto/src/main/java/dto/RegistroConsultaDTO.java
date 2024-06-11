package dto;

import java.util.LinkedList;
import java.util.List;
import model.RegistroConsulta;
import persistence.consulta.ConsultaImpl;
import persistence.prontuario.ProntuarioImpl;

public class RegistroConsultaDTO extends DTO {

    public String descricao;

    @Override
    public Object builder() {
        RegistroConsulta registroConsulta = new RegistroConsulta();
        registroConsulta.setId(id != null ? Long.valueOf(id) : 0l);
        registroConsulta.setDescricao(descricao);
        ConsultaImpl con = new ConsultaImpl();
        registroConsulta.setConsulta(con.getConsultaById());
        ProntuarioImpl pron = new ProntuarioImpl();
        registroConsulta.setProntuario(pron.getProntuarioById());

        return registroConsulta;
    }

    public List getListaDados(List<RegistroConsulta> dados) {
        List dadosDTO = new LinkedList();
        for (RegistroConsulta dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    public Object converte(RegistroConsulta rc) {
        RegistroConsultaDTO dto = new RegistroConsultaDTO();
        dto.id = rc.getId();
        dto.descricao = rc.getDescricao();

        return dto;
    }
}
