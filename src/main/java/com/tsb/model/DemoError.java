package com.tsb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class DemoError {
	private java.lang.String code;
	private java.lang.String message;
	private java.lang.String description;
	private java.lang.String reason;
}
