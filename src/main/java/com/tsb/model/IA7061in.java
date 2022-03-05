package com.tsb.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class IA7061in {
	private java.lang.String entidnper;
	private java.lang.String accion;
	private java.lang.String idmarca;
	private Long idpersona;
	private java.lang.String tipper;
	private List<DocConfigOp> elements;
//	private DocConfigOp element;
}
