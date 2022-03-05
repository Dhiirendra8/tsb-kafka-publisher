package com.tsb.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DocConfigOp implements Serializable {

	private static final long serialVersionUID = -3965651664746920494L;
	// private ApplicationConfig application;
	private java.lang.String application;
	private java.lang.String correspondence; // All, A
	private java.lang.String statements; // All, A
}

//enum ApplicationConfig { // Only valid values: DV, PR
//	DV, PR, TA, BV;
//}
